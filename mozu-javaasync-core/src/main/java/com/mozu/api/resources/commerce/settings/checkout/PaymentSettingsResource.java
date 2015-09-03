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
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Payment Settings resource to specify settings when creating payments for order checkout on the site.
 * </summary>
 */
public class PaymentSettingsResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PaymentSettingsResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * checkout-paymentsettings Get GetThirdPartyPaymentWorkflowWithValues description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName);
	 * </code></pre></p>
	 * @param fullyQualifiedName 
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition getThirdPartyPaymentWorkflowWithValues(String fullyQualifiedName) throws Exception
	{
		return getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName,  null);
	}

	/**
	 * checkout-paymentsettings Get GetThirdPartyPaymentWorkflowWithValues description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	CountDownLatch latch = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param fullyQualifiedName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public CountDownLatch getThirdPartyPaymentWorkflowWithValuesAsync(String fullyQualifiedName, AsyncCallback<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> callback) throws Exception
	{
		return getThirdPartyPaymentWorkflowWithValuesAsync( fullyQualifiedName,  null, callback);
	}

	/**
	 * checkout-paymentsettings Get GetThirdPartyPaymentWorkflowWithValues description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName,  responseFields);
	 * </code></pre></p>
	 * @param fullyQualifiedName 
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition getThirdPartyPaymentWorkflowWithValues(String fullyQualifiedName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowWithValuesClient( fullyQualifiedName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * checkout-paymentsettings Get GetThirdPartyPaymentWorkflowWithValues description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	CountDownLatch latch = paymentsettings.getThirdPartyPaymentWorkflowWithValues( fullyQualifiedName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param fullyQualifiedName 
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public CountDownLatch getThirdPartyPaymentWorkflowWithValuesAsync(String fullyQualifiedName, String responseFields, AsyncCallback<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowWithValuesClient( fullyQualifiedName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of the third-party payment service workflows configured for the site.
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	ExternalPaymentWorkflowDefinition externalPaymentWorkflowDefinition = paymentsettings.getThirdPartyPaymentWorkflows();
	 * </code></pre></p>
	 * @return List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition> getThirdPartyPaymentWorkflows() throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowsClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the third-party payment service workflows configured for the site.
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	CountDownLatch latch = paymentsettings.getThirdPartyPaymentWorkflows( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public CountDownLatch getThirdPartyPaymentWorkflowsAsync( AsyncCallback<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition>> client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.getThirdPartyPaymentWorkflowsClient();
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * checkout-paymentsettings Put AddThirdPartyPaymentWorkflow description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	paymentsettings.addThirdPartyPaymentWorkflow( definition);
	 * </code></pre></p>
	 * @param definition Properties of an external payment processing workflow defined for the site. At this time, only PayPal Express is supported.
	 * @return 
	 * @see com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition
	 */
	public void addThirdPartyPaymentWorkflow(com.mozu.api.contracts.sitesettings.order.ExternalPaymentWorkflowDefinition definition) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.addThirdPartyPaymentWorkflowClient( definition);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * checkout-paymentsettings Delete DeleteThirdPartyPaymentWorkflow description DOCUMENT_HERE 
	 * <p><pre><code>
	 *	PaymentSettings paymentsettings = new PaymentSettings();
	 *	paymentsettings.deleteThirdPartyPaymentWorkflow( fullyQualifiedName);
	 * </code></pre></p>
	 * @param fullyQualifiedName 
	 * @return 
	 */
	public void deleteThirdPartyPaymentWorkflow(String fullyQualifiedName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.settings.checkout.PaymentSettingsClient.deleteThirdPartyPaymentWorkflowClient( fullyQualifiedName);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



