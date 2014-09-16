package org.vampireteeth.core.events.orders;

import java.util.UUID;

import org.vampireteeth.core.domain.OrderDetails;
import org.vampireteeth.core.events.ReadEvent;

public class OrderDetailsEvent extends ReadEvent{
  private UUID key;
  private OrderDetails details;


  private OrderDetailsEvent(UUID key) {
    this.key = key;
  }

  public OrderDetailsEvent(UUID key, OrderDetails details) {
    this.key = key;
    this.details = details;
  }

  public UUID getKey() {
    return this.key;
  }

  public OrderDetails getDetails() {
    return this.details;
  }

  public static OrderDetailsEvent notFound(UUID key) {
    OrderDetailsEvent ev = new OrderDetailsEvent(key);
    ev.entityFound = false;
    return ev;
  }
}
