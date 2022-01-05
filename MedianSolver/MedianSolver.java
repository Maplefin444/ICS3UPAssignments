/*
* James Huynh and Ethan Zhu
* Sept 22, 2021
* This program asks for the input of the x and y values of two points, then outputs the midpoint and length of the line segment between them.
*/
import java.awt.*;
import hsa.Console;

public class MedianSolver
{
    static Console c;
    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;
    double midX;
    double midY;
    double length;
    public MedianSolver(){
	c = new Console ();
    }
    public void getInput(){
	c.print("Enter the x value of the first point of the triangle on the base: ");
	x1 = c.readDouble();
	c.print("Enter the y value of the first point of the triangle on the base: ");
	y1 = c.readDouble();
	c.print("Enter the x value of the second point of the triangle on the base: ");
	x2 = c.readDouble();
	c.print("Enter the y value of the second point of the triangle on the base: ");
	y2 = c.readDouble();
	c.print("Enter the x value of the third point of the triangle on the median: ");
	x3 = c.readDouble();
	c.print("Enter the y value of the third point of the triangle on the median: ");
	y3 = c.readDouble();
    }
    public void midpointSolver(){
	midX = (x1+x2)/2;
	midY = (y1+y2)/2;
    }
    public void lengthSolver(){
	length = Math.sqrt((Math.pow(midX-x3,2))+(Math.pow(midX-y3,2)));
	length = Math.round(length*100.0)/100.0;
    }
    public void giveOutput(){
	midX = Math.round(midX*100.0)/100.0;
	midY = Math.round(midY*100.0)/100.0;
	c.print("The midpoint of the base is: (");
	c.print(midX,0,2);
	c.print(", ");
	c.print(midY,0,2);
	c.println(")");
	c.print("The length of the median is: ");
	c.println(length,0,2);
    }
    public static void main (String[] args)
    {
	MedianSolver g = new MedianSolver();
	g.getInput();
	g.midpointSolver();
	g.lengthSolver();
	g.giveOutput();
    }
}
