/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.storefront;

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
 * Use the Storefront Shipping resource to retrieve shipping rate information from the website.
 * </summary>
 */
public class ShippingResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ShippingResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the shipping rates applicable for the site.
	 * <p><pre><code>
	 *	Shipping shipping = new Shipping();
	 *	RatesResponse ratesResponse = shipping.getRates( rateRequest);
	 * </code></pre></p>
	 * @param rateRequest Properties required to request a shipping rate calculation.
	 * @return com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public com.mozu.api.contracts.shippingruntime.RatesResponse getRates(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest) throws Exception
	{
		return getRates( rateRequest,  null);
	}

	/**
	 * Retrieves the shipping rates applicable for the site.
	 * <p><pre><code>
	 *	Shipping shipping = new Shipping();
	 *	CountDownLatch latch = shipping.getRates( rateRequest, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param rateRequest Properties required to request a shipping rate calculation.
	 * @return com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public CountDownLatch getRatesAsync(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, AsyncCallback<com.mozu.api.contracts.shippingruntime.RatesResponse> callback) throws Exception
	{
		return getRatesAsync( rateRequest,  null, callback);
	}

	/**
	 * Retrieves the shipping rates applicable for the site.
	 * <p><pre><code>
	 *	Shipping shipping = new Shipping();
	 *	RatesResponse ratesResponse = shipping.getRates( rateRequest,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param rateRequest Properties required to request a shipping rate calculation.
	 * @return com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public com.mozu.api.contracts.shippingruntime.RatesResponse getRates(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> client = com.mozu.api.clients.commerce.catalog.storefront.ShippingClient.getRatesClient( rateRequest,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the shipping rates applicable for the site.
	 * <p><pre><code>
	 *	Shipping shipping = new Shipping();
	 *	CountDownLatch latch = shipping.getRates( rateRequest,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param rateRequest Properties required to request a shipping rate calculation.
	 * @return com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public CountDownLatch getRatesAsync(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, String responseFields, AsyncCallback<com.mozu.api.contracts.shippingruntime.RatesResponse> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> client = com.mozu.api.clients.commerce.catalog.storefront.ShippingClient.getRatesClient( rateRequest,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



