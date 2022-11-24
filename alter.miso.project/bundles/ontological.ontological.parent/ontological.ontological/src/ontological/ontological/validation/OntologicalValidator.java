package ontological.ontological.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.util.CancelIndicator;

import relatedSchemas.RelatedSchemas;
import relatedSchemas.EnclosingSchema;
import jsonMM.JsonDocument;
import org.eclipse.emf.converter.util.ConverterUtil;

public class OntologicalValidator extends AbstractOntologicalValidator {

	public void register(EValidatorRegistrar registrar) {
		super.register(registrar); 
		ontological.OntologicalPackage ePackage = ontological.OntologicalPackage.eINSTANCE;
		URI basicOclURI = URI.createPlatformPluginURI("/ontological/ontologicalOpt.ocl", true);
		registrar.register(ePackage, new CompleteOCLEObjectValidator(ePackage, basicOclURI));
	}
}
