/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;

import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Master Catalog resource to view details of the master catalogs associated with a tenant and to manage the product publishing mode for each master catalog.
 * </summary>
 */
public class MasterCatalogResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public MasterCatalogResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalogCollection masterCatalogCollection = mastercatalog.getMasterCatalogs();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalogCollection getMasterCatalogs() throws Exception
	{
		return getMasterCatalogs( null);
	}

	/**
	 * Retrieve the details of all master catalog associated with a tenant.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalogCollection masterCatalogCollection = mastercatalog.getMasterCatalogs( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 * @see com.mozu.api.contracts.productadmin.MasterCatalogCollection
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalogCollection getMasterCatalogs(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalogCollection> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.getMasterCatalogsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.getMasterCatalog( masterCatalogId);
	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog getMasterCatalog(Integer masterCatalogId) throws Exception
	{
		return getMasterCatalog( masterCatalogId,  null);
	}

	/**
	 * Retrieve the details of the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.getMasterCatalog( masterCatalogId,  responseFields);
	 * </code></pre></p>
	 * @param masterCatalogId The unique identifier of the master catalog associated with the entity.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog getMasterCatalog(Integer masterCatalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.getMasterCatalogClient( masterCatalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.updateMasterCatalog( masterCatalog,  masterCatalogId);
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param masterCatalog Properties of a master product catalog defined for a tenant. All catalogs and sites associated with a master catalog share product definitions.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog updateMasterCatalog(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId) throws Exception
	{
		return updateMasterCatalog( masterCatalog,  masterCatalogId,  null);
	}

	/**
	 * Updates the product publishing mode for the master catalog specified in the request.
	 * <p><pre><code>
	 *	MasterCatalog mastercatalog = new MasterCatalog();
	 *	MasterCatalog masterCatalog = mastercatalog.updateMasterCatalog( masterCatalog,  masterCatalogId,  responseFields);
	 * </code></pre></p>
	 * @param masterCatalogId 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param masterCatalog Properties of a master product catalog defined for a tenant. All catalogs and sites associated with a master catalog share product definitions.
	 * @return com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 * @see com.mozu.api.contracts.productadmin.MasterCatalog
	 */
	public com.mozu.api.contracts.productadmin.MasterCatalog updateMasterCatalog(com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.MasterCatalog> client = com.mozu.api.clients.commerce.catalog.admin.MasterCatalogClient.updateMasterCatalogClient( masterCatalog,  masterCatalogId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



