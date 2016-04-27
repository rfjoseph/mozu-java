/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Field within a view of the content.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewField implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

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
	 * Targets represent the object, such as an item to apply discounts (products or orders) or a view field for content. When accessing MZDB APIs for Mongo interactions, targets are the dot notation that links to the source document property. For example, firstitem for the direc level or firstitem.seconditem.thirditem for a deeper property.              
	 */
	protected String target;

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

}
