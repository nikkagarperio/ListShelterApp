package com.pointwest.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.beans.AnimalBean;
import com.pointwest.training.beans.CatBean;
import com.pointwest.training.beans.DogBean;
import com.pointwest.training.beans.ParrotBean;

public class Manager {

	private static List<AnimalBean> listOfAnimals = new ArrayList<AnimalBean>();
	
	int index = 0;
	int uniqueID;
	
	public static List<AnimalBean> getListOfAnimals() {
		return listOfAnimals;
	}
	
	public int getAnimalsInShelter() {
		return listOfAnimals.size();
	}
	
//	public void getUniqueID() {
//		AnimalBean newAnimal = new AnimalBean();
//		uniqueID = AnimalBean.getCounter();
//		AnimalBean.setCounter(uniqueID+1);
//		uniqueID = AnimalBean.getCounter();
//		newAnimal.setUniqueID(uniqueID);
//	}
	
	public void addDog(DogBean newDog) {

		listOfAnimals.add(newDog);
//		index++;
		
//		newDog.getUniqueID();
		uniqueID = AnimalBean.getCounter();
		AnimalBean.setCounter(uniqueID+1);
		uniqueID = AnimalBean.getCounter();
		newDog.setUniqueID(uniqueID);
	}
	
	public void addCat(CatBean newCat) {

		listOfAnimals.add(newCat);
//		index++;
		
		uniqueID = AnimalBean.getCounter();
		AnimalBean.setCounter(uniqueID+1);
		uniqueID = AnimalBean.getCounter();
		newCat.setUniqueID(uniqueID);
	}
	
	public void addParrot(ParrotBean newParrot) {

		listOfAnimals.add(newParrot);
//		index++;
		
		uniqueID = AnimalBean.getCounter();
		AnimalBean.setCounter(uniqueID+1);
		uniqueID = AnimalBean.getCounter();
		newParrot.setUniqueID(uniqueID);
	}
	
	public boolean removeAnimal(int refID) {
		for (AnimalBean animal : listOfAnimals) {
			if (animal.getUniqueID() == refID) {
				listOfAnimals.remove(animal);
				return true;
			}
		} 
		return false;
	}
	
	public void displayAnimal(List<AnimalBean> listOfAnimals) {
		for (AnimalBean animal : listOfAnimals) {
			animal.speak();
		}
	}
	
}
