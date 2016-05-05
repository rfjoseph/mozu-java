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
 *	For range type facets, a single range of facet values. For example, a price facet might have a $0-$25 range query.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetRangeQuery implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The maximum value to use for the facet range query.
	 */
	protected Object rangeValueEnd;

	public Object getRangeValueEnd() {
		return this.rangeValueEnd;
	}

	public void setRangeValueEnd(Object rangeValueEnd) {
		this.rangeValueEnd = rangeValueEnd;
	}

	/**
	 * The minimum value to use for the facet range query.
	 */
	protected Object rangeValueStart;

	public Object getRangeValueStart() {
		return this.rangeValueStart;
	}

	public void setRangeValueStart(Object rangeValueStart) {
		this.rangeValueStart = rangeValueStart;
	}

}
