package com.bl.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class Adress_Book {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Contacts> personDetails = new ArrayList<>();

	
	public void newContact() {
		Contacts add = new Contacts();
		System.out.println("Enter your First Name");
		add.firstName = sc.nextLine();
		System.out.println("Enter your Last Name");
		add.lastName = sc.nextLine();
		System.out.println("Enter your City");
		add.city = sc.nextLine();
		System.out.println("Enter your state");
		add.state = sc.nextLine();
		System.out.println("Enter your Zip");
		add.zip = sc.nextInt();
		System.out.println("Enter your Phone Number");
		add.phNo = sc.nextInt();
		System.out.println("Enter your email ID");
		add.email = sc.next();
		System.out.println("Added Successfully");

		
		personDetails.add(add);

		System.out.println(add);
	}

	
	public void editPerson() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name to Edit");
		String name = sc.next();

		for (int i = 0; i < personDetails.size(); i++) {
			Contacts p = (Contacts) personDetails.get(i);

			if (name.equals(p.getFirstName())) {
				System.out.println(p);

				System.out.print(
						"Enter what to update(1.first name/ 2.last name/ 3.city/ 4.state/ 5.phone/ 6.zip/ 7.email): ");
				sc.nextLine();
				Integer choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter your first name to update:");
					p.firstName = sc.next();
					break;
				case 2:
					System.out.println("Enter your last name to update:");
					p.lastName = sc.next();
					break;
				case 3:
					System.out.println("Enter your city name to update:");
					p.city = sc.next();
					break;
				case 4:
					System.out.println("Enter your state name to update:");
					p.state = sc.next();
					break;
				case 5:
					System.out.println("Enter Your phone no to update:");
					p.phNo = sc.nextInt();
					break;
				case 6:
					System.out.println("Enter Your zip to update:");
					p.zip = sc.nextInt();
					break;
				case 7:
					System.out.println("Enter Your email to update:");
					p.email = sc.next();
					break;
				}
				
				personDetails.set(i, p);
				System.out.println(p);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");
		Scanner sc = new Scanner(System.in);

		Adress_Book addPerson = new Adress_Book();
		
		System.out.println("Enter Number of persons you want to add : ");
		int person_count = sc.nextInt();
		for (int i = 0; i < person_count; i++) {
			addPerson.newContact();
		}
		
		addPerson.editPerson();

		sc.close();
	}
}
	



