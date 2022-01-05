/*
* James Huynh
* Oct 8, 2021
* This prgram contains 2 methods, both of them doing the same thing, outputting the average of 2 numbers, but one is for integers and one is for doubles.
*/
import java.awt.*;
import hsa.Console;

public class JamesHuynhA4
{
    static Console c;
    public JamesHuynhA4(){
	c = new Console();
    }
    public int average(int num1, int num2){ //public static int means that it will return an integer
	num1 = num1+num2; //adds the 2 nums together into num1
	num1 = num1/2; //divides by 2
	return num1; //returns the integer num1
    }
    public double average(double num1, double num2){ //public static double means that it will return a double
	num1 = num1+num2;
	num1 = num1/2;
	return num1; //returns the double num1
    }
    public static void main (String[] args)
    {
	JamesHuynhA4 g = new JamesHuynhA4();
	c.println(g.average(10,15)); //test cases
	c.println(g.average(10.0,5.0));
    }
}
