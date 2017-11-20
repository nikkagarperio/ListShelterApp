package com.pointwest.training.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pointwest.training.beans.AnimalBean;
import com.pointwest.training.beans.CatBean;
import com.pointwest.training.beans.DogBean;
import com.pointwest.training.beans.ParrotBean;
import com.pointwest.training.manager.Manager;

public class AppUI {

	int uniqueID;
	String mainMenuInput = null;
	Scanner mainMenuScanner = new Scanner(System.in);
	Manager animalManager = new Manager();

	public void displayMenu() {
		int animalsInShelter = 0;
		int maxCap = 3;
		boolean continueYes = true;

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("~ WELCOME TO NIKKA'S ANIMAL SHELTER ~");

			if (animalManager.getAnimalsInShelter() == 0) {
				System.out.println("The shelter is currently empty. You only have the option to add.");
				System.out.println("\t[1] ADD an animal");
				System.out.print("Enter choice:  ");
			} else if (animalManager.getAnimalsInShelter() == maxCap) {
				System.out.println("The shelter is now full. We can no longer accept new animals.");
				System.out.println("Do you want to continue? Y or N?");
				String continueApp = scanner.nextLine();

				if (continueApp.equalsIgnoreCase("y")) {
					System.out.println("Please select an option: ");
					System.out.println("\t[2] REMOVE an animal");
					System.out.println("\t[3] VIEW all animals");
					System.out.print("Enter choice:  ");
				} else if (continueApp.equalsIgnoreCase("n")) {
					continueYes = false;
				}
			} else if (animalsInShelter < animalManager.getAnimalsInShelter()) {
				System.out.println("Please select an option: ");
				System.out.println("\t[1] ADD an animal");
				System.out.println("\t[2] REMOVE an animal");
				System.out.println("\t[3] VIEW all animals");
				System.out.print("Enter choice:  ");
			}
			
			if (continueYes) {
				String mainMenuInput = scanner.nextLine();
				switch (mainMenuInput) {
				case "1": // add animal
					String selectAnimal = addAnimal();

					switch (selectAnimal) {
					case "1": // dog
						addDog();
						break;
					case "2": // cat
						addCat();
						break;
					case "3": // parrot
						addParrot();
						break;
					}
					break;
				case "2": // remove animal
					removeAnimal();
					break;
				case "3": // view all animals
					displayAnimals();
					break;
				}
			}
		} while (continueYes);

		System.out.println("The animal shelter is now full. Thank you, bye!");
	}

	public String addAnimal() {
		String whatAnimal;

		Scanner scanner = new Scanner(System.in);
		System.out.println("What animal do you want to add?");
		System.out.println("\t[1] a DOG");
		System.out.println("\t[2] a CAT");
		System.out.println("\t[3] a PARROT");
		whatAnimal = scanner.nextLine();

		return whatAnimal;
	}

	public DogBean addDog() {
		DogBean newDog = new DogBean();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of dog: ");
		newDog.setName(scanner.nextLine());

		System.out.println("Enter age of dog: ");
		newDog.setAge(scanner.nextInt());

		System.out.println("Enter gender of dog: ");
		newDog.setGender(scanner.next());

		animalManager.addDog(newDog);
		System.out.println("Successfully added. Welcome to the family " + newDog.getName().toUpperCase() + "!\n");

		return newDog;
	}

	public CatBean addCat() {
		CatBean newCat = new CatBean();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of cat: ");
		newCat.setName(scanner.nextLine());

		System.out.println("Enter age of cat: ");
		newCat.setAge(scanner.nextInt());

		System.out.println("Enter gender of cat: ");
		newCat.setGender(scanner.next());

		animalManager.addCat(newCat);
		System.out.println("Successfully added. Welcome to the family " + newCat.getName().toUpperCase() + "!\n");

		return newCat;
	}

	public ParrotBean addParrot() {
		ParrotBean newParrot = new ParrotBean();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of parrot: ");
		newParrot.setName(scanner.nextLine());

		System.out.println("Enter age of parrot: ");
		newParrot.setAge(scanner.nextInt());

		System.out.println("Enter gender of parrot: ");
		newParrot.setGender(scanner.next());

		animalManager.addParrot(newParrot);
		System.out.println("Successfully added. Welcome to the family " + newParrot.getName().toUpperCase() + "!\n");

		return newParrot;
	}

	public void removeAnimal() {
		System.out.println("Enter reference id of animal you want to remove: ");
		Scanner scanner = new Scanner(System.in);
		int refID = scanner.nextInt();

		if (animalManager.removeAnimal(refID) == true) {
			System.out.println(">> The animal with reference id " + refID + " is now removed. <<\n");
		} else {
			System.out.println("xxx Animal with reference id " + refID + " does not exist xxx\n");
		}
	}

	public void displayAnimals() {
		List<AnimalBean> listOfAnimals = new ArrayList<AnimalBean>();
		listOfAnimals = animalManager.getListOfAnimals();

		System.out.println("\n> Meet the lovely members of our family! <");
		animalManager.displayAnimal(listOfAnimals);
		System.out.println();

	}
}
