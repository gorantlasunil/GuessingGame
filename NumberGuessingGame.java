package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		   Scanner scan = new Scanner(System.in);
		   int randomNumber = rand.nextInt(100)+1;
	   //System.out.println(randomNumber);
		   int tryCount = 0; 
		   while(true)
		{
			   System.out.println("Enter your guess (1-100):");
			   int playerGuess = scan.nextInt();
			   tryCount++;
			   if(playerGuess == randomNumber)
			   {
				   System.out.println("correct! You win");
				   System.out.println("It took you: 1" +tryCount + " tries");
				   break;
			   }
			   else if (randomNumber > playerGuess) {
				   System.out.println("Nope! The Number is Higher. Guess Again.....");
			}
			   else if (randomNumber < playerGuess) {
				   System.out.println("Nope! The Number is Lower . Guess Again.....");
			   }
			   else{
				   System.out.println("Invaild Input");
			   }
		   }
		   scan.close();
	}
   
}
