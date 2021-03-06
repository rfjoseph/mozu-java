/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Coupon Sets resource to view and create coupon sets. You can use coupon sets to group multiple coupon codes together and associate them with one or more discounts. Use the  subresource to manage the coupon codes within manual coupon sets. Use the  subresource to mange the discounts assigned to coupon sets.
 * </summary>
 */
public class CouponSetClient {
	
	/**
	 * Retrieves a list of coupon sets in the catalog according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> mozuClient=GetCouponSetsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSetCollection couponSetCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSetCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> getCouponSetsClient() throws Exception
	{
		return getCouponSetsClient( null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of coupon sets in the catalog according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> mozuClient=GetCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSetCollection couponSetCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param includeCounts Specifies whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts in the response body.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSetCollection>
	 * @see com.mozu.api.contracts.productadmin.CouponSetCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> getCouponSetsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.getCouponSetsUrl(filter, includeCounts, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSetCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single coupon set. Use the couponSetCode parameter to specify the coupon set. Use the includeCounts parameter to specify whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=GetCouponSetClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> getCouponSetClient(String couponSetCode) throws Exception
	{
		return getCouponSetClient( couponSetCode,  null,  null);
	}

	/**
	 * Retrieves the details of a single coupon set. Use the couponSetCode parameter to specify the coupon set. Use the includeCounts parameter to specify whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=GetCouponSetClient( couponSetCode,  includeCounts,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param includeCounts Specifies whether to include the number of redeemed coupons, existing coupon codes, and assigned discounts in the response body.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> getCouponSetClient(String couponSetCode, Boolean includeCounts, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.getCouponSetUrl(couponSetCode, includeCounts, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Returns a unique, random four character code to use for the couponSetCode.
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetUniqueCouponSetCodeClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> getUniqueCouponSetCodeClient() throws Exception
	{
		return getUniqueCouponSetCodeClient( null);
	}

	/**
	 * Returns a unique, random four character code to use for the couponSetCode.
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetUniqueCouponSetCodeClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <string>
	 * @see string
	 */
	public static MozuClient<String> getUniqueCouponSetCodeClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.getUniqueCouponSetCodeUrl(responseFields);
		String verb = "GET";
		Class<?> clz = String.class;
		MozuClient<String> mozuClient = (MozuClient<String>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Adds a single coupon set to the catalog.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=AddCouponSetClient( couponSet);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSet The details of the new coupon set.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> addCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet) throws Exception
	{
		return addCouponSetClient( couponSet,  null);
	}

	/**
	 * Adds a single coupon set to the catalog.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=AddCouponSetClient( couponSet,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param couponSet The details of the new coupon set.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> addCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.addCouponSetUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(couponSet);
		return mozuClient;

	}

	/**
	 * Validates the couponSetCode and tests it for uniqueness.
	 * <p><pre><code>
	 * MozuClient mozuClient=ValidateUniqueCouponSetCodeClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient validateUniqueCouponSetCodeClient(String code) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.validateUniqueCouponSetCodeUrl(code);
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a coupon set in the catalog.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=UpdateCouponSetClient( couponSet,  couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param couponSet The details of the updated coupon set.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> updateCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode) throws Exception
	{
		return updateCouponSetClient( couponSet,  couponSetCode,  null);
	}

	/**
	 * Updates one or more properties of a coupon set in the catalog.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=UpdateCouponSetClient( couponSet,  couponSetCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param couponSet The details of the updated coupon set.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> updateCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet, String couponSetCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.updateCouponSetUrl(couponSetCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.CouponSet.class;
		MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.CouponSet>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(couponSet);
		return mozuClient;

	}

	/**
	 * Deletes a specified coupon set from the catalog. Use the couponSetCode parameter to specify the coupon set to delete.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteCouponSetClient( couponSetCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param couponSetCode The unique identifier of the coupon set.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteCouponSetClient(String couponSetCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.CouponSetUrl.deleteCouponSetUrl(couponSetCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



