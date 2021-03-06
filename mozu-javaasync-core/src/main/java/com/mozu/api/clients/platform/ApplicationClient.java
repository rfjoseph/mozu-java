/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * platform/developer related resources. DOCUMENT_HERE 
 * </summary>
 */
public class ApplicationClient {
	
	/**
	 * platform-developer Get GetAppPackageNames description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> mozuClient=GetAppPackageNamesClient( applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageNamesCollection packageNamesCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageNamesCollection>
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> getAppPackageNamesClient(String applicationKey) throws Exception
	{
		return getAppPackageNamesClient( applicationKey,  null);
	}

	/**
	 * platform-developer Get GetAppPackageNames description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> mozuClient=GetAppPackageNamesClient( applicationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PackageNamesCollection packageNamesCollection = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.PackageNamesCollection>
	 * @see com.mozu.api.contracts.appdev.PackageNamesCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> getAppPackageNamesClient(String applicationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getAppPackageNamesUrl(applicationKey, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.PackageNamesCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.PackageNamesCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * platform-developer Get GetAppVersions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> mozuClient=GetAppVersionsClient( nsAndAppId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationVersionsCollection applicationVersionsCollection = client.Result();
	 * </code></pre></p>
	 * @param nsAndAppId The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationVersionsCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> getAppVersionsClient(String nsAndAppId) throws Exception
	{
		return getAppVersionsClient( nsAndAppId,  null);
	}

	/**
	 * platform-developer Get GetAppVersions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> mozuClient=GetAppVersionsClient( nsAndAppId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ApplicationVersionsCollection applicationVersionsCollection = client.Result();
	 * </code></pre></p>
	 * @param nsAndAppId The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.ApplicationVersionsCollection>
	 * @see com.mozu.api.contracts.appdev.ApplicationVersionsCollection
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> getAppVersionsClient(String nsAndAppId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getAppVersionsUrl(nsAndAppId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.ApplicationVersionsCollection.class;
		MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.ApplicationVersionsCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * platform-developer Get GetPackageFileMetadata description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=GetPackageFileMetadataClient( applicationKey,  filepath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> getPackageFileMetadataClient(String applicationKey, String filepath) throws Exception
	{
		return getPackageFileMetadataClient( applicationKey,  filepath,  null);
	}

	/**
	 * platform-developer Get GetPackageFileMetadata description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=GetPackageFileMetadataClient( applicationKey,  filepath,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> getPackageFileMetadataClient(String applicationKey, String filepath, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getPackageFileMetadataUrl(applicationKey, filepath, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FileMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * platform-developer Get GetPackageMetadata description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient=GetPackageMetadataClient( applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FolderMetadata folderMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FolderMetadata>
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> getPackageMetadataClient(String applicationKey) throws Exception
	{
		return getPackageMetadataClient( applicationKey,  null);
	}

	/**
	 * platform-developer Get GetPackageMetadata description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient=GetPackageMetadataClient( applicationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FolderMetadata folderMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FolderMetadata>
	 * @see com.mozu.api.contracts.appdev.FolderMetadata
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> getPackageMetadataClient(String applicationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.getPackageMetadataUrl(applicationKey, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.appdev.FolderMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FolderMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FolderMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * platform-developer Post UpsertPackageFile description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=UpsertPackageFileClient( stream,  applicationKey,  filepath,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> upsertPackageFileClient(java.io.InputStream stream, String applicationKey, String filepath, String  contentType) throws Exception
	{
		return upsertPackageFileClient( stream,  applicationKey,  filepath,  null,  null,  contentType);
	}

	/**
	 * platform-developer Post UpsertPackageFile description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=UpsertPackageFileClient( stream,  applicationKey,  filepath,  lastModifiedTime,  responseFields,  contentType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param lastModifiedTime The date and time of the last file insert or update. This parameter is optional.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param stream Data stream that delivers information. Used to input and output data.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see Stream
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> upsertPackageFileClient(java.io.InputStream stream, String applicationKey, String filepath, String lastModifiedTime, String responseFields, String  contentType) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.upsertPackageFileUrl(applicationKey, filepath, lastModifiedTime, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FileMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(stream);
		if (!StringUtils.isEmpty(contentType))
			mozuClient.addHeader(Headers.CONTENT_TYPE, contentType);
		return mozuClient;

	}

	/**
	 * platform-developer Post RenamePackageFile description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=RenamePackageFileClient( renameInfo,  applicationKey);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param renameInfo Information required to update the name of a file in a package, which consists of the original name and the new name.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> renamePackageFileClient(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey) throws Exception
	{
		return renamePackageFileClient( renameInfo,  applicationKey,  null);
	}

	/**
	 * platform-developer Post RenamePackageFile description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient=RenamePackageFileClient( renameInfo,  applicationKey,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * FileMetadata fileMetadata = client.Result();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param renameInfo Information required to update the name of a file in a package, which consists of the original name and the new name.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.appdev.FileMetadata>
	 * @see com.mozu.api.contracts.appdev.FileMetadata
	 * @see com.mozu.api.contracts.appdev.RenameInfo
	 */
	public static MozuClient<com.mozu.api.contracts.appdev.FileMetadata> renamePackageFileClient(com.mozu.api.contracts.appdev.RenameInfo renameInfo, String applicationKey, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.renamePackageFileUrl(applicationKey, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.appdev.FileMetadata.class;
		MozuClient<com.mozu.api.contracts.appdev.FileMetadata> mozuClient = (MozuClient<com.mozu.api.contracts.appdev.FileMetadata>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(renameInfo);
		return mozuClient;

	}

	/**
	 * platform-developer Delete DeletePackageFile description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePackageFileClient( applicationKey,  filepath);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param applicationKey The application key uniquely identifies the developer namespace, application ID, version, and package in Dev Center. The format is {Dev Account namespace}.{Application ID}.{Application Version}.{Package name}.
	 * @param filepath Represents the file name and location.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePackageFileClient(String applicationKey, String filepath) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.ApplicationUrl.deletePackageFileUrl(applicationKey, filepath);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



