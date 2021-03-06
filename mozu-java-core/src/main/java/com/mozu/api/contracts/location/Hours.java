/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.location;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Container for the label that describes the range of operating hours for a location.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hours implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Descriptive text used as a label for objects, such as field names, facets, date ranges, contact information, and package information.
	 */
	protected  String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


}
