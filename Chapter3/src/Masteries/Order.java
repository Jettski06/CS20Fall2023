package Masteries;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		double burgersPrice = 1.69;
		double friesPrice = 1.09;
		double drinksPrice = .99;

		
		System.out.println("Please enter the amount of each item you would like");
		
		System.out.println("Burgers: ");
		int ofburgers = scanner.nextInt();
		
		System.out.println("Fries: ");
		int offries = scanner.nextInt();

		System.out.println("Drinks: ");
		int ofdrinks = scanner.nextInt();

		scanner.close();
		
		double burgerTotal = burgersPrice * ofburgers;
		double friesTotal = friesPrice * offries;
		double drinksTotal = drinksPrice * ofdrinks;
		
		double fullTotal = burgerTotal + friesTotal + drinksTotal;
		double roundedfullTotal = Math.round(fullTotal);
		System.out.println("total Before tax: " + roundedfullTotal);
		
	    double withTax = (0.065 * roundedfullTotal);
		double fullWtax = roundedfullTotal + withTax;
		System.out.println("full total: "+ roundedfullTotal + Math.round(fullWtax));
		
	}

}
