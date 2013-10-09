package org.uqbar.hoope.lib.views;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.uqbar.hoope.lib.views.SampleView;

@SuppressWarnings("all")
public class HoopeGraphicObjectPartListener implements IPartListener, IResourceChangeListener, CaretListener {
  private XtextEditor currentEditor;
  
  @Inject
  private SampleView view;
  
  private boolean isStopMode;
  
  public boolean isHoopeEditor(final IWorkbenchPart part) {
    boolean _and = false;
    if (!(part instanceof XtextEditor)) {
      _and = false;
    } else {
      IWorkbenchPartSite _site = part.getSite();
      String _id = _site.getId();
      boolean _equals = Objects.equal(_id, "org.uqbar.Hoope");
      _and = ((part instanceof XtextEditor) && _equals);
    }
    return _and;
  }
  
  public void partActivated(final IWorkbenchPart part) {
    boolean _isHoopeEditor = this.isHoopeEditor(part);
    if (_isHoopeEditor) {
      IFile _editorFile = null;
      if (this.currentEditor!=null) {
        _editorFile=this.getEditorFile(this.currentEditor);
      }
      IWorkspace _workspace = null;
      if (_editorFile!=null) {
        _workspace=_editorFile.getWorkspace();
      }
      if (_workspace!=null) {
        _workspace.removeResourceChangeListener(this);
      }
      ISourceViewer _internalSourceViewer = null;
      if (this.currentEditor!=null) {
        _internalSourceViewer=this.currentEditor.getInternalSourceViewer();
      }
      StyledText _textWidget = null;
      if (_internalSourceViewer!=null) {
        _textWidget=_internalSourceViewer.getTextWidget();
      }
      if (_textWidget!=null) {
        _textWidget.removeCaretListener(this);
      }
      this.currentEditor = ((XtextEditor) part);
      IFile _editorFile_1 = null;
      if (this.currentEditor!=null) {
        _editorFile_1=this.getEditorFile(this.currentEditor);
      }
      IWorkspace _workspace_1 = null;
      if (_editorFile_1!=null) {
        _workspace_1=_editorFile_1.getWorkspace();
      }
      if (_workspace_1!=null) {
        _workspace_1.addResourceChangeListener(this);
      }
    }
  }
  
  public void partBroughtToTop(final IWorkbenchPart part) {
  }
  
  public void partClosed(final IWorkbenchPart part) {
  }
  
  public void partDeactivated(final IWorkbenchPart part) {
    boolean _equals = Objects.equal(part, this.currentEditor);
    if (_equals) {
      ISourceViewer _internalSourceViewer = null;
      if (this.currentEditor!=null) {
        _internalSourceViewer=this.currentEditor.getInternalSourceViewer();
      }
      StyledText _textWidget = null;
      if (_internalSourceViewer!=null) {
        _textWidget=_internalSourceViewer.getTextWidget();
      }
      if (_textWidget!=null) {
        _textWidget.removeCaretListener(this);
      }
      IFile _editorFile = null;
      if (this.currentEditor!=null) {
        _editorFile=this.getEditorFile(this.currentEditor);
      }
      IWorkspace _workspace = null;
      if (_editorFile!=null) {
        _workspace=_editorFile.getWorkspace();
      }
      if (_workspace!=null) {
        _workspace.removeResourceChangeListener(this);
      }
      this.currentEditor = null;
    }
  }
  
  public void partOpened(final IWorkbenchPart part) {
  }
  
  public void resourceChanged(final IResourceChangeEvent event) {
    try {
      IFile _editorFile = null;
      if (this.currentEditor!=null) {
        _editorFile=this.getEditorFile(this.currentEditor);
      }
      final IFile editorFile = _editorFile;
      boolean _notEquals = (!Objects.equal(editorFile, null));
      if (_notEquals) {
        final IPath editorFilePath = editorFile.getFullPath();
        IResourceDelta _delta = event.getDelta();
        final IResourceDeltaVisitor _function = new IResourceDeltaVisitor() {
            public boolean visit(final IResourceDelta it) throws CoreException {
              boolean _xifexpression = false;
              boolean _and = false;
              boolean _and_1 = false;
              IResource _resource = it.getResource();
              boolean _equals = Objects.equal(_resource, editorFile);
              if (!_equals) {
                _and_1 = false;
              } else {
                int _kind = it.getKind();
                boolean _equals_1 = (_kind == IResourceDelta.CHANGED);
                _and_1 = (_equals && _equals_1);
              }
              if (!_and_1) {
                _and = false;
              } else {
                int _flags = it.getFlags();
                boolean _equals_2 = (_flags == IResourceDelta.CONTENT);
                _and = (_and_1 && _equals_2);
              }
              if (_and) {
                _xifexpression = false;
              } else {
                IResource _resource_1 = it.getResource();
                IPath _fullPath = _resource_1.getFullPath();
                boolean _isPrefixOf = _fullPath.isPrefixOf(editorFilePath);
                _xifexpression = _isPrefixOf;
              }
              return _xifexpression;
            }
          };
        _delta.accept(_function);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected IFile getEditorFile(final IEditorPart editor) {
    IFile _xifexpression = null;
    IEditorInput _editorInput = null;
    if (editor!=null) {
      _editorInput=editor.getEditorInput();
    }
    if ((_editorInput instanceof IFileEditorInput)) {
      IEditorInput _editorInput_1 = editor.getEditorInput();
      IFile _file = ((IFileEditorInput) _editorInput_1).getFile();
      _xifexpression = _file;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public boolean toggleStopMode() {
    boolean _xblockexpression = false;
    {
      ISourceViewer _internalSourceViewer = null;
      if (this.currentEditor!=null) {
        _internalSourceViewer=this.currentEditor.getInternalSourceViewer();
      }
      StyledText _textWidget = null;
      if (_internalSourceViewer!=null) {
        _textWidget=_internalSourceViewer.getTextWidget();
      }
      if (_textWidget!=null) {
        _textWidget.removeCaretListener(this);
      }
      boolean _not = (!this.isStopMode);
      this.isStopMode = _not;
      if (this.isStopMode) {
        ISourceViewer _internalSourceViewer_1 = null;
        if (this.currentEditor!=null) {
          _internalSourceViewer_1=this.currentEditor.getInternalSourceViewer();
        }
        StyledText _textWidget_1 = null;
        if (_internalSourceViewer_1!=null) {
          _textWidget_1=_internalSourceViewer_1.getTextWidget();
        }
        if (_textWidget_1!=null) {
          _textWidget_1.addCaretListener(this);
        }
      }
      _xblockexpression = (this.isStopMode);
    }
    return _xblockexpression;
  }
  
  public void caretMoved(final CaretEvent event) {
    try {
      IXtextDocument _document = this.currentEditor.getDocument();
      final int stopAtLine = _document.getLineOfOffset(event.caretOffset);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
