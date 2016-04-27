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
import com.mozu.api.contracts.productruntime.ProductInventoryInfo;
import com.mozu.api.contracts.productruntime.PackageMeasurements;
import com.mozu.api.contracts.productruntime.ProductOption;
import com.mozu.api.contracts.productruntime.ProductPrice;
import com.mozu.api.contracts.productruntime.ProductPriceRange;
import com.mozu.api.contracts.productruntime.ProductPurchasableState;

/**
 *	Properties of a product configuration with shopper-selected options.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfiguredProduct implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * List of supported types of fulfillment  for the product or variation. The types include direct ship, in-store pickup, or both. 
	 */
	protected List<String> fulfillmentTypesSupported;
	public List<String> getFulfillmentTypesSupported() {
		return this.fulfillmentTypesSupported;
	}
	public void setFulfillmentTypesSupported(List<String> fulfillmentTypesSupported) {
		this.fulfillmentTypesSupported = fulfillmentTypesSupported;
	}

	/**
	 * The manufacturer's part number for the product.
	 */
	protected String mfgPartNumber;

	public String getMfgPartNumber() {
		return this.mfgPartNumber;
	}

	public void setMfgPartNumber(String mfgPartNumber) {
		this.mfgPartNumber = mfgPartNumber;
	}

	/**
	 * Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 */
	protected String productCode;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * The universal product code (UPC) is the barcode defined for the product. The UPC is unique across all sales channels. 
	 */
	protected String upc;

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	/**
	 * Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 */
	protected String variationProductCode;

	public String getVariationProductCode() {
		return this.variationProductCode;
	}

	public void setVariationProductCode(String variationProductCode) {
		this.variationProductCode = variationProductCode;
	}

	/**
	 * List of shipping discounts that can be applied to the configured product. These discounts are calculated and updated as shoppers add content to their cart and continue checkout steps to order submission.
	 */
	protected List<Discount> availableShippingDiscounts;
	public List<Discount> getAvailableShippingDiscounts() {
		return this.availableShippingDiscounts;
	}
	public void setAvailableShippingDiscounts(List<Discount> availableShippingDiscounts) {
		this.availableShippingDiscounts = availableShippingDiscounts;
	}

	/**
	 * Properties and data of inventory information for configured and bundled products. If product stock is managed, the data specifies out of stock behavior.
	 */
	protected ProductInventoryInfo inventoryInfo;

	public ProductInventoryInfo getInventoryInfo() {
		return this.inventoryInfo;
	}

	public void setInventoryInfo(ProductInventoryInfo inventoryInfo) {
		this.inventoryInfo = inventoryInfo;
	}

	/**
	 * Dimensions of the packaged product.
	 */
	protected PackageMeasurements measurements;

	public PackageMeasurements getMeasurements() {
		return this.measurements;
	}

	public void setMeasurements(PackageMeasurements measurements) {
		this.measurements = measurements;
	}

	/**
	 * List of option attributes configured for an object. These values are associated and used by products, product bundles, and product types.
	 */
	protected List<ProductOption> options;
	public List<ProductOption> getOptions() {
		return this.options;
	}
	public void setOptions(List<ProductOption> options) {
		this.options = options;
	}

	/**
	 * Unit price that the tenant intends to sell the product if no sale price is set.
	 */
	protected ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	/**
	 * For products with options that vary the cost of the product, the range between lowest and highest possible price of the product based on the current selection of options.
	 */
	protected ProductPriceRange priceRange;

	public ProductPriceRange getPriceRange() {
		return this.priceRange;
	}

	public void setPriceRange(ProductPriceRange priceRange) {
		this.priceRange = priceRange;
	}

	/**
	 * The current state of the configured product determines whether or not the product is eligible for purchase. Products with options are only purchasable if the shopper has selected all required options. If the product is not ready for purchase, a message lists missing options that are required.
	 */
	protected ProductPurchasableState purchasableState;

	public ProductPurchasableState getPurchasableState() {
		return this.purchasableState;
	}

	public void setPurchasableState(ProductPurchasableState purchasableState) {
		this.purchasableState = purchasableState;
	}

}
