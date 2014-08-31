package org.vampireteeth.domain;

import java.util.Calendar;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	private String id;

	private String firstName;

	private String lastName;

	private int age;

	private Calendar birthday;

	public Customer(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthday = Calendar.getInstance();
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	public Calendar getBirthday() {
		return this.birthday;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%s, firstName=%s, lastName=%s, age=%d]", this.id,
				this.firstName, this.lastName, this.age);
	}

}
