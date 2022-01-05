/*
Names: James Huynh and Ethan Zhu 
Teacher name: Ms. Krasteva
Date: Sept 22, 2021
Program purpose: Calculates the surface area and volume of a cylinder
*/

import java.awt.*;
import hsa.Console;

public class CylinderCalcs
{
    double  cylinderHeight;
    double  cylinderRadius;
    double cylinderSA;
    double cylinderVolume;
    String cylinderUnit;
    Console c;

    public CylinderCalcs ()
    {
	c = new Console ();
    }

    public void getInfo ()
    {
	c.print ("What is the height");
	cylinderHeight = c.readDouble ();
	c.println (" ");
	c.print ("What is the radius");
	cylinderRadius = c.readDouble ();
	c.print ("What is the unit (Please enter the abbreviated version in the metric system)");
	cylinderUnit = c.readLine();
    }
    
    public void calculations ()
    {
	cylinderSA = 2.0*Math.PI*cylinderRadius*cylinderHeight + 2.0*Math.PI*Math.pow(cylinderRadius,2);
	c.print ("The surface area is ");
	c.print (cylinderSA, 0, 1);
	c.println (cylinderUnit + "² ");
	cylinderVolume = Math.PI*Math.pow(cylinderRadius,2)*cylinderHeight;
	c.print ("The volume is ");
	c.print (cylinderVolume, 0, 1);
	c.println (cylinderUnit + "² ");
    }


    public static void main (String[] args)
    {
	CylinderCalcs g = new CylinderCalcs ();
	g.getInfo();
	g.calculations ();
    }
}
