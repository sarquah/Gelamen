package towerofzaldagor.leveleditor.codegenerator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import Leveleditor.Act;

public class GenerateJavaCode implements IObjectActionDelegate 
{

	private Act act;
	private IContainer container;

	@Override
	public void run(IAction action) {
		final String base = Activator.getDefault().getBundle().getEntry("/").toString();
		final String relativeUri = "templates/TOZModel.javajet";
		final JETEmitter emitter = new JETEmitter(base + relativeUri, getClass().getClassLoader());
		String className = act.getActName();		
		final String fileName = className + ".java";
		IContainer[] containers = WorkspaceResourceDialog.openFolderSelection(null, "Save Java code...",
				"Please select a folder to which the generated java code should go.", false, new IContainer[] { container }, null);
		if (containers.length == 1) {
			container = containers[0];
			final IFile file = container.getFile(new Path(fileName));
			final Job job = new Job("Generating Java code for the TOZ model: ") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {				
						emitter.addVariable("LEVELEDITOR2JAVA", Activator.PLUGIN_ID);
						emitter.addVariable("TOZMODEL", "TowerOfZaldagor.leveleditor");
						emitter.addVariable("EMF_COMMON", "org.eclipse.emf.common");
						emitter.addVariable("EMF_ECORE", "org.eclipse.emf.ecore");
						String result = emitter.generate(monitor, new Object[] { act });
						InputStream newContents = new ByteArrayInputStream(result.getBytes());
						if (file.exists()) {
							file.setContents(newContents, true, true, new SubProgressMonitor(monitor, 1));
						} else {
							file.create(newContents, true, new SubProgressMonitor(monitor, 1));
						}
					} catch (JETException e) {
						e.printStackTrace();						
					} catch (CoreException e) {
						e.printStackTrace();
					}
					monitor.worked(1);
					return new Status(Status.OK, Activator.PLUGIN_ID, "Code successfully generated");
				}
			};
			job.setUser(true);
			job.schedule();
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		act = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof Act) {
				act = (Act) structuredSelection.getFirstElement();
			}
		}		
	}
	
	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {		
	}
}
