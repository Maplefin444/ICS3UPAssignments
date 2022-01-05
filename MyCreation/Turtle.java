/*
Name: Pradyumn Jha and James Huynh
Teacher: Ms. Krasteva
Date: November 3rd, 2021 (2021-11-03)
Assignment: My Creations

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
turtleBody                Color              This variable will store the color value of the specified color.
shellPattern              Color              This variable will store the color value of the specified color.
turtleLimbs               Color              This variable will store the color value of the specified color.
turtleEyes                Color              This variable will store the color value of the specified color.
turtleMouth               Color              This variable will store the color value of the specified color.
ocean                     Color              This variable will store the color value of the specified color.
*/

// The "Turtle" class.
import java.awt.*;
import hsa.Console;
public class Turtle extends Thread
{
    private Console c;
    private Color turtleBody = new Color (200, 223, 152);
    private Color shellPattern = new Color (74, 131, 89);
    private Color turtleLimbs = new Color (141, 198, 125);
    private Color turtleEyes = new Color (92, 103, 52);
    private Color turtleMouth = new Color (64, 112, 62);
    private Color ocean = new Color (130, 194, 237);
    
    public Turtle (Console con)  // Constructor, accepts a console to draw in
    {
	c = con;
    }

    // This private method will be used to delay the timing of the animation, so that it looks nice.
    private void sleep (int time)
    {
	try
	{
	    Thread.sleep (time);
	}
	catch (Exception e)
	{
	}
    }

    /*
    This private method named "turtle" will draw and animate the turtle.
    
    For Loop: This for loop animates the turtle, it starts at 400 and goes to -300 because of how the turtle is drawn at default.
    Variable Name             Type               Description
    i                          int             This is where everything will be drawn.
    */
    private void turtle ()
    {
	for (int i = 400 ; i >= -300 ; i--)
	{
	    c.setColor (turtleLimbs);
	    c.fillOval (180 + i, 100, 55, 22); // back legs
	    c.fillOval (180 + i, 166, 55, 22);

	    c.fillOval (65 + i, 100, 60, 20); // front arms
	    c.fillOval (65 + i, 166, 60, 20);

	    c.fillOval (60 + i, 123, 55, 40); // head

	    c.fillArc (187 + i, 133, 60, 15, 80, 250); // tail

	    c.setColor (turtleEyes);
	    c.fillOval (76 + i, 132, 7, 7);
	    c.fillOval (76 + i, 148, 7, 7);

	    c.setColor (turtleMouth);
	    c.fillArc (66 + i, 132, 11, 23, 80, 180);
	    c.setColor (turtleBody);
	    c.fillOval (100 + i, 100, 123, 85);
	    c.setColor (shellPattern);
	    c.fillOval (115 + i, 114, 95, 60);

	    c.setColor (turtleBody);
	    c.fillStar (115 + i, 114, 90, 55);

	    c.setColor (shellPattern);
	    c.fillOval (140 + i, 130, 40, 30);
	    sleep (5);
	    c.setColor (ocean);
	    c.fillRect (61 + i, 100, 185, 88);
	}
    }

    //This public method will draw run the turtle.
    public void run ()
    {
	turtle ();
    }

}
