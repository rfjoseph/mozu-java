/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.products;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	An option attribute configured for a product on a storefront.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductOption implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

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
	 * The data type of the source product property, typically of type Bool, DateTime, Number, or String.
	 */
	protected String dataType;

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * The display name of the source product property. For a product field it will be the display name of the field. For a product attribute it will be the Attribute Name.
	 */
	protected String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The value a shopper entered for an attribute that requires additional input for the product on a storefront. This entered value is a selected option or entered content for an extra, such as selecting a color or entering content for a monogram.
	 */
	protected Object shopperEnteredValue;

	public Object getShopperEnteredValue() {
		return this.shopperEnteredValue;
	}

	public void setShopperEnteredValue(Object shopperEnteredValue) {
		this.shopperEnteredValue = shopperEnteredValue;
	}

	/**
	 * If the object value is a String, this value provides that string value, used by vocabulary property values, products, and options.
	 */
	protected String stringValue;

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

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

}
