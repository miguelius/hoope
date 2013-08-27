package org.uqbar.hoope.ui;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class HoopeLessonWizardPage extends WizardPage {

	public Text getLessonNameText() {
		return lessonNameText;
	}

	public void setLessonNameText(Text lessonNameText) {
		this.lessonNameText = lessonNameText;
	}

	public Text getLessonGroupIdText() {
		return lessonGroupIdText;
	}

	public void setLessonGroupIdText(Text lessonGroupIdText) {
		this.lessonGroupIdText = lessonGroupIdText;
	}

	public String getName() {
		return this.lessonNameText.getText();
	}

	public String getGroupId() {
		return this.lessonGroupIdText.getText();
	}
	
	private Text lessonNameText;
	private Text lessonGroupIdText;
	
	protected HoopeLessonWizardPage(String pageName) {
		super(pageName);
		setTitle("New HOOPE Lesson");
		setDescription("This wizard creates a new HOOPE Lesson with all the stuff you need to start playing with your objects. Have fun!");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;

		new Label(container, SWT.NULL).setText("&Group id:");
		
	    lessonGroupIdText = new Text(container, SWT.BORDER | SWT.SINGLE);
	    lessonGroupIdText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	    new Label(container, SWT.NULL).setText("Lesson &name:");

	    lessonNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
	    lessonNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	    setControl(container);
	}

}
