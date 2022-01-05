/*
* James Huynh
* Ms. Krasteva ICS3UP
* Nov. 21 2021
* Assignment 11
* This program will calculate the power, current, or voltage given 2 values. It includes proper error-trapping.


Variable Name         Type          Description
c                     Console       This is where everything is drawn.
cont                  String        This variable stores the input that the user gives if they want to exit or continue.
choice                String        This variable stores which value the user wants to calculate for.
power                 double        This variable stores the power value.
voltage               double        This variable stores the voltage value.
current               double        This variable stores the current value.
*/
import java.awt.*;
import hsa.*;

public class PowerCalc
{
    Console c;           // The output console
    String cont;
    String choice;
    double power;
    double voltage;
    double current;
    
    public PowerCalc () //The constructor for the class, will initialize the console.
    {
	c = new Console ("The POWER Calculator");
    }


    private void title () //This private method will clear the screen and draw the title at the top.
    {
	c.clear ();
	c.print ("", 30);
	c.setTextColor (Color.RED);
	c.println ("The POWER Calculator");
	c.setTextColor (Color.BLACK);
	c.println ();
    }


    public void intro () // This public method will ask if the user wants to continue or not, along with a description of the program.
    {
	title ();
	c.print ("", 10);
	c.println ("This calculator will calculate the power, voltage, or current ");
	c.print ("", 27);
	c.print ("using the equation ");
	c.setTextColor (Color.MAGENTA);
	c.println ("P = V/I\n");
	c.setTextColor (Color.BLACK);
	c.print ("Enter ");
	c.setTextColor (Color.MAGENTA);
	c.print ("\"C\"");
	c.setTextColor (Color.BLACK);
	c.println (" to continue.");
	c.println ("Enter any other key to exit.");
	cont = c.readLine ();
    }
    
    /*
    This public method will recieve all of the data that the user inputs.
    It contains 3 while loops, one for what they want to calculate for, one for the first value, and one for the second value.
    It also error traps all inputs to check if they are greater than 0, and if it is a valid number.
    
    While Loop 1: Asks the user what they want to calculate for.
    While Loop 2: Asks the user what their first value is.
    While Loop 3: Asks the user what their second value is.
    
    Variable Name         Type          Description
    input                 String        This variable will hold what the user inputs as a string, and will be parsed into the correct variable later.
    */
    public void askData ()
    {
	title ();
	c.print ("Enter ");
	c.setTextColor (Color.MAGENTA);
	c.print ("\"P\"");
	c.setTextColor (Color.BLACK);
	c.println (" to calculate for power.");
	c.print ("Enter ");
	c.setTextColor (Color.MAGENTA);
	c.print ("\"V\"");
	c.setTextColor (Color.BLACK);
	c.println (" to calculate for voltage.");
	c.print ("Enter ");
	c.setTextColor (Color.MAGENTA);
	c.print ("\"I\"");
	c.setTextColor (Color.BLACK);
	c.println (" to calculate for current.");
	c.print ("Enter your choice here:");
	while (true)
	{
	    c.setCursor (6, 25);
	    choice = c.readLine ();
	    if (choice.equalsIgnoreCase ("P") || choice.equalsIgnoreCase ("V") || choice.equalsIgnoreCase ("I"))
	    {
		break;
	    }
	    else
	    {
		new Message ("Please enter P,V, or I", "Error");
	    }
	    c.println ();
	}
	while (true)
	{
	    if (choice.equalsIgnoreCase ("P"))
	    {
		c.setCursor (8, 1);
		c.print ("Enter the voltage:             ");
		c.setCursor (8, 20);
		String input = c.readLine ();
		try
		{
		    voltage = Double.parseDouble (input);
		    if(voltage <= 0){
			throw new IllegalArgumentException();
		    }
		    break;
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a valid number.", "Error");
		}
		catch (IllegalArgumentException e)
		{
		    new Message ("Please enter a number higher than 0.", "Error");
		}
	    }
	    if (choice.equalsIgnoreCase ("V"))
	    {
		c.setCursor (8, 1);
		c.print ("Enter the power:             ");
		c.setCursor (8, 18);
		String input = c.readLine ();
		try
		{
		    power = Double.parseDouble (input);
		    if(power <= 0){
			throw new IllegalArgumentException();
		    }
		    break;
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a valid number.", "Error");
		}
		catch (IllegalArgumentException e)
		{
		    new Message ("Please enter a number higher than 0.", "Error");
		}
	    }
	    if (choice.equalsIgnoreCase ("I"))
	    {
		c.setCursor (8, 1);
		c.print ("Enter the power:             ");
		c.setCursor (8, 18);
		String input = c.readLine ();
		try
		{
		    power = Double.parseDouble (input);
		    if(power <= 0){
			throw new IllegalArgumentException();
		    }
		    break;
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a valid number.", "Error");
		}
		catch (IllegalArgumentException e)
		{
		    new Message ("Please enter a number higher than 0.", "Error");
		}
	    }
	}
	while (true)
	{
	    if (choice.equalsIgnoreCase ("P"))
	    {
		c.setCursor (9, 1);
		c.print ("Enter the current:             ");
		c.setCursor (9, 20);
		String input = c.readLine ();
		try
		{
		    current = Double.parseDouble (input);
		    if(current <= 0){
			throw new IllegalArgumentException();
		    }
		    break;
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a valid number.", "Error");
		}
		catch (IllegalArgumentException e)
		{
		    new Message ("Please enter a number higher than 0.", "Error");
		}
	    }
	    if (choice.equalsIgnoreCase ("V"))
	    {
		c.setCursor (9, 1);
		c.print ("Enter the current:             ");
		c.setCursor (9, 20);
		String input = c.readLine ();
		try
		{
		    current = Double.parseDouble (input);
		    if(current <= 0){
			throw new IllegalArgumentException();
		    }
		    break;
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a valid number.", "Error");
		}
		catch (IllegalArgumentException e)
		{
		    new Message ("Please enter a number higher than 0.", "Error");
		}
	    }
	    if (choice.equalsIgnoreCase ("I"))
	    {
		c.setCursor (9, 1);
		c.print ("Enter the voltage:             ");
		c.setCursor (9, 20);
		String input = c.readLine ();
		try
		{
		    voltage = Double.parseDouble (input);
		    if(voltage <= 0){
			throw new IllegalArgumentException();
		    }
		    break;
		}
		catch (NumberFormatException e)
		{
		    new Message ("Please enter a valid number.", "Error");
		}
		catch (IllegalArgumentException e)
		{
		    new Message ("Please enter a number higher than 0.", "Error");
		}
	    }
	}
	pauseProgram ();
    }

    /*
    Variable Name         Type          Description
    x[]                   int[]         Stores the x values of the corners for the lightning symbol.
    y[]                   int[]         Stores the y values of the corners for the lightning symbol.
    */
    public void display () //This public method draws the final display and calculates the output.
    {
	title ();
	if (choice.equalsIgnoreCase ("P"))
	{
	    power = current * voltage;
	    choice = "POWER";
	}


	else if (choice.equalsIgnoreCase ("V"))
	{
	    voltage = power / current;
	    choice = "VOLTAGE";
	}


	else if (choice.equalsIgnoreCase ("I"))
	{
	    current = power / voltage;
	    choice = "CURRENT";
	}


	c.println ("You asked for: " + choice);
	c.println ("Power is equal to: " + power);
	c.println ("Voltage is equal to: " + voltage);
	c.println ("Current is equal to: " + current);
	int[] x = {300,250,300,275,350,300};
	int[] y = {250,350,370,450,370,350};
	c.setColor(Color.ORANGE);
	c.fillPolygon(x,y,6);
	pauseProgram ();
    }


    private void pauseProgram () //This private method will ask the user to press any button to continue, and will continue when it is pressed.
    {
	c.println ("Press any button to continue...");
	c.getChar ();
    }


    public void goodbye () //This public method will display the goodbye screen.
    {
	title ();
	c.println ("Thank you for using the POWER calculator.");
	pauseProgram ();
	c.close ();
    }


    public static void main (String[] args) //This is the main method, where everything is run.
    {
	PowerCalc g = new PowerCalc ();
	g.intro ();
	if (g.cont.equalsIgnoreCase ("c"))
	{
	    g.askData ();
	    g.display ();
	}
	g.goodbye ();
    } // main method
} // PowerCalc class
