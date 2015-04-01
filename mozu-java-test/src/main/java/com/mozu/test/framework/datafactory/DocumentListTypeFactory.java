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
import com.mozu.api.resources.content.DocumentListTypeResource;

/** <summary>
 * Use the Document List Types resource to manage the types of document lists in your site's document hierarchy. The type denotes a content type for that list of folders, sub-folders, and documents such as `web_pages`.
 * </summary>
 */
public class DocumentListTypeFactory
{

	public static com.mozu.api.contracts.content.DocumentListType createDocumentListType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentListType list, int expectedCode, int successCode) throws Exception
	{
		return createDocumentListType(apiContext, dataViewMode,  list,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentListType createDocumentListType(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.content.DocumentListType list, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentListType returnObj = new com.mozu.api.contracts.content.DocumentListType();
		DocumentListTypeResource resource = new DocumentListTypeResource(apiContext, dataViewMode);
		try
		{
			returnObj = resource.createDocumentListType( list,  responseFields);
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

	public static com.mozu.api.contracts.content.DocumentListType updateDocumentListType(ApiContext apiContext, com.mozu.api.contracts.content.DocumentListType list, String documentListTypeFQN, int expectedCode, int successCode) throws Exception
	{
		return updateDocumentListType(apiContext,  list,  documentListTypeFQN,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.content.DocumentListType updateDocumentListType(ApiContext apiContext, com.mozu.api.contracts.content.DocumentListType list, String documentListTypeFQN, String responseFields, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.content.DocumentListType returnObj = new com.mozu.api.contracts.content.DocumentListType();
		DocumentListTypeResource resource = new DocumentListTypeResource(apiContext);
		try
		{
			returnObj = resource.updateDocumentListType( list,  documentListTypeFQN,  responseFields);
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



