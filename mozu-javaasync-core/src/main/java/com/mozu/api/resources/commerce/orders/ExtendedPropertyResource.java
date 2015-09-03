/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

import com.mozu.api.ApiContext;
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
 * Use the Extended Properties resource to store tracking strings for your orders. Extended properties can help you track affiliate sources.
 * </summary>
 */
public class ExtendedPropertyResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ExtendedPropertyResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the extended property string associated with the order. 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.getExtendedProperties( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> getExtendedProperties(String orderId) throws Exception
	{
		return getExtendedProperties( orderId,  null);
	}

	/**
	 * Retrieves the extended property string associated with the order. 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.getExtendedProperties( orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch getExtendedPropertiesAsync(String orderId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		return getExtendedPropertiesAsync( orderId,  null, callback);
	}

	/**
	 * Retrieves the extended property string associated with the order. 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.getExtendedProperties( orderId,  draft);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> getExtendedProperties(String orderId, Boolean draft) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.getExtendedPropertiesClient( orderId,  draft);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the extended property string associated with the order. 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.getExtendedProperties( orderId,  draft, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch getExtendedPropertiesAsync(String orderId, Boolean draft, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.getExtendedPropertiesClient( orderId,  draft);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Create an extended property for the order.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.addExtendedProperties( extendedProperties,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> addExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return addExtendedProperties( extendedProperties,  orderId,  null,  null);
	}

	/**
	 * Create an extended property for the order.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.addExtendedProperties( extendedProperties,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch addExtendedPropertiesAsync(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		return addExtendedPropertiesAsync( extendedProperties,  orderId,  null,  null, callback);
	}

	/**
	 * Create an extended property for the order.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.addExtendedProperties( extendedProperties,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> addExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.addExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Create an extended property for the order.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.addExtendedProperties( extendedProperties,  orderId,  updateMode,  version, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch addExtendedPropertiesAsync(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.addExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one ore more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key) throws Exception
	{
		return updateExtendedProperty( extendedProperty,  orderId,  key,  null,  null,  null,  null);
	}

	/**
	 * Updates one ore more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertyAsync(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key, AsyncCallback<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> callback) throws Exception
	{
		return updateExtendedPropertyAsync( extendedProperty,  orderId,  key,  null,  null,  null,  null, callback);
	}

	/**
	 * Updates one ore more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates an extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty updateExtendedProperty(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key, String updateMode, String version, Boolean upsert, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertyClient( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one ore more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperty( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates an extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperty Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertyAsync(com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty extendedProperty, String orderId, String key, String updateMode, String version, Boolean upsert, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertyClient( extendedProperty,  orderId,  key,  updateMode,  version,  upsert,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates one or more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId) throws Exception
	{
		return updateExtendedProperties( extendedProperties,  orderId,  null,  null,  null);
	}

	/**
	 * Updates one or more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperties( extendedProperties,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertiesAsync(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		return updateExtendedPropertiesAsync( extendedProperties,  orderId,  null,  null,  null, callback);
	}

	/**
	 * Updates one or more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	ExtendedProperty extendedProperty = extendedproperty.updateExtendedProperties( extendedProperties,  orderId,  updateMode,  version,  upsert);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates the extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> updateExtendedProperties(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version, Boolean upsert) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version,  upsert);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	CountDownLatch latch = extendedproperty.updateExtendedProperties( extendedProperties,  orderId,  updateMode,  version,  upsert, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param upsert Inserts and updates the extended property.
        
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param  callback callback handler for asynchronous operations
	 * @param extendedProperties Mozu.CommerceRuntime.Contracts.Commerce.ExtendedProperty ApiType DOCUMENT_HERE 
	 * @return List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 * @see com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty
	 */
	public CountDownLatch updateExtendedPropertiesAsync(List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty> extendedProperties, String orderId, String updateMode, String version, Boolean upsert, AsyncCallback<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.commerceruntime.commerce.ExtendedProperty>> client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.updateExtendedPropertiesClient( extendedProperties,  orderId,  updateMode,  version,  upsert);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes one or more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperty( orderId,  key);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @return 
	 */
	public void deleteExtendedProperty(String orderId, String key) throws Exception
	{
		deleteExtendedProperty( orderId,  key,  null,  null);
	}

	/**
	 * Deletes one or more extended properties.
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperty( orderId,  key,  updateMode,  version);
	 * </code></pre></p>
	 * @param key 
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @return 
	 */
	public void deleteExtendedProperty(String orderId, String key, String updateMode, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.deleteExtendedPropertyClient( orderId,  key,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * Deletes the extended property associated with the order. 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperties( keys,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param keys 
	 * @return 
	 * @see string
	 */
	public void deleteExtendedProperties(List<String> keys, String orderId) throws Exception
	{
		deleteExtendedProperties( keys,  orderId,  null,  null);
	}

	/**
	 * Deletes the extended property associated with the order. 
	 * <p><pre><code>
	 *	ExtendedProperty extendedproperty = new ExtendedProperty();
	 *	extendedproperty.deleteExtendedProperties( keys,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version Determines whether or not to check versioning of items for concurrency purposes.
	 * @param keys 
	 * @return 
	 * @see string
	 */
	public void deleteExtendedProperties(List<String> keys, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.orders.ExtendedPropertyClient.deleteExtendedPropertiesClient( keys,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



