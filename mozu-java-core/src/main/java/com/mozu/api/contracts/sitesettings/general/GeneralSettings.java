/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.general;

import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.sitesettings.general.CacheSettings;
import com.mozu.api.contracts.sitesettings.general.general.routing.CustomRouteSettings;
import com.mozu.api.contracts.sitesettings.general.EmailTransactionSettings;
import com.mozu.api.contracts.sitesettings.general.TaxableTerritory;
import com.mozu.api.contracts.sitesettings.general.general.ViewAuthorizations;

/**
 *	General settings used on the storefront site.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralSettings implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The name of the theme used on the storefront.
	 */
	protected String theme;

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * If true, the site allows entry of addresses not verified by an address validation service.
	 */
	protected Boolean allowInvalidAddresses;

	public Boolean getAllowInvalidAddresses() {
		return this.allowInvalidAddresses;
	}

	public void setAllowInvalidAddresses(Boolean allowInvalidAddresses) {
		this.allowInvalidAddresses = allowInvalidAddresses;
	}

	/**
	 * Custom dns host name for cnd edge caching.
	 */
	protected String customCdnHostName;

	public String getCustomCdnHostName() {
		return this.customCdnHostName;
	}

	public void setCustomCdnHostName(String customCdnHostName) {
		this.customCdnHostName = customCdnHostName;
	}

	/**
	 * The physical directory path or URL where the mobile favicon image file is stored. The favicon icon is generally 57x57 pixels. The icon appears on a mobile website or on the mobile device's OS Home.
	 */
	protected String favIconMobilePath;

	public String getFavIconMobilePath() {
		return this.favIconMobilePath;
	}

	public void setFavIconMobilePath(String favIconMobilePath) {
		this.favIconMobilePath = favIconMobilePath;
	}

	/**
	 * The physical directory path or URL where the mobile favicon image file is stored. The favicon icon is generally 16x16 pixels. The icon appears on a a browser tab as the website's mini logo or on a browser address bar, or next to the page name in a list of bookmarks.
	 */
	protected String favIconPath;

	public String getFavIconPath() {
		return this.favIconPath;
	}

	public void setFavIconPath(String favIconPath) {
		this.favIconPath = favIconPath;
	}

	/**
	 * The Google Analytics code associated with a particular store. This could be the web tracking code.
	 */
	protected String googleAnalyticsCode;

	public String getGoogleAnalyticsCode() {
		return this.googleAnalyticsCode;
	}

	public void setGoogleAnalyticsCode(String googleAnalyticsCode) {
		this.googleAnalyticsCode = googleAnalyticsCode;
	}

	/**
	 * If true, a service to verify addresses as valid is enabled for the site.
	 */
	protected Boolean isAddressValidationEnabled;

	public Boolean getIsAddressValidationEnabled() {
		return this.isAddressValidationEnabled;
	}

	public void setIsAddressValidationEnabled(Boolean isAddressValidationEnabled) {
		this.isAddressValidationEnabled = isAddressValidationEnabled;
	}

	/**
	 * If true, the Google analytics for eCommerce is enabled for this site. If false, the analytics are not enabled.
	 */
	protected Boolean isGoogleAnalyticsEcommerceEnabled;

	public Boolean getIsGoogleAnalyticsEcommerceEnabled() {
		return this.isGoogleAnalyticsEcommerceEnabled;
	}

	public void setIsGoogleAnalyticsEcommerceEnabled(Boolean isGoogleAnalyticsEcommerceEnabled) {
		this.isGoogleAnalyticsEcommerceEnabled = isGoogleAnalyticsEcommerceEnabled;
	}

	/**
	 * If true, enable Google analytics for this site. If false, analytics are not enabled.
	 */
	protected Boolean isGoogleAnalyticsEnabled;

	public Boolean getIsGoogleAnalyticsEnabled() {
		return this.isGoogleAnalyticsEnabled;
	}

	public void setIsGoogleAnalyticsEnabled(Boolean isGoogleAnalyticsEnabled) {
		this.isGoogleAnalyticsEnabled = isGoogleAnalyticsEnabled;
	}

	/**
	 * If true, this site represents a Mozu-hosted web storefront.
	 */
	protected Boolean isMozuWebSite;

	public Boolean getIsMozuWebSite() {
		return this.isMozuWebSite;
	}

	public void setIsMozuWebSite(Boolean isMozuWebSite) {
		this.isMozuWebSite = isMozuWebSite;
	}

	/**
	 * If true, shoppers on this site can create customer wish lists.
	 */
	protected Boolean isWishlistCreationEnabled;

	public Boolean getIsWishlistCreationEnabled() {
		return this.isWishlistCreationEnabled;
	}

	public void setIsWishlistCreationEnabled(Boolean isWishlistCreationEnabled) {
		this.isWishlistCreationEnabled = isWishlistCreationEnabled;
	}

	/**
	 * The physical directory path or URL where the website logo is stored.
	 */
	protected String logoPath;

	public String getLogoPath() {
		return this.logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	/**
	 * The tagline or text that appears when hovering over the site logo.
	 */
	protected String logoText;

	public String getLogoText() {
		return this.logoText;
	}

	public void setLogoText(String logoText) {
		this.logoText = logoText;
	}

	/**
	 * MissingImageSubstitute for 404 image requests. Can be name or id of cmsImage in files@mozu.
	 */
	protected String missingImageSubstitute;

	public String getMissingImageSubstitute() {
		return this.missingImageSubstitute;
	}

	public void setMissingImageSubstitute(String missingImageSubstitute) {
		this.missingImageSubstitute = missingImageSubstitute;
	}

	/**
	 * The name of the theme to use when viewing this website on a mobile device.
	 */
	protected String mobileTheme;

	public String getMobileTheme() {
		return this.mobileTheme;
	}

	public void setMobileTheme(String mobileTheme) {
		this.mobileTheme = mobileTheme;
	}

	/**
	 * Email address to display on email messages sent from the site.
	 */
	protected String replyToEmailAddress;

	public String getReplyToEmailAddress() {
		return this.replyToEmailAddress;
	}

	public void setReplyToEmailAddress(String replyToEmailAddress) {
		this.replyToEmailAddress = replyToEmailAddress;
	}

	/**
	 * Email address to set up so that shoppers and users browsing the site can use to contact the merchant.
	 */
	protected String senderEmailAddress;

	public String getSenderEmailAddress() {
		return this.senderEmailAddress;
	}

	public void setSenderEmailAddress(String senderEmailAddress) {
		this.senderEmailAddress = senderEmailAddress;
	}

	/**
	 * Email alias used in emails sent to your shoppers.
	 */
	protected String senderEmailAlias;

	public String getSenderEmailAlias() {
		return this.senderEmailAlias;
	}

	public void setSenderEmailAlias(String senderEmailAlias) {
		this.senderEmailAlias = senderEmailAlias;
	}

	/**
	 * Choose a format to use on the site: 12-hour (hh:mm:ss tt) or 24-hour format (HH:mm:ss).
	 */
	protected String siteTimeFormat;

	public String getSiteTimeFormat() {
		return this.siteTimeFormat;
	}

	public void setSiteTimeFormat(String siteTimeFormat) {
		this.siteTimeFormat = siteTimeFormat;
	}

	/**
	 * Choose the time zone to use for the site.
	 */
	protected String siteTimeZone;

	public String getSiteTimeZone() {
		return this.siteTimeZone;
	}

	public void setSiteTimeZone(String siteTimeZone) {
		this.siteTimeZone = siteTimeZone;
	}

	/**
	 * The name of the theme to use when viewing the website on a mobile device.
	 */
	protected String tabletTheme;

	public String getTabletTheme() {
		return this.tabletTheme;
	}

	public void setTabletTheme(String tabletTheme) {
		this.tabletTheme = tabletTheme;
	}

	/**
	 * Unique identifier of the tenant site that site uses to render content for the shopper. For example, if this site represents a third-party sales channel such as Amazon but the company wants to send shopper emails, this value represents the Mozu-hosted web storefront site that maintains this content.
	 */
	protected Integer templateSiteId;

	public Integer getTemplateSiteId() {
		return this.templateSiteId;
	}

	public void setTemplateSiteId(Integer templateSiteId) {
		this.templateSiteId = templateSiteId;
	}

	/**
	 * The name of the website to display on the storefront with no spaces.
	 */
	protected String websiteName;

	public String getWebsiteName() {
		return this.websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	/**
	 * Set of settings to deal with site caching.
	 */
	protected CacheSettings cacheSettings;

	public CacheSettings getCacheSettings() {
		return this.cacheSettings;
	}

	public void setCacheSettings(CacheSettings cacheSettings) {
		this.cacheSettings = cacheSettings;
	}

	/**
	 * Site-level control over request routing for SEO purposes. Not available for update, must use its own subresource.
	 */
	protected CustomRouteSettings customRoutes;

	public CustomRouteSettings getCustomRoutes() {
		return this.customRoutes;
	}

	public void setCustomRoutes(CustomRouteSettings customRoutes) {
		this.customRoutes = customRoutes;
	}

	/**
	 * Supressed emails. Setting any of these to 'true' will block Mozu from sending that email and an event will be published instead.
	 */
	protected EmailTransactionSettings supressedEmailTransactions;

	public EmailTransactionSettings getSupressedEmailTransactions() {
		return this.supressedEmailTransactions;
	}

	public void setSupressedEmailTransactions(EmailTransactionSettings supressedEmailTransactions) {
		this.supressedEmailTransactions = supressedEmailTransactions;
	}

	/**
	 * The territories configured for the site that are subject to sales tax.
	 */
	protected List<TaxableTerritory> taxableTerritories;
	public List<TaxableTerritory> getTaxableTerritories() {
		return this.taxableTerritories;
	}
	public void setTaxableTerritories(List<TaxableTerritory> taxableTerritories) {
		this.taxableTerritories = taxableTerritories;
	}

	/**
	 * Mozu.SiteSettings.General.Contracts.GeneralSettings viewAuthorizations ApiTypeMember DOCUMENT_HERE 
	 */
	protected ViewAuthorizations viewAuthorizations;

	public ViewAuthorizations getViewAuthorizations() {
		return this.viewAuthorizations;
	}

	public void setViewAuthorizations(ViewAuthorizations viewAuthorizations) {
		this.viewAuthorizations = viewAuthorizations;
	}

}
