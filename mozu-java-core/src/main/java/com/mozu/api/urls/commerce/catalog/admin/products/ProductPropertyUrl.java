/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.products;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ProductPropertyUrl
{

	/**
	 * Get Resource Url for GetProperties
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertiesUrl(String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties");
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPropertyValueLocalizedContents
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertyValueLocalizedContentsUrl(String attributeFQN, String productCode, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPropertyValueLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertyValueLocalizedContentUrl(String attributeFQN, String localeCode, String productCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetProperty
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPropertyUrl(String attributeFQN, String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddPropertyValueLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl addPropertyValueLocalizedContentUrl(String attributeFQN, String productCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddProperty
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addPropertyUrl(String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties?responseFields={responseFields}");
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePropertyValueLocalizedContents
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePropertyValueLocalizedContentsUrl(String attributeFQN, String productCode, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePropertyValueLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value The value string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePropertyValueLocalizedContentUrl(String attributeFQN, String localeCode, String productCode, String responseFields, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateProperty
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePropertyUrl(String attributeFQN, String productCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteProperty
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePropertyUrl(String attributeFQN, String productCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("productCode", productCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeletePropertyValueLocalizedContent
	 * @param attributeFQN Fully qualified name for an attribute.
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param value The value string to create.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePropertyValueLocalizedContentUrl(String attributeFQN, String localeCode, String productCode, String value)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/products/{productCode}/Properties/{attributeFQN}/values/{value}/LocalizedContent/{localeCode}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("localeCode", localeCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("value", value);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

