/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.AttributeVocabularyValue;
import com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent;

/**
 *	Properties of a value for a product property.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPropertyValue implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The value of a property, used by numerous objects within Mozu including facets, attributes, products, localized content, metadata, capabilities (Mozu and third-party), location inventory adjustment, and more. The value may be a string, integer, or double. Validation may be run against the entered and saved values depending on the object type.
	 */
	protected Object value;

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	/**
	 * Properties of an individual vocabulary value for an attribute. For example, a "color" attribute might have the following vocabulary values: Red, Blue, Green.
	 */
	protected AttributeVocabularyValue attributeVocabularyValueDetail;

	public AttributeVocabularyValue getAttributeVocabularyValueDetail() {
		return this.attributeVocabularyValueDetail;
	}

	public void setAttributeVocabularyValueDetail(AttributeVocabularyValue attributeVocabularyValueDetail) {
		this.attributeVocabularyValueDetail = attributeVocabularyValueDetail;
	}

	/**
	 * Localizable content (such as a name and/or description) for an attribute. The content may be localized when displayed according to the locale code specified by the master catalog. Content can include descriptive text for product extensible attributes, catalog-level descriptions (displayed if isContentOverriden is true), product bundles, and customer account notes.
	 */
	protected ProductPropertyValueLocalizedContent content;

	public ProductPropertyValueLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(ProductPropertyValueLocalizedContent content) {
		this.content = content;
	}

	/**
	 * The localized content of an attribute determined by the `localeCode`. This content is always in the default language of the MasterCatalog.
	 */
	protected List<ProductPropertyValueLocalizedContent> localizedContent;
	public List<ProductPropertyValueLocalizedContent> getLocalizedContent() {
		return this.localizedContent;
	}
	public void setLocalizedContent(List<ProductPropertyValueLocalizedContent> localizedContent) {
		this.localizedContent = localizedContent;
	}

}
