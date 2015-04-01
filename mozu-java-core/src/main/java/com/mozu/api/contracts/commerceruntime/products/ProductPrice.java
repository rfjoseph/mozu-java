/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.products;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	The price of a product that appears on a storefront after any applied discounts.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The credit value of the product or bundled product. When the `goodsType `is `DigitalCredit`, this value is populated to indicate the value of the credit. This is used to create store credit in the fulfillment of gift cards.
	 */
	protected Double creditValue;

	public Double getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(Double creditValue) {
		this.creditValue = creditValue;
	}

	/**
	 * The manufacturer's suggested retail price for the product. This content may be defined by the supplier.
	 */
	protected Double msrp;

	public Double getMsrp() {
		return this.msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	/**
	 * The price the merchant charges for a product on a storefront if no sales price is defined.
	 */
	protected Double price;

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * The set sale price for a product consisting of a price with a discount already applied.
	 */
	protected Double salePrice;

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	/**
	 * The override price defined by the tenant for this cart or order item.
	 */
	protected Double tenantOverridePrice;

	public Double getTenantOverridePrice() {
		return this.tenantOverridePrice;
	}

	public void setTenantOverridePrice(Double tenantOverridePrice) {
		this.tenantOverridePrice = tenantOverridePrice;
	}

}
