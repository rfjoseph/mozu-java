/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

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
 * Use the Returns resource to manage returned items that were previously fufilled. Returns can include any number of items associated with an original Mozu order. Each return must either be associated with an original order or a product definition to represent each returned item.
 * </summary>
 */
public class ReturnClient {
	
	/**
	 * Retrieves a list of all returns according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=GetReturnsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> getReturnsClient() throws Exception
	{
		return getReturnsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all returns according to any filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=GetReturnsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> getReturnsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of the actions available to perform for the specified return based on its current state.
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailableReturnActionsClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailableReturnActionsClient(String returnId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getAvailableReturnActionsUrl(returnId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = (MozuClient<List<String>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a single return item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> mozuClient=GetReturnItemClient( returnId,  returnItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItem returnItem = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param returnItemId Unique identifier of the return item whose details you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItem>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> getReturnItemClient(String returnId, String returnItemId) throws Exception
	{
		return getReturnItemClient( returnId,  returnItemId,  null);
	}

	/**
	 * Retrieves the details of a single return item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> mozuClient=GetReturnItemClient( returnId,  returnItemId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItem returnItem = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param returnItemId Unique identifier of the return item whose details you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItem>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> getReturnItemClient(String returnId, String returnItemId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnItemUrl(responseFields, returnId, returnItemId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnItem.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of all return items in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> mozuClient=GetReturnItemsClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItemCollection returnItemCollection = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> getReturnItemsClient(String returnId) throws Exception
	{
		return getReturnItemsClient( returnId,  null);
	}

	/**
	 * Retrieves the details of all return items in an order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> mozuClient=GetReturnItemsClient( returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnItemCollection returnItemCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> getReturnItemsClient(String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnItemsUrl(responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of the payment actions available to perform for the specified return when a return results in a refund to the customer.
	 * <p><pre><code>
	 * MozuClient<List<String>> mozuClient=GetAvailablePaymentActionsForReturnClient( returnId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * string string = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <List<string>>
	 * @see string
	 */
	public static MozuClient<List<String>> getAvailablePaymentActionsForReturnClient(String returnId, String paymentId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getAvailablePaymentActionsForReturnUrl(paymentId, returnId);
		String verb = "GET";
		Class<?> clz = new ArrayList<String>(){}.getClass();
		MozuClient<List<String>> mozuClient = (MozuClient<List<String>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of a payment submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient=GetPaymentClient( returnId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Payment payment = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.Payment>
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> getPaymentClient(String returnId, String paymentId) throws Exception
	{
		return getPaymentClient( returnId,  paymentId,  null);
	}

	/**
	 * Retrieves the details of a payment submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient=GetPaymentClient( returnId,  paymentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Payment payment = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.Payment>
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> getPaymentClient(String returnId, String paymentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getPaymentUrl(paymentId, responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.Payment.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of all payments submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient=GetPaymentsClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PaymentCollection paymentCollection = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> getPaymentsClient(String returnId) throws Exception
	{
		return getPaymentsClient( returnId,  null);
	}

	/**
	 * Retrieves a list of all payments submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient=GetPaymentsClient( returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PaymentCollection paymentCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> getPaymentsClient(String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getPaymentsUrl(responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.payments.PaymentCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of properties for the specified return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=GetReturnClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> getReturnClient(String returnId) throws Exception
	{
		return getReturnClient( returnId,  null);
	}

	/**
	 * Retrieves a list of properties for the specified return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=GetReturnClient( returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> getReturnClient(String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReturnUrl(responseFields, returnId);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * commerce-returns Get GetReasons description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> mozuClient=GetReasonsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReasonCollection reasonCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReasonCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> getReasonsClient() throws Exception
	{
		return getReasonsClient( null);
	}

	/**
	 * commerce-returns Get GetReasons description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> mozuClient=GetReasonsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReasonCollection reasonCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields A list or array of fields returned for a call. These fields may be customized and may be used for various types of data calls in Mozu. For example, responseFields are returned for retrieving or updating attributes, carts, and messages in Mozu.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReasonCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> getReasonsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.getReasonsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReasonCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Creates a return for previously fulfilled items. Each return must either be associated with an original order or a product definition to represent each returned item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnClient( ret);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param ret Properties of a return of one or more previously fulfilled items.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret) throws Exception
	{
		return createReturnClient( ret,  null);
	}

	/**
	 * Creates a return for previously fulfilled items. Each return must either be associated with an original order or a product definition to represent each returned item.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnClient( ret,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param ret Properties of a return of one or more previously fulfilled items.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.createReturnUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(ret);
		return mozuClient;

	}

	/**
	 * Adds a return item to the return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnItemClient( returnItem,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param returnItem Properties of a previously fulfilled item associated with a return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnItemClient(com.mozu.api.contracts.commerceruntime.returns.ReturnItem returnItem, String returnId) throws Exception
	{
		return createReturnItemClient( returnItem,  returnId,  null);
	}

	/**
	 * Adds a return item to the return.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreateReturnItemClient( returnItem,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param returnItem Properties of a previously fulfilled item associated with a return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createReturnItemClient(com.mozu.api.contracts.commerceruntime.returns.ReturnItem returnItem, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.createReturnItemUrl(responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(returnItem);
		return mozuClient;

	}

	/**
	 * Updates a refund payment associated with a customer return by performing the specified action.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=PerformPaymentActionForReturnClient( action,  returnId,  paymentId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> performPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String paymentId) throws Exception
	{
		return performPaymentActionForReturnClient( action,  returnId,  paymentId,  null);
	}

	/**
	 * Updates a refund payment associated with a customer return by performing the specified action.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=PerformPaymentActionForReturnClient( action,  returnId,  paymentId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> performPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String paymentId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.performPaymentActionForReturnUrl(paymentId, responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * Creates a new payment for a return that results in a refund to the customer.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreatePaymentActionForReturnClient( action,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId) throws Exception
	{
		return createPaymentActionForReturnClient( action,  returnId,  null);
	}

	/**
	 * Creates a new payment for a return that results in a refund to the customer.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=CreatePaymentActionForReturnClient( action,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param action Properties of the payment action performed for an order.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> createPaymentActionForReturnClient(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.createPaymentActionForReturnUrl(responseFields, returnId);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * Updates the return by performing the action specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=PerformReturnActionsClient( action);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @param action Properties of an action a user can perform for a return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> performReturnActionsClient(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action) throws Exception
	{
		return performReturnActionsClient( action,  null);
	}

	/**
	 * Updates the return by performing the action specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient=PerformReturnActionsClient( action,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ReturnCollection returnCollection = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param action Properties of an action a user can perform for a return.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> performReturnActionsClient(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.performReturnActionsUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.ReturnCollection.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * Updates one or more properties of a return for items previously shipped in a completed order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=UpdateReturnClient( ret,  returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param ret Properties of a return of one or more previously fulfilled items.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> updateReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret, String returnId) throws Exception
	{
		return updateReturnClient( ret,  returnId,  null);
	}

	/**
	 * Updates one or more properties of a return for items previously shipped in a completed order.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=UpdateReturnClient( ret,  returnId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param ret Properties of a return of one or more previously fulfilled items.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> updateReturnClient(com.mozu.api.contracts.commerceruntime.returns.Return ret, String returnId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.updateReturnUrl(responseFields, returnId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(ret);
		return mozuClient;

	}

	/**
	 * commerce-returns Put ResendReturnEmail description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=ResendReturnEmailClient( action);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param action Properties of an action a user can perform for a return.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public static MozuClient resendReturnEmailClient(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.resendReturnEmailUrl();
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(action);
		return mozuClient;

	}

	/**
	 * Removes a particular order item from the order of the current shopper.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient=DeleteOrderItemClient( returnId,  returnItemId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Return return = client.Result();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @param returnItemId Unique identifier of the return item whose details you want to get.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.returns.Return>
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> deleteOrderItemClient(String returnId, String returnItemId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.deleteOrderItemUrl(returnId, returnItemId);
		String verb = "DELETE";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.returns.Return.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Deletes the return specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteReturnClient( returnId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteReturnClient(String returnId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.ReturnUrl.deleteReturnUrl(returnId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



