/*
 * By: Alex Thoennes
 * September 28, 2015
 * 
 * This program asks the user for a lower and upper
 * bound. It then prints out the result with the
 * upper bound being exclusive.
 */

import java.util.Scanner;

public class NumberLine {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static int lower, upper;
	
	public static void main(String [] args) 
	{
		lower = getIntFromUser("Enter lower bound: ");
		upper = getIntFromUser("Enter upper bound: ");
		printNumLine();
	}
	
	
	
	/*
	 * displays the users desired number line
	 * using the user specified bounds
	 */
	public static void printNumLine()
	{
		int digitsInUpper = (int) (Math.floor( (Math.log10(upper))) + 1);
		
		for (int i = digitsInUpper; i > -1; i--)
		{
			for (int m = lower; m < upper; m++)
			{
				if (i == 0)
				{
					System.out.print("|");
				}
				else
				{
					System.out.print ( (int)  Math.floor((m / Math.pow(10,i-1))) % 10);
				}
			}
			System.out.println();
		}
	}
	
	/* 
	 * Displays the specified string (i.e., 'prompt', which is intended to be
	 * a prompt to the user) and then reads and returns the user's response,
	 * which is expected to be a whole number.  (If the user enters input that
	 * is not formatted in a way that it can be recognized as a whole number,
	 * an exception is thrown.)
	 */
	   private static int getIntFromUser(String prompt)
	   {
	      System.out.print(prompt);    // Prompt user to enter input value
	      return keyboard.nextInt();   // Read and return user's response
	   }

}
