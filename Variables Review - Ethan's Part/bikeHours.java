/*
Names: James Huynh and Ethan Zhu 
Teacher name: Ms. Krasteva
Date: Sept 22, 2021
Program purpose: caluclates the number of hours one needs to bike in order to burn off calories of a set amount of pizzas.

*/

import java.awt.*;
import hsa.Console;

public class bikeHours
{
    int pizzaSlices;
    double bikeHours;
    Console c;

    public bikeHours ()
    {
	c = new Console ();
    }


    public void calculations ()
    {
	c.print ("What is the number of pizza slices consumed?");
	pizzaSlices = c.readInt ();
	c.println (" ");
	bikeHours = 355.0 * pizzaSlices / 550;
	c.print ("You need to bike for ");
	c.print (bikeHours, 0, 2);
	c.print (" hours");
    }


    public static void main (String[] args)
    {
	bikeHours g = new bikeHours ();
	g.calculations ();
    }
}
