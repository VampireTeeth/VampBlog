package org.vampireteeth.domain;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	private String id;

	private String firstName;

	private String lastName;

	private int age;

	public Customer(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%s, firstName=%s, lastName=%s, age=%d]", this.id,
				this.firstName, this.lastName, this.age);
	}

}
