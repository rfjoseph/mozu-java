/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;
import com.mozu.api.contracts.commerceruntime.commerce.ChangeMessage;
import com.mozu.api.contracts.commerceruntime.payments.PaymentInteraction;

/**
 *	Properties of a payment transaction submitted for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payment implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The total monetary amount collected in this payment transaction for the order.
	 */
	protected  Double amountCollected;

	public Double getAmountCollected() {
		return this.amountCollected;
	}

	public void setAmountCollected(Double amountCollected) {
		this.amountCollected = amountCollected;
	}

	/**
	 * If the payment transaction is a shopper store credit, the total monetary amount credited in this payment transaction for the order.
	 */
	protected  Double amountCredited;

	public Double getAmountCredited() {
		return this.amountCredited;
	}

	public void setAmountCredited(Double amountCredited) {
		this.amountCredited = amountCredited;
	}

	/**
	 * The total amount originally requested for this payment.
	 */
	protected  Double amountRequested;

	public Double getAmountRequested() {
		return this.amountRequested;
	}

	public void setAmountRequested(Double amountRequested) {
		this.amountRequested = amountRequested;
	}

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
	 * The external/third party transaction Id for this payment. This is used to store the transaction Id from digital wallet like Visa Checkout
	 */
	protected  String externalTransactionId;

	public String getExternalTransactionId() {
		return this.externalTransactionId;
	}

	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}

	/**
	 * Unique identifier of the source property, such as a catalog, discount, order, or email template.For a product field it will be the name of the field.For a category ID, must be a positive integer not greater than 2000000. By default,  auto-generates a category ID when categories are created. If you want to specify an ID during creation (which preserves category link relationships when migrating tenant data from one sandbox to another), you must also include the  query string in the endpoint. For example, . Then, use the  property to specify the desired category ID.For a product attribute it will be the Attribute FQN.For a document, the ID must be specified as a 32 character, case-insensitive, alphanumeric string. You can specify the ID as 32 sequential characters or as groups separated by dashes in the format 8-4-4-4-12. For example, or.For email templates, the ID must be one of the following values:			
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Indicates if the product in a cart, order, or wish list is purchased on a recurring schedule. If true, the item can be purchased or fulfilled at regular intervals, such as a monthly billing cycle. For example, digital or physical product subscriptions are recurring cart items. This property is not used at this time and is reserved for future functionality.
	 */
	protected  Boolean isRecurring;

	public Boolean getIsRecurring() {
		return this.isRecurring;
	}

	public void setIsRecurring(Boolean isRecurring) {
		this.isRecurring = isRecurring;
	}

	/**
	 * Unique identifier of the order associated with the payment.
	 */
	protected  String orderId;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * The transaction ID supplied by the payment service to associate with this order payment.
	 */
	protected  String paymentServiceTransactionId;

	public String getPaymentServiceTransactionId() {
		return this.paymentServiceTransactionId;
	}

	public void setPaymentServiceTransactionId(String paymentServiceTransactionId) {
		this.paymentServiceTransactionId = paymentServiceTransactionId;
	}

	/**
	 * The type of payment, such as credit card, check, or PayPal Express. Additional payment types will be supported in future releases.
	 */
	protected  String paymentType;

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * The source of data for this payment. By default, this will be set to 'mozu'
	 */
	protected  String paymentWorkflow;

	public String getPaymentWorkflow() {
		return this.paymentWorkflow;
	}

	public void setPaymentWorkflow(String paymentWorkflow) {
		this.paymentWorkflow = paymentWorkflow;
	}

	/**
	 * The current status of the object.This value is read only. Valid values for this field are: "Active", "Expired", and "Inactive".
	 */
	protected  String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected  AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Properties for the customer's billing information associated with an order or specific payment.
	 */
	protected  BillingInfo billingInfo;

	public BillingInfo getBillingInfo() {
		return this.billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
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
	 * Custom data originated by the payment service.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * Container for the interactions associated with the payment, which includes details for each action performed for the payment.
	 */
	protected List<PaymentInteraction> interactions;
	public List<PaymentInteraction> getInteractions() {
		return this.interactions;
	}
	public void setInteractions(List<PaymentInteraction> interactions) {
		this.interactions = interactions;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(data == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, data);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.data = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
