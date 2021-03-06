/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.attributedefinition;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Attributes are used to add custom definitions and characteristics to the following objects:
*  — are attributes that define the characteristics of products, enabling you to uniquely describe a product. They consist of options, properties, and extras. Refer to [Product Attributes](https://www.mozu.com/docs/guides/catalog/product-attributes.htm) in the Guides section for more information.

*  — are custom attributes that you can apply to customer accounts to add further definition for special uses, such as marketing campaigns, or discounts. Refer to [Customer Attributes](https://www.mozu.com/docs/guides/customers/customers.htm#customer_attributes) in the Guides section for more information.

*  — are custom attributes that enable you to uniquely describe an aspect of an order. Depending on the attribute definition, either you or a shopper can enter values for the order attribute. Refer to [Order Attributes](https://www.mozu.com/docs/guides/orders/order-attributes.htm) in the Guides section for more information.

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
	 * Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.getAttributes();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeCollection getAttributes() throws Exception
	{
		return getAttributes( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a paged list of attributes according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	AttributeCollection attributeCollection = attribute.getAttributes( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.AttributeCollection
	 * @see com.mozu.api.contracts.productadmin.AttributeCollection
	 */
	public com.mozu.api.contracts.productadmin.AttributeCollection getAttributes(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.AttributeCollection> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.getAttributesClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the specified product attribute.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.getAttribute( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute getAttribute(String attributeFQN) throws Exception
	{
		return getAttribute( attributeFQN,  null);
	}

	/**
	 * Retrieves the details of the specified product attribute.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.getAttribute( attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute getAttribute(String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.getAttributeClient( attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new attribute to describe one aspect of a product such as color or size, based on its defined product type. The attribute name, attribute type, input type, and data type are required.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.addAttribute( attribute);
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute addAttribute(com.mozu.api.contracts.productadmin.Attribute attribute) throws Exception
	{
		return addAttribute( attribute,  null);
	}

	/**
	 * Creates a new attribute to describe one aspect of a product such as color or size, based on its defined product type. The attribute name, attribute type, input type, and data type are required.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.addAttribute( attribute,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute addAttribute(com.mozu.api.contracts.productadmin.Attribute attribute, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.addAttributeClient( attribute,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates an existing attribute with attribute properties to set.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.updateAttribute( attribute,  attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute updateAttribute(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN) throws Exception
	{
		return updateAttribute( attribute,  attributeFQN,  null);
	}

	/**
	 * Updates an existing attribute with attribute properties to set.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	Attribute attribute = attribute.updateAttribute( attribute,  attributeFQN,  responseFields);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @param attribute Properties of an attribute used to describe customers or orders.
	 * @return com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 * @see com.mozu.api.contracts.productadmin.Attribute
	 */
	public com.mozu.api.contracts.productadmin.Attribute updateAttribute(com.mozu.api.contracts.productadmin.Attribute attribute, String attributeFQN, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Attribute> client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.updateAttributeClient( attribute,  attributeFQN,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a defined product attribute. You cannot delete an attribute assigned a value for a product.
	 * <p><pre><code>
	 *	Attribute attribute = new Attribute();
	 *	attribute.deleteAttribute( attributeFQN);
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteAttribute(String attributeFQN) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.attributedefinition.AttributeClient.deleteAttributeClient( attributeFQN);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



