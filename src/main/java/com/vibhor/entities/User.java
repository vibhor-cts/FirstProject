package com.vibhor.entities;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {
	@NotNull
	@Min(18)
	private int age;

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
