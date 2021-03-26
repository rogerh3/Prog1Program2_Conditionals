//Project: Project 2 - Conditionals
//Author: Roger H Hayden III
//Desc: using conditionals - if/else and strings
//Version: 1.0
//Last update: 9/11

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		//Import scanner
		
		System.out.println("What is your first name?");
		String firstName = keyboard.next();
		//Asking for first name and storing it
	
			System.out.print ("Hi " + firstName); 
		
		System.out.print(", how old are you? (in numbers)");
		int age = keyboard.nextInt();
		//Asking for age and storing it
		
			System.out.println("Your are" + " " + age + " " + "years old.");
		
		System.out.println("What is your favorite number? (in numbers)");
		long number = keyboard.nextLong(); 
		//Asking for Favorite number and storing it
		
			System.out.println("Your favorite number is" + " " + number + ".");
		
		System.out.println("Pick a random number. (in numbers)");
		long randNum = keyboard.nextLong(); 
		//Asking for a Random Number and storing
		
			System.out.println("The random number you selected is " + randNum); 
		
		System.out.println("Select what operation you would like to be done.");
		System.out.println("1. Add age and favorite number");
		System.out.println("2. Subtract age and favorite number");
		System.out.println("3. Multiply age and favorite number");
		System.out.println("4. Add age and favorite number then multiply by 2");
		int entry = keyboard.nextInt();
		//Asking which operation user wants done and then storing it
			 
			long num1 = age + number; 
			long num2 = age - number; 
			long num3 = age * number;
			long num4 = (age + number) * 2; 
	//Labeling what different values we can get from the above entries
		
	//Below is telling the computer what to do for each entry
			//Providing information about the operation the user chose versus the random numbers size
		if (entry == 1) {
			System.out.println("Your age plus your favorite number is " + num1);
				if (num1 > randNum) {
					System.out.println("Your age plus your favorite number is greater than your random number.");
				}
				if (num1 == randNum) {
					System.out.println("Your age plus your favorite number is equal to your random number.");
				}
				if (num1 < randNum) {
					System.out.println("Your age plus your favorite number is less than your random number."); 
				}
			//after all the if statements I did a switch that just asks if the math in the program was done correctly
			//I have them nested within all the entries 1-4 because it makes the program run the best
			//I should have done a switch instead of all the if statements but this worked out best since I didn't do that at first.
						System.out.println("Was my math correct? choose an option below");
						System.out.println("1. for yes");
						System.out.println("2. for no");
					String answer = keyboard.next();
						switch(answer){
							case "1":
									System.out.println("Thank you, have a great day!");
										break;
							case "2":
									System.out.println("I am sorry for the inconvenience, try again with different numbers!");
										break;
							default:
									System.out.println("Please restart and choose numbers that are listed as options.");
		}
		}else if (entry == 2) {
			System.out.println("Your age minus your favorite number is " + num2);
				if (num2 > randNum) {
					System.out.println("Your age minus your favorite number is greater than your random number.");
				}
				if (num2 == randNum) {
					System.out.println("Your age minus your favorite number is equal to your random number.");
				}
				if (num2 < randNum) {
					System.out.println("Your age minus your favorite number is less than your random number."); 
				}
						System.out.println("Was my math correct? choose an option below");
						System.out.println("1. for yes");
						System.out.println("2. for no");
					String answer = keyboard.next();
						switch(answer){
							case "1":
									System.out.println("Thank you, have a great day!");
										break;
							case "2":
									System.out.println("I am sorry for the inconvenience, try again with different numbers!");
										break;
							default:
									System.out.println("Please restart and choose numbers that are listed as options.");
		}
		}else if (entry == 3) {
			System.out.println("Your age multiplied by your favorite number is " + num3);
				if (num3 > randNum) {
					System.out.println("Your age multiplied by your favorite number is greater than your random number.");
				}
				if (num3 == randNum) {
					System.out.println("Your age multiplied by your favorite number is equal to your random number.");
				}
				if (num3 < randNum) {
					System.out.println("Your age multiplied by your favorite number is less than your random number."); 
				}
						System.out.println("Was my math correct? choose an option below");
						System.out.println("1. for yes");
						System.out.println("2. for no");
					String answer = keyboard.next();
						switch(answer){
							case "1":
								System.out.println("Thank you, have a great day!");
									break;
							case "2":
								System.out.println("I am sorry for the inconvenience, try again with different numbers!");
									break;
							default:
								System.out.println("Please restart and choose numbers that are listed as options.");
				
		}
		}else if (entry == 4) {
			System.out.println("Your age plus your favorite number plus your random number is " + num4);
				if (num4 > randNum) {
					System.out.println("Your age plus your favorite number plus your random number is greater than your random number.");
				}
				if (num4 == randNum) {
					System.out.println("Your age plus your favorite number plus your random number is equal to your random number.");
				}
				if (num4 < randNum) {
					System.out.println("Your age plus your favorite number plus your random number is less than your random number."); 
			}
						System.out.println("Was my math correct? choose an option below");
						System.out.println("1. for yes");
						System.out.println("2. for no");
					String answer = keyboard.next();
						switch(answer){
							case "1":
								System.out.println("Thank you, have a great day!");
									break;
							case "2":
								System.out.println("I am sorry for the inconvenience, try again with different numbers!");
									break;
							default:
								System.out.println("Please restart and choose numbers that are listed as options.");
		} 
		}else {
					System.out.println("Please restart and pick a number listed");
		}
		
//		if (entry == 1){
//			System.out.println("Was my math correct? choose an option below");
//			System.out.println("1. for yes");
//			System.out.println("2. for no");
//				String answer = keyboard.next();
//		switch(answer){
//			case "1":
//				System.out.println("Thank you, have a great day!");
//				break;
//			case "2":
//				System.out.println("I am sorry for the inconvenience, try again with different numbers!");
//				break;
//			default:
//				System.out.println("Please restart and choose numbers that are listed as options.");
//				
//		}
//		}
//		if (entry == 2) {
//			System.out.println("Was my math correct? choose an option below");
//			System.out.println("1. for yes");
//			System.out.println("2. for no");
//				String answer = keyboard.next();
//		switch(answer){
//			case "1":
//				System.out.println("Thank you, have a great day!");
//				break;
//			case "2":
//				System.out.println("I am sorry for the inconvenience, try again with different numbers!");
//				break;
//			default:
//				System.out.println("Please restart and choose numbers that are listed as options.");
//		}
//		if (entry == 3) {
//			System.out.println("Was my math correct? choose an option below");
//			System.out.println("1. for yes");
//			System.out.println("2. for no");
//				String answer = keyboard.next();
//		switch(answer){
//			case "1":
//				System.out.println("Thank you, have a great day!");
//				break;
//			case "2":
//				System.out.println("I am sorry for the inconvenience, try again with different numbers!");
//				break;
//			default:
///				System.out.println("Please restart and choose numbers that are listed as options.");
	//	}
	//	
	//	
	//	
		
		
	//			}
}
}
