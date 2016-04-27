/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.sitesettings.order.VocabularyValue;

/**
 *	The properties of the credentials required to communicate with the external payment processor.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThirdPartyCredentialField implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * System-supplied API name required to communicate with the external payment processor.
	 */
	protected String apiName;

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	/**
	 * The name that displays for the payment gateway or third-party credentials field. 
	 */
	protected String displayName;

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * The type of input selection used to define a value for the attribute, including Yes/No, Date, DateTime, List, TextBox, or TextArea.
	 */
	protected String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	/**
	 * the value holds sensitive information.
	 */
	protected Boolean isSensitive;

	public Boolean getIsSensitive() {
		return this.isSensitive;
	}

	public void setIsSensitive(Boolean isSensitive) {
		this.isSensitive = isSensitive;
	}

	/**
	 * The value of a property, used by numerous objects within Mozu including facets, attributes, products, localized content, metadata, capabilities (Mozu and third-party), location inventory adjustment, and more. The value may be a string, integer, or double. Validation may be run against the entered and saved values depending on the object type.
	 */
	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * List of valid vocabulary values defined for an attribute.
	 */
	protected List<VocabularyValue> vocabularyValues;
	public List<VocabularyValue> getVocabularyValues() {
		return this.vocabularyValues;
	}
	public void setVocabularyValues(List<VocabularyValue> vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}

}
