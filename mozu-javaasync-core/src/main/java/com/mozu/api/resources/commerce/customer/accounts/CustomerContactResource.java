/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.accounts;

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
 * Merchants and customers can create, view, update, and delete a contact for a customer account. A customer account may have multiple contacts for billing and shipping addresses.
 * </summary>
 */
public class CustomerContactResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerContactResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.getAccountContact( accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact getAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		return getAccountContact( accountId,  contactId,  null);
	}

	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContact( accountId,  contactId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch getAccountContactAsync(Integer accountId, Integer contactId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		return getAccountContactAsync( accountId,  contactId,  null, callback);
	}

	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.getAccountContact( accountId,  contactId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact getAccountContact(Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactClient( accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the specified contact for a customer account such as a billing or shipping contact.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContact( accountId,  contactId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch getAccountContactAsync(Integer accountId, Integer contactId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactClient( accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.getAccountContacts( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId) throws Exception
	{
		return getAccountContacts( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContacts( accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public CountDownLatch getAccountContactsAsync(Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContactCollection> callback) throws Exception
	{
		return getAccountContactsAsync( accountId,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContactCollection customerContactCollection = customercontact.getAccountContacts( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public com.mozu.api.contracts.customer.CustomerContactCollection getAccountContacts(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of contacts for a customer according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.getAccountContacts( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.CustomerContactCollection
	 * @see com.mozu.api.contracts.customer.CustomerContactCollection
	 */
	public CountDownLatch getAccountContactsAsync(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContactCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContactCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.getAccountContactsClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.addAccountContact( contact,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact addAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId) throws Exception
	{
		return addAccountContact( contact,  accountId,  null);
	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.addAccountContact( contact,  accountId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch addAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		return addAccountContactAsync( contact,  accountId,  null, callback);
	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.addAccountContact( contact,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact addAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.addAccountContactClient( contact,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new contact for a customer account such as a new shipping address.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.addAccountContact( contact,  accountId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch addAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.addAccountContactClient( contact,  accountId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.updateAccountContact( contact,  accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact updateAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId) throws Exception
	{
		return updateAccountContact( contact,  accountId,  contactId,  null);
	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.updateAccountContact( contact,  accountId,  contactId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch updateAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		return updateAccountContactAsync( contact,  accountId,  contactId,  null, callback);
	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CustomerContact customerContact = customercontact.updateAccountContact( contact,  accountId,  contactId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public com.mozu.api.contracts.customer.CustomerContact updateAccountContact(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.updateAccountContactClient( contact,  accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a contact for a specified customer account such as to update addresses or change which contact is the primary contact for billing.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	CountDownLatch latch = customercontact.updateAccountContact( contact,  accountId,  contactId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param contact Contact information, including the contact's name, address, phone numbers, email addresses, and company (if supplied). Also indicates whether this is a billing, shipping, or billing and shipping contact.
	 * @return com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 * @see com.mozu.api.contracts.customer.CustomerContact
	 */
	public CountDownLatch updateAccountContactAsync(com.mozu.api.contracts.customer.CustomerContact contact, Integer accountId, Integer contactId, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.CustomerContact> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerContact> client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.updateAccountContactClient( contact,  accountId,  contactId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes a contact for the specified customer account.
	 * <p><pre><code>
	 *	CustomerContact customercontact = new CustomerContact();
	 *	customercontact.deleteAccountContact( accountId,  contactId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param contactId Unique identifer of the customer account contact being updated.
	 * @return 
	 */
	public void deleteAccountContact(Integer accountId, Integer contactId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerContactClient.deleteAccountContactClient( accountId,  contactId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



