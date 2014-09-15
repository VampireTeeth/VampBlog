package org.vampireteeth.core.domain;

import java.util.Date;

import org.vampireteeth.core.events.orders.OrderStatusDetails;


public class OrderStatus {
	private Date statusDate;
	private String status;

	public OrderStatus(final Date date, final String status) {
    this.statusDate = date;
    this.status = status;
	}

	/**
	 * @return the statusDate
	 */
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

  public OrderStatusDetails toStatusDetails() {
    return null;
  }
  
}
