/*
* James Huynh and Ethan Zhu
* Sept 22
* This program will ask for length and width of a rectangle, then calculate the area.
*/

import java.awt.*;
import hsa.Console;

public class RectangleCalc{
    static Console c;
    double length;
    double width;
    public RectangleCalc(){
	c = new Console();
    }
    public void askLength(){
	c.println("Please enter the length of your rectangle in cm: ");
	length = c.readDouble();
    }
    public void askWidth(){
	c.println("Please enter the width of your rectangle in cm: ");
	width = c.readDouble();
    }
    public void giveOutput(){
	c.println("The area of your rectangle in cm^2 is: " + (length*width));
    }
    public static void main (String[] args){
	RectangleCalc g = new RectangleCalc();
	g.askLength();
	g.askWidth();
	g.giveOutput();
    }
}
