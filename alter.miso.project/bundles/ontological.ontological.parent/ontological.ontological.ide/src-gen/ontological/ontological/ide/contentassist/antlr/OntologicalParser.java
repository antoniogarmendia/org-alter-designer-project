/*
 * generated by Xtext 2.23.0
 */
package ontological.ontological.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import ontological.ontological.ide.contentassist.antlr.internal.InternalOntologicalParser;
import ontological.ontological.services.OntologicalGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class OntologicalParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OntologicalGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OntologicalGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOntologicalRootPropertiesAbstractAccess().getAlternatives(), "rule__OntologicalRootPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getOntologicalRootClassesItemsPropertiesAbstractAccess().getAlternatives(), "rule__OntologicalRootClassesItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsPropertiesAbstractAccess().getAlternatives(), "rule__OntologicalRootClassesItemsAttributesItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsPropertiesAbstractAccess().getAlternatives(), "rule__OntologicalRootClassesItemsReferencesItemsPropertiesAbstract__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getVALID_STRINGAccess().getAlternatives(), "rule__VALID_STRING__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getOntologicalRootAccess().getGroup(), "rule__OntologicalRoot__Group__0");
			builder.put(grammarAccess.getOntologicalRootAccess().getGroup_2(), "rule__OntologicalRoot__Group_2__0");
			builder.put(grammarAccess.getOntologicalRootAccess().getGroup_2_1(), "rule__OntologicalRoot__Group_2_1__0");
			builder.put(grammarAccess.getOntologicalRootNameAccess().getGroup(), "rule__OntologicalRootName__Group__0");
			builder.put(grammarAccess.getOntologicalRootURIAccess().getGroup(), "rule__OntologicalRootURI__Group__0");
			builder.put(grammarAccess.getOntologicalRootOnlyCodesAccess().getGroup(), "rule__OntologicalRootOnlyCodes__Group__0");
			builder.put(grammarAccess.getOntologicalRootBluetoothAccess().getGroup(), "rule__OntologicalRootBluetooth__Group__0");
			builder.put(grammarAccess.getOntologicalRootExternalAccess().getGroup(), "rule__OntologicalRootExternal__Group__0");
			builder.put(grammarAccess.getOntologicalRootFirebaseAccess().getGroup(), "rule__OntologicalRootFirebase__Group__0");
			builder.put(grammarAccess.getOntologicalRootPhysicsAccess().getGroup(), "rule__OntologicalRootPhysics__Group__0");
			builder.put(grammarAccess.getOntologicalRootGameloopAccess().getGroup(), "rule__OntologicalRootGameloop__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesAccess().getGroup(), "rule__OntologicalRootClasses__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesAccess().getGroup_4(), "rule__OntologicalRootClasses__Group_4__0");
			builder.put(grammarAccess.getOntologicalRootClassesAccess().getGroup_4_1(), "rule__OntologicalRootClasses__Group_4_1__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup(), "rule__OntologicalRootClassesItems__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup_2(), "rule__OntologicalRootClassesItems__Group_2__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAccess().getGroup_2_1(), "rule__OntologicalRootClassesItems__Group_2_1__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsNameAccess().getGroup(), "rule__OntologicalRootClassesItemsName__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getGroup(), "rule__OntologicalRootClassesItemsAbstract__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributes__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup_4(), "rule__OntologicalRootClassesItemsAttributes__Group_4__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getGroup_4_1(), "rule__OntologicalRootClassesItemsAttributes__Group_4_1__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup(), "rule__OntologicalRootClassesItemsReferences__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup_4(), "rule__OntologicalRootClassesItemsReferences__Group_4__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getGroup_4_1(), "rule__OntologicalRootClassesItemsReferences__Group_4_1__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getGroup(), "rule__OntologicalRootClassesItemsAutoID__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getGroup(), "rule__OntologicalRootClassesItemsOnlyCodes__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getGroup(), "rule__OntologicalRootClassesItemsBluetooth__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getGroup(), "rule__OntologicalRootClassesItemsNoSCN__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItems__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup_2(), "rule__OntologicalRootClassesItemsAttributesItems__Group_2__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getGroup_2_1(), "rule__OntologicalRootClassesItemsAttributesItems__Group_2_1__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsName__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsType__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsMin__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsMax__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsDefault__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsIsParam__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getGroup(), "rule__OntologicalRootClassesItemsAttributesItemsIsKey__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup(), "rule__OntologicalRootClassesItemsReferencesItems__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup_2(), "rule__OntologicalRootClassesItemsReferencesItems__Group_2__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getGroup_2_1(), "rule__OntologicalRootClassesItemsReferencesItems__Group_2_1__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getGroup(), "rule__OntologicalRootClassesItemsReferencesItemsName__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getGroup(), "rule__OntologicalRootClassesItemsReferencesItemsContaintment__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getGroup(), "rule__OntologicalRootClassesItemsReferencesItemsMin__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getGroup(), "rule__OntologicalRootClassesItemsReferencesItemsMax__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getGroup(), "rule__OntologicalRootClassesItemsReferencesItemsTarget__Group__0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getGroup(), "rule__OntologicalRootClassesItemsReferencesItemsOpposite__Group__0");
			builder.put(grammarAccess.getOntologicalRootAccess().getOntologicalRootAssignment_2_0(), "rule__OntologicalRoot__OntologicalRootAssignment_2_0");
			builder.put(grammarAccess.getOntologicalRootAccess().getOntologicalRootAssignment_2_1_1(), "rule__OntologicalRoot__OntologicalRootAssignment_2_1_1");
			builder.put(grammarAccess.getOntologicalRootNameAccess().getNameAssignment_3(), "rule__OntologicalRootName__NameAssignment_3");
			builder.put(grammarAccess.getOntologicalRootURIAccess().getURIAssignment_2(), "rule__OntologicalRootURI__URIAssignment_2");
			builder.put(grammarAccess.getOntologicalRootOnlyCodesAccess().getOnlyCodesAssignment_2(), "rule__OntologicalRootOnlyCodes__OnlyCodesAssignment_2");
			builder.put(grammarAccess.getOntologicalRootBluetoothAccess().getBluetoothAssignment_2(), "rule__OntologicalRootBluetooth__BluetoothAssignment_2");
			builder.put(grammarAccess.getOntologicalRootExternalAccess().getExternalAssignment_2(), "rule__OntologicalRootExternal__ExternalAssignment_2");
			builder.put(grammarAccess.getOntologicalRootFirebaseAccess().getFirebaseAssignment_2(), "rule__OntologicalRootFirebase__FirebaseAssignment_2");
			builder.put(grammarAccess.getOntologicalRootPhysicsAccess().getPhysicsAssignment_2(), "rule__OntologicalRootPhysics__PhysicsAssignment_2");
			builder.put(grammarAccess.getOntologicalRootGameloopAccess().getGameloopAssignment_2(), "rule__OntologicalRootGameloop__GameloopAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesAccess().getClassesAssignment_4_0(), "rule__OntologicalRootClasses__ClassesAssignment_4_0");
			builder.put(grammarAccess.getOntologicalRootClassesAccess().getClassesAssignment_4_1_1(), "rule__OntologicalRootClasses__ClassesAssignment_4_1_1");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsAssignment_2_0(), "rule__OntologicalRootClassesItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAccess().getItemsAssignment_2_1_1(), "rule__OntologicalRootClassesItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getOntologicalRootClassesItemsNameAccess().getNameAssignment_3(), "rule__OntologicalRootClassesItemsName__NameAssignment_3");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAbstractAccess().getAbstractAssignment_2(), "rule__OntologicalRootClassesItemsAbstract__AbstractAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesAssignment_4_0(), "rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesAccess().getAttributesAssignment_4_1_1(), "rule__OntologicalRootClassesItemsAttributes__AttributesAssignment_4_1_1");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesAssignment_4_0(), "rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesAccess().getReferencesAssignment_4_1_1(), "rule__OntologicalRootClassesItemsReferences__ReferencesAssignment_4_1_1");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAutoIDAccess().getAutoIDAssignment_2(), "rule__OntologicalRootClassesItemsAutoID__AutoIDAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsOnlyCodesAccess().getOnlyCodesAssignment_2(), "rule__OntologicalRootClassesItemsOnlyCodes__OnlyCodesAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsBluetoothAccess().getBluetoothAssignment_2(), "rule__OntologicalRootClassesItemsBluetooth__BluetoothAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsNoSCNAccess().getNoSCNAssignment_2(), "rule__OntologicalRootClassesItemsNoSCN__NoSCNAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsAssignment_2_0(), "rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsAccess().getItemsAssignment_2_1_1(), "rule__OntologicalRootClassesItemsAttributesItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsNameAccess().getNameAssignment_3(), "rule__OntologicalRootClassesItemsAttributesItemsName__NameAssignment_3");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsTypeAccess().getTypeAssignment_2(), "rule__OntologicalRootClassesItemsAttributesItemsType__TypeAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMinAccess().getMinAssignment_2(), "rule__OntologicalRootClassesItemsAttributesItemsMin__MinAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsMaxAccess().getMaxAssignment_2(), "rule__OntologicalRootClassesItemsAttributesItemsMax__MaxAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsDefaultAccess().getDefaultAssignment_2(), "rule__OntologicalRootClassesItemsAttributesItemsDefault__DefaultAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsReadOnlyAccess().getReadOnlyAssignment_2(), "rule__OntologicalRootClassesItemsAttributesItemsReadOnly__ReadOnlyAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsParamAccess().getIsParamAssignment_2(), "rule__OntologicalRootClassesItemsAttributesItemsIsParam__IsParamAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsAttributesItemsIsKeyAccess().getIsKeyAssignment_2(), "rule__OntologicalRootClassesItemsAttributesItemsIsKey__IsKeyAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsAssignment_2_0(), "rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_0");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsAccess().getItemsAssignment_2_1_1(), "rule__OntologicalRootClassesItemsReferencesItems__ItemsAssignment_2_1_1");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsNameAccess().getNameAssignment_3(), "rule__OntologicalRootClassesItemsReferencesItemsName__NameAssignment_3");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsContaintmentAccess().getContaintmentAssignment_2(), "rule__OntologicalRootClassesItemsReferencesItemsContaintment__ContaintmentAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMinAccess().getMinAssignment_2(), "rule__OntologicalRootClassesItemsReferencesItemsMin__MinAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsMaxAccess().getMaxAssignment_2(), "rule__OntologicalRootClassesItemsReferencesItemsMax__MaxAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsTargetAccess().getTargetAssignment_2(), "rule__OntologicalRootClassesItemsReferencesItemsTarget__TargetAssignment_2");
			builder.put(grammarAccess.getOntologicalRootClassesItemsReferencesItemsOppositeAccess().getOppositeAssignment_2(), "rule__OntologicalRootClassesItemsReferencesItemsOpposite__OppositeAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OntologicalGrammarAccess grammarAccess;

	@Override
	protected InternalOntologicalParser createParser() {
		InternalOntologicalParser result = new InternalOntologicalParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OntologicalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OntologicalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}