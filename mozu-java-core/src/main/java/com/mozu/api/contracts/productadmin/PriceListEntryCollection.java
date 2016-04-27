/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productadmin.PriceListEntry;

/**
 *	Mozu.ProductAdmin.Contracts.PriceListEntryCollection ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceListEntryCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The total number of pages of the results divided per the `pageSize`.
	 */
	protected Integer pageCount;

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * The number of results to display on each page when creating paged results from a query. The amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and maximum value is 200 per page.
	 */
	protected Integer pageSize;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a `pageSize `of 25, to get the 51st through the 75th items, use `startIndex=3`.
	 */
	protected Integer startIndex;

	public Integer getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * Total number of objects in am item collection. Total counts are calculated for numerous objects in Mozu, including location inventory, products, options, product types, product reservations, categories, addresses, carriers, tax rates, time zones, and much more.
	 */
	protected Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * Collection list of items. All returned data is provided in an items array. For a failed request, the returned response may be success with an empty item collection. Items are used throughout APIs for carts, wish lists, documents, payments, returns, properties, and more.
	 */
	protected List<PriceListEntry> items;
	public List<PriceListEntry> getItems() {
		return this.items;
	}
	public void setItems(List<PriceListEntry> items) {
		this.items = items;
	}

}
