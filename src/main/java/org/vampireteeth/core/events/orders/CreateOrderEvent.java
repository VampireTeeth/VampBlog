package org.vampireteeth.core.events.orders;

import org.vampireteeth.core.domain.OrderDetails;
import org.vampireteeth.core.events.CreateEvent;


public class CreateOrderEvent extends CreateEvent{

  private OrderDetails details;

  public CreateOrderEvent(OrderDetails details) {
    this.details = details;
  }

	/**
	 * @return the orderDetails
	 */
	public OrderDetails getDetails() {
		return details;
	}

}
