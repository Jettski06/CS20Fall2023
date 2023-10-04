//program: Spending
//author: Jett Bachmann
//school: CHHS
//course: CS20


package Masteries;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		// price of each item
		double burgersPrice = 1.69;
		double friesPrice = 1.09;
		double drinksPrice = .99;

		// takes user input for each item they want to purchase
		System.out.println("Please enter the amount of each item you would like");
		
		System.out.println("Burgers: ");
		int ofburgers = scanner.nextInt();
		
		System.out.println("Fries: ");
		int offries = scanner.nextInt();

		System.out.println("Drinks: ");
		int ofdrinks = scanner.nextInt();

		scanner.close();
		// calculates the price with and without tax from the users inputs
		double burgerTotal = burgersPrice * ofburgers;
		double friesTotal = friesPrice * offries;
		double drinksTotal = drinksPrice * ofdrinks;
		
		double fullTotal = burgerTotal + friesTotal + drinksTotal;
		double roundedfullTotal = Math.round(fullTotal);
		System.out.println("total Before tax: " + roundedfullTotal);
		
	    double withTax = (0.065 * roundedfullTotal);
		double fullWtax = roundedfullTotal + withTax;
		// prints out the final cost of all items and also rounds it
		System.out.println("full total: "+ roundedfullTotal + Math.round(fullWtax));
		
	}

}

/*
Screen dump
 
 Please enter the amount of each item you would like
Burgers: 
2
Fries: 
1
Drinks: 
3
total Before tax: 7.0
full total: 7.07

 */
