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
import com.mozu.api.contracts.core.AuditInfo;

/**
 *	Mozu.ProductAdmin.Contracts.Coupon ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coupon implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.ProductAdmin.Contracts.Coupon canBeDeleted ApiTypeMember DOCUMENT_HERE 
	 */
	protected Boolean canBeDeleted;

	public Boolean getCanBeDeleted() {
		return this.canBeDeleted;
	}

	public void setCanBeDeleted(Boolean canBeDeleted) {
		this.canBeDeleted = canBeDeleted;
	}

	/**
	 * Code of a discount coupon. This code can be used by a shopper when a coupon code is required to earn the associated discount on a purchase.
	 */
	protected String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * Link to associated coupon
	 */
	protected String couponSetCode;

	public String getCouponSetCode() {
		return this.couponSetCode;
	}

	public void setCouponSetCode(String couponSetCode) {
		this.couponSetCode = couponSetCode;
	}

	/**
	 * ReadOnly system id for releated couponset.
	 */
	protected Integer couponSetId;

	public Integer getCouponSetId() {
		return this.couponSetId;
	}

	public void setCouponSetId(Integer couponSetId) {
		this.couponSetId = couponSetId;
	}

	/**
	 * Total number of times this code has been redeemed. ReadOnly, calculated. Only returned with response group includeCounts
	 */
	protected Integer redemptionCount;

	public Integer getRedemptionCount() {
		return this.redemptionCount;
	}

	public void setRedemptionCount(Integer redemptionCount) {
		this.redemptionCount = redemptionCount;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

}
