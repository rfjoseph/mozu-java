/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

import com.mozu.api.ApiContext;
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
 * Use the Checkout Settings resource to specify the site-wide settings that define checkout and order processing behavior. This resource includes subresources for payment settings, customer checkout settings, and order processing settings.
 * </summary>
 */
public class CheckoutSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CheckoutSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves all checkout settings defined for the site including payment settings (payment gateway ID and credentials), shopper checkout settings (login requirement or guest mode and custom attributes), and order processing settings (when payment is authorized and captured plus any custom attributes).
	 * <p><pre><code>
	 *	CheckoutSettings checkoutsettings = new CheckoutSettings();
	 *	CheckoutSettings checkoutSettings = checkoutsettings.getCheckoutSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CheckoutSettings getCheckoutSettings() throws Exception
	{
		return getCheckoutSettings( null);
	}

	/**
	 * Retrieves all checkout settings defined for the site including payment settings (payment gateway ID and credentials), shopper checkout settings (login requirement or guest mode and custom attributes), and order processing settings (when payment is authorized and captured plus any custom attributes).
	 * <p><pre><code>
	 *	CheckoutSettings checkoutsettings = new CheckoutSettings();
	 *	CountDownLatch latch = checkoutsettings.getCheckoutSettings( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 */
	public CountDownLatch getCheckoutSettingsAsync( AsyncCallback<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> callback) throws Exception
	{
		return getCheckoutSettingsAsync( null, callback);
	}

	/**
	 * Retrieves all checkout settings defined for the site including payment settings (payment gateway ID and credentials), shopper checkout settings (login requirement or guest mode and custom attributes), and order processing settings (when payment is authorized and captured plus any custom attributes).
	 * <p><pre><code>
	 *	CheckoutSettings checkoutsettings = new CheckoutSettings();
	 *	CheckoutSettings checkoutSettings = checkoutsettings.getCheckoutSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CheckoutSettings getCheckoutSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> client = com.mozu.api.clients.commerce.settings.CheckoutSettingsClient.getCheckoutSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves all checkout settings defined for the site including payment settings (payment gateway ID and credentials), shopper checkout settings (login requirement or guest mode and custom attributes), and order processing settings (when payment is authorized and captured plus any custom attributes).
	 * <p><pre><code>
	 *	CheckoutSettings checkoutsettings = new CheckoutSettings();
	 *	CountDownLatch latch = checkoutsettings.getCheckoutSettings( responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CheckoutSettings
	 */
	public CountDownLatch getCheckoutSettingsAsync(String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CheckoutSettings> client = com.mozu.api.clients.commerce.settings.CheckoutSettingsClient.getCheckoutSettingsClient( responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



