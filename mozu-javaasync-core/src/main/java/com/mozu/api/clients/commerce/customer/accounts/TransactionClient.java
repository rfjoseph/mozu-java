/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

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
 * Use the Customer Account Transactions resource to manage the transactions associated with a customer account.
 * </summary>
 */
public class TransactionClient {
	
	/**
	 * Retrieves a list of transactions associated with the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.customer.Transaction>> mozuClient=GetTransactionsClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Transaction transaction = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.customer.Transaction>>
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public static MozuClient<List<com.mozu.api.contracts.customer.Transaction>> getTransactionsClient(Integer accountId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.TransactionUrl.getTransactionsUrl(accountId);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.customer.Transaction>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.customer.Transaction>> mozuClient = (MozuClient<List<com.mozu.api.contracts.customer.Transaction>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a new transaction for the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Transaction> mozuClient=AddTransactionClient( transaction,  accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Transaction transaction = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param transaction Properties of a transaction performed by a customer account. The system creates a transaction each time the customer submits an order, returns an item, picks up items for an order, or manages items on a wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Transaction>
	 * @see com.mozu.api.contracts.customer.Transaction
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Transaction> addTransactionClient(com.mozu.api.contracts.customer.Transaction transaction, Integer accountId) throws Exception
	{
		return addTransactionClient( transaction,  accountId,  null);
	}

	/**
	 * Creates a new transaction for the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.Transaction> mozuClient=AddTransactionClient( transaction,  accountId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Transaction transaction = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param transaction Properties of a transaction performed by a customer account. The system creates a transaction each time the customer submits an order, returns an item, picks up items for an order, or manages items on a wish list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.Transaction>
	 * @see com.mozu.api.contracts.customer.Transaction
	 * @see com.mozu.api.contracts.customer.Transaction
	 */
	public static MozuClient<com.mozu.api.contracts.customer.Transaction> addTransactionClient(com.mozu.api.contracts.customer.Transaction transaction, Integer accountId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.TransactionUrl.addTransactionUrl(accountId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.customer.Transaction.class;
		MozuClient<com.mozu.api.contracts.customer.Transaction> mozuClient = (MozuClient<com.mozu.api.contracts.customer.Transaction>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(transaction);
		return mozuClient;

	}

	/**
	 * Deletes a transaction from the customer account specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=RemoveTransactionClient( accountId,  transactionId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param transactionId Unique identifier of the transaction to delete.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient removeTransactionClient(Integer accountId, String transactionId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.TransactionUrl.removeTransactionUrl(accountId, transactionId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



