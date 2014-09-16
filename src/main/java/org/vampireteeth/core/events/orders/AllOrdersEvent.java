package org.vampireteeth.core.events.orders;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.vampireteeth.core.domain.OrderDetails;
import org.vampireteeth.core.events.ReadEvent;


public class AllOrdersEvent extends ReadEvent{

  private final List<OrderDetails> orderDetails;

  public AllOrdersEvent(List<OrderDetails> orders) {
    this.orderDetails = Collections.unmodifiableList(orders);
  }
  
  public Collection<OrderDetails> getOrderDertails() {
    return this.orderDetails;
  }

}
