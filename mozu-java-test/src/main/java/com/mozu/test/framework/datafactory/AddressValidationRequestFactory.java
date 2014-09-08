/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.customer.AddressValidationRequestResource;

/** <summary>
 * Use the Address Validation resource to validate addresses associated with a customer account contact.
 * </summary>
 */
public class AddressValidationRequestFactory
{

	public static com.mozu.api.contracts.customer.AddressValidationResponse validateAddress(ApiContext apiContext, com.mozu.api.contracts.customer.AddressValidationRequest addressValidationRequest, int expectedCode, int successCode) throws Exception
	{
		return validateAddress(apiContext,  addressValidationRequest,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.customer.AddressValidationResponse validateAddress(ApiContext apiContext, com.mozu.api.contracts.customer.AddressValidationRequest addressValidationRequest, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.customer.AddressValidationResponse returnObj = new com.mozu.api.contracts.customer.AddressValidationResponse();
		AddressValidationRequestResource resource = new AddressValidationRequestResource(apiContext);
		try
		{
			returnObj = resource.validateAddress( addressValidationRequest,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

}


