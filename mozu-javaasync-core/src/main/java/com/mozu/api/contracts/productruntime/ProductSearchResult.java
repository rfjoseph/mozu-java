/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.Facet;
import com.mozu.api.contracts.productruntime.Product;
import com.mozu.api.contracts.productruntime.SolrDebugInfo;

/**
 *	The result of a product search.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductSearchResult implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The number of pages returned based on the startIndex and pageSize values specified. This value is system-supplied and read-only.
	 */
	protected Integer pageCount;

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 */
	protected Integer pageSize;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	protected Integer startIndex;

	public Integer getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * The number of results listed in the query collection, represented by a signed 64-bit (8-byte) integer. This value is system-supplied and read-only.
	 */
	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * The facets applied to index products in the product search result.
	 */
	protected List<Facet> facets;
	public List<Facet> getFacets() {
		return this.facets;
	}
	public void setFacets(List<Facet> facets) {
		this.facets = facets;
	}

	/**
	 * An array list of objects in the returned collection.
	 */
	protected List<Product> items;
	public List<Product> getItems() {
		return this.items;
	}
	public void setItems(List<Product> items) {
		this.items = items;
	}

	/**
	 * Mozu.ProductRuntime.Contracts.ProductSearchResult solrDebugInfo ApiTypeMember DOCUMENT_HERE 
	 */
	protected SolrDebugInfo solrDebugInfo;

	public SolrDebugInfo getSolrDebugInfo() {
		return this.solrDebugInfo;
	}

	public void setSolrDebugInfo(SolrDebugInfo solrDebugInfo) {
		this.solrDebugInfo = solrDebugInfo;
	}

}
