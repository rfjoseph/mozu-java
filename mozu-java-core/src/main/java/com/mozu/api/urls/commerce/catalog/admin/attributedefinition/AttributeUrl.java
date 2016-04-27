/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.attributedefinition;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class AttributeUrl
{

	/**
	 * Get Resource Url for GetAttributes
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributesUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAttribute
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAttributeUrl(String attributeFQN, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddAttribute
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl addAttributeUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateAttribute
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateAttributeUrl(String attributeFQN, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}?responseFields={responseFields}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteAttribute
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteAttributeUrl(String attributeFQN)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/attributedefinition/attributes/{attributeFQN}");
		formatter.formatUrl("attributeFQN", attributeFQN);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

