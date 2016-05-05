/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.Discount;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.BundledProduct;
import com.mozu.api.contracts.productadmin.ProductLocalizedContent;
import com.mozu.api.contracts.productadmin.ProductExtra;
import com.mozu.api.contracts.productadmin.ProductInventoryInfo;
import com.mozu.api.contracts.productadmin.ProductOption;
import com.mozu.api.contracts.core.Measurement;
import com.mozu.api.contracts.productadmin.ProductPrice;
import com.mozu.api.contracts.productadmin.ProductPricingBehaviorInfo;
import com.mozu.api.contracts.productadmin.ProductInCatalogInfo;
import com.mozu.api.contracts.productadmin.ProductProperty;
import com.mozu.api.contracts.productadmin.ProductPublishingInfo;
import com.mozu.api.contracts.productadmin.ProductLocalizedSEOContent;
import com.mozu.api.contracts.productadmin.ProductSupplierInfo;
import com.mozu.api.contracts.productadmin.ProductVariationOption;

/**
 *	The properties of a product, referenced and used by carts, orders, wish lists, and returns.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Product code defined by the tenant administrator to use as a base prefix when generating product codes for any variations of this product.
	 */
	protected String baseProductCode;

	public String getBaseProductCode() {
		return this.baseProductCode;
	}

	public void setBaseProductCode(String baseProductCode) {
		this.baseProductCode = baseProductCode;
	}

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
	 * If true, the product has configurable options. This option means that a product is not purchasable until the shopper selects options that resolve into a product variation. Configurable options for a product are the choices a shopper makes when ordering a product. Size and color are configurable options. System-supplied and read-only.
	 */
	protected Boolean hasConfigurableOptions;

	public Boolean getHasConfigurableOptions() {
		return this.hasConfigurableOptions;
	}

	public void setHasConfigurableOptions(Boolean hasConfigurableOptions) {
		this.hasConfigurableOptions = hasConfigurableOptions;
	}

	/**
	 * If true, this product has standalone options that a shopper can select without configuring a defined product variations. System-supplied and read only.
	 */
	protected Boolean hasStandAloneOptions;

	public Boolean getHasStandAloneOptions() {
		return this.hasStandAloneOptions;
	}

	public void setHasStandAloneOptions(Boolean hasStandAloneOptions) {
		this.hasStandAloneOptions = hasStandAloneOptions;
	}

	/**
	 * Indicates if the product must be shipped alone in a container. This is used for products and products within a bundle. If true, this product cannot be shipped in a package with other items and must ship in a package by itself.
	 */
	protected Boolean isPackagedStandAlone;

	public Boolean getIsPackagedStandAlone() {
		return this.isPackagedStandAlone;
	}

	public void setIsPackagedStandAlone(Boolean isPackagedStandAlone) {
		this.isPackagedStandAlone = isPackagedStandAlone;
	}

	/**
	 * Indicates if the product in a cart, order, or wish list is purchased on a recurring schedule. If true, the item can be purchased or fulfilled at regular intervals, such as a monthly billing cycle. For example, digital or physical product subscriptions are recurring cart items. This property is not used at this time and is reserved for future functionality.
	 */
	protected Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * Indicates if the item is subject to taxation, used by products, options, extras, cart and order items, line items, and wish lists. If true, the entity is subject to tax based on the relevant tax rate and rules.
	 */
	protected Boolean isTaxable;

	public Boolean getIsTaxable() {
		return this.isTaxable;
	}

	public void setIsTaxable(Boolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	/**
	 * If true, this product is valid for the assigned product type.
	 */
	protected Boolean isValidForProductType;

	public Boolean getIsValidForProductType() {
		return this.isValidForProductType;
	}

	public void setIsValidForProductType(Boolean isValidForProductType) {
		this.isValidForProductType = isValidForProductType;
	}

	/**
	 * If true, this configured product represents a product variation defined with configurable options. System-supplied and read only.
	 */
	protected Boolean isVariation;

	public Boolean getIsVariation() {
		return this.isVariation;
	}

	public void setIsVariation(Boolean isVariation) {
		this.isVariation = isVariation;
	}

	/**
	 * The unique identifier of the master catalog associated with the entity.
	 */
	protected Integer masterCatalogId;

	public Integer getMasterCatalogId() {
		return this.masterCatalogId;
	}

	public void setMasterCatalogId(Integer masterCatalogId) {
		this.masterCatalogId = masterCatalogId;
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
	 * Integer that represents the sequential order of the product.
	 */
	protected Integer productSequence;

	public Integer getProductSequence() {
		return this.productSequence;
	}

	public void setProductSequence(Integer productSequence) {
		this.productSequence = productSequence;
	}

	/**
	 * Unique identifier of the product type assigned for this product. Tenant administrators can only define one product type per product.
	 */
	protected Integer productTypeId;

	public Integer getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	/**
	 * The usage type that applies to this product, which is Standard (a single product without configurable options), Configurable (a product that includes configurable option attributes), Bundle (a collection of products sold as a single entity), or Component (an invididual product that represents a component in a bundle).
	 */
	protected String productUsage;

	public String getProductUsage() {
		return this.productUsage;
	}

	public void setProductUsage(String productUsage) {
		this.productUsage = productUsage;
	}

	/**
	 * Identifier of the shipping class.
	 */
	protected Integer shippingClassId;

	public Integer getShippingClassId() {
		return this.shippingClassId;
	}

	public void setShippingClassId(Integer shippingClassId) {
		this.shippingClassId = shippingClassId;
	}

	/**
	 * If the product must be packaged separately, the type of standalone package to use.
	 */
	protected String standAlonePackageType;

	public String getStandAlonePackageType() {
		return this.standAlonePackageType;
	}

	public void setStandAlonePackageType(String standAlonePackageType) {
		this.standAlonePackageType = standAlonePackageType;
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
	 * System-generated key that represents the attribute values that uniquely identify a specific product variation.
	 */
	protected String variationKey;

	public String getVariationKey() {
		return this.variationKey;
	}

	public void setVariationKey(String variationKey) {
		this.variationKey = variationKey;
	}

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

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Properties of a collection of component products that make up a single product bundle with its own product code. Tenants can define product bundles for any product type that supports the Bundle product usage.
	 */
	protected List<BundledProduct> bundledProducts;
	public List<BundledProduct> getBundledProducts() {
		return this.bundledProducts;
	}
	public void setBundledProducts(List<BundledProduct> bundledProducts) {
		this.bundledProducts = bundledProducts;
	}

	protected ProductLocalizedContent content;

	public ProductLocalizedContent getContent() {
		return this.content;
	}

	public void setContent(ProductLocalizedContent content) {
		this.content = content;
	}

	/**
	 * List of extra product attributes defined for this product. For example, monogram could be a possible extra for a shirt product.
	 */
	protected List<ProductExtra> extras;
	public List<ProductExtra> getExtras() {
		return this.extras;
	}
	public void setExtras(List<ProductExtra> extras) {
		this.extras = extras;
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
	 * Height of a package or bundle package in imperial units of feet and inches.
	 */
	protected Measurement packageHeight;

	public Measurement getPackageHeight() {
		return this.packageHeight;
	}

	public void setPackageHeight(Measurement packageHeight) {
		this.packageHeight = packageHeight;
	}

	/**
	 * Length of a package or bundle package in imperial units of feet and inches.
	 */
	protected Measurement packageLength;

	public Measurement getPackageLength() {
		return this.packageLength;
	}

	public void setPackageLength(Measurement packageLength) {
		this.packageLength = packageLength;
	}

	/**
	 * Weight of a package or bundle package in imperial units of pounds and ounces.
	 */
	protected Measurement packageWeight;

	public Measurement getPackageWeight() {
		return this.packageWeight;
	}

	public void setPackageWeight(Measurement packageWeight) {
		this.packageWeight = packageWeight;
	}

	/**
	 * Width of a package or bundle package in imperial units of feet and inches.
	 */
	protected Measurement packageWidth;

	public Measurement getPackageWidth() {
		return this.packageWidth;
	}

	public void setPackageWidth(Measurement packageWidth) {
		this.packageWidth = packageWidth;
	}

	/**
	 * Unit price that the client intends to sell the product if no sale price is set.
	 */
	protected ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	/**
	 * Properties that describe the behavior the system uses when determining the price of products.
	 */
	protected ProductPricingBehaviorInfo pricingBehavior;

	public ProductPricingBehaviorInfo getPricingBehavior() {
		return this.pricingBehavior;
	}

	public void setPricingBehavior(ProductPricingBehaviorInfo pricingBehavior) {
		this.pricingBehavior = pricingBehavior;
	}

	/**
	 * Properties defined for a product as they appear in its associated catalogs.
	 */
	protected List<ProductInCatalogInfo> productInCatalogs;
	public List<ProductInCatalogInfo> getProductInCatalogs() {
		return this.productInCatalogs;
	}
	public void setProductInCatalogs(List<ProductInCatalogInfo> productInCatalogs) {
		this.productInCatalogs = productInCatalogs;
	}

	/**
	 * Collection of property attributes defined for the object. Properties are associated to all objects within Mozu, including documents, products, and product types.
	 */
	protected List<ProductProperty> properties;
	public List<ProductProperty> getProperties() {
		return this.properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}

	/**
	 * Properties of the product publishing settings for the associated product.
	 */
	protected ProductPublishingInfo publishingInfo;

	public ProductPublishingInfo getPublishingInfo() {
		return this.publishingInfo;
	}

	public void setPublishingInfo(ProductPublishingInfo publishingInfo) {
		this.publishingInfo = publishingInfo;
	}

	/**
	 * The search engine optimized content defined for products or products associated with a catalog. If no SEO content is specified in the request for products associated with a catalog, this catalog uses the SEO content defined in the master catalog. To override the SEO content for this catalog, the `IsSEOContentOverridden `flag must be set to "true".
	 */
	protected ProductLocalizedSEOContent seoContent;

	public ProductLocalizedSEOContent getSeoContent() {
		return this.seoContent;
	}

	public void setSeoContent(ProductLocalizedSEOContent seoContent) {
		this.seoContent = seoContent;
	}

	/**
	 * Supplier-defined properties assigned for the product.
	 */
	protected ProductSupplierInfo supplierInfo;

	public ProductSupplierInfo getSupplierInfo() {
		return this.supplierInfo;
	}

	public void setSupplierInfo(ProductSupplierInfo supplierInfo) {
		this.supplierInfo = supplierInfo;
	}

	/**
	 * The list of product variation configurations defined for this product based on its available product option attributes.
	 */
	protected List<ProductVariationOption> variationOptions;
	public List<ProductVariationOption> getVariationOptions() {
		return this.variationOptions;
	}
	public void setVariationOptions(List<ProductVariationOption> variationOptions) {
		this.variationOptions = variationOptions;
	}

}
