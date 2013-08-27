package org.uqbar.hoope.ui;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.NewFolderDialog;

public class NewWizard1 extends Wizard implements INewWizard {

	private HoopeLessonWizardPage _pageOne;

	public NewWizard1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	IProject newProject(String projectName) {
		IProjectDescription description = ResourcesPlugin.getWorkspace()
				.newProjectDescription(projectName);
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(description.getName());
		try {
			project.create(description, null);
			project.open(null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return project;
	}

	private void doFinish(String name, String groupId, IProgressMonitor monitor)
			throws CoreException {
		IProject project = newProject((groupId != null ? (groupId + ".") : "")
				+ name);
		IProjectDescription description = project.getDescription();
		project.setDescription(description, monitor);
		IFolder hooplFolder = createFolder(monitor, project, "src/main/hoopl");
		hooplFolder.getFile(name + ".hoopl").create(new ByteArrayInputStream("".getBytes()), true, monitor);
		createFolder(monitor, project, "src/main/resources");
		IFolder scalaFolder = createFolder(monitor, project, "src/main/scala");
		ResourceAttributes readonly = new ResourceAttributes();
		readonly.setReadOnly(true);
		scalaFolder.setResourceAttributes(readonly);
	}

	@Override
	public boolean performFinish() {
		final String name = _pageOne.getName();
		final String groupId = _pageOne.getGroupId();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				try {
					doFinish(name, groupId, monitor);
				} catch (CoreException e) {
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}

		};

		try {
			getContainer().run(true, false, op);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return true;
	}

	@Override
	public void addPages() {
		super.addPages();
		_pageOne = new HoopeLessonWizardPage("wizardPage");
		addPage(_pageOne);
	}

	private IFolder createFolder(IProgressMonitor monitor, IContainer project,
			String folderName) throws CoreException {

		String[] rutaCompleta = folderName.split("/");
		return ultimoNivel(monitor, rutaCompleta, project.getFolder(new Path(rutaCompleta[0])),  0);
		
		/*
		IFolder folder = project.getFolder(new Path(posicionesRuta[0]));
		if (!folder.exists()) {
			folder.create(true, true, monitor);
		}
		*/

		/*
		 * val firstFolder = project.getFolder(new
		 * Path(folderName.split("/").head)) if (!firstFolder.exists()) {
		 * firstFolder.create(true, true, monitor) }
		 * folderName.split("/").tail.foldLeft(firstFolder)((container,
		 * folderName) => { val folder = container.getFolder(new
		 * Path(folderName)) if (!folder.exists()) { folder.create(true, true,
		 * monitor) } folder })
		 */
	}

	// crea carpetas en tail-reccursion 
	private IFolder ultimoNivel(IProgressMonitor monitor, String[] split, IFolder currentFolder, int nivel) throws CoreException {
		if (!currentFolder.exists()) { // si no existe hay que crearla
			currentFolder.create(false, true, monitor);
		}
		if ( nivel + 1 == split.length) { // si estamos en el nivel más alto hay que devolverla
			return currentFolder;
		}
		return ultimoNivel(monitor, split, currentFolder.getFolder(new Path(split[++nivel])), nivel); // sino seguimos subiendo
	}

}
