/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

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

/** <summary>
 * The Entity Lists resource manages all dynamic entities in your Mozu document store of the Mozu cloud. The content is JSON and can have up to five indexed properties (integer, decimal, string, date, and boolean) with support for additional customized elements as needed. Every document in the entity list has a validated unique ID. 
 * </summary>
 */
public class EntityListClient {
	
	/**
	 * Get a filtered list of EntityLists for a specific tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> mozuClient=GetEntityListsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityListCollection entityListCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityListCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> getEntityListsClient() throws Exception
	{
		return getEntityListsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Get a filtered list of EntityLists for a specific tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> mozuClient=GetEntityListsClient( pageSize,  startIndex,  filter,  sortBy,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityListCollection entityListCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=50`.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityListCollection>
	 * @see com.mozu.api.contracts.mzdb.EntityListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> getEntityListsClient(Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.getEntityListsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityListCollection.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityListCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Get an existing EntityList definition for a specific tenant
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=GetEntityListClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> getEntityListClient(String entityListFullName) throws Exception
	{
		return getEntityListClient( entityListFullName,  null);
	}

	/**
	 * Get an existing EntityList definition for a specific tenant
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=GetEntityListClient( entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> getEntityListClient(String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.getEntityListUrl(entityListFullName, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityList.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Create a new EntityList for a specific tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=CreateEntityListClient( entityList);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> createEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList) throws Exception
	{
		return createEntityListClient( entityList,  null);
	}

	/**
	 * Create a new EntityList for a specific tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=CreateEntityListClient( entityList,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> createEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.createEntityListUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityList.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(entityList);
		return mozuClient;

	}

	/**
	 * Update an existing Entitylist for a specific tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=UpdateEntityListClient( entityList,  entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> updateEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName) throws Exception
	{
		return updateEntityListClient( entityList,  entityListFullName,  null);
	}

	/**
	 * Update an existing Entitylist for a specific tenant.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient=UpdateEntityListClient( entityList,  entityListFullName,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * EntityList entityList = client.Result();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param entityList The definition of an MZDB EntityList which describes the characteristics of the EntityList on a per tenant basis. EntityLists are created at the tenant level, but instances of the EntityLists are implicitly created at the appropriate context level as entities are added or removed from the EntityList.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.mzdb.EntityList>
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 * @see com.mozu.api.contracts.mzdb.EntityList
	 */
	public static MozuClient<com.mozu.api.contracts.mzdb.EntityList> updateEntityListClient(com.mozu.api.contracts.mzdb.EntityList entityList, String entityListFullName, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.updateEntityListUrl(entityListFullName, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.mzdb.EntityList.class;
		MozuClient<com.mozu.api.contracts.mzdb.EntityList> mozuClient = (MozuClient<com.mozu.api.contracts.mzdb.EntityList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(entityList);
		return mozuClient;

	}

	/**
	 * Delete an existing EntityList for a specific tenant. This will also delete all Entities in all instances of this EntityList for the tenant.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteEntityListClient( entityListFullName);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param entityListFullName The full name of the EntityList including namespace in name@nameSpace format
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteEntityListClient(String entityListFullName) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.EntityListUrl.deleteEntityListUrl(entityListFullName);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



