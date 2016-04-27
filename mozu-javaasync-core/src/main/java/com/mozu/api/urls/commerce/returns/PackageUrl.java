/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.returns;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PackageUrl
{

	/**
	 * Get Resource Url for GetPackageLabel
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageLabelUrl(String packageId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/packages/{packageId}/label");
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPackage
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPackageUrl(String packageId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/packages/{packageId}?responseFields={responseFields}");
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreatePackage
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl createPackageUrl(String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/packages?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePackage
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePackageUrl(String packageId, String responseFields, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/packages/{packageId}?responseFields={responseFields}");
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeletePackage
	 * @param packageId Unique identifier of the package for which to retrieve the label.
	 * @param returnId Unique identifier of the return whose items you want to get.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePackageUrl(String packageId, String returnId)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/returns/{returnId}/packages/{packageId}");
		formatter.formatUrl("packageId", packageId);
		formatter.formatUrl("returnId", returnId);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

