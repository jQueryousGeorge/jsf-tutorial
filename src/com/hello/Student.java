package com.hello;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "student")
@RequestScoped
public class Student {
	private String firstName;
	private String lastName;
	
	// no-arg constructor
	public Student() {
		
	}

	// Define getter/setter methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
