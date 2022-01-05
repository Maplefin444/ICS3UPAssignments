// The "Pizza2" class.
import java.awt.*;
import hsa.*;
import java.io.*;

public class Pizza2
{
    Console c;           // The output console
    int places = 0;
    String name;
    String size;
    String[] placesArr;
    double[] [] prices;
    public Pizza2 ()
    {
	c = new Console ();
    }


    public void intro ()
    {
	c.print ("The valid pizza places are: ");
	c.setTextColor (Color.magenta);
	try
	{
	    BufferedReader input = new BufferedReader (new FileReader ("PizzaPlaces.txt"));
	    String line = "";
	    while (line != null)
	    {
		line = input.readLine ();
		try
		{
		    Double.parseDouble (line);
		}
		catch (Exception e)
		{
		    if (line != null)
		    {
			c.print (line + ", ");
			places++;
		    }
		}
	    }
	    c.println ();
	    input.close ();
	}
	catch (Exception e)
	{
	}
	c.setTextColor (Color.black);
	c.print ("The sizes available are: ");
	c.setTextColor (Color.magenta);
	c.println ("large, medium, small, and single.");
	c.setTextColor (Color.black);
    }


    public void storeData () throws IOException
    {
	BufferedReader input = new BufferedReader (new FileReader ("PizzaPlaces.txt"));
	String data = "";
	placesArr = new String [places];
	prices = new double [places] [4];
	int count = 0;
	while (data != null)
	{
	    data = input.readLine ();
	    try
	    {
		Double.parseDouble (data);
	    }
	    catch (Exception e)
	    {
		if (data != null)
		{
		    placesArr [count] = data;
		    for (int i = 0 ; i < 4 ; i++)
		    {
			prices [count] [i] = Double.parseDouble (input.readLine ());
		    }
		    count++;
		}
	    }
	}
	input.close ();
    }


    public void getInput ()
    {
	c.print ("Enter the pizza place's name: ");
	name = c.readLine ();
	c.print ("Enter the size of pizza you're looking for: ");
	size = c.readLine ();
    }


    public void getOutput () throws IOException
    {
	BufferedReader input = new BufferedReader (new FileReader ("PizzaPlaces.txt"));
	int place = 0;
	String line = "";
	while (line != null)
	{
	    line = input.readLine ();
	    try
	    {
		Double.parseDouble (line);
	    }
	    catch (Exception e)
	    {
		if (line.equalsIgnoreCase(name))
		{
		    break;
		}
		else
		    place++;
	    }
	}
	for(int i = 0; i < place; i++){
	    line = input.readLine ();
	}
	int ind = 0;
	if (size.equalsIgnoreCase ("large"))
	{
	    ind = 0;
	}
	else if (size.equalsIgnoreCase ("medium"))
	{
	    ind = 1;
	}
	else if (size.equalsIgnoreCase ("small"))
	{
	    ind = 2;
	}
	else if (size.equalsIgnoreCase ("single"))
	{
	    ind = 3;
	}
	else{
	    new FatalError ("Incorrect size.");
	}
	c.println("The price is: " + prices[place][ind]);
    }


    public static void main (String[] args) throws IOException
    {
	Pizza2 g = new Pizza2 ();
	g.intro ();
	g.storeData ();
	g.getInput ();
	g.getOutput();
	// Place your program here.  'c' is the output console
    } // main method
} // Pizza2 class
