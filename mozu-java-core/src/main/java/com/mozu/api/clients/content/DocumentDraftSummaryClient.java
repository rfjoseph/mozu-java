/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.content;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;

/** <summary>
 * Use the document publishing subresource to manage and publish document drafts in the Content service.
 * </summary>
 */
public class DocumentDraftSummaryClient {
	
	/**
	 * Retrieves a list of the documents currently in draft state, according to any defined filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=ListDocumentDraftSummariesClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> listDocumentDraftSummariesClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return listDocumentDraftSummariesClient(dataViewMode,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the documents currently in draft state, according to any defined filter and sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient=ListDocumentDraftSummariesClient(dataViewMode,  pageSize,  startIndex,  documentLists,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * DocumentDraftSummaryPagedCollection documentDraftSummaryPagedCollection = client.Result();
	 * </code></pre></p>
	 * @param documentLists Lists that contain the document drafts.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields 
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection>
	 * @see com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection
	 */
	public static MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> listDocumentDraftSummariesClient(com.mozu.api.DataViewMode dataViewMode, Integer pageSize, Integer startIndex, String documentLists, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentDraftSummaryUrl.listDocumentDraftSummariesUrl(documentLists, pageSize, responseFields, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection.class;
		MozuClient<com.mozu.api.contracts.content.DocumentDraftSummaryPagedCollection> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the drafts of the specified documents. Published documents cannot be deleted.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentDraftsClient(dataViewMode,  documentIds);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteDocumentDraftsClient(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds) throws Exception
	{
		return deleteDocumentDraftsClient(dataViewMode,  documentIds,  null);
	}

	/**
	 * Deletes the drafts of the specified documents. Published documents cannot be deleted.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteDocumentDraftsClient(dataViewMode,  documentIds,  documentLists);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to delete.
	 * @param documentIds Unique identifiers of the documents to delete.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient deleteDocumentDraftsClient(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds, String documentLists) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentDraftSummaryUrl.deleteDocumentDraftsUrl(documentLists);
		String verb = "POST";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(documentIds);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Publish one or more document drafts to live content on the site.
	 * <p><pre><code>
	 * MozuClient mozuClient=PublishDocumentsClient(dataViewMode,  documentIds);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentIds List of unique identifiers of the document drafts to publish.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient publishDocumentsClient(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds) throws Exception
	{
		return publishDocumentsClient(dataViewMode,  documentIds,  null);
	}

	/**
	 * Publish one or more document drafts to live content on the site.
	 * <p><pre><code>
	 * MozuClient mozuClient=PublishDocumentsClient(dataViewMode,  documentIds,  documentLists);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param documentLists List of document lists that contain documents to publish.
	 * @param documentIds List of unique identifiers of the document drafts to publish.
	 * @return Mozu.Api.MozuClient 
	 * @see string
	 */
	public static MozuClient publishDocumentsClient(com.mozu.api.DataViewMode dataViewMode, List<String> documentIds, String documentLists) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.content.DocumentDraftSummaryUrl.publishDocumentsUrl(documentLists);
		String verb = "PUT";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(documentIds);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



