/*
* Name: James Huynh
* Oct 4, 2021
* This program will write out my name, James Huynh, my first name being in uppercase and my last name being in lowercase, then it will print my first name one letter at a time on each line.
*/
import java.awt.*;
import hsa.Console;

public class PrintName
{
    static Console c;
    String firstName = "James"; // Variables declared globally as they are used in 2 methods
    public PrintName(){
	c = new Console ("Printing My Name In Java!");
    }
    public void drawTitle(){
	c.print("",33); // Reserves spacing
	c.println("This Is My Name:");
    }
    public void displayData(){
	String lastName = "Huynh";
	c.println(firstName.toUpperCase()); // Prints out the first name in all uppercases
	c.println(lastName.toLowerCase()); // Prints out the last name in all lowercases
    }
    public void displayName(){
	c.println(firstName.charAt(0)); // Prints out each letter by it's index
	c.println(firstName.charAt(1));
	c.println(firstName.charAt(2));
	c.println(firstName.charAt(3));
	c.println(firstName.charAt(4));
    }
    public static void main (String[] args){
	PrintName g = new PrintName();
	g.drawTitle();
	g.displayData();
	g.displayName();
    }
}
