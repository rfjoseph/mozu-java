/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class SoftAllocationUrl
{

	/**
	 * Get Resource Url for GetSoftAllocations
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return   String Resource Url
	 */
	public static MozuUrl getSoftAllocationsUrl(String filter, Integer pageSize, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetSoftAllocation
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param softAllocationId The unique identifier of the soft allocation.
	 * @return   String Resource Url
	 */
	public static MozuUrl getSoftAllocationUrl(String responseFields, Integer softAllocationId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/{softAllocationId}?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("softAllocationId", softAllocationId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddSoftAllocations
	 * @return   String Resource Url
	 */
	public static MozuUrl addSoftAllocationsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for ConvertToProductReservation
	 * @return   String Resource Url
	 */
	public static MozuUrl convertToProductReservationUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/convert");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RenewSoftAllocations
	 * @return   String Resource Url
	 */
	public static MozuUrl renewSoftAllocationsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/renew");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateSoftAllocations
	 * @return   String Resource Url
	 */
	public static MozuUrl updateSoftAllocationsUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteSoftAllocation
	 * @param softAllocationId The unique identifier of the soft allocation.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteSoftAllocationUrl(Integer softAllocationId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/softallocations/{softAllocationId}");
		formatter.formatUrl("softAllocationId", softAllocationId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

