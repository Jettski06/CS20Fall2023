
        //purpose: calculating change
		//
		//author: Jett Bachmann
		//school: CHS
		//course: CS20

package Masteries;
import java.util.Scanner;

public class Change 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter an amount less than 1.00$: ");
		double amount = scanner.nextDouble();
		
		if (amount  >= 1.00) {
		System.out.println("Must be less than 1.00$"); } 
		
		//amounts for all the coins
		int cents = (int) (amount * 100);// changes dollars into cents
		int quarters = cents / 25;
		cents %= 25;
				
		int dimes = cents / 10;
		cents %= 10;
		
		int nickles = cents / 5;
		cents %= 5;
		
		int pennies = cents / 1;
		cents %= 1;
		
		System.out.println("minimum required coins");
		System.out.println("Quarters: " + quarters);
		System.out.println("dimes: " + dimes);
		System.out.println("nickles: " + nickles);
		System.out.println("pennies: " + pennies);
		System.out.println("total");
	}
}