package org.uqbar.hoope.lib;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;

import com.google.inject.Singleton;

@Singleton
public class ProjectClassLoaderHelper implements IProjectClassLoaderHelper {

	@Override
	public Class<?> loadClass(IProject project, String fullyQualifiedName) throws ClassNotFoundException {
		try {
			project.open(null /* IProgressMonitor */);
			IJavaProject javaProject = JavaCore.create(project);
			URLClassLoader loader = getProjectClassLoader(javaProject);
			Class<?> clazz = loader.loadClass(fullyQualifiedName);
			return clazz;
		} catch (CoreException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        throw new ClassNotFoundException(fullyQualifiedName);
	}

	@Override
	public Class<?> loadClass(String fullyQualifiedName) throws ClassNotFoundException {
		
		try {
			List<IJavaProject> javaProjects = new ArrayList<IJavaProject>();
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
					.getProjects();

			for (IProject project : projects) {
				project.open(null /* IProgressMonitor */);
				IJavaProject javaProject = JavaCore.create(project);
				javaProjects.add(javaProject);
			}

			ArrayList<URLClassLoader> loaders = new ArrayList<URLClassLoader>();
			for (IJavaProject project : javaProjects) {
				 loaders.add(getProjectClassLoader(project));
			}
			
			for(URLClassLoader loader: loaders){
				 try {
				  Class<?> clazz = loader.loadClass(fullyQualifiedName);
				  return clazz;
				 } catch (ClassNotFoundException e) {
				 
				 }
			}
				 
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        throw new ClassNotFoundException(fullyQualifiedName);
	}

	private URLClassLoader getProjectClassLoader(IJavaProject project) throws CoreException, MalformedURLException {
		String[] classPathEntries = JavaRuntime
				.computeDefaultRuntimeClassPath(project);

		List<URL> urlList = new ArrayList<URL>();
		for (int i = 0; i < classPathEntries.length; i++) {
			String entry = classPathEntries[i];
			IPath path = new Path(entry);
			URL url = path.toFile().toURI().toURL();
			urlList.add(url);
		}

		ClassLoader parentClassLoader = project.getClass().getClassLoader();
		URL[] urls = (URL[]) urlList.toArray(new URL[urlList.size()]);
		return new URLClassLoader(urls, parentClassLoader);		
	}

}
