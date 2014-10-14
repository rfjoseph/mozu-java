/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ShipmentUrl
{

	/**
	 * Get Resource Url for GetShipment
	 * @param orderId Unique identifier of the order associated with the shipment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param shipmentId Unique identifier of the shipment to retrieve.
	 * @return   String Resource Url
	 */
	public static MozuUrl getShipmentUrl(String orderId, String responseFields, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/{shipmentId}?responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("shipmentId", shipmentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetAvailableShipmentMethods
	 * @param draft 
	 * @param orderId Unique identifier of the order for the available shipment methods being retrieved.
	 * @return   String Resource Url
	 */
	public static MozuUrl getAvailableShipmentMethodsUrl(Boolean draft, String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/methods");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePackageShipments
	 * @param orderId Unique identifier of the order for this shipment.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPackageShipmentsUrl(String orderId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments");
		formatter.formatUrl("orderId", orderId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteShipment
	 * @param orderId Unique identifier of the order to cancel shipment.
	 * @param shipmentId Unique identifier of the shipment to cancel.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteShipmentUrl(String orderId, String shipmentId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/shipments/{shipmentId}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("shipmentId", shipmentId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

