package Practice;
import java.util.Scanner;
public class GuessingGame
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String playAgain = "";
		do
		{
			//Create a random number for user to guess
			int theNumber = (int)(Math.random()*100+1);
			//System.out.println(theNumber);
			int guess = 0;
			int numberOfTries = 0;
			while (guess != theNumber) 
			{
				System.out.println("Guess a number from 1 to 100:");
				guess = scan.nextInt();
				//System.out.println("You entered "+guess+".");
				if (guess < theNumber)
				System.out.println(guess+" is too low. Try again!");
				else if(guess > theNumber)
				System.out.println(guess+" is too high. Try again!");
				else
				System.out.print(+guess+" is correct. ");
				numberOfTries = numberOfTries +1;
			} // End of while loop for guessing
			
			System.out.println("You win after "+numberOfTries+" tries!");
			System.out.println("Would you like to play again(y/n)?");
			playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));	
		System.out.println("Thank you for playing! Goodbye.");
		scan.close();
	}
}