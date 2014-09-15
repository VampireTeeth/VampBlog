package org.vampireteeth.core.domain;

import java.util.Date;


public class OrderDetails {

	private Date dateTimeOfSubmission;

	/**
	 * @return the dateTimeOfSubmission
	 */
	public Date getDateTimeOfSubmission() {
		return dateTimeOfSubmission;
	}

	/**
	 * @param dateTimeOfSubmission the dateTimeOfSubmission to set
	 */
	public void setDateTimeOfSubmission(Date dateTimeOfSubmission) {
		this.dateTimeOfSubmission = dateTimeOfSubmission;
	}

}
