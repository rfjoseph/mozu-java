/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.TargetRuleResource;

/** <summary>
 * commerce/targetrules related resources. DOCUMENT_HERE 
 * </summary>
 */
public class TargetRuleFactory
{

	public static com.mozu.api.contracts.shippingadmin.TargetRuleCollection getTargetRules(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getTargetRules(apiContext,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.TargetRuleCollection getTargetRules(ApiContext apiContext, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.TargetRuleCollection returnObj = new com.mozu.api.contracts.shippingadmin.TargetRuleCollection();
		TargetRuleResource resource = new TargetRuleResource(apiContext);
		try
		{
			returnObj = resource.getTargetRules( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.shippingadmin.TargetRule getTargetRule(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		return getTargetRule(apiContext,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.TargetRule getTargetRule(ApiContext apiContext, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.TargetRule returnObj = new com.mozu.api.contracts.shippingadmin.TargetRule();
		TargetRuleResource resource = new TargetRuleResource(apiContext);
		try
		{
			returnObj = resource.getTargetRule( code,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.shippingadmin.TargetRule createTargetRule(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.TargetRule targetRule, int expectedCode) throws Exception
	{
		return createTargetRule(apiContext,  targetRule,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.TargetRule createTargetRule(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.TargetRule returnObj = new com.mozu.api.contracts.shippingadmin.TargetRule();
		TargetRuleResource resource = new TargetRuleResource(apiContext);
		try
		{
			returnObj = resource.createTargetRule( targetRule,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void validateTargetRule(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.TargetRule targetRule, int expectedCode) throws Exception
	{
		TargetRuleResource resource = new TargetRuleResource(apiContext);
		try
		{
			resource.validateTargetRule( targetRule);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

	public static com.mozu.api.contracts.shippingadmin.TargetRule updateTargetRule(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code, int expectedCode) throws Exception
	{
		return updateTargetRule(apiContext,  targetRule,  code,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingadmin.TargetRule updateTargetRule(ApiContext apiContext, com.mozu.api.contracts.shippingadmin.TargetRule targetRule, String code, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingadmin.TargetRule returnObj = new com.mozu.api.contracts.shippingadmin.TargetRule();
		TargetRuleResource resource = new TargetRuleResource(apiContext);
		try
		{
			returnObj = resource.updateTargetRule( targetRule,  code,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deleteTargetRule(ApiContext apiContext, String code, int expectedCode) throws Exception
	{
		TargetRuleResource resource = new TargetRuleResource(apiContext);
		try
		{
			resource.deleteTargetRule( code);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



