/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.customer;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	The Customer Segment object includes properties of a defined customer segment used to group customer accounts.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerSegment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The user-defined code assigned for the customer segment.
	 */
	protected String code;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * The localized description in text for the object, displayed per the locale code. For example, descriptions are used for product descriptions, attributes, and pre-authorization transaction types.
	 */
	protected String description;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
