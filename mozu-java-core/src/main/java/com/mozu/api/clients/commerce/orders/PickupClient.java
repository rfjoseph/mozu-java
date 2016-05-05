/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
 * Use the Pickups resource to organize items submitted in an order into pickups that enable the shopper to fulfill the order items using the in-store pickup method.
 * </summary>
 */
public class PickupClient {
	
	/**
	 * Retrieves a list of the actions available to perform for the pickup specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailablePickupFulfillmentActionsClient( orderId,  pickupId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailablePickupFulfillmentActionsClient(String orderId, String pickupId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PickupUrl.getAvailablePickupFulfillmentActionsUrl(orderId, pickupId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = (MozuClient<List<String>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the in-store pickup specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient=GetPickupClient( orderId,  pickupId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Pickup pickup = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> getPickupClient(String orderId, String pickupId) throws Exception
	{
		return getPickupClient( orderId,  pickupId,  null);
	}

	/**
	 * Retrieves the details of the in-store pickup specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient=GetPickupClient( orderId,  pickupId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Pickup pickup = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> getPickupClient(String orderId, String pickupId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PickupUrl.getPickupUrl(orderId, pickupId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Pickup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Create a new pickup for the order specified in the request for in-store fufillment.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient=CreatePickupClient( pickup,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Pickup pickup = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> createPickupClient(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId) throws Exception
	{
		return createPickupClient( pickup,  orderId,  null);
	}

	/**
	 * Create a new pickup for the order specified in the request for in-store fufillment.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient=CreatePickupClient( pickup,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Pickup pickup = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> createPickupClient(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PickupUrl.createPickupUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Pickup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pickup);
		return mozuClient;

	}

	/**
	 * Updates one or more details of a defined in-store pickup.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient=UpdatePickupClient( pickup,  orderId,  pickupId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Pickup pickup = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> updatePickupClient(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId) throws Exception
	{
		return updatePickupClient( pickup,  orderId,  pickupId,  null);
	}

	/**
	 * Updates one or more details of a defined in-store pickup.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient=UpdatePickupClient( pickup,  orderId,  pickupId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Pickup pickup = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param pickup Properties of an in-store pickup defined to fulfill items in an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.Pickup
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> updatePickupClient(com.mozu.api.contracts.commerceruntime.fulfillment.Pickup pickup, String orderId, String pickupId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PickupUrl.updatePickupUrl(orderId, pickupId, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.fulfillment.Pickup.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.fulfillment.Pickup>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(pickup);
		return mozuClient;

	}

	/**
	 * Removes a pickup previously defined for order item in-store pickup fulfillment.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePickupClient( orderId,  pickupId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param pickupId Unique identifier of the pickup to remove.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePickupClient(String orderId, String pickupId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.PickupUrl.deletePickupUrl(orderId, pickupId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



