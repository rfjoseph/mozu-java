/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Validates the attribute configured for the customer in the storefront against the attribute configured in .
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeValidation implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The maximum date allowed including month, day, and year. System-supplied and read-only.
	 */
	protected DateTime maxDateValue;

	public DateTime getMaxDateValue() {
		return this.maxDateValue;
	}

	public void setMaxDateValue(DateTime maxDateValue) {
		this.maxDateValue = maxDateValue;
	}

	/**
	 * The maximum number that can be entered as a value for an extensible attribute.
	 */
	protected Double maxNumericValue;

	public Double getMaxNumericValue() {
		return this.maxNumericValue;
	}

	public void setMaxNumericValue(Double maxNumericValue) {
		this.maxNumericValue = maxNumericValue;
	}

	/**
	 * The maximum character length possible for a string value entered for an extensible attribute.
	 */
	protected Integer maxStringLength;

	public Integer getMaxStringLength() {
		return this.maxStringLength;
	}

	public void setMaxStringLength(Integer maxStringLength) {
		this.maxStringLength = maxStringLength;
	}

	/**
	 * The minimum date allowed including month, day, and year. System-supplied and read-only.
	 */
	protected DateTime minDateValue;

	public DateTime getMinDateValue() {
		return this.minDateValue;
	}

	public void setMinDateValue(DateTime minDateValue) {
		this.minDateValue = minDateValue;
	}

	/**
	 * The minimum numeric value required to validate an extensible attribute.
	 */
	protected Double minNumericValue;

	public Double getMinNumericValue() {
		return this.minNumericValue;
	}

	public void setMinNumericValue(Double minNumericValue) {
		this.minNumericValue = minNumericValue;
	}

	/**
	 * The minimum character length possible for a string value entered for an extensible attribute.
	 */
	protected Integer minStringLength;

	public Integer getMinStringLength() {
		return this.minStringLength;
	}

	public void setMinStringLength(Integer minStringLength) {
		this.minStringLength = minStringLength;
	}

	/**
	 * Regular expression used to process and validate an extensible attribute value that require special formatting, such as phone numbers.
	 */
	protected String regularExpression;

	public String getRegularExpression() {
		return this.regularExpression;
	}

	public void setRegularExpression(String regularExpression) {
		this.regularExpression = regularExpression;
	}

}
