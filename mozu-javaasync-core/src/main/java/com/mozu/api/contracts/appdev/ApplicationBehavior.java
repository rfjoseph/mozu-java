/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

/**
 *	Mozu.AppDev.Contracts.ApplicationBehavior ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationBehavior implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Mozu.AppDev.Contracts.ApplicationBehavior behaviorId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer behaviorId;

	public Integer getBehaviorId() {
		return this.behaviorId;
	}

	public void setBehaviorId(Integer behaviorId) {
		this.behaviorId = behaviorId;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationBehavior packageId ApiTypeMember DOCUMENT_HERE 
	 */
	protected Integer packageId;

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

}
