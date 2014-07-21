/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Storefront Products  resource to manage the shopper product selection process during a visit to the web storefront. You can update product options as shoppers pick and choose their product choices. A shopper cannot add a product to a cart until all of its required options have been selected.
 * </summary>
 */
public class ProductClient {
	
	/**
	 * Retrieves a list of products that appear on the storefront according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient=GetProductsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> getProductsClient() throws Exception
	{
		return getProductsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of products that appear on the storefront according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient=GetProductsClient( filter,  startIndex,  pageSize,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductCollection productCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductCollection>
	 * @see com.mozu.api.contracts.productruntime.ProductCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> getProductsClient(String filter, Integer startIndex, Integer pageSize, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the active inventory level information associated with the product or location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoryClient( productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoryClient(String productCode) throws Exception
	{
		return getProductInventoryClient( productCode,  null,  null);
	}

	/**
	 * Retrieves the active inventory level information associated with the product or location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoryClient( productCode,  locationCodes,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param locationCodes Array of location codes for which to retrieve product inventory information.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoryClient(String productCode, String locationCodes, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductInventoryUrl(locationCodes, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves information about a single product given its product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductClient( productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductClient(String productCode) throws Exception
	{
		return getProductClient( productCode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves information about a single product given its product code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient=GetProductClient( productCode,  variationProductCode,  allowInactive,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Product product = client.Result();
	 * </code></pre></p>
	 * @param allowInactive If true, returns an inactive product as part of the query.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @param skipInventoryCheck If true, skip the inventory validation process for the specified product.
	 * @param variationProductCode Merchant-created code associated with a specific product variation. Variation product codes maintain an association with the base product code.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.Product>
	 * @see com.mozu.api.contracts.productruntime.Product
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.Product> getProductClient(String productCode, String variationProductCode, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductUrl(allowInactive, productCode, responseFields, skipInventoryCheck, variationProductCode);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.Product.class;
		MozuClient<com.mozu.api.contracts.productruntime.Product> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new product configuration each time a shopper selects a product option value. After the shopper defines values for all required product options, the shopper can add the product configuration to a cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient=ConfiguredProductClient( productOptionSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ConfiguredProduct configuredProduct = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ConfiguredProduct>
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> configuredProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return configuredProductClient( productOptionSelections,  productCode,  null,  null,  null);
	}

	/**
	 * Creates a new product configuration each time a shopper selects a product option value. After the shopper defines values for all required product options, the shopper can add the product configuration to a cart.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient=ConfiguredProductClient( productOptionSelections,  productCode,  includeOptionDetails,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ConfiguredProduct configuredProduct = client.Result();
	 * </code></pre></p>
	 * @param includeOptionDetails If true, the response returns details about the product. If false, returns a product summary such as the product name, price, and sale price.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @param skipInventoryCheck If true, skip the inventory validation process for the specified product.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ConfiguredProduct>
	 * @see com.mozu.api.contracts.productruntime.ConfiguredProduct
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> configuredProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean includeOptionDetails, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.configuredProductUrl(includeOptionDetails, productCode, responseFields, skipInventoryCheck);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.ConfiguredProduct.class;
		MozuClient<com.mozu.api.contracts.productruntime.ConfiguredProduct> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionSelections);
		return mozuClient;

	}

	/**
	 * Validate the final state of shopper-selected options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient=ValidateProductClient( productOptionSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductValidationSummary productValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> validateProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode) throws Exception
	{
		return validateProductClient( productOptionSelections,  productCode,  null,  null);
	}

	/**
	 * Validate the final state of shopper-selected options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient=ValidateProductClient( productOptionSelections,  productCode,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductValidationSummary productValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields 
	 * @param skipInventoryCheck If true, skip the inventory validation process for the specified product.
	 * @param productOptionSelections For a product with shopper-configurable options, the properties of the product options selected by the shopper.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.ProductValidationSummary
	 * @see com.mozu.api.contracts.productruntime.ProductOptionSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> validateProductClient(com.mozu.api.contracts.productruntime.ProductOptionSelections productOptionSelections, String productCode, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.validateProductUrl(productCode, responseFields, skipInventoryCheck);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductValidationSummary.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductValidationSummary> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productOptionSelections);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient=ValidateDiscountsClient( discountSelections,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountValidationSummary discountValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param productCode 
	 * @param discountSelections 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.DiscountValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> validateDiscountsClient(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode) throws Exception
	{
		return validateDiscountsClient( discountSelections,  productCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient=ValidateDiscountsClient( discountSelections,  productCode,  variationProductCode,  customerAccountId,  allowInactive,  skipInventoryCheck,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DiscountValidationSummary discountValidationSummary = client.Result();
	 * </code></pre></p>
	 * @param allowInactive 
	 * @param customerAccountId 
	 * @param productCode 
	 * @param responseFields 
	 * @param skipInventoryCheck 
	 * @param variationProductCode 
	 * @param discountSelections 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.DiscountValidationSummary>
	 * @see com.mozu.api.contracts.productruntime.DiscountValidationSummary
	 * @see com.mozu.api.contracts.productruntime.DiscountSelections
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> validateDiscountsClient(com.mozu.api.contracts.productruntime.DiscountSelections discountSelections, String productCode, String variationProductCode, Integer customerAccountId, Boolean allowInactive, Boolean skipInventoryCheck, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.validateDiscountsUrl(allowInactive, customerAccountId, productCode, responseFields, skipInventoryCheck, variationProductCode);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.DiscountValidationSummary.class;
		MozuClient<com.mozu.api.contracts.productruntime.DiscountValidationSummary> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(discountSelections);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoriesClient( query);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param query 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoriesClient(com.mozu.api.contracts.productruntime.LocationInventoryQuery query) throws Exception
	{
		return getProductInventoriesClient( query,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient=GetProductInventoriesClient( query,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationInventoryCollection locationInventoryCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields 
	 * @param query 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.LocationInventoryCollection>
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productruntime.LocationInventoryQuery
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> getProductInventoriesClient(com.mozu.api.contracts.productruntime.LocationInventoryQuery query, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductUrl.getProductInventoriesUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productruntime.LocationInventoryCollection.class;
		MozuClient<com.mozu.api.contracts.productruntime.LocationInventoryCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(query);
		return mozuClient;

	}

}



