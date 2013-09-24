package org.uqbar.hoope.lib.views;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.FreeformViewport;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.util.DisplayRunHelper;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.uqbar.hoope.lib.HoopeGraphicObject;
import org.uqbar.hoope.lib.IHoopeInterpreter;
import org.uqbar.hoope.lib.IHoopeObjectEvent;
import org.uqbar.hoope.lib.IHoopeObjectEvent.Listener;
import org.uqbar.hoope.lib.MoveEvent;
import org.uqbar.hoope.lib.TurnEvent;
import org.uqbar.hoope.lib.views.Animation;
import org.uqbar.hoope.lib.views.Animator;
import org.uqbar.hoope.lib.views.HoopeGraphicObjectFigure;
import org.uqbar.hoope.lib.views.HoopeGraphicObjectPartListener;
import org.uqbar.hoope.lib.views.RootLayer;
import org.uqbar.hoope.lib.views.ToggleStopModeAction;

@Singleton
@SuppressWarnings("all")
public class SampleView extends ViewPart implements Listener {
  private final static Logger LOGGER = new Function0<Logger>() {
    public Logger apply() {
      Logger _logger = Logger.getLogger(SampleView.class);
      return _logger;
    }
  }.apply();
  
  private FigureCanvas canvas;
  
  @Inject
  private ToggleStopModeAction action;
  
  @Inject
  private RootLayer rootFigure;
  
  @Inject
  private HoopeGraphicObjectFigure hoopeGraphicObjectFigure;
  
  @Inject
  private HoopeGraphicObjectPartListener listener;
  
  @Inject
  private Animator animator;
  
  public void createPartControl(final Composite parent) {
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
    pane.add(this.rootFigure, "primary");
    this.reset();
    IWorkbenchPartSite _site = this.getSite();
    IWorkbenchPage _page = _site.getPage();
    _page.addPartListener(this.listener);
    IWorkbenchPartSite _site_1 = this.getSite();
    IActionBars _actionBars = ((IViewSite) _site_1).getActionBars();
    IToolBarManager _toolBarManager = _actionBars.getToolBarManager();
    _toolBarManager.add(this.action);
  }
  
  public void setFocus() {
    this.canvas.setFocus();
  }
  
  public HoopeGraphicObjectFigure getHoopeGraphicObjectFigure() {
    return this.hoopeGraphicObjectFigure;
  }
  
  public HoopeGraphicObjectPartListener getHoopeGraphicObjectPartListener() {
    return this.listener;
  }
  
  public void reset() {
    this.rootFigure.removeAll();
    this.rootFigure.add(this.hoopeGraphicObjectFigure);
    Point _point = new Point(0, 0);
    this.hoopeGraphicObjectFigure.setObjectLocation(_point);
    this.hoopeGraphicObjectFigure.setAngle(0);
    final org.eclipse.swt.graphics.Point viewportSize = this.canvas.getSize();
    int _minus = (-viewportSize.x);
    int _divide = (_minus / 2);
    int _minus_1 = (-viewportSize.y);
    int _divide_1 = (_minus_1 / 2);
    this.canvas.scrollTo(_divide, _divide_1);
  }
  
  public Boolean show(final XtextEditor tortoiseEditor, final int stopAtLine) {
    Boolean _xblockexpression = null;
    {
      boolean _lessThan = (stopAtLine < 0);
      this.animator.setAnimated(_lessThan);
      final Runnable _function = new Runnable() {
          public void run() {
            SampleView.this.reset();
          }
        };
      DisplayRunHelper.runSyncInDisplayThread(_function);
      IXtextDocument _document = tortoiseEditor.getDocument();
      final IUnitOfWork<Boolean,XtextResource> _function_1 = new IUnitOfWork<Boolean,XtextResource>() {
          public Boolean exec(final XtextResource it) throws Exception {
            Boolean _xifexpression = null;
            boolean _and = false;
            boolean _notEquals = (!Objects.equal(it, null));
            if (!_notEquals) {
              _and = false;
            } else {
              boolean _hasError = SampleView.this.hasError(tortoiseEditor);
              boolean _not = (!_hasError);
              _and = (_notEquals && _not);
            }
            if (_and) {
              boolean _xblockexpression = false;
              {
                HoopeGraphicObject _hoopeGraphicObject = new HoopeGraphicObject();
                final HoopeGraphicObject hoopeObject = _hoopeGraphicObject;
                hoopeObject.addListener(SampleView.this);
                IResourceServiceProvider _resourceServiceProvider = it.getResourceServiceProvider();
                final IHoopeInterpreter interpreter = _resourceServiceProvider.<IHoopeInterpreter>get(IHoopeInterpreter.class);
                boolean _and_1 = false;
                boolean _notEquals_1 = (!Objects.equal(interpreter, null));
                if (!_notEquals_1) {
                  _and_1 = false;
                } else {
                  EList<EObject> _contents = it.getContents();
                  boolean _isEmpty = _contents.isEmpty();
                  boolean _not_1 = (!_isEmpty);
                  _and_1 = (_notEquals_1 && _not_1);
                }
                if (_and_1) {
                  try {
                    EList<EObject> _contents_1 = it.getContents();
                    EObject _get = _contents_1.get(0);
                    interpreter.run(hoopeObject, _get, stopAtLine);
                  } catch (final Throwable _t) {
                    if (_t instanceof Exception) {
                      final Exception e = (Exception)_t;
                      IWorkbenchPartSite _site = SampleView.this.getSite();
                      Shell _shell = _site.getShell();
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("Error during execution:");
                      _builder.newLine();
                      _builder.append("  ");
                      String _message = e.getMessage();
                      _builder.append(_message, "  ");
                      _builder.newLineIfNotEmpty();
                      _builder.append("See log for details");
                      MessageDialog.openError(_shell, "Error during Execution", _builder.toString());
                      SampleView.LOGGER.error("Error executing TortoiseScript", e);
                    } else {
                      throw Exceptions.sneakyThrow(_t);
                    }
                  }
                }
                boolean _removeListener = hoopeObject.removeListener(SampleView.this);
                _xblockexpression = (_removeListener);
              }
              _xifexpression = Boolean.valueOf(_xblockexpression);
            }
            return _xifexpression;
          }
        };
      Boolean _readOnly = _document.<Boolean>readOnly(_function_1);
      _xblockexpression = (_readOnly);
    }
    return _xblockexpression;
  }
  
  public boolean hasError(final XtextEditor tortoiseEditor) {
    boolean _xblockexpression = false;
    {
      IDocumentProvider _documentProvider = tortoiseEditor.getDocumentProvider();
      IAnnotationModel _annotationModel = null;
      if (_documentProvider!=null) {
        IEditorInput _editorInput = tortoiseEditor.getEditorInput();
        _annotationModel=_documentProvider.getAnnotationModel(_editorInput);
      }
      Iterator _annotationIterator = null;
      if (_annotationModel!=null) {
        _annotationIterator=_annotationModel.getAnnotationIterator();
      }
      final Iterator annotations = _annotationIterator;
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
  
  public void handleObjectEvent(final IHoopeObjectEvent event) {
    boolean _matched = false;
    if (!_matched) {
      if (event instanceof MoveEvent) {
        final MoveEvent _moveEvent = (MoveEvent)event;
        _matched=true;
        HoopeGraphicObject _hoopeObject = _moveEvent.getHoopeObject();
        boolean _isPaint = _hoopeObject.isPaint();
        if (_isPaint) {
          Polyline _polyline = new Polyline();
          final Polyline line = _polyline;
          HoopeGraphicObject _hoopeObject_1 = _moveEvent.getHoopeObject();
          Color _lineColor = _hoopeObject_1.getLineColor();
          line.setForegroundColor(_lineColor);
          HoopeGraphicObject _hoopeObject_2 = _moveEvent.getHoopeObject();
          int _lineWidth = _hoopeObject_2.getLineWidth();
          line.setLineWidth(_lineWidth);
          Point _oldPosition = _moveEvent.getOldPosition();
          Point _oldPosition_1 = _moveEvent.getOldPosition();
          line.setEndpoints(_oldPosition, _oldPosition_1);
          Point _oldPosition_2 = _moveEvent.getOldPosition();
          HoopeGraphicObject _hoopeObject_3 = _moveEvent.getHoopeObject();
          Point _position = _hoopeObject_3.getPosition();
          HoopeGraphicObject _hoopeObject_4 = _moveEvent.getHoopeObject();
          int _delay = _hoopeObject_4.getDelay();
          Animation _animation = new Animation(_oldPosition_2, _position, line, _delay);
          this.animator.addAnimation(_animation);
        } else {
          Point _oldPosition_3 = _moveEvent.getOldPosition();
          HoopeGraphicObject _hoopeObject_5 = _moveEvent.getHoopeObject();
          Point _position_1 = _hoopeObject_5.getPosition();
          HoopeGraphicObject _hoopeObject_6 = _moveEvent.getHoopeObject();
          int _delay_1 = _hoopeObject_6.getDelay();
          Animation _animation_1 = new Animation(_oldPosition_3, _position_1, _delay_1);
          this.animator.addAnimation(_animation_1);
        }
      }
    }
    if (!_matched) {
      if (event instanceof TurnEvent) {
        final TurnEvent _turnEvent = (TurnEvent)event;
        _matched=true;
        double _oldAngle = _turnEvent.getOldAngle();
        HoopeGraphicObject _hoopeObject = _turnEvent.getHoopeObject();
        double _angleInRadians = _hoopeObject.getAngleInRadians();
        HoopeGraphicObject _hoopeObject_1 = _turnEvent.getHoopeObject();
        int _delay = _hoopeObject_1.getDelay();
        Animation _animation = new Animation(_oldAngle, _angleInRadians, _delay);
        this.animator.addAnimation(_animation);
      }
    }
  }
}