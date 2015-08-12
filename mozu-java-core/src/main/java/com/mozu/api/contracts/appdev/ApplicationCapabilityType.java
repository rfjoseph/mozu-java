/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.appdev.ApplicationCapability;
import com.mozu.api.contracts.appdev.ApplicationCapabilityDomain;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationCapabilityType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Integer applicationCapabilityTypeId;

	public Integer getApplicationCapabilityTypeId() {
		return this.applicationCapabilityTypeId;
	}

	public void setApplicationCapabilityTypeId(Integer applicationCapabilityTypeId) {
		this.applicationCapabilityTypeId = applicationCapabilityTypeId;
	}

	protected Integer applicationId;

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	protected Integer capabilityTypeId;

	public Integer getCapabilityTypeId() {
		return this.capabilityTypeId;
	}

	public void setCapabilityTypeId(Integer capabilityTypeId) {
		this.capabilityTypeId = capabilityTypeId;
	}

	protected String capabilityTypeName;

	public String getCapabilityTypeName() {
		return this.capabilityTypeName;
	}

	public void setCapabilityTypeName(String capabilityTypeName) {
		this.capabilityTypeName = capabilityTypeName;
	}

	protected Boolean isImplemented;

	public Boolean getIsImplemented() {
		return this.isImplemented;
	}

	public void setIsImplemented(Boolean isImplemented) {
		this.isImplemented = isImplemented;
	}

	protected Boolean isInitializedByDefault;

	public Boolean getIsInitializedByDefault() {
		return this.isInitializedByDefault;
	}

	public void setIsInitializedByDefault(Boolean isInitializedByDefault) {
		this.isInitializedByDefault = isInitializedByDefault;
	}

	protected Integer packageId;

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	protected List<ApplicationCapability> applicationCapabilities;
	public List<ApplicationCapability> getApplicationCapabilities() {
		return this.applicationCapabilities;
	}
	public void setApplicationCapabilities(List<ApplicationCapability> applicationCapabilities) {
		this.applicationCapabilities = applicationCapabilities;
	}

	protected List<ApplicationCapabilityDomain> applicationCapabilityDomains;
	public List<ApplicationCapabilityDomain> getApplicationCapabilityDomains() {
		return this.applicationCapabilityDomains;
	}
	public void setApplicationCapabilityDomains(List<ApplicationCapabilityDomain> applicationCapabilityDomains) {
		this.applicationCapabilityDomains = applicationCapabilityDomains;
	}

}