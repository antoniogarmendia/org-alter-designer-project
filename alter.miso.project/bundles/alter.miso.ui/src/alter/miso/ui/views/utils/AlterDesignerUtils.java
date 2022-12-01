package alter.miso.ui.views.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class AlterDesignerUtils {
	
	public static final String MONGO_URL = "https://alterserver.herokuapp.com/jsonGraphic?json=true";
	public static final String JSON_KEY= "obj";
		
	//Supress default constructor for noninstantiability
	private AlterDesignerUtils() {
		throw new AssertionError();
	}
		
	public static String getXtextStringFromActiveEditor() {
		var activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		var editorInput = activeEditor.getEditorInput();
		if (editorInput instanceof FileEditorInput inputFile) {
			try {
				InputStream inputStream = inputFile.getFile().getContents();
				Path tempFile = 
					      Files.createTempDirectory("").resolve(UUID.randomUUID().toString() + ".tmp");
					    Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
					    return new String(Files.readAllBytes(tempFile));					    
			} catch (CoreException | IOException e) {
				e.printStackTrace();
			}
		}		
		throw new IllegalArgumentException("Not Supported class" + editorInput.getClass().toString());
	}
	
}
