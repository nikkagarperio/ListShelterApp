package com.pointwest.training.beans;

public class DogBean extends AnimalBean {

	private String signatureSound = "~arf arf~";
	private int uniqueID;

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public void speak() {
		System.out.println(uniqueID + ": " + signatureSound + " Hi I'm " + getName().toUpperCase() + " the Dog. I'm " + getAge() + " years old.");
	}
}