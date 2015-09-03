/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Describes the scope of the product publishing update, which can include individual product codes or all pending changes.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublishingScope implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, publish or discard all pending product changes in the master catalog.
	 */
	protected Boolean allPending;

	public Boolean getAllPending() {
		return this.allPending;
	}

	public void setAllPending(Boolean allPending) {
		this.allPending = allPending;
	}

	/**
	 * List of product codes of associated products, used for pending product changes to publish or delete and returned in a product inventory location query.
	 */
	protected List<String> productCodes;
	public List<String> getProductCodes() {
		return this.productCodes;
	}
	public void setProductCodes(List<String> productCodes) {
		this.productCodes = productCodes;
	}

	/**
	 * The Publish Set to publish
	 */
	protected String publishSetCode;

	public String getPublishSetCode() {
		return this.publishSetCode;
	}

	public void setPublishSetCode(String publishSetCode) {
		this.publishSetCode = publishSetCode;
	}

}
