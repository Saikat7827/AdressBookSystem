package com.bl.Address;

import java.util.LinkedList;
import java.util.Scanner;

public class Adress_Book {
	LinkedList<Contacts> contacts = new LinkedList<>();
	Contacts contact  = new Contacts();
	Scanner sc = new Scanner(System.in);
//	contact.add("Contacts");

	public void add() {




		System.out.println("Enter first Name");
		String firstName=sc.next();
		contact.setFirstName(firstName);

		System.out.println("Enter last Name");
		String lastName=sc.next();
		contact.setLastName(lastName);
		sc.nextLine();

		System.out.println("Enter address");
		String address=sc.nextLine();
		contact.setAddress(address);

		System.out.println("Enter city");
		String city=sc.next();
		contact.setCity(city);

		System.out.println("Enter state");
		String state=sc.next();
		contact.setState(state);

		System.out.println("Enter zip");
		int zip=sc.nextInt();
		contact.setZip(zip);

		System.out.println("Enter phoneNo");
		long phoneNo=sc.nextLong();
		contact.setPhoneNo(phoneNo);

		System.out.println("Enter email");
		String email=sc.next();
		contact.setEmail(email);

		contacts.add(contact);


	}
	public void showcontact()
	{
		 System.out.println(contact.toString()); 
	}

	public static void main(String[] args) {
		Adress_Book objadress = new Adress_Book();
		objadress.add();
		objadress.showcontact();
	}
	    }
	



