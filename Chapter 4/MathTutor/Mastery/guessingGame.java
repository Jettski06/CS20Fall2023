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
	
    
	
	
	
	if(perAnswer = secretNumber) {
	System.out.println("you got it!"); // will tell you if the answer is right or wrong
	}
	
	else (perAnswer > secterNumber) {
	System.out.println("sorry, thats incorrect");
	}

	else (perAnswer < secterNumber) {
		System.out.println("sorry, that is incorrect");
	}             
	
	}
}
