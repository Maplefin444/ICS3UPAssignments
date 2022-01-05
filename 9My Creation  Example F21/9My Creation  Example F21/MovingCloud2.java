/*
   Name: xxx
   Teacher: Ms. Dyke
   Date: xxxx
This class is has 3 overloaded constructors!!!
The basic constructor creates a cloud in a specific predetermined location.
The 2nd constructor allows a parameter pass to change the cloud color.
The 3rd constructor creates a cloud with a specific color and a time delay to
control the speed of its movement during the animation.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class MovingCloud2 extends Thread
{
    private Console c;
    private Color cloud;
    private int delay;

    public void cloud ()
    {
	//local colour variable used for sky
	Color skyblue = new Color (89, 172, 255);
	//loop used to animate the storm cloud
	for (int x = 0 ; x < 300 ; x++)
	{
	    c.setColor (skyblue);
	    c.fillRect (-65 + x, 0, 210, 50);
	    c.setColor (cloud);
	    c.fillRoundRect (10 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (40 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (60 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (20 + x, 25, 50, 20, 90, 90);
	    c.fillRoundRect (50 + x, 25, 50, 20, 90, 90);
	    c.fillRoundRect (20 + x, 5, 50, 20, 90, 90);
	    c.fillRoundRect (50 + x, 5, 50, 20, 90, 90);
	    c.fillRoundRect (60 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (90 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (110 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (70 + x, 25, 50, 20, 90, 90);
	    c.fillRoundRect (100 + x, 25, 50, 20, 90, 90);
	    c.fillRoundRect (90 + x, 5, 50, 20, 90, 90);
	    c.fillRoundRect (100 + x, 5, 50, 20, 90, 90);
	    c.fillRoundRect (-10 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (-40 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (-60 + x, 15, 50, 20, 90, 90);
	    c.fillRoundRect (-20 + x, 25, 50, 20, 90, 90);
	    c.fillRoundRect (-50 + x, 25, 50, 20, 90, 90);
	    c.fillRoundRect (-20 + x, 5, 50, 20, 90, 90);
	    c.fillRoundRect (-50 + x, 5, 50, 20, 90, 90);
	    //used to delay the animation
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //basic cloud
    public MovingCloud2 (Console con)
    {
	c = con;
	cloud = new Color (149, 149, 149);
    }


    // cloud with a Color parameter
    public MovingCloud2 (Console con, Color n)
    {
	c = con;
	cloud = n;

    }


    // cloud with a Color parameter, and a new delay time
    public MovingCloud2 (Console con, Color n, int t)
    {
	c = con;
	cloud = n;
	delay = t;

    }


    public void run ()
    {
	cloud ();
    }
}


