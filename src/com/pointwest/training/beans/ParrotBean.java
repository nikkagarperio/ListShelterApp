package com.pointwest.training.beans;

public class ParrotBean extends AnimalBean {

	private String signatureSound = "~ha ha ha ha~";
	private int uniqueID;

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}

	public void speak() {
		System.out.println(uniqueID + ": " + signatureSound + " Hi I'm " + getName().toUpperCase() + " the Parrot. I'm " + getAge() + " years old.");
	}
}