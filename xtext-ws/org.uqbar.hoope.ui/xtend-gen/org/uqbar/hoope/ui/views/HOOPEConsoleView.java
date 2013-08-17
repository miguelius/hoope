/**
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.uqbar.hoope.ui.views;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformViewport;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.uqbar.hoope.ui.views.HOOPEView;

@Singleton
@SuppressWarnings("all")
public class HOOPEConsoleView extends ViewPart {
  private final static Logger LOGGER = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = Logger.getLogger(HOOPEView.class);
      return _logger;
    }
  }.apply();
  
  private FigureCanvas canvas;
  
  public void createPartControl(final Composite parent) {
    HOOPEConsoleView.LOGGER.debug("Creo el canvas");
    FigureCanvas _figureCanvas = new FigureCanvas(parent, SWT.DOUBLE_BUFFERED);
    this.canvas = _figureCanvas;
    FreeformViewport _freeformViewport = new FreeformViewport();
    this.canvas.setViewport(_freeformViewport);
    this.canvas.setBackground(ColorConstants.white);
    FreeformLayeredPane _freeformLayeredPane = new FreeformLayeredPane();
    final FreeformLayeredPane pane = _freeformLayeredPane;
    Font _font = parent.getFont();
    pane.setFont(_font);
    this.canvas.setContents(pane);
  }
  
  public void setFocus() {
    HOOPEConsoleView.LOGGER.debug("Estoy en foco!");
    this.canvas.setFocus();
  }
  
  public Object show(final XtextEditor hooplEditor, final int stopAtLine) {
    IXtextDocument _document = hooplEditor.getDocument();
    final IUnitOfWork<Object,XtextResource> _function = new IUnitOfWork<Object,XtextResource>() {
        public Object exec(final XtextResource it) throws Exception {
          Object _xifexpression = null;
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(it, null));
          if (!_notEquals) {
            _and = false;
          } else {
            boolean _hasError = HOOPEConsoleView.this.hasError(hooplEditor);
            boolean _not = (!_hasError);
            _and = (_notEquals && _not);
          }
          if (_and) {
            _xifexpression = null;
          }
          return _xifexpression;
        }
      };
    Object _readOnly = _document.<Object>readOnly(_function);
    return _readOnly;
  }
  
  public boolean hasError(final XtextEditor hooplEditor) {
    boolean _xblockexpression = false;
    {
      IDocumentProvider _documentProvider = hooplEditor.getDocumentProvider();
      IEditorInput _editorInput = hooplEditor.getEditorInput();
      IAnnotationModel _annotationModel = _documentProvider==null?(IAnnotationModel)null:_documentProvider.getAnnotationModel(_editorInput);
      final Iterator annotations = _annotationModel==null?(Iterator)null:_annotationModel.getAnnotationIterator();
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(annotations, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _hasNext = annotations.hasNext();
        _and = (_notEquals && _hasNext);
      }
      boolean _while = _and;
      while (_while) {
        {
          final Object annotation = annotations.next();
          boolean _and_1 = false;
          if (!(annotation instanceof Annotation)) {
            _and_1 = false;
          } else {
            String _type = ((Annotation) annotation).getType();
            boolean _equals = Objects.equal(_type, XtextEditor.ERROR_ANNOTATION_TYPE);
            _and_1 = ((annotation instanceof Annotation) && _equals);
          }
          if (_and_1) {
            return true;
          }
        }
        boolean _and_1 = false;
        boolean _notEquals_1 = (!Objects.equal(annotations, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          boolean _hasNext_1 = annotations.hasNext();
          _and_1 = (_notEquals_1 && _hasNext_1);
        }
        _while = _and_1;
      }
      _xblockexpression = (false);
    }
    return _xblockexpression;
  }
}
