/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.returns.ReturnItem;
import com.mozu.api.contracts.commerceruntime.orders.OrderNote;
import com.mozu.api.contracts.commerceruntime.fulfillment.Package;
import com.mozu.api.contracts.commerceruntime.payments.Payment;

/**
 *	Properties of a return of one or more previously fulfilled items.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Return implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Available actions you can complete for an order. These actions may differ depending on the status of the order, such as actions required to enter a payment, return of a package, and fulfillment of a shipment.
	 */
	protected List<String> availableActions;
	public List<String> getAvailableActions() {
		return this.availableActions;
	}
	public void setAvailableActions(List<String> availableActions) {
		this.availableActions = availableActions;
	}

	/**
	 * Code that identifies the channel associated with the site for the shopper's created shopping cart, order, and return.
	 */
	protected String channelCode;

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * Unique identifer of the customer account. This ID is used to associate numerous types of data and object with the customer account, including orders, returns, wish lists, and in-store credit.
	 */
	protected Integer customerAccountId;

	public Integer getCustomerAccountId() {
		return this.customerAccountId;
	}

	public void setCustomerAccountId(Integer customerAccountId) {
		this.customerAccountId = customerAccountId;
	}

	/**
	 * The type of customer interaction used to create this shopping cart. Possible values are Website, Call, Store, or Unknown.
	 */
	protected String customerInteractionType;

	public String getCustomerInteractionType() {
		return this.customerInteractionType;
	}

	public void setCustomerInteractionType(String customerInteractionType) {
		this.customerInteractionType = customerInteractionType;
	}

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The unique, user-defined code that identifies a location. This location can be the location where the order was entered, location for newly in-stock products, and where products are returned.
	 */
	protected String locationCode;

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	/**
	 * The total value of the return to the merchant for accounting purposes. This total represents the combined product loss and shipping loss associated with the return.
	 */
	protected Double lossTotal;

	public Double getLossTotal() {
		return this.lossTotal;
	}

	public void setLossTotal(Double lossTotal) {
		this.lossTotal = lossTotal;
	}

	/**
	 * If this return is associated with a previously completed order, the unique identifier of the original order.
	 */
	protected String originalOrderId;

	public String getOriginalOrderId() {
		return this.originalOrderId;
	}

	public void setOriginalOrderId(String originalOrderId) {
		this.originalOrderId = originalOrderId;
	}

	/**
	 * The total tax amount levied on the product loss amount.
	 */
	protected Double productLossTaxTotal;

	public Double getProductLossTaxTotal() {
		return this.productLossTaxTotal;
	}

	public void setProductLossTaxTotal(Double productLossTaxTotal) {
		this.productLossTaxTotal = productLossTaxTotal;
	}

	/**
	 * The total value of the product returned to the merchant for accounting purposes, calculated by multiplying the cost of the item by its quantity returned.
	 */
	protected Double productLossTotal;

	public Double getProductLossTotal() {
		return this.productLossTotal;
	}

	public void setProductLossTotal(Double productLossTotal) {
		this.productLossTotal = productLossTotal;
	}

	/**
	 * If a refund action was performed for this return, the total amount refunded to the shopper. The refund amount can differ from the sum of the price of the returned items.
	 */
	protected Double refundAmount;

	public Double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	/**
	 * A merchant-specific identifier used to sequentially order returns.
	 */
	protected Integer returnNumber;

	public Integer getReturnNumber() {
		return this.returnNumber;
	}

	public void setReturnNumber(Integer returnNumber) {
		this.returnNumber = returnNumber;
	}

	/**
	 * Unique identifier for the order created as a result of the return. If the return results in shipping a replacement item, the order includes shipment information for the replaced items. If the return results in a refund, the order includes payment transactions to credit the shopper.
	 */
	protected String returnOrderId;

	public String getReturnOrderId() {
		return this.returnOrderId;
	}

	public void setReturnOrderId(String returnOrderId) {
		this.returnOrderId = returnOrderId;
	}

	/**
	 * The type of return, which is "Refund" or "Replace".
	 */
	protected String returnType;

	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	/**
	 * The date by which a shopper must ship items associated with a return in an "awaiting items" state to the merchant.
	 */
	protected DateTime rmaDeadline;

	public DateTime getRmaDeadline() {
		return this.rmaDeadline;
	}

	public void setRmaDeadline(DateTime rmaDeadline) {
		this.rmaDeadline = rmaDeadline;
	}

	/**
	 * The total tax amount levied on the shipping loss amount.
	 */
	protected Double shippingLossTaxTotal;

	public Double getShippingLossTaxTotal() {
		return this.shippingLossTaxTotal;
	}

	public void setShippingLossTaxTotal(Double shippingLossTaxTotal) {
		this.shippingLossTaxTotal = shippingLossTaxTotal;
	}

	/**
	 * The total value of shipping the returned product to the merchant for accounting purposes, calculated by multiplying the shipping cost of the item by its quantity returned.
	 */
	protected Double shippingLossTotal;

	public Double getShippingLossTotal() {
		return this.shippingLossTotal;
	}

	public void setShippingLossTotal(Double shippingLossTotal) {
		this.shippingLossTotal = shippingLossTotal;
	}

	/**
	 * Unique identifier of the site.
	 */
	protected Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * The current status of an object. This status is specific to the object including payment (New, Authorized, Captured, Declined, Failed, Voided, Credited, CheckRequested, or RolledBack), discount (Active, Scheduled, or Expired), returns (ReturnAuthorized), tenant, package (Fulfilled or NotFulfilled), application, master and product catalogs, orders (Pending, Submitted, Processing, Pending Review, Closed, or Canceled), and order validation results (Pass, Fail, Error, or Review).
	 */
	protected String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Unique identifier of the Mozu tenant.
	 */
	protected Integer tenantId;

	public Integer getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	/**
	 * Unique identifier of the customer account (shopper or system user). System-supplied and read-only. If the shopper user is anonymous, the user ID represents a system-generated user ID string.
	 */
	protected String userId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * Unique identifier of the customer visit in which the cart was created or last modified.
	 */
	protected String visitId;

	public String getVisitId() {
		return this.visitId;
	}

	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}

	/**
	 * Unique identifier of the web session in which the cart, order, return, or wish list was created or last modified.
	 */
	protected String webSessionId;

	public String getWebSessionId() {
		return this.webSessionId;
	}

	public void setWebSessionId(String webSessionId) {
		this.webSessionId = webSessionId;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Collection (list or paged) of change messages logged for each modification made by a shopper to their carts, wishlists, orders, package, payment, pickup, and returns. Change log messages are system-supplied based on shopper actions and read only.
	 */
	protected List<ChangeMessage> changeMessages;
	public List<ChangeMessage> getChangeMessages() {
		return this.changeMessages;
	}
	public void setChangeMessages(List<ChangeMessage> changeMessages) {
		this.changeMessages = changeMessages;
	}

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<ReturnItem> items;
	public List<ReturnItem> getItems() {
		return this.items;
	}
	public void setItems(List<ReturnItem> items) {
		this.items = items;
	}

	/**
	 * Paged list collection of note content for objects including customers, orders, and returns. 
	 */
	protected List<OrderNote> notes;
	public List<OrderNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<OrderNote> notes) {
		this.notes = notes;
	}

	/**
	 * Array list of physical packages shipped for a specified order.
	 */
	protected List<Package> packages;
	public List<Package> getPackages() {
		return this.packages;
	}
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	/**
	 * Wrapper for a collection of payments associated with an order or return. An order can include a number of payments until the full total is covered. 
	 */
	protected List<Payment> payments;
	public List<Payment> getPayments() {
		return this.payments;
	}
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
