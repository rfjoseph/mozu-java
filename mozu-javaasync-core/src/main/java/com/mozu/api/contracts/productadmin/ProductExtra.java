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
import com.mozu.api.contracts.productadmin.ProductExtraValue;

/**
 *	Properties of an extra attribute to defined for a product that is associated with a product type that uses the extra. Setting up extras for a product enables shopper-entered information, such as initials for a monogram.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductExtra implements Serializable
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
	 * If true, the shopper can select more than one value from a predefined list for this extra.
	 */
	protected Boolean isMultiSelect;

	public Boolean getIsMultiSelect() {
		return this.isMultiSelect;
	}

	public void setIsMultiSelect(Boolean isMultiSelect) {
		this.isMultiSelect = isMultiSelect;
	}

	/**
	 * Indicates if the property, attribute, product option, or product extra is required. If true, the object must have a defined value.
	 */
	protected Boolean isRequired;

	public Boolean getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(Boolean isRequired) {
		this.isRequired = isRequired;
	}

	/**
	 * List of value data for objects.
	 */
	protected List<ProductExtraValue> values;
	public List<ProductExtraValue> getValues() {
		return this.values;
	}
	public void setValues(List<ProductExtraValue> values) {
		this.values = values;
	}

}
