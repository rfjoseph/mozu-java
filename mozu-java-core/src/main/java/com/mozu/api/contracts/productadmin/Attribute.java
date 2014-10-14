/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.AttributeMetadataItem;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.AttributeLocalizedContent;
import com.mozu.api.contracts.productadmin.AttributeSearchSettings;
import com.mozu.api.contracts.productadmin.AttributeValidation;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;

/**
 *	Details of an attribute used to describe individual aspects of a product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Attribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The administrative name of the product attribute as it appears in Mozu Admin.
	 */
	protected String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * Merchant-defined identifier of the product attribute used to generate the attribute's fully qualified name.
	 */
	protected String attributeCode;

	public String getAttributeCode() {
		return this.attributeCode;
	}

	public void setAttributeCode(String attributeCode) {
		this.attributeCode = attributeCode;
	}

	/**
	 * Generated sequence that increments for each attribute and data type combination created. This value is system-supplied and read-only.
	 */
	protected Integer attributeDataTypeSequence;

	public Integer getAttributeDataTypeSequence() {
		return this.attributeDataTypeSequence;
	}

	public void setAttributeDataTypeSequence(Integer attributeDataTypeSequence) {
		this.attributeDataTypeSequence = attributeDataTypeSequence;
	}

	/**
	 * The fully qualified name of the attribute, which is a user defined attribute identifier.
	 */
	protected String attributeFQN;

	public String getAttributeFQN() {
		return this.attributeFQN;
	}

	public void setAttributeFQN(String attributeFQN) {
		this.attributeFQN = attributeFQN;
	}

	/**
	 * Generated sequence that increments for each product attribute created. This value is system-supplied and read-only.
	 */
	protected Integer attributeSequence;

	public Integer getAttributeSequence() {
		return this.attributeSequence;
	}

	public void setAttributeSequence(Integer attributeSequence) {
		this.attributeSequence = attributeSequence;
	}

	/**
	 * The data type of the product attribute, which is a Bool, DateTime, Number, or String. The attribute's data type cannot be changed.
	 */
	protected String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * The storefront interface input type for the product attribute, which is a Date, DateTime, List, TextArea, TextBox, or YesNo. The attribute's input type cannot be changed.
	 */
	protected String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	 * If true, the product attribute is an add-on configuration made by the shopper that does not represent a product variation, such as a monogram.
	 */
	protected Boolean isExtra;

	public Boolean getIsExtra() {
		return this.isExtra;
	}

	public void setIsExtra(Boolean isExtra) {
		this.isExtra = isExtra;
	}

	/**
	 * If true, the product attribute is a merchant- or shopper-configurable option, such as size or color, that represents a product variation.
	 */
	protected Boolean isOption;

	public Boolean getIsOption() {
		return this.isOption;
	}

	public void setIsOption(Boolean isOption) {
		this.isOption = isOption;
	}

	/**
	 * If true, the product attribute describes aspects of the product that do not represent an option configurable by the shopper, such as screen resolution or brand.
	 */
	protected Boolean isProperty;

	public Boolean getIsProperty() {
		return this.isProperty;
	}

	public void setIsProperty(Boolean isProperty) {
		this.isProperty = isProperty;
	}

	/**
	 * The unique identifier of the master catalog associated with the entity.
	 */
	protected Integer masterCatalogId;

	public Integer getMasterCatalogId() {
		return this.masterCatalogId;
	}

	public void setMasterCatalogId(Integer masterCatalogId) {
		this.masterCatalogId = masterCatalogId;
	}

	/**
	 * If applicable, the registered namespace associated with the product attribute, used to generate the fully qualified name. If no namespace is defined, the namespace associated with the tenant is automatically assigned.
	 */
	protected String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * The type of value associated with the product attribute, which is ShopperEntered (the shopper selects or enters an attribute value during checkout), Predefined (the merchant sets the attribute value from a list during product attribute definition), or AdminEntered (the merchant selects or enters a value during product definition). The attribute value type cannot be changed.
	 */
	protected String valueType;

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	/**
	 * List of key-value pairs that store metadata associated with the product attribute.
	 */
	protected List<AttributeMetadataItem> attributeMetadata;
	public List<AttributeMetadataItem> getAttributeMetadata() {
		return this.attributeMetadata;
	}
	public void setAttributeMetadata(List<AttributeMetadataItem> attributeMetadata) {
		this.attributeMetadata = attributeMetadata;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Complex type that contains content for a language specified by LocaleCode.
	 */
	protected AttributeLocalizedContent content;

	public AttributeLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(AttributeLocalizedContent content) {
		this.content = content;
	}

	protected List<AttributeLocalizedContent> localizedContent;
	public List<AttributeLocalizedContent> getLocalizedContent() {
		return this.localizedContent;
	}
	public void setLocalizedContent(List<AttributeLocalizedContent> localizedContent) {
		this.localizedContent = localizedContent;
	}

	/**
	 * This API type provides the search and indexing settings for the attribute.
	 */
	protected AttributeSearchSettings searchSettings;

	public AttributeSearchSettings getSearchSettings() {
		return this.searchSettings;
	}

	public void setSearchSettings(AttributeSearchSettings searchSettings) {
		this.searchSettings = searchSettings;
	}

	/**
	 * Properties of the validation of a product attribute, which contains rules that dictate what values are valid entries for product attributes.
	 */
	protected AttributeValidation validation;

	public AttributeValidation getValidation() {
		return this.validation;
	}

	public void setValidation(AttributeValidation validation) {
		this.validation = validation;
	}

	/**
	 * Array list of the defined vocabulary values for the specified product attribute. For example, for a Color attribute, vocabulary values might include black, white, and purple.
	 */
	protected List<AttributeVocabularyValue> vocabularyValues;
	public List<AttributeVocabularyValue> getVocabularyValues() {
		return this.vocabularyValues;
	}
	public void setVocabularyValues(List<AttributeVocabularyValue> vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}

}
