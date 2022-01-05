/*
* James Huynh
* Dec 3 2021
* Ms. Krasteva ICS3UP
* Exercise 21 Part 2
* This program will ask the user how many numbers they want in their array, then the minimum and maximum. Based on these numbers, it will generate an array in data.txt and output it to the screen.
*/
import java.awt.*;
import hsa.*;
import java.io.*;

public class Ex21_P2
{
    Console c;           // The output console
    int nums;
    int min;
    int max;
    int arr[] [];
    public Ex21_P2 ()
    {
	c = new Console ();
    }


    public void getInput ()
    {
	c.print ("Enter the length and width of the array you want (1-5): ");
	nums = c.readInt ();
	c.print ("Enter the minimum number you want to generate: ");
	min = c.readInt ();
	c.print ("Enter the maximum number you want to generate: ");
	max = c.readInt ();
    }


    public void storeData () throws IOException
    {
	PrintWriter output = new PrintWriter (new FileWriter ("data.txt"));
	if (nums > 5 || nums <= 0)
	{
	    new FatalError ("Only 0-25 is allowed.");
	}
	int arr[] [] = new int [nums] [nums];
	for (int i = 0 ; i < arr [0].length ; i++)
	{
	    for (int j = 0 ; j < arr.length ; j++)
	    {
		arr [i] [j] = (int) (Math.random () * (max - min + 1) + min);
	    }
	}

	for (int i = 0 ; i < arr [0].length ; i++)
	{
	    for (int j = 0 ; j < arr.length ; j++)
	    {
		output.print (arr [i] [j] + " ");
	    }
	    output.println ();
	}
	output.close ();
	c.println ();
    }


    public void printData () throws IOException
    {
	BufferedReader input = new BufferedReader (new FileReader ("data.txt"));
	while (true)
	{
	    String in = input.readLine ();
	    if (in == null)
	    {
		break;
	    }
	    else
	    {
		String[] vals = in.split (" ");
		for (int i = 0 ; i < vals.length ; i++)
		{
		    c.print (vals [i] + " ");
		}
		c.println ();
	    }
	}
	input.close ();
    }


    public static void main (String[] args) throws IOException
    {
	Ex21_P2 g = new Ex21_P2 ();
	g.getInput ();
	g.storeData ();
	g.printData ();
	// Place your program here.  'c' is the output console
    } // main method
} // Ex20_P2 class
