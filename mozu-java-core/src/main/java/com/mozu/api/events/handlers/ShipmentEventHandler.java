/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */

package com.mozu.api.events.handlers;

import com.mozu.api.ApiContext;
import com.mozu.api.contracts.event.Event;
import com.mozu.api.events.model.EventHandlerStatus;

public interface ShipmentEventHandler {

		public EventHandlerStatus fulfilled(ApiContext apiContext, Event event);

}
