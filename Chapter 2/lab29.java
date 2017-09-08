//Brad Palagi + Tommy Hojnicki
//8/30/17
//2.9
//Calculates area and circumference

import java.util.Scanner;

public class lab29
{

final static double Pi = 3.1415; // makes a Pi variable that won't change

public static void main (String[] args) // need main
{

	double radius,area,circumference; // declares variables
	Scanner keyboard = new Scanner(System.in);

	System.out.print("What is the radius of the circle: "); // asks user for input
	radius = keyboard.nextDouble(); // gets radius value from user

	area = Pi * Math.pow(radius,2); // calculates area using math calss to square the radius
	circumference = 2 * Pi * radius; // calculates circumference

	System.out.printf("\nThe area of the circle is: %.4f", area); // prints the area to 4 decimal places
	System.out.printf("\nThe circumference of the circle is: %.4f \n", circumference); // prints circumference to 4 decimal places


}//end of main
}//end of class



/*
Output 1:
What is the radius of the circle: 2

The area of the circle is: 12.5660
The circumference of the circle is: 12.5660
Press any key to continue . . .

Output 2:
What is the radius of the circle: 3.9

The area of the circle is: 47.7822
The circumference of the circle is: 24.5037
Press any key to continue . . .

*/










