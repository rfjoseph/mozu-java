/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
/** <summary>
 * Use the Storefront Shipping resource to retrieve shipping rate information from the website.
 * </summary>
 */
public class ShippingClient {
	
	/**
	 * Retrieves the shipping rates applicable for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> mozuClient=GetRatesClient( rateRequest);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RatesResponse ratesResponse = client.Result();
	 * </code></pre></p>
	 * @param rateRequest Properties of the shipping rate request sent on behalf of the storefront website.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingruntime.RatesResponse>
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public static MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> getRatesClient(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest) throws Exception
	{
		return getRatesClient( rateRequest,  null);
	}

	/**
	 * Retrieves the shipping rates applicable for the site.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> mozuClient=GetRatesClient( rateRequest,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * RatesResponse ratesResponse = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param rateRequest Properties of the shipping rate request sent on behalf of the storefront website.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.shippingruntime.RatesResponse>
	 * @see com.mozu.api.contracts.shippingruntime.RatesResponse
	 * @see com.mozu.api.contracts.shippingruntime.RateRequest
	 */
	public static MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> getRatesClient(com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ShippingUrl.getRatesUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.shippingruntime.RatesResponse.class;
		MozuClient<com.mozu.api.contracts.shippingruntime.RatesResponse> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(rateRequest);
		return mozuClient;

	}

}



