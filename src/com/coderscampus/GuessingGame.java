package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		/* Create a random number(int) to be generated at the start	Done
		Player will be asked to “Pick a number between 1 and 100”. Done
		If number is outside of the range then display “Your guess is not between 1 and 100, please try again” Done
		If the guess was outside of the range do not remove a guess from the user Done
		If the number that the player guessed is lower than the random number say “Please pick a higher number” Done
		If the number that the player guessed us higher than the random number say   “Please pick a lower number” Done
		If the player got the right answer say  “You win!” Done
		Player gets 5 guesses Done
		If they run out of guesses say “You lose, the number to guess was (theRandomNumber)” Done
		*/
		Random random = new Random();
		Scanner scanner = new Scanner(System.in); 
		int randomNum = random.nextInt(100) + 1;
		int numOfTries = 0;
		
		while(numOfTries < 5) {
			System.out.println("Pick a number between 1 and 100");
			int guess = scanner.nextInt();
			//System.out.println(randomNum);
			if(guess > 0 & guess < 101) {
				if(guess > randomNum) {
					System.out.println("Please pick a lower number");
					numOfTries++;
				} else if(guess < randomNum) {
					System.out.println("Please pick a higher number");
					numOfTries++;
				} else {
					System.out.println("You win!");
					break;
				} 
			} else {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}
		}
		if(numOfTries == 5) {
			System.out.println("You lose!");
			System.out.println("The number to guess was " + randomNum);
		}
	}
	
}
