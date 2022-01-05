/*
* James Huynh and Aaron Zhu
* Nov 29 2021
* Ms. Krasteva ICS3UP
* Return Methods Assignment
* This program will ask you for a date in DD/MM/YYYY form and will tell you what day of the year it is, out of the 365 days.
*/
import java.awt.*;
import hsa.Console;

public class DayOfYear
{
    Console c;
    int day, month;
    
    public DayOfYear() { // Constructor, initalizes console
	c = new Console("Day of Year");
    }
    /*
    Recieves user input and splits it into an array using the split() function, we used https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
    to learn more about arrays, along with our past knowledge. We also used https://www.baeldung.com/string/split to learn how to use split().
    */
    public void userInput() {
	c.print("Enter a valid date in the format DD/MM/YYYY: ");
	String[] tmp = (c.readLine()).split("/");
	day = Integer.parseInt(tmp[0]);
	month = Integer.parseInt(tmp[1]);
    }
    /*
    Contains an array with 12 values, one for how many days a month has in it, which we iterate through to add to our total variable.
    We then add the amount of days in the month to the total and return the total.
    */
    private int calc(int d, int m) {
	
	int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int total = 0;
	for (int i = 0; i < m - 1; i += 1) {
	    total += daysOfMonth[i];
	}
	total += d;
	return total;
    }
    
    public void display() { //Prints out the result
	c.println("The date you entered is the " + calc(day, month) + " day of the year.");
    }
    
    public static void main (String[] args) //Where everything is called.
    {
	DayOfYear q = new DayOfYear();
	q.userInput();
	q.display();
	
	
	// Place your program here.  'c' is the output console
    } // main method
} // DayOfYear class
