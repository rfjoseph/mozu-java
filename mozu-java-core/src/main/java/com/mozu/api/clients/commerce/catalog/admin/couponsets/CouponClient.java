/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.couponsets;

import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Coupons subresource to manage coupons within manual coupon sets.
 * </summary>
 */
public class CouponClient {
	
	/**
	 * Retrieves the details of the specified coupon. Use the couponSetCode and the couponCode parameter to specify the coupon within a coupon set. Use the includeCounts paramter to specify whether to return the redemptionCount property in the response body object.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Coupon> mozuClient=GetCouponClient( couponSetCode,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Coupon coupon = client.Result();
	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Coupon>
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Coupon> getCouponClient(String couponSetCode, String couponCode) throws Exception
	{
		return getCouponClient( couponSetCode,  couponCode,  null,  null);
	}

	/**
	 * Retrieves the details of the specified coupon. Use the couponSetCode and the couponCode parameter to specify the coupon within a coupon set. Use the includeCounts paramter to specify whether to return the redemptionCount property in the response body object.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.Coupon> mozuClient=GetCouponClient( couponSetCode,  couponCode,  includeCounts,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Coupon coupon = client.Result();
	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @param includeCounts Specifies whether to return the redemptionCount property in the response body object.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.Coupon>
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.Coupon> getCouponClient(String couponSetCode, String couponCode, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.getCouponUrl(couponCode, couponSetCode, includeCounts, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.Coupon.class;
		MozuClient<com.mozu.api.contracts.productadmin.Coupon> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.Coupon>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of coupons in a specified coupon set according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> mozuClient=GetCouponsClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponCollection couponCollection = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupons belongs to.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> getCouponsClient(String couponSetCode) throws Exception
	{
		return getCouponsClient( couponSetCode,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of coupons in a specified coupon set according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> mozuClient=GetCouponsClient( couponSetCode,  startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponCollection couponCollection = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupons belongs to.
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param includeCounts Specifies whether to include the redemptionCount property in the response body object.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. For example, ) returns only the  and  items inside the  array of the specified product.This paramter should only be used to retrieve data. Attempting to update data using this parmater may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> getCouponsClient(String couponSetCode, Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.getCouponsUrl(couponSetCode, filter, includeCounts, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds coupons  to a specified manual coupon set. Use the couponSetCode parameter to specify the manual coupon set.
	 * <p><pre><code>
	 * MozuClient mozuClient=AddCouponsClient( coupons,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param coupons Mozu.ProductAdmin.Contracts.Coupon ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.Coupon
	 */
	public static MozuClient addCouponsClient(List<com.mozu.api.contracts.productadmin.Coupon> coupons, String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.addCouponsUrl(couponSetCode);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(coupons);
		return mozuClient;

	}

	/**
	 * Deletes the specified coupons and removes them from the coupon set. You can only delete a coupon if it has not been redeemed. Use the canBeDeleted property to determine whether a coupon can be deleted.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCouponsClient( couponCodes,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @param couponCodes The unique identifiers of the coupons to delete.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteCouponsClient(List<String> couponCodes, String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.deleteCouponsUrl(couponSetCode);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(couponCodes);
		return mozuClient;

	}

	/**
	 * Deletes the specified coupon and remove it from the coupon set. You can only delete a coupon if it has not been redeemed. Use the canBeDeleted property to determine whether a coupon can be deleted.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCouponClient( couponSetCode,  couponCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponCode Code associated with the coupon to remove from the cart.
	 * @param couponSetCode The unique identifier of the coupon set that the coupon belongs to.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCouponClient(String couponSetCode, String couponCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.couponsets.CouponUrl.deleteCouponUrl(couponCode, couponSetCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



