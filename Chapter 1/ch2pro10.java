//Brad Palagi
//8/24/17
//first program to test output
//AYYO

import java.util.Scanner;
import java.text.DecimalFormat;


public class ch2pro10
{


public static void main (String[] args)	// must have main
{



	double a,b,c,area,s;
	DecimalFormat fmt3dec = new DecimalFormat("0.000");
	Scanner keyboard = new Scanner(System.in);

	System.out.println("Enter Length of Side A: ");

	a = keyboard.nextDouble();

	System.out.println("Enter Length of Side B: ");

	b = keyboard.nextDouble();

	System.out.println("Enter Length of Side C: ");

	c = keyboard.nextDouble();

	s = (a + b + c)/2;

	area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

	System.out.println(fmt3dec.format(area));




/*multi
line
comment*/

}//end of main
}//end of class firstPro














