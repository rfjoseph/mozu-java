/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class InStockNotificationSubscriptionUrl
{

	/**
	 * Get Resource Url for GetInStockNotificationSubscriptions
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl getInStockNotificationSubscriptionsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/instocknotifications/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetInStockNotificationSubscription
	 * @param id Unique identifier of the in-stock notification subscription to retrieve.
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getInStockNotificationSubscriptionUrl(Integer id, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/instocknotifications/{id}?responseFields={responseFields}");
		formatter.formatUrl("id", id);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddInStockNotificationSubscription
	 * @param responseFields 
	 * @return   String Resource Url
	 */
	public static MozuUrl addInStockNotificationSubscriptionUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/instocknotifications/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteInStockNotificationSubscription
	 * @param id Unique identifier of the customer in-stock notification subscription to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteInStockNotificationSubscriptionUrl(Integer id)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/instocknotifications/{id}");
		formatter.formatUrl("id", id);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

