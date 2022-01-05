/*
* James Huynh
* Ms. Krasteva ICS3UP
* Nov 30, 2021
* Return Method Assignment
* The HACKERMANS Sum Checker asks for a 6 digit student number, along with a checksum, it will then calculate the checksum using Luhn's Algorithmn.
* It then compares the checksum of the student number to the given checksum, and see if it is verified or not.


Variable Name              Type                  Description
c                          Console               This is where everything is drawn.
choice                     String                This variable takes the choice on the main menu and stores it.
stuNum                     long                  This variable stores the inputted student number.
verify                     long                  This variable stores the inputted checksum value.
*/
import java.awt.*;
import hsa.*;

public class SumCheck
{
    static Console c;           // The output console
    String choice = "";
    long stuNum;
    long verify;

    public SumCheck ()  // Constructor for the SumCheck class, intializes the console
    {
	c = new Console ();
    }


    /*
    This is the private blackbox return method, which contains one for loop to iterate through each digit in the student number.
    It takes every other number and multiplies it by two, then adds up the digits of the output.
    It then adds this number to the sum value, and adds all the other numbers to it as well.
    It then calculates the checksum of the value.

    Variable Name              Type                  Description
    input                      long                  This variable stores the inputted student number.
    sum                        long                  This variable stores the sum so far.
    tempNum                    long                  This variable stores the the number of the digit that is multiplied by 2.
    */
    private long checkSum (long input)
    {
	long sum = 0; //Initializing sum variable
	for (int i = 0 ; i < 6 ; i++)
	{
	    long tempNum = 0;
	    if (i % 2 == 0) // Runs every other number
	    {
		tempNum = (input % 10) * 2; // Takes the rightmost digit and multiplies it by 2, sets it to tempNum
		sum += tempNum % 10; // Adds the rightmost digit to sum
		tempNum /= 10; // Divides by 10 to cut out the rightmost digit
		sum += tempNum % 10; // Adds the rightmost digit to sum, may sometimes add 0 if it is 1 digit, which is intended
	    }
	    else //Runs on all the other numbers
	    {
		sum += input % 10; // Adds the rightmost digit to the sum
	    }
	    input /= 10; //Removes the rightmost digit
	}
	return (10 - ((sum) % 10)); //Takes the rightmost digit and subtracts it from 10 to get the checksum
    }


    private void title ()  //This private method draws the title and the background.
    {
	c.clear ();
	c.setColor (Color.black);
	c.fillRect (0, 0, 640, 500);
	c.setTextBackgroundColor (Color.black);
	c.print ("", 27);
	c.setTextColor (Color.magenta);
	c.println ("The HACKERMANS Sum Checker");
	c.println ();
	c.setTextColor (Color.green);
    }


    /*
    This public method draws the spash screen at the beginning of the program.
    It contains 3 for loops nested within eachother.
    For Loop 1: Causes the background to change 10 times.
    For Loop 2: Draws the zeroes and ones row-by-row
    For Loop 3: Draws the zeroes and ones column-by-column
    I use System.currentTimeMillis to create a pseudo-randomness, and simply filter it out by using % 9 so it's not always ones.
    I then draw the title of the screen, and have a 0.5s sleep between each element to make it look better.
    Then, I draw the loading text and have a for loop to run 300 times to expand the loading bar.
    For Loop 3: Creates the loading effect of the bar.
    */
    public void splashScreen ()
    {
	c.setFont (new Font ("Arial", 1, 25));
	c.setColor (Color.black);
	c.fillRect (0, 0, 640, 500);
	for (int i = 0 ; i < 10 ; i++) //Repeats 3 times
	{
	    for (int j = 0 ; j < 520 ; j += 20) //Repeats for each row
	    {
		for (int k = 0 ; k < 640 ; k += 20) //Repeats for each column
		{
		    c.setColor (Color.black);
		    c.fillRect (k, j - 20, 14, 22); //Eraser shape for each number
		    c.setColor (Color.green);
		    if (System.currentTimeMillis () % 3 == 0)
		    {
			c.drawString ("1", k, j);
		    }
		    else
		    {
			c.drawString ("0", k, j);
		    }
		}
	    }
	}
	c.setColor (Color.gray);
	c.fillRect (200, 150, 250, 200);
	c.setColor (Color.white);
	c.drawString ("The", 230, 200);
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.setColor (Color.green);
	c.drawString ("HACKERMANS", 250, 230);
	c.setColor (Color.white);
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.drawString ("Sum Checker", 270, 260);
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
	c.drawString ("By: James Huynh", 220, 300);
	c.setColor (Color.gray);
	c.fillRect (200, 150, 250, 200);
	c.setColor (Color.white);
	c.drawString ("The", 230, 200);
	c.setColor (Color.green);
	c.drawString ("HACKERMANS", 250, 230);
	c.setColor (Color.white);
	c.drawString ("Sum Checker", 270, 260);
	c.drawString ("By: James Huynh", 220, 300);
	c.setColor (Color.gray);
	c.fillRect (260, 360, 140, 40);
	c.setColor (Color.white);
	c.drawString ("Loading...", 270, 390);
	c.setColor (Color.gray);
	c.fillRect (150, 400, 350, 50);
	c.setColor (Color.LIGHT_GRAY);
	c.fillRect (175, 407, 300, 35);
	c.setColor (Color.green);
	for (int i = 0 ; i <= 300 ; i++)
	{
	    c.fillRect (175, 407, i, 35);
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	try
	{
	    Thread.sleep (500);
	}
	catch (Exception e)
	{
	}
    }


    public void instructions ()  // This public method will draw the instructions screen, it includes the pauseProgram method to pause it.
    {
	title ();
	c.println ("This program will ask you for a six-digit student number,");
	c.println ("and it will ask you for your checksum number,");
	c.println ("it will then calculate the checksum number of your student number");
	c.println ("using Luhn's algorithm, which takes digits 2, 4, and 6, and multiplies");
	c.println ("them by 2, then adds the values of the digits to digits 1, 3, and 5,");
	c.println ("then calculates what number will make it evenly divisible by 10, which is the");
	c.println ("checksum. It will then compare it to your checksum number,");
	c.println ("and will see if you are verified or not.");
	pauseProgram ();
    }


    private void pauseProgram ()  // This private method will ask the user to press any key to continue the program.
    {
	c.println ();
	c.println ("Press any key to continue...");
	c.getChar ();
    }


    public void mainMenu ()  //This public method will print the main menu, and ask for input and check if the input is allowed or not, if it is not, it will display an error
    {
	title ();
	c.println ("Enter the # to navigate to the specified menu.");
	c.println ("1. Start Program");
	c.println ("2. Instructions");
	c.println ("3. Exit");
	choice = c.readLine ();
	if (choice.equals ("1") || choice.equals ("2") || choice.equals ("3"))
	    ;
	else
	{
	    new Message ("Please enter a valid number!", "Error");
	}
    }


    /*
    This public method asks the user for their 6-digit student number, and their checksum number.
    It will error trap all inputs
    While Loop 1: Asks the user for their student number and repeats until given a valid number.
    While Loop 2: Asks the user for their checksum value and repeats until given a valid checksum value.

    Variable Name              Type                  Description
    temp                       String                Temporarily holds the user input until it is parsed into the correct value.
    */
    public void askData ()
    {
	title ();
	c.print ("Please enter a 6 digit student number: ");
	while (true)
	{
	    c.setCursor (3, 40);
	    String temp = c.readLine ();
	    try
	    {
		if (temp.length () != 6)
		{
		    throw new IllegalArgumentException ();
		}
		stuNum = Long.parseLong (temp);
		break;
	    }
	    catch (Exception e)
	    {
		new Message ("Please enter a valid student number with 6 digits!");
	    }
	}

	c.print ("Please enter your checksum value: ");
	while (true)
	{
	    c.setCursor (4, 35);
	    String temp = c.readLine ();
	    try
	    {
		if (temp.length () != 1)
		{
		    throw new IllegalArgumentException ();
		}
		verify = Long.parseLong (temp);
		break;
	    }
	    catch (Exception e)
	    {
		new Message ("Please enter a valid checksum value!");
	    }
	}
	pauseProgram ();
    }


    public void display ()  // This public method will print out the result of the program, and will see if the user is verified or not.
    {
	title ();
	c.println ("Your inputted student number was: " + stuNum);
	c.println ("Your inputted checksum value was: " + verify);
	c.println ("The checksum of your student number is: " + checkSum (stuNum));
	c.println ();
	if (checkSum (stuNum) != verify)
	{
	    c.println ("You have been NOT verified.");
	}
	else
	{
	    c.println ("You have been verified.");
	}
	pauseProgram ();
    }


    public void goodbye ()  // This public method shows a very small goodbye screen, and closes the window when the user is done.
    {
	title ();
	c.println ("Thank you for using the HACKERMANS Sum Checker");
	pauseProgram ();
	c.close ();
    }


    public static void main (String[] args)  // The main method, runs everything else.
    {
	SumCheck g = new SumCheck ();
	g.splashScreen ();
	while (!g.choice.equals ("3"))
	{
	    g.mainMenu ();
	    if (g.choice.equals ("2"))
	    {
		g.instructions ();
	    }
	    else if (g.choice.equals ("1"))
	    {
		g.askData ();
		g.display ();
	    }
	}
	g.goodbye ();
    } // main method
} // SumCheck class


