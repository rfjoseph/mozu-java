/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.extensible;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The localized name and description of the attribute, displayed in the locale defined for the master catalog.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeLocalizedContent implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Language used for the entity. Currently, only "en-US" is supported.
	 */
	protected String localeCode;

	public String getLocaleCode() {
		return this.localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
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

}
