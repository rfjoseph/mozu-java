/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin.search;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.productadmin.search.SearchTuningRuleFilter;

/**
 *	Mozu.ProductAdmin.Contracts.Search.SearchTuningRule ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchTuningRule implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule active ApiTypeMember DOCUMENT_HERE 
	 */
	protected Boolean active;

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule activeEndDate ApiTypeMember DOCUMENT_HERE 
	 */
	protected DateTime activeEndDate;

	public DateTime getActiveEndDate() {
		return this.activeEndDate;
	}

	public void setActiveEndDate(DateTime activeEndDate) {
		this.activeEndDate = activeEndDate;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule activeStartDate ApiTypeMember DOCUMENT_HERE 
	 */
	protected DateTime activeStartDate;

	public DateTime getActiveStartDate() {
		return this.activeStartDate;
	}

	public void setActiveStartDate(DateTime activeStartDate) {
		this.activeStartDate = activeStartDate;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule blockedProductCodes ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<String> blockedProductCodes;
	public List<String> getBlockedProductCodes() {
		return this.blockedProductCodes;
	}
	public void setBlockedProductCodes(List<String> blockedProductCodes) {
		this.blockedProductCodes = blockedProductCodes;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule boostedProductCodes ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<String> boostedProductCodes;
	public List<String> getBoostedProductCodes() {
		return this.boostedProductCodes;
	}
	public void setBoostedProductCodes(List<String> boostedProductCodes) {
		this.boostedProductCodes = boostedProductCodes;
	}

	/**
	 * Indicates if the object is default. This indicator is used for product variations and site search settings. If true, the value/object is the default option. 
	 */
	protected Boolean isDefault;

	public Boolean getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule keywords ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<String> keywords;
	public List<String> getKeywords() {
		return this.keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule searchTuningRuleCode ApiTypeMember DOCUMENT_HERE 
	 */
	protected String searchTuningRuleCode;

	public String getSearchTuningRuleCode() {
		return this.searchTuningRuleCode;
	}

	public void setSearchTuningRuleCode(String searchTuningRuleCode) {
		this.searchTuningRuleCode = searchTuningRuleCode;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule searchTuningRuleDescription ApiTypeMember DOCUMENT_HERE 
	 */
	protected String searchTuningRuleDescription;

	public String getSearchTuningRuleDescription() {
		return this.searchTuningRuleDescription;
	}

	public void setSearchTuningRuleDescription(String searchTuningRuleDescription) {
		this.searchTuningRuleDescription = searchTuningRuleDescription;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule searchTuningRuleName ApiTypeMember DOCUMENT_HERE 
	 */
	protected String searchTuningRuleName;

	public String getSearchTuningRuleName() {
		return this.searchTuningRuleName;
	}

	public void setSearchTuningRuleName(String searchTuningRuleName) {
		this.searchTuningRuleName = searchTuningRuleName;
	}

	/**
	 * Unique identifier for the site. This ID is used at all levels of a store, catalog, and tenant to associate objects to a site.
	 */
	protected Integer siteId;

	public Integer getSiteId() {
		return this.siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	/**
	 * Basic audit info about the object, including date, time, and user account. Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Mozu.ProductAdmin.Contracts.Search.SearchTuningRule filters ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<SearchTuningRuleFilter> filters;
	public List<SearchTuningRuleFilter> getFilters() {
		return this.filters;
	}
	public void setFilters(List<SearchTuningRuleFilter> filters) {
		this.filters = filters;
	}

}
