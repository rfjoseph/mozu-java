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

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Attributes subresource to manage the attributes used to uniquely identify shopper accounts, such as gender or age.
 * </summary>
 */
public class CustomerAttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CustomerAttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the contents of an attribute associated with the specified customer account.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.getAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		return getAccountAttribute( accountId,  attributeFQN,  null);
	}

	/**
	 * Retrieves the contents of an attribute associated with the specified customer account.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.getAccountAttribute( accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute getAccountAttribute(Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributeClient( accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of customer account attributes.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.getAccountAttributes( accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId) throws Exception
	{
		return getAccountAttributes( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves the list of customer account attributes.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttributeCollection customerAttributeCollection = customerattribute.getAccountAttributes( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.customer.CustomerAttributeCollection
	 * @see com.mozu.api.contracts.customer.CustomerAttributeCollection
	 */
	public com.mozu.api.contracts.customer.CustomerAttributeCollection getAccountAttributes(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttributeCollection> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.getAccountAttributesClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Applies a defined attribute to the customer account specified in the request and assigns a value to the customer attribute.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.addAccountAttribute( attribute,  accountId);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId) throws Exception
	{
		return addAccountAttribute( attribute,  accountId,  null);
	}

	/**
	 * Applies a defined attribute to the customer account specified in the request and assigns a value to the customer attribute.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.addAccountAttribute( attribute,  accountId,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute addAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.addAccountAttributeClient( attribute,  accountId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more details of a customer account attribute.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN) throws Exception
	{
		return updateAccountAttribute( attribute,  accountId,  attributeFQN,  null);
	}

	/**
	 * Updates one or more details of a customer account attribute.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	CustomerAttribute customerAttribute = customerattribute.updateAccountAttribute( attribute,  accountId,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param attribute Properties of an attribute associated with a customer account.
	 * @return com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 * @see com.mozu.api.contracts.customer.CustomerAttribute
	 */
	public com.mozu.api.contracts.customer.CustomerAttribute updateAccountAttribute(com.mozu.api.contracts.customer.CustomerAttribute attribute, Integer accountId, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.CustomerAttribute> client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.updateAccountAttributeClient( attribute,  accountId,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Removes the attribute specified in the request from the customer account.
	 * <p><pre><code>
	 *	CustomerAttribute customerattribute = new CustomerAttribute();
	 *	customerattribute.deleteAccountAttribute( accountId,  attributeFQN);
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return 
	 */
	public void deleteAccountAttribute(Integer accountId, String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.customer.accounts.CustomerAttributeClient.deleteAccountAttributeClient( accountId,  attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



