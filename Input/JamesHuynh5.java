/*
* James Huynh
* Oct. 5 2021
* This program will ask for your data, then display it back to you.
*/

import java.awt.*;
import hsa.Console;

public class JamesHuynh5
{
    static Console c;

    String name; // Different variables to store different data inputted
    String teacherName;
    int age;
    
    public JamesHuynh5 ()  // Constructor
    {
	c = new Console ();
    }


    public void askData ()
    {
	c.println ("What is your name? "); // Asks for input
	name = c.readLine (); // Reads the input
	c.println ("Who is your teacher? ");
	teacherName = c.readLine ();
	c.println ("What is your age?");
	age = c.readInt ();
    }


    public void displayData ()
    {
	c.println ("So, " + name + ", your teacher is " + teacherName + " and are you really " + age + " years old?"); // Outputs all of the inputs
    }


    public static void main (String[] args)
    {
	JamesHuynh5 g = new JamesHuynh5 ();
	g.askData ();
	g.displayData ();
    }
}

