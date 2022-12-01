package alter.miso.ui.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import alter.miso.ui.views.api.MongoDBStruct;
import alter.miso.ui.views.http.MongoDBHttp;
import alter.miso.ui.views.utils.AlterDesignerUtils;

import static org.eclipse.jface.widgets.CompositeFactory.newComposite;
import static org.eclipse.jface.widgets.ButtonFactory.newButton;
import static org.eclipse.jface.widgets.TextFactory.newText;
import static org.eclipse.jface.widgets.LabelFactory.newLabel;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import javax.inject.Inject;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class AlterDesignerView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "alter.miso.ui.views.AlterDesignerView";

	@Inject IWorkbench workbench;
	
	private Composite mainComposite;
	private MongoDBStruct mongoConfig;
	

	public void makeDefaultMongoConfig() {
		this.mongoConfig = MongoDBStruct.of();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		makeDefaultMongoConfig();
		//Main composite
		mainComposite = newComposite(SWT.NONE).create(parent);
		
		//Title
		newLabel(SWT.NONE).text("Upload to MongoDB").create(mainComposite);
		
		//Parameter composite
		Composite parameterComposite = newComposite(SWT.NONE).create(mainComposite);				
					
		//URL
		newLabel(SWT.NONE).text("URL").create(parameterComposite);
		newText(SWT.NONE)
			.onModify(e -> this.mongoConfig.setUrl(((Text)e.widget).getText()))
			.create(parameterComposite)
			.setText(this.mongoConfig.getUrl());
		
		//Key
		newLabel(SWT.NONE).text("Key").create(parameterComposite);			
		newText(SWT.NONE).
			onModify(e -> this.mongoConfig.setParameter(((Text)e.widget).getText()))
			.create(parameterComposite)
			.setText(this.mongoConfig.getKey());
			;
		
		//Submit Button
		newButton(SWT.PUSH).text("Submit JSON").onSelect(e -> submitJSON()).create(parameterComposite);
		
		GridLayoutFactory.fillDefaults().numColumns(2).generateLayout(parameterComposite);
		
		GridLayoutFactory.fillDefaults().numColumns(1).generateLayout(mainComposite);		
	}
	
	private void submitJSON() {
		String rawJson = AlterDesignerUtils.getXtextStringFromActiveEditor();
		MongoDBHttp mongoHttpStruct = new MongoDBHttp(mongoConfig, rawJson);
		mongoHttpStruct.submitJSON();		
	}	

	@Override
	public void setFocus() {
		mainComposite.setFocus();		
	}
}
