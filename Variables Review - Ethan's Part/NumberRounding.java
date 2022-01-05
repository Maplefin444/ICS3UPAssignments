/*
Names: James Huynh and Ethan Zhu
Teacher name: Ms. Krasteva
Date: Sept 22, 2021
Program purpose: To round numbers to the whole one's, ten's, hundred's, or thousand's
*/

import java.awt.*;
import hsa.Console;

public class NumberRounding
{
    double inputNumber;
    int numberRounded;
    Console c;

    public NumberRounding ()
    {
	c = new Console ();
    }


    public void getInfo ()
    {
	c.print ("What is the number to be rounded?");
	inputNumber = c.readDouble ();
	c.println (" ");
	c.print ("What place do you want to round it to? (Enter 1, 10, 100, or 1000)");
	numberRounded = c.readInt ();
	c.println (" ");
    }


    public void calculations ()
    {
	inputNumber = inputNumber / numberRounded;
	inputNumber = Math.round (inputNumber);
	inputNumber = inputNumber * numberRounded;
	c.print ("The result is " + (int) inputNumber);
    }


    public static void main (String[] args)
    {
	NumberRounding g = new NumberRounding ();
	g.getInfo ();
	g.calculations ();
    }
}
