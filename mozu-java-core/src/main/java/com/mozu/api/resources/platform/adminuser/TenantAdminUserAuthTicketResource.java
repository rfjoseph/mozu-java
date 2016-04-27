/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.adminuser;

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
 * Use the Admin User authentication tickets resource to generate and refresh authentication tickets that enable Mozu administrator or developer account users to access development or production tenants.
 * </summary>
 */
public class TenantAdminUserAuthTicketResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public TenantAdminUserAuthTicketResource() 
		{
			_apiContext = null;
	}
public TenantAdminUserAuthTicketResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Creates an authentication ticket for the supplied user to specify in API requests associated with the supplied tenant.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.createUserAuthTicket( userAuthInfo);
	 * </code></pre></p>
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo) throws Exception
	{
		return createUserAuthTicket( userAuthInfo,  null,  null);
	}

	/**
	 * Creates an authentication ticket for the supplied user to specify in API requests associated with the supplied tenant.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.createUserAuthTicket( userAuthInfo,  tenantId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param tenantId Unique identifier of the development or production tenant for which to generate the user authentication ticket.
	 * @param userAuthInfo Information required to authenticate a user.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.core.UserAuthInfo
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket createUserAuthTicket(com.mozu.api.contracts.core.UserAuthInfo userAuthInfo, Integer tenantId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.createUserAuthTicketClient( userAuthInfo,  tenantId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Generates a new user authentication ticket for the specified tenant by supplying the user's existing refresh token information.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.refreshAuthTicket( existingAuthTicket);
	 * </code></pre></p>
	 * @param existingAuthTicket Properties of the authentication ticket to be used in user claims with the Mozu API.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket) throws Exception
	{
		return refreshAuthTicket( existingAuthTicket,  null,  null);
	}

	/**
	 * Generates a new user authentication ticket for the specified tenant by supplying the user's existing refresh token information.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	TenantAdminUserAuthTicket tenantAdminUserAuthTicket = tenantadminuserauthticket.refreshAuthTicket( existingAuthTicket,  tenantId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param tenantId 
	 * @param existingAuthTicket Properties of the authentication ticket to be used in user claims with the Mozu API.
	 * @return com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 * @see com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket
	 */
	public com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket refreshAuthTicket(com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket existingAuthTicket, Integer tenantId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.adminuser.TenantAdminUserAuthTicket> client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.refreshAuthTicketClient( existingAuthTicket,  tenantId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the authentication ticket for the user by supplying the refresh token.
	 * <p><pre><code>
	 *	TenantAdminUserAuthTicket tenantadminuserauthticket = new TenantAdminUserAuthTicket();
	 *	tenantadminuserauthticket.deleteUserAuthTicket( refreshToken);
	 * </code></pre></p>
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @return 
	 */
	public void deleteUserAuthTicket(String refreshToken) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.adminuser.TenantAdminUserAuthTicketClient.deleteUserAuthTicketClient( refreshToken);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



