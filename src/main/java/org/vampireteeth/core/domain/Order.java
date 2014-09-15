package org.vampireteeth.core.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.BeanUtils;


public class Order {

  private final Date dateTimeOfSubmission;
  private Map<String, Integer> orderItems;
  private final UUID key;
  private Customer customer;

  private OrderStatus status;
  private List<OrderStatus> statusHistory;


  public Order(final Date dateTimeOfSubmission) {
    this.key = UUID.randomUUID();
    this.dateTimeOfSubmission = dateTimeOfSubmission;
    statusHistory = new ArrayList<OrderStatus>();
  }

  public void addStatus(OrderStatus newStatus) {
    this.statusHistory.add(newStatus);
    this.status = newStatus;
  }

  public OrderStatus getStatus() {
    return this.status;
  }
    
  public Date getDateTimeOfSubmission() {
    return this.dateTimeOfSubmission;
  }

	/**
	 * @return the orderItems
	 */
	public Map<String, Integer> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(Map<String, Integer> orderItems) {
    if(orderItems == null) {
      this.orderItems = Collections.emptyMap();
    } else {
      this.orderItems = Collections.unmodifiableMap(orderItems);
    }
	}

	public UUID getKey() {
    return this.key;
  }


  public boolean canBeDeleted() {
    return true;
  }

  public OrderDetails toOrderDetails() {
    OrderDetails details = new OrderDetails();
    BeanUtils.copyProperties(this, details);
    return details;
  }


  public static Order fromOrderDetails(OrderDetails orderDetails) {
    Order order = new Order(orderDetails.getDateTimeOfSubmission());
    BeanUtils.copyProperties(orderDetails, order);
    return order;
  }
}










