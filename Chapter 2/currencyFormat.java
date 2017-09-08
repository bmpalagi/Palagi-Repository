//Brad Palagi
//8/30/17
//2.12
//Receive number of each type of coin and print out the value in curency format

import java.util.Scanner;
import java.text.*;


public class currencyFormat
{

public static void main (String[] args)
{
	//defining variables
	int quarters,dimes,nickels,pennies;
	double value;

	//making objects - keyboard to receive input, money to print things like currency
	Scanner keyboard = new Scanner(System.in);
	NumberFormat money = NumberFormat.getCurrencyInstance();

	//Prints questions and receives input
	System.out.println("Number of Quarters: ");
	quarters = keyboard.nextInt();

	System.out.println("Number of Dimes: ");
	dimes = keyboard.nextInt();

	System.out.println("Number of Nickels: ");
	nickels = keyboard.nextInt();

	System.out.println("Number of Pennies: ");
	pennies = keyboard.nextInt();

	//totals up the value
	value = (quarters * .25) + (dimes * .1) + (nickels * .05) + (pennies * .01);

	//prints out the properly formatted value
	System.out.print("\nCurrency Value Formated: " + money.format(value));

	System.out.println("\n");


}//end of main
}//end of class














