/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class ObjectUrl
{

	/**
	 * Get Resource Url for GetSettings
	 * @param fields 
	 * @return   String Resource Url
	 */
	public static MozuUrl getSettingsUrl(String fields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/search/settings?fields={fields}");
		formatter.formatUrl("fields", fields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateSettings
	 * @param fields 
	 * @return   String Resource Url
	 */
	public static MozuUrl updateSettingsUrl(String fields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/search/settings?fields={fields}");
		formatter.formatUrl("fields", fields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}
