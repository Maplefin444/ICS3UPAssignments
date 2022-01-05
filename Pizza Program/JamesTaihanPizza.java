// The "JamesTaihanPizza" class.

/*
	Author: James Huynh and Taihan Mobasshir
	Teacher: Valentina Krasteva
	Date: December 2nd, 2021
	Description: A program that searches a file for data and returns said data regarding a rensteraunt's pizza prices based on user input.
*/
import java.awt.*;
import hsa.*;
import java.io.*;

public class JamesTaihanPizza
{
    /*
	Name        Type            Description
	
	c           Console         Used to create a console window for the program
	name        String          Used to store the user inputted name of the pizza place the user would like to find the price of a pizza from
	size        String          Used to store the user inputted size of pizza they would like to find the price of
	double      price           Used to store the price of the pizza of the size the user requested as well as from the pizza place the user requested
	input       BufferedReader  Used to read the .txt file containing data ragarding pizza places
    */
    Console c;

    String name;
    String size;
    double price;
    BufferedReader input;

    // Class constructor method
    public JamesTaihanPizza ()
    {
	c = new Console ();
    }

    /*
	Name        Type        Description
	line        String      Used to store the line read from the .txt file containing data regarding pizza.
    
	while loop 1: Used to read each line of the .txt file containing data regarding the pizza places and their prices.
	
	Description: This method goes through each line of the .txt file and prints out the name of each pizza place in the file. Valid pizza places are found by searching each of the line and parseing each line to a double. This works as if the double is successfully parsed
		     the line represents a price whereas if it cannot be parsed, it must be a pizza place. Then it prints the valid pizza places and the valid sizes to the user.
    */
    public void intro ()
    {
	c.print ("The valid pizza places are: ");
	c.setTextColor(Color.magenta);
	try
	{
	    input = new BufferedReader (new FileReader ("PizzaPlaces.txt"));
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
		    }
		}
	    }
	    c.println ();
	    input.close();
	    input = new BufferedReader (new FileReader ("PizzaPlaces.txt"));
	}
	catch (Exception e)
	{
	}
	c.setTextColor(Color.black);
	c.print("The sizes available are: ");
	c.setTextColor(Color.magenta);
	c.println("large, medium, small, and single.");
	c.setTextColor(Color.black);
    }

    // Input method that allows the user to input their choice of pizza place and size of pizza.
    public void getInput ()
    {
	c.print ("Enter the pizza place's name: ");
	name = c.readLine ();
	c.print ("Enter the size of pizza you're looking for: ");
	size = c.readLine ();
    }

    /*
	Name        Type        Description
	currentLine String      Stores the line that is read using bufferedreader and is used to locate the pizza place requested by the user
	
	while loop 1: While loop that runs until the input from the buffered reader reads a line with a name of a pizza place that is equal to the name of the pizza place the user inputted. If the pizza place the user inputted is not found, a fatal error occurs.
	
	Description: Used to locate the pizza place the user inputted as their pizza place of choice.
    */
    public void locateString ()
    {
	try
	{
	    String currentLine = "";
	    while (!currentLine.equalsIgnoreCase (name))
	    {
		currentLine = input.readLine ();
		if (currentLine == null)
		{
		    new FatalError ("String not found in file.");
		}
	    }
	}
	catch (Exception e)
	{
	}
    }

    /*
	Name        Type        Description
	linesToGO   int         Used to determine how many lines the buffered reader input needs to go up to until it finds the correct price for the correct sized pizza according to the user's input
	
	for loop 1: for loop that reads lines until it reaches the price of the size of pizza the user requested and stores it to the price variable.
	
	Description: Used to locate the price of the pizza size of the user's choice.
    */
    public void locatePrice ()
    {
	int linesToGo = 0;
	if (size.equalsIgnoreCase ("large"))
	{
	    linesToGo = 1;
	}
	else if (size.equalsIgnoreCase ("medium"))
	{
	    linesToGo = 2;
	}
	else if (size.equalsIgnoreCase ("small"))
	{
	    linesToGo = 3;
	}
	else if (size.equalsIgnoreCase ("single"))
	{
	    linesToGo = 4;
	}
	else{
	    new FatalError ("Incorrect size.");
	}
	for (int i = 0 ; i < linesToGo ; i++)
	{
	    try
	    {
		price = Double.parseDouble (input.readLine ());
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

    // DisplayPrice method used to display to the user the price of the pizza they searched for by inputting a size and pizza place
    public void displayPrice ()
    {
	c.print ("The price of a " + size + " pizza is: ");
	c.setTextColor(Color.magenta);
	c.println("$" + price);
	c.setTextColor(Color.black);
	try{
	    input.close();
	}
	catch(Exception e){
	}
    }


    public static void main (String[] args)
    {
	JamesTaihanPizza g = new JamesTaihanPizza ();
	g.intro ();
	g.getInput ();
	g.locateString ();
	g.locatePrice ();
	g.displayPrice ();
    } // main method
} // JamesTaihanPizza class
