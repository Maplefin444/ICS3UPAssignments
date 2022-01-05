/*
* James Huynh and Aaron Zhu
* Nov 29 2021
* Ms. Krasteva ICS3UP
* Return Methods Assignment
* This program will ask you for a string, and it will tell you if the string contains special character or not by having a return method.
*/
import java.awt.*;
import hsa.Console;

public class ContainSpecialChar
{
    Console c;
    String input;
    
    public ContainSpecialChar() { //Constructor, intializes the console
	c = new Console("Contain Special Character");
    }
    
    public void input() { //Recieves input from the user for the string to check
	c.print("Enter the string to check: ");
	input = c.readLine();
    }
    
    private boolean calc(String s) { //This return method accepts the string
	for (int i = 32; i < 127; i += 1) { //Iterates through all typeable ASCII values
	    if (!(65 <= i && i <= 90) && !(97 <= i && i <= 122)) { //if the ASCII value in the for loop is a symbol, it will run this
		if (s.indexOf(i) != -1) return false; //If it returns the index of the symbol and not -1, it immediately returns false
	    }
	}
	return true; // This code will only run if the for loop does not return false
    }
    
    public void display() { //Shows the user their string and whether it contains special characters or not
	c.println("User String: " + input);
	if (!calc(input)) c.println("Your string contains special characters.");
	else c.println("Your string does not contain special characters.");
	
    }
    
    public static void main (String[] args) //Where everything is run
    {
	ContainSpecialChar q = new ContainSpecialChar();
	q.input();
	q.display();
	
	// Place your program here.  'c' is the output console
    } // main method
} // ContainSpecialChar class
