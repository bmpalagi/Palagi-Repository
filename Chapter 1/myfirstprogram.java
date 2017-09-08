//Brad Palagi
//date
//program notes
//first program to test output

//import java.util.Scanner;
//import java.util.ArrayList;
import java.util.*;
import java.text.DecimalFormat;
//import java.text.NumberFormat;
//import java.text.*;//is a wild card- imports the whole class to use


public class myfirstprogram	//file and class name must match
{
	final static double Pi=3.1415;

public static void main (String[] args)	// must have main
{

	/*

	int x,y,z;
	double num,number;
	String name= new String();


	Scanner keyboard= new Scanner(System.in);

	//page 93 Decimal and number format class

	DecimalFormat fmt2dec =new DecimalFormat("0.##"); // ## will float the num of decimal places to the max stated
	DecimalFormat fmt2dec =new DecimalFormat("0.00");// 00 will always print number of decimals padded with 0's

	System.out.println("Enter a number: ");

	num=keyboard.nextDouble();
	keyboard.nextLine();//Clears import buffer of /n

	//must use math clas
	number=Math.pow(num,6);

	System.out.println(num+" to the sixth power is equal to "+number+".\n");
	System.out.println(num+" to the sixth power is equal to "+fmt2dec.format(number)+".\n");

	//The percent marks the place for a variable
	//%n = \n
	//ask the user for their name

	System.out.println("Please enter your name:");
	name= keyboard.nextLine();



	System.out.printf("\n%.1f to the power of six = %,.2f \n", num,number);
	System.out.println("Thank you "+name+" for using my program!\n");


	x=2;
	y=5;
	z=x/y;
	num=x/(double)y;//casting
	//equals has the lower precident in order of operations divides, this is done because int's are being divided
	//int/int will result in int answer of 0
	num=7/21.0;//promotion
	num='y'/3.0;
	System.out.println(num);




	String word = new String("Homer Simpson");
	String word1 = word;
	word1 = "Homer Simpson";
	String word2 = new String("Homer Simpson");

	System.out.println(".equals(): " + word.equals(word1));
	System.out.println("== " + (word == word1));

	//strings are immutable, they cant change

	// .equals() checks if the value is the same - cant use with primative data types
	// == checks if they are the same object
	// both things output a boolean


	String word3 = new String("Bart");
	String name = new String("Alexander M Kashyap");
	String lname = "Palagi",fname = "Brad",mname; //can only do this with string objects,putting the = new String() thing is just to show its an object


	//String methods p 78
	System.out.println(fname.length()); // prints the length of a string
	System.out.println(name.replace('a','*')); // replaces all a's with *'s
	System.out.println(name.compareTo(fname)); // compares where name is to fname
	System.out.println(name.substring(2,6)); // prints exan (n, n-1) (n) just prints n to the end of the string

	*/

	int length;
	int x = 9;
	int id = 789;
	double num = 5, num1 = 23.8765, num2 = 3.4;
	char letter = 'd';
	boolean choice;


	Integer number = new Integer(47);
	number = id; //autoboxing, number is an object
	System.out.println(number);

	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.parseInt("56") + 1); // parse int makes it an integer, prints 57
	System.out.println("56" + 1); //prints 561

	ArrayList<Integer> grades = new ArrayList<Integer>();



/*This is a
multi line
comment*/

}//end of main
}//end of class myfirstprogram



















