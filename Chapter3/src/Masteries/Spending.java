
//program: Spending
//author: Jett Bachmann
//school: CHHS
//course: CS20






package Masteries;

import java.util.Scanner;


public class Spending {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("enter The amount spent on last month on the following items");
		
		System.out.println("Food: ");
		int ofFood = scanner.nextInt();
		
		System.out.println("Clothing: ");
		int ofClothing = scanner.nextInt();
		
		System.out.println("Entertainment: ");
		int ofEnt = scanner.nextInt();
		
		System.out.println("Rent: ");
		int ofRent = scanner.nextInt();
		// takes users input for prices of each variable
		
		scanner.close();
		
		double fullCost = ofRent + ofFood + ofClothing + ofEnt;
		System.out.println(fullCost);
		
		double perofFood = ofFood / fullCost *100;
		double perofClothing = ofClothing / fullCost *100;
		double perofEnt = ofEnt / fullCost *100;
		double perofRent = ofRent / fullCost *100;
		// calculates the percent of each variable and turns it into a percent
		
		System.out.println("Category                Budget");
		
		System.out.println("food:                    "   + perofFood+"%");
		
		System.out.println("Clothing:                "  +  perofClothing+"%");
		
		System.out.println("Entertainment:           " +   perofEnt+"%");
		
		System.out.println("Rent:                    " +            perofRent+"%");
// outputs the final percent of each variable in a chart form
	}

}

/*
  screen dump
  
 enter The amount spent on last month on the following items
Food: 
2
Clothing: 
2
Entertainment: 
2
Rent: 
4
10.0
Category                Budget
food:                    20.0%
Clothing:                20.0%
Entertainment:           20.0%
Rent:                    40.0%

 */

