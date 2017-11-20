package com.pointwest.training.beans;

public class CatBean extends AnimalBean {

	private String signatureSound = "~meow meow~";
	private int uniqueID;

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public void speak() {
		System.out.println(uniqueID + ": " + signatureSound + " Hi I'm " + getName().toUpperCase() + " the Cat. I'm " + getAge() + " years old.");
	}
}
