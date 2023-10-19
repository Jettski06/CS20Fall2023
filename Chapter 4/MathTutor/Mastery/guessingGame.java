package Mastery;

import java.util.Random;

import java. util.Scanner;

public class guessingGame 
{
	public static void main(String[] args) 
	{
	
	
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	
	int secretNumber = random.nextInt(20)+1;	// generates a random number for the user to guess
	
	System.out.println("welcome to java guessing game");
	System.out.println("you will pick a number between 1-20 and try to guess the correct answer!");
    System.out.println("enter your guess: ");
    int guess = scanner.nextInt();
	
	
	
	if (guess == secretNumber) {
	System.out.println("congrats you got it");
	} else { 
		{ System.out.println("sorry thats not right nigga");
			
		}
	}
	
	
	
	}
   }
