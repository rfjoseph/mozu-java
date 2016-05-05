/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders.attributedefinition;

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
 * Use the Order Attribute Definition resource to manage the attributes that uniquely describe orders, such as the associated shopping season or "How did you hear about us?" information. Merchants can display order attributes on the order summary, the order confirmation page, invoices, or packing slips.
 * </summary>
 */
public class AttributeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public AttributeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of order attributes according to any filter criteria or sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.getAttributes();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes() throws Exception
	{
		return getAttributes( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of order attributes according to any filter criteria or sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttributes( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public CountDownLatch getAttributesAsync( AsyncCallback<com.mozu.api.contracts.core.extensible.AttributeCollection> callback) throws Exception
	{
		return getAttributesAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of order attributes according to any filter criteria or sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public com.mozu.api.contracts.core.extensible.AttributeCollection getAttributes(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of order attributes according to any filter criteria or sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.AttributeCollection
	 * @see com.mozu.api.contracts.core.extensible.AttributeCollection
	 */
	public CountDownLatch getAttributesAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.core.extensible.AttributeCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.AttributeCollection> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Returns the list of vocabulary values defined for the order attribute specified in the request.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeVocabularyValue attributeVocabularyValue = attribute.getAttributeVocabularyValues( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.core.extensible.AttributeVocabularyValue
	 */
	public List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue> getAttributeVocabularyValues(String attributeFQN) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributeVocabularyValuesClient( attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Returns the list of vocabulary values defined for the order attribute specified in the request.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttributeVocabularyValues( attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.core.extensible.AttributeVocabularyValue
	 */
	public CountDownLatch getAttributeVocabularyValuesAsync(String attributeFQN, AsyncCallback<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.core.extensible.AttributeVocabularyValue>> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributeVocabularyValuesClient( attributeFQN);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves the details of the order attribute specified in the request.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.getAttribute( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute getAttribute(String attributeFQN) throws Exception
	{
		return getAttribute( attributeFQN,  null);
	}

	/**
	 * Retrieves the details of the order attribute specified in the request.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttribute( attributeFQN, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch getAttributeAsync(String attributeFQN, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		return getAttributeAsync( attributeFQN,  null, callback);
	}

	/**
	 * Retrieves the details of the order attribute specified in the request.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.getAttribute( attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public com.mozu.api.contracts.core.extensible.Attribute getAttribute(String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributeClient( attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the order attribute specified in the request.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	CountDownLatch latch = attribute.getAttribute( attributeFQN,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.core.extensible.Attribute
	 * @see com.mozu.api.contracts.core.extensible.Attribute
	 */
	public CountDownLatch getAttributeAsync(String attributeFQN, String responseFields, AsyncCallback<com.mozu.api.contracts.core.extensible.Attribute> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.extensible.Attribute> client = com.mozu.api.clients.commerce.orders.attributedefinition.AttributeClient.getAttributeClient( attributeFQN,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



