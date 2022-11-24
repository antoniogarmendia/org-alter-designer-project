/**
 * generated by Xtext 2.23.0
 */
package ontological.ontological.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import ontological.OntologicalRoot;
import ontological.OntologicalRootClasses;
import ontological.OntologicalRootClassesItems;
import ontological.OntologicalRootPropertiesAbstract;
import ontological.ontological.services.OntologicalGrammarAccess;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class OntologicalFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private OntologicalGrammarAccess _ontologicalGrammarAccess;
  
  protected void _format(final OntologicalRoot ontologicalRoot, @Extension final IFormattableDocument document) {
    EList<OntologicalRootPropertiesAbstract> _ontologicalRoot = ontologicalRoot.getOntologicalRoot();
    for (final OntologicalRootPropertiesAbstract ontologicalRootPropertiesAbstract : _ontologicalRoot) {
      document.<OntologicalRootPropertiesAbstract>format(ontologicalRootPropertiesAbstract);
    }
  }
  
  protected void _format(final OntologicalRootClasses ontologicalRootClasses, @Extension final IFormattableDocument document) {
    EList<OntologicalRootClassesItems> _classes = ontologicalRootClasses.getClasses();
    for (final OntologicalRootClassesItems ontologicalRootClassesItems : _classes) {
      document.<OntologicalRootClassesItems>format(ontologicalRootClassesItems);
    }
  }
  
  public void format(final Object ontologicalRootClasses, final IFormattableDocument document) {
    if (ontologicalRootClasses instanceof XtextResource) {
      _format((XtextResource)ontologicalRootClasses, document);
      return;
    } else if (ontologicalRootClasses instanceof OntologicalRootClasses) {
      _format((OntologicalRootClasses)ontologicalRootClasses, document);
      return;
    } else if (ontologicalRootClasses instanceof OntologicalRoot) {
      _format((OntologicalRoot)ontologicalRootClasses, document);
      return;
    } else if (ontologicalRootClasses instanceof EObject) {
      _format((EObject)ontologicalRootClasses, document);
      return;
    } else if (ontologicalRootClasses == null) {
      _format((Void)null, document);
      return;
    } else if (ontologicalRootClasses != null) {
      _format(ontologicalRootClasses, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ontologicalRootClasses, document).toString());
    }
  }
}