/*
* James Huynh and Luke Mathieu
* Nov 11, 2021
* Ms. Krasteva ICS3UP
* Assignment 10
* This program will ask for any year
*/
import java.awt.*;
import hsa.Console;

public class A10LeapYears
{
    Console c;           // The output console
    int year;

    public A10LeapYears ()
    {
	c = new Console ();
    }


    public void getInput ()
    {
	c.println ("Enter a year and I will calculate if it is a leap year:");
	year = c.readInt ();
	c.println ();
    }


    public void calculateLeap ()
    {
	if (year % 4 == 0)
	{
	    if (year % 100 == 0)
	    {
		if (year % 400 == 0)
		{
		    c.println ("It is a leap year.");
		}
		else{
		    c.println ("It is NOT a leap year.");
		}
	    }
	    else
	    {
		c.println ("It is a leap year.");
	    }
	}
	else
	{
	    c.println ("It is NOT a leap year.");
	}
    }


    public static void main (String[] args)
    {
	A10LeapYears g = new A10LeapYears ();
	g.getInput ();
	g.calculateLeap ();
	// Place your program here.  'c' is the output console
    } // main method
} // A10LeapYears class
