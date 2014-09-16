package org.vampireteeth.core.events.orders;

import java.util.UUID;

import org.vampireteeth.core.events.DeleteEvent;


public class DeleteOrderEvent extends DeleteEvent {

	private UUID key;

	public DeleteOrderEvent(final UUID key) {
    this.key = key;
  }

	/**
	 * @return the key
	 */
	public UUID getKey() {
		return key;
	}

}
