/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.content;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class DocumentDraftSummaryUrl
{

	/**
	 * Get Resource Url for ListDocumentDraftSummaries
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return   String Resource Url
	 */
	public static MozuUrl listDocumentDraftSummariesUrl(String documentLists, Integer pageSize, String responseFields, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentpublishing/draft?pageSize={pageSize}&startIndex={startIndex}&documentLists={documentLists}&responseFields={responseFields}");
		formatter.formatUrl("documentLists", documentLists);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeleteDocumentDrafts
	 * @param documentLists List of document lists that contain documents to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl deleteDocumentDraftsUrl(String documentLists)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentpublishing/draft?documentLists={documentLists}");
		formatter.formatUrl("documentLists", documentLists);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for PublishDocuments
	 * @param documentLists List of document lists that contain documents to delete.
	 * @return   String Resource Url
	 */
	public static MozuUrl publishDocumentsUrl(String documentLists)
	{
		UrlFormatter formatter = new UrlFormatter("/api/content/documentpublishing/active?documentLists={documentLists}");
		formatter.formatUrl("documentLists", documentLists);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

