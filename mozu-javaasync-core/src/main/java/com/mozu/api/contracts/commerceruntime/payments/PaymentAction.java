/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.payments;

import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.commerceruntime.payments.PaymentGatewayInteraction;
import com.mozu.api.contracts.commerceruntime.payments.BillingInfo;

/**
 *	Properties of the payment action performed for an order.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentAction implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The name of the fulfillment action to perform for the purchased product. Options include "Ship" or "PickUp" (in-store pick-up).
	 */
	protected String actionName;

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * The total monetary amount of the payment transaction.
	 */
	protected Double amount;

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * The URL provided to cancel payments submitted using PayPal Express or another non-gateway payment provider.
	 */
	protected String cancelUrl;

	public String getCancelUrl() {
		return this.cancelUrl;
	}

	public void setCancelUrl(String cancelUrl) {
		this.cancelUrl = cancelUrl;
	}

	/**
	 * If applicable, the check number associated with the payment action or interaction.
	 */
	protected String checkNumber;

	public String getCheckNumber() {
		return this.checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
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
	 * Mozu.CommerceRuntime.Contracts.Payments.PaymentAction externalTransactionId ApiTypeMember DOCUMENT_HERE 
	 */
	protected String externalTransactionId;

	public String getExternalTransactionId() {
		return this.externalTransactionId;
	}

	public void setExternalTransactionId(String externalTransactionId) {
		this.externalTransactionId = externalTransactionId;
	}

	/**
	 * Date and time of a payment interaction, including handling and processing a payment and validating and completing a payment with a payment gateway.
	 */
	protected DateTime interactionDate;

	public DateTime getInteractionDate() {
		return this.interactionDate;
	}

	public void setInteractionDate(DateTime interactionDate) {
		this.interactionDate = interactionDate;
	}

	/**
	 * Unique ID that references an original transaction in the event of a credit back.
	 */
	protected String referenceSourcePaymentId;

	public String getReferenceSourcePaymentId() {
		return this.referenceSourcePaymentId;
	}

	public void setReferenceSourcePaymentId(String referenceSourcePaymentId) {
		this.referenceSourcePaymentId = referenceSourcePaymentId;
	}

	/**
	 * The URL provided to redirect users who submit payments using PayPal Express or another non-gateway payment provider.
	 */
	protected String returnUrl;

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	/**
	 * Custom data from payment providers
	 */
	protected com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * Properties of a manually performed interaction with the payment gateway.
	 */
	protected PaymentGatewayInteraction manualGatewayInteraction;

	public PaymentGatewayInteraction getManualGatewayInteraction() {
		return this.manualGatewayInteraction;
	}

	public void setManualGatewayInteraction(PaymentGatewayInteraction manualGatewayInteraction) {
		this.manualGatewayInteraction = manualGatewayInteraction;
	}

	/**
	 * The billing information associated with this payment action.
	 */
	protected BillingInfo newBillingInfo;

	public BillingInfo getNewBillingInfo() {
		return this.newBillingInfo;
	}

	public void setNewBillingInfo(BillingInfo newBillingInfo) {
		this.newBillingInfo = newBillingInfo;
	}

}
