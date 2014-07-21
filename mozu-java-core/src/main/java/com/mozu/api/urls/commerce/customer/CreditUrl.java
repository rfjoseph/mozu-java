/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CreditUrl
{

	/**
	 * Get Resource Url for GetCredits
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getCreditsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/credits/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetCredit
	 * @param code User-defined code that identifies the store credit to retrieve.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getCreditUrl(String code, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/credits/{code}?responseFields={responseFields}");
		formatter.formatUrl("code", code);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddCredit
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addCreditUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/credits/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AssociateCreditToShopper
	 * @param code The code that represents the credit to claim for the shopper.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl associateCreditToShopperUrl(String code, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/credits/{code}/associate-to-shopper?responseFields={responseFields}");
		formatter.formatUrl("code", code);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateCredit
	 * @param code User-defined code of the store credit to update.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateCreditUrl(String code, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/credits/{code}?responseFields={responseFields}");
		formatter.formatUrl("code", code);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteCredit
	 * @param code User-defined code of the store credit to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteCreditUrl(String code)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/credits/{code}");
		formatter.formatUrl("code", code);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

