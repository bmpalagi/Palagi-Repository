//Brad Palagi
//9/1/17
//2_14
//Prints a random phone number

import java.util.Random;
import java.text.*;

public class lab2_14
{

public static void main (String[] args)
{


	int one,two,three,second3,four;

	Random random = new Random();


	one = random.nextInt(7) + 1;
	two = random.nextInt(8);
	three = random.nextInt(8);


	second3 = random.nextInt(743);
	if second3 < 100
	{
		String print3 = new String(second3);
	}
	four = random.nextInt(10000);





	System.out.print(one);
	System.out.print(two);
	System.out.print(three);
	System.out.println("-" + second3 + "-" + four);



}
}


/* Output:

edit mark
Highlight the text

edit copy
Paste it here

*/