package com.bl.Address;

import java.util.Scanner;

public class Adress_Book {
	Scanner sc = new Scanner(System.in);

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	int phoneNo;
	String email;

		public void contactDetails()
		{

			System.out.println("Enter firstName");
			firstName=sc.next();
			
			System.out.println("Enter lastName");
			lastName=sc.next();
			
			sc.nextLine();
			
			System.out.println("Enter address");
			address=sc.nextLine();
			
			System.out.println("Enter city");
			city=sc.next();
			
			System.out.println("Enter state");
			state=sc.next();
			
			System.out.println("Enter zip");
			zip=sc.nextInt();
			
			System.out.println("Enter phoneNo");
			phoneNo=sc.nextInt();
			
			System.out.println("Enter email");
			email=sc.next();


			System.out.println('\n' + "----Contact details----" + '\n' );
			System.out.println(firstName);
			System.out.println(lastName);
			System.out.println(address);
			System.out.println(city);
			System.out.println(state);
			System.out.println(zip);
			System.out.println(phoneNo);
			System.out.println(email);


		}


public static void main(String[] args) {


System.out.println('\n' +"Welcome to Address Book Program"+ '\n');

Adress_Book obj = new Adress_Book();
obj.contactDetails();

}
	    }
	



