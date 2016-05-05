/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.Discount;

/**
 *	List of discounts the shopper can redeem for a product in its current state.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiscountValidationSummary implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * List of discounts available per configured conditions and criteria. These discounts are associated with products, orders, and shipping costs. Shoppers can view these discounts per order, per product in an order, or for their shipping depending on the configuration.
	 */
	protected List<Discount> applicableDiscounts;
	public List<Discount> getApplicableDiscounts() {
		return this.applicableDiscounts;
	}
	public void setApplicableDiscounts(List<Discount> applicableDiscounts) {
		this.applicableDiscounts = applicableDiscounts;
	}

}
