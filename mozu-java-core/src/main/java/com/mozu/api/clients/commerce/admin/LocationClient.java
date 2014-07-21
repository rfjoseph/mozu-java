/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.admin;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the Locations resource to manage each physical location associated with a tenant. Locations enable tenants to associate a physical address with product inventory, provide a store finder for in-store pickup, or both. Locations that support inventory can use both direct ship and in-store pickup fulfillment types.
 * </summary>
 */
public class LocationClient {
	
	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsClient() throws Exception
	{
		return getLocationsClient( null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all locations associated with a tenant, according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsClient( startIndex,  pageSize,  sortBy,  filter);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsClient(Integer startIndex, Integer pageSize, String sortBy, String filter) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.getLocationsUrl(filter, pageSize, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the location specified in the request by location code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode The merchant-defined code of the location to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String locationCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.getLocationUrl(locationCode);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new physical location for the tenant specified in the request header.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=AddLocationClient( location);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param location Properties of the location to create.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> addLocationClient(com.mozu.api.contracts.location.Location location) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.addLocationUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(location);
		return mozuClient;

	}

	/**
	 * Updates one or more details of a the location specified in the request by location code.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=UpdateLocationClient( location,  locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param locationCode The merchant-defined code associated with the location to update.
	 * @param location Properties of the location to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> updateLocationClient(com.mozu.api.contracts.location.Location location, String locationCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.updateLocationUrl(locationCode);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(location);
		return mozuClient;

	}

	/**
	 * Deletes the location specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteLocationClient( locationCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param locationCode The merchant-defined code of the location to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteLocationClient(String locationCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.admin.LocationUrl.deleteLocationUrl(locationCode);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



