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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * commerce/catalog/admin/couponsets related resources. DOCUMENT_HERE 
 * </summary>
 */
public class CouponSetClient {
	
	/**
	 * Returns a paged collection of CouponSets
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
	 * Returns a paged collection of CouponSets
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSetCollection> mozuClient=GetCouponSetsClient( startIndex,  pageSize,  sortBy,  filter,  includeCounts,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSetCollection couponSetCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query: eq=equals, ne=not equals, gt=greater than, lt = less than or equals, gt = greater than or equals, lt = less than or equals, sw = starts with, or cont = contains. Optional.
	 * @param includeCounts 
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
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
	 * Returns a random 4 character code that is unique as a coupon set code.
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
	 * Returns a random 4 character code that is unique as a coupon set code.
	 * <p><pre><code>
	 * MozuClient<String> mozuClient=GetUniqueCouponSetCodeClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
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
	 * Adds a single
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=AddCouponSetClient( couponSet);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.CouponSet>
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 * @see com.mozu.api.contracts.productadmin.CouponSet
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.CouponSet> addCouponSetClient(com.mozu.api.contracts.productadmin.CouponSet couponSet) throws Exception
	{
		return addCouponSetClient( couponSet,  null);
	}

	/**
	 * Adds a single
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.CouponSet> mozuClient=AddCouponSetClient( couponSet,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CouponSet couponSet = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param couponSet Mozu.ProductAdmin.Contracts.CouponSet ApiType DOCUMENT_HERE 
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
	 * Tests code for uniqueness and validity
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

}



