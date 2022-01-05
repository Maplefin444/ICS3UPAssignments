/*
    Name: Pradyumn Jha and James Huynh
    Teacher: Ms. Krasteva
    Date: November 3rd, 2021 (2021-11-03)
    Assignment: My Creations

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
ocean                    Color               This variable will store the associated color.
skyBlue                  Color               This variable will store the associated color.
rock                     Color               This variable will store the associated color.
boat                     Color               This variable will store the associated color.
sail                     Color               This variable will store the associated color.
seaweed                  Color               This variable will store the associated color.
redCoral                 Color               This variable will store the associated color.
garbage                  Color               This variable will store the associated color.
garbageLabel             Color               This variable will store the associated color.
*/

// The "BackgroundOne" class.
import java.awt.*;
import hsa.Console;

public class BackgroundOne
{
    private Console c;

    private Color ocean = new Color (130, 194, 237);
    private Color skyBlue = new Color (207, 226, 243);
    private Color rock = new Color (126, 118, 127);
    private Color boat = new Color (192, 154, 107);
    private Color sail = new Color (207, 226, 243);
    private Color seaweed = new Color (83, 124, 80);
    private Color redCoral = new Color (193, 51, 77);
    private Color garbage = new Color (217, 217, 217);
    private Color garbageLabel = new Color (244, 204, 204);

    public BackgroundOne (Console con)  // Constructor for the BackgroundOne class.
    {
	c = con;
	finalDisplay ();
    }


    private void finalDisplay ()  //This private method calls all of the other methods.
    {
	water ();
	pillar ();
	decor ();
	sunkenShip ();
	seaweed ();
    }

    /*
    This private method will draw ocean using 2 for loops, the first one drawing the water and the second one drawing the sky.
    
    For Loop 1: Draws the ocean by expanding a rect across the background 1 pixel at a time.
    For Loop 2: Draws the sky by drawing circles next to eachother.
    Variable Name             Type               Description
    i                         int                This variable controls the first for loop.
    j                         int                This variable controls the second for loop.
    */
    private void water ()  //This private method will draw the water.
    {
	for (int i = 0 ; i <= 500 ; i++)
	{
	    c.setColor (ocean);
	    c.drawRect (0, 0, i + 140, i);
	}
	for (int j = 0 ; j <= 15 ; j++)
	{
	    c.setColor (skyBlue);
	    c.fillOval ((j * 45) - 5, -15, 55, 55);
	}
    }


    private void pillar ()  //This private method will draw the small piece of rock on the right.
    {

	c.setColor (redCoral);
	c.fillOval (560, 290, 15, 70);
	c.fillOval (590, 280, 15, 80);


	c.setColor (rock);
	c.fillRect (540, 325, 100, 75);
    }

    /*
    This private method will draw the bottom of the boat and the piece of garbage.
    
    For Loop: Draws the piece of garbage next to the boat.
    Variable Name             Type               Description
    i                         int                This variable controls the for loop.
    */
    private void decor () 
    {
	c.setColor (boat);
	c.fillOval (300, -130, 250, 180);
	c.setColor (Color.WHITE);
	c.setFont (new Font("Arial",1,10));
	c.drawString ("James H, Pradyumn J", 370, 20);
	for (int i = 0 ; i <= 20 ; i++)
	{ //The piece of garbage next to the boat at the top will be drawn using a for loop.
	    c.setColor (garbage);
	    c.drawRect (200, 30, i + 20, i);
	    c.setColor (garbageLabel);
	    c.drawRect (210, 30, i, i);
	}
    }


    private void sunkenShip ()  //This private method will draw the sunken ship.
    {
	c.setColor (sail);
	int sailX[] = {30, 120, 140};
	int sailY[] = {430, 250, 380};
	c.fillPolygon (sailX, sailY, 3);

	c.setColor (boat);
	c.fillArc (-100, 325, 250, 180, 160, 180);
	int[] boatX = {107, 120, 30, 20};
	int[] boatY = {245, 250, 430, 420};
	c.fillPolygon (boatX, boatY, 4);
    }


    private void seaweed ()  //This private method will draw the seaweed at the bottom.
    {
	c.setColor (seaweed);
	c.fillArc (170, 400, 20, 100, 90, 200);
	c.fillArc (200, 400, 20, 100, 90, 200);
	c.fillArc (220, 400, 20, 100, 90, 200);
    }
}
