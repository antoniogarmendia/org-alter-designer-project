/*
 * generated by Xtext 2.23.0
 */
package graphic.graphic.formatting2

import com.google.inject.Inject
import graphic.GraphicRoot
import graphic.GraphicRootClasses
import graphic.graphic.services.GraphicGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class GraphicFormatter extends AbstractFormatter2 {
	
	@Inject extension GraphicGrammarAccess

	def dispatch void format(GraphicRoot graphicRoot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (graphicRootPropertiesAbstract : graphicRoot.graphicRoot) {
			graphicRootPropertiesAbstract.format
		}
	}

	def dispatch void format(GraphicRootClasses graphicRootClasses, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (graphicRootClassesItems : graphicRootClasses.classes) {
			graphicRootClassesItems.format
		}
	}
	
	// TODO: implement for GraphicRootClassesItems, GraphicRootClassesItemsVersions, GraphicRootClassesItemsVname, GraphicRootClassesItemsShowAttributes, GraphicRootClassesItemsMaterialAttributes, GraphicRootClassesItemsConstraints, GraphicRootClassesItemsConnections, GraphicRootClassesItemsConnectionsItems
}
