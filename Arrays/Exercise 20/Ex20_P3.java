/*
* James Huynh
* Dec 3 2021
* Ms. Krasteva ICS3UP
* Exercise 20 Part 3
* This asks for how many doubles the user wants to store, then asks for the doubles. It then stores them into an array and outputs it to data.txt. It will then ask the user if they want their inputs read back to them.
* If they do, then it will read it to them backwards.
*/
import java.awt.*;
import hsa.*;
import java.io.*;

public class Ex20_P3
{
    Console c;           // The output console
    final int MAXIMUM = 20;

    public Ex20_P3 ()
    {
	c = new Console ();
    }


    public void getAndStoreInput () throws IOException
    {
	c.println ("Please enter the amount of doubles you wish to enter, up to 20: ");
	int doubles = 0;
	while (true)
	{
	    String val = c.readLine ();
	    try
	    {
		doubles = Integer.parseInt (val);
		if (doubles > MAXIMUM)
		{
		    new Message ("No more than 20 doubles.");
		}
		else if (doubles <= 0)
		{
		    new Message ("No less than 20 doubles.");
		}
		else
		{
		    break;
		}
	    }
	    catch (Exception e)
	    {
		new Message ("Enter a valid value.");
	    }
	}
	PrintWriter output = new PrintWriter (new FileWriter ("data.txt"));
	c.println ("Enter your doubles: ");
	double inputs[] = new double [doubles];
	int i = doubles - 1;
	while (i >= 0)
	{
	    try
	    {
		String in = c.readLine();
		inputs [i] = Double.parseDouble(in);
		i--;
	    }
	    catch (Exception e)
	    {
		new Message ("Enter a valid double.");
	    }
	}
	for (int j = 0 ; j < doubles ; j++)
	{
	    output.println (inputs [j]);
	}
	output.close ();
    }


    public void displayInput () throws IOException
    {
	c.println ("Enter \"T\" if you'd like to output your inputs.");
	String in = c.readLine ();
	if (in.equalsIgnoreCase ("t"))
	{
	    BufferedReader input = new BufferedReader (new FileReader ("data.txt"));
	    while (true)
	    {
		String output = input.readLine ();
		if (output != null)
		{
		    c.println (output);
		}
		else
		{
		    break;
		}
	    }
	    input.close ();
	    c.println("Program ended");
	}
	else{
	    c.println("Program ended");
	}

    }


    public static void main (String[] args) throws IOException
    {
	Ex20_P3 g = new Ex20_P3 ();
	g.getAndStoreInput ();
	g.displayInput ();
    } // main method
} // Ex20_P3 class
