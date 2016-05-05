/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.products;

import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Extras resource to configure an extra product attribute for products associated with the product type that uses the extra attribute.
 * </summary>
 */
public class ProductExtraClient {
	
	/**
	 * Retrieves a list of extras configured for the product according to any defined filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtra>> mozuClient=GetExtrasClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtra productExtra = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductExtra>>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtra>> getExtrasClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.getExtrasUrl(productCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductExtra>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtra>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtra>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves a collection of all localized delta price values for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> mozuClient=GetExtraValueLocalizedDeltaPricesClient(dataViewMode,  productCode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> getExtraValueLocalizedDeltaPricesClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.getExtraValueLocalizedDeltaPricesUrl(attributeFQN, productCode, value);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the localized delta price value for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient=GetExtraValueLocalizedDeltaPriceClient(dataViewMode,  productCode,  attributeFQN,  value,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> getExtraValueLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String currencyCode) throws Exception
	{
		return getExtraValueLocalizedDeltaPriceClient(dataViewMode,  productCode,  attributeFQN,  value,  currencyCode,  null);
	}

	/**
	 * Retrieves the localized delta price value for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient=GetExtraValueLocalizedDeltaPriceClient(dataViewMode,  productCode,  attributeFQN,  value,  currencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> getExtraValueLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String currencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.getExtraValueLocalizedDeltaPriceUrl(attributeFQN, currencyCode, productCode, responseFields, value);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of an extra attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient=GetExtraClient(dataViewMode,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtra productExtra = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> getExtraClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		return getExtraClient(dataViewMode,  productCode,  attributeFQN,  null);
	}

	/**
	 * Retrieves the details of an extra attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient=GetExtraClient(dataViewMode,  productCode,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtra productExtra = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> getExtraClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.getExtraUrl(attributeFQN, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductExtra.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductExtra>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Adds a localized delta price value for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient=AddExtraValueLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @param localizedDeltaPrice The properties of the price difference between the product extra and the base product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> addExtraValueLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value) throws Exception
	{
		return addExtraValueLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value,  null);
	}

	/**
	 * Adds a localized delta price value for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient=AddExtraValueLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param localizedDeltaPrice The properties of the price difference between the product extra and the base product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> addExtraValueLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.addExtraValueLocalizedDeltaPriceUrl(attributeFQN, productCode, responseFields, value);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedDeltaPrice);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Configure an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient=AddExtraClient(dataViewMode,  productExtra,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtra productExtra = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of an extra attribute to defined for a product that is associated with a product type that uses the extra. Setting up extras for a product enables shopper-entered information, such as initials for a monogram.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> addExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode) throws Exception
	{
		return addExtraClient(dataViewMode,  productExtra,  productCode,  null);
	}

	/**
	 * Configure an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient=AddExtraClient(dataViewMode,  productExtra,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtra productExtra = client.Result();
	 * </code></pre></p>
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productExtra Properties of an extra attribute to defined for a product that is associated with a product type that uses the extra. Setting up extras for a product enables shopper-entered information, such as initials for a monogram.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> addExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.addExtraUrl(productCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductExtra.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductExtra>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productExtra);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates all localized delta price values for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> mozuClient=UpdateExtraValueLocalizedDeltaPricesClient(dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @param localizedDeltaPrice The properties of the price difference between the product extra and the base product.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> updateExtraValueLocalizedDeltaPricesClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> localizedDeltaPrice, String productCode, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.updateExtraValueLocalizedDeltaPricesUrl(attributeFQN, productCode, value);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedDeltaPrice);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates the localized delta price value for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient=UpdateExtraValueLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @param localizedDeltaPrice The properties of the price difference between the product extra and the base product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> updateExtraValueLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value, String currencyCode) throws Exception
	{
		return updateExtraValueLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value,  currencyCode,  null);
	}

	/**
	 * Updates the localized delta price value for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient=UpdateExtraValueLocalizedDeltaPriceClient(dataViewMode,  localizedDeltaPrice,  productCode,  attributeFQN,  value,  currencyCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtraValueDeltaPrice productExtraValueDeltaPrice = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @param localizedDeltaPrice The properties of the price difference between the product extra and the base product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 * @see com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> updateExtraValueLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice localizedDeltaPrice, String productCode, String attributeFQN, String value, String currencyCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.updateExtraValueLocalizedDeltaPriceUrl(attributeFQN, currencyCode, productCode, responseFields, value);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductExtraValueDeltaPrice>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedDeltaPrice);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates the configuration of an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient=UpdateExtraClient(dataViewMode,  productExtra,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtra productExtra = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param productExtra Properties of an extra attribute to defined for a product that is associated with a product type that uses the extra. Setting up extras for a product enables shopper-entered information, such as initials for a monogram.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> updateExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String attributeFQN) throws Exception
	{
		return updateExtraClient(dataViewMode,  productExtra,  productCode,  attributeFQN,  null);
	}

	/**
	 * Updates the configuration of an extra attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient=UpdateExtraClient(dataViewMode,  productExtra,  productCode,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductExtra productExtra = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productExtra Properties of an extra attribute to defined for a product that is associated with a product type that uses the extra. Setting up extras for a product enables shopper-entered information, such as initials for a monogram.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductExtra>
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 * @see com.mozu.api.contracts.productadmin.ProductExtra
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> updateExtraClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductExtra productExtra, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.updateExtraUrl(attributeFQN, productCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductExtra.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductExtra> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductExtra>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productExtra);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Delete a product extra configuration for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtraClient(dataViewMode,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtraClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.deleteExtraUrl(attributeFQN, productCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the localized delta price value for a product extra. Localized delta prices are deltas between two differing monetary conversion amounts between countries, such as US Dollar vs Euro.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteExtraValueLocalizedDeltaPriceClient(dataViewMode,  productCode,  attributeFQN,  value,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteExtraValueLocalizedDeltaPriceClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String currencyCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductExtraUrl.deleteExtraValueLocalizedDeltaPriceUrl(attributeFQN, currencyCode, productCode, value);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



