package org.vampireteeth.core.events.orders;

import java.util.UUID;

import org.vampireteeth.core.domain.OrderDetails;
import org.vampireteeth.core.events.CreatedEvent;

public class OrderCreatedEvent extends CreatedEvent {
	private final UUID newOrderKey;
	private final OrderDetails details;

  public OrderCreatedEvent(final UUID key, final OrderDetails details) {
    this.newOrderKey = key;
    this.details = details;
  }
	/**
	 * @return the newOrderKey
	 */
	public UUID getNewOrderKey() {
		return this.newOrderKey;
	}

  public OrderDetails getDetails() {
    return this.details;
  }
}
