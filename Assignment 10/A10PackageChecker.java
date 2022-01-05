/*Luke Mathieu and James Huynh
  Ms. Krasteva
  November 15, 2021
  Unit 10 Decision Exercise 2
*/

import java.awt.*;
import hsa.Console;

public class A10PackageChecker
{
    int packageWeight, packageLength, packageWidth, packageHeight;

    Console c;
    public A10PackageChecker ()
    {
	c = new Console ("Package Checking Program");
    }


    public void userInput ()
    {

	c.println ("Package Checking Program");
	c.println ();
	c.println ("Welcome to the Package Checking Program. Please remember that any package");
	c.println ("heavier than 27 kilograms or larger than the equivalent of a 46-centimeter cube");
	c.println ("are not eligible to be sent through this postal service");
	c.println ();
	c.println ("Please enter the weight in kilograms of the package you wish to send.");
	c.setTextColor (Color.magenta);
	packageWeight = c.readInt ();
	c.setTextColor (Color.black);
	c.println ("Response received.");
	c.println ("Please enter the length in centimetres of the package you wish to send.");
	c.setTextColor (Color.magenta);
	packageLength = c.readInt ();
	c.setTextColor (Color.black);
	c.println ("Response received.");
	c.println ("Please enter the width in centimetres of the package you wish to send.");
	c.setTextColor (Color.magenta);
	packageWidth = c.readInt ();
	c.setTextColor (Color.black);
	c.println ("Response received.");
	c.println ("Please enter the height in centimetres of the package you wish to send.");
	c.setTextColor (Color.magenta);
	packageHeight = c.readInt ();
	c.setTextColor (Color.black);
	c.println ("Response received.");
	c.println ();
    }


    public void packageCheck ()
    {
	if (packageWeight > 27)
	{
	    c.setTextColor (Color.red);
	    c.println ("Sorry, your package is too heavy to be delivered by this postal service.");
	}
	else if ((packageLength * packageWidth * packageHeight) > 100000)
	{
	    c.setTextColor (Color.red);
	    c.println ("Sorry, your package is too large to be deliveed by this postal service.");
	}
	else
	{
	    c.setTextColor (Color.green);
	    c.println ("Your package is eligible to be sent through this postal service.");
	}
    }


    public static void main (String[] args)
    {
	A10PackageChecker x = new A10PackageChecker ();
	x.userInput ();
	x.packageCheck ();
    }
}
