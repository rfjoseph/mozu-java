/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings.checkout;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;
/** <summary>
 * Use the Customer Checkout Settings resource to define login settings that apply when shoppers proceed to checkout.
 * </summary>
 */
public class CustomerCheckoutSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerCheckoutSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves all checkout settings defined for the site: Payment settings, such as the payment gateway ID and credentials, supported credit cards, and more; Customer Checkout settings, such as whether login is required, and any custom attributes; and Order Processing settings, such as when payment is authorized and captured, and any custom attributes.
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.getCustomerCheckoutSettings();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings getCustomerCheckoutSettings() throws Exception
	{
		return getCustomerCheckoutSettings( null);
	}

	/**
	 * Retrieves all checkout settings defined for the site: Payment settings, such as the payment gateway ID and credentials, supported credit cards, and more; Customer Checkout settings, such as whether login is required, and any custom attributes; and Order Processing settings, such as when payment is authorized and captured, and any custom attributes.
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.getCustomerCheckoutSettings( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings getCustomerCheckoutSettings(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> client = com.mozu.api.clients.commerce.settings.checkout.CustomerCheckoutSettingsClient.getCustomerCheckoutSettingsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies existing site checkout settings. Modify Payment, Customer Checkout, and Order Processing settings in one PUT.
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.updateCustomerCheckoutSettings( customerCheckoutSettings);
	 * </code></pre></p>
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings updateCustomerCheckoutSettings(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings) throws Exception
	{
		return updateCustomerCheckoutSettings( customerCheckoutSettings,  null);
	}

	/**
	 * Modifies existing site checkout settings. Modify Payment, Customer Checkout, and Order Processing settings in one PUT.
	 * <p><pre><code>
	 *	CustomerCheckoutSettings customercheckoutsettings = new CustomerCheckoutSettings();
	 *	CustomerCheckoutSettings customerCheckoutSettings = customercheckoutsettings.updateCustomerCheckoutSettings( customerCheckoutSettings,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param customerCheckoutSettings The properties of the customer checkout settings such as whether shoppers must be logged in.
	 * @return com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 * @see com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings
	 */
	public com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings updateCustomerCheckoutSettings(com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings customerCheckoutSettings, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.CustomerCheckoutSettings> client = com.mozu.api.clients.commerce.settings.checkout.CustomerCheckoutSettingsClient.updateCustomerCheckoutSettingsClient( customerCheckoutSettings,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



