package com.pointwest.training.beans;

public abstract class AnimalBean {

	protected String name;
	protected int age;
	protected String gender;
	protected static int counter;
	protected int uniqueID;

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		AnimalBean.counter = counter;
	}

	public abstract void speak();
}
