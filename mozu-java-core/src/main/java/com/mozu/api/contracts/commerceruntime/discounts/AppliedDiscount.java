/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.discounts;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.discounts.Discount;

/**
 *	The discount currently applied to the cart or order, represented as a negative currency amount to be subtracted from the final price. If multiple discounts are applied to the same order, the Applied Discount displays the most valuable discount for the shopper.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppliedDiscount implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Alphanumeric code associated with the coupon or promotion that results in a discounted price.
	 */
	protected  String couponCode;

	public String getCouponCode() {
		return this.couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * Indicates if a discount is not used for the product or product line item in an order. If true, the system ignores this discount when pricing the order.
	 */
	protected  Boolean excluded;

	public Boolean getExcluded() {
		return this.excluded;
	}

	public void setExcluded(Boolean excluded) {
		this.excluded = excluded;
	}

	/**
	 * The value of the discount applied to the cart or order, represented as a negative currency amount to apply to the original price.
	 */
	protected  Double impact;

	public Double getImpact() {
		return this.impact;
	}

	public void setImpact(Double impact) {
		this.impact = impact;
	}

	/**
	 * Name of the discount added and applied to a shopping cart and order for a shopper's purchase. 
	 */
	protected  Discount discount;

	public Discount getDiscount() {
		return this.discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}


}
