/*
* Luke Mathieu and James Huynh
* Nov 15, 2021
* Ms. Krasteva ICS3UP
* Assignment 10
* This program will slowly figure out what a password is equal to. The password will be stored in a string, and it will go through each letter one-by-one.
*/
import java.awt.*;
import hsa.Console;

public class A10CodeBreaker
{
    Console c;           // The output console
    String password = "ACD4FG&^";
    public A10CodeBreaker ()
    {
	c = new Console ();
    }


    public void codeBreaker ()
    {
	String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()[]{}/\\";
	String output = "";
	for (int i = 0 ; i < password.length () ; i++)
	{
	    String currentChar = password.substring (i, i + 1);
	    for (int j = 0 ; j < possibleChars.length () ; j++)
	    {
		String currentPossible = possibleChars.substring (j, j + 1);
		if (currentChar.equals (currentPossible))
		{
		    c.print ("The character at index " +i + " is ");
		    c.setTextColor(Color.magenta);
		    c.println (currentPossible);
		    c.setTextColor(Color.black);
		    output += currentPossible;
		    j = possibleChars.length ();
		}
	    }
	}
	c.print("The password is: ");
	c.setTextColor(Color.magenta);
	c.print(output);
    }


    public static void main (String[] args)
    {
	A10CodeBreaker g = new A10CodeBreaker ();
	g.codeBreaker ();
	// Place your program here.  'c' is the output console
    } // main method
} // A10CodeBreaker class
