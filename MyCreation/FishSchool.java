/*
    Name: Pradyumn Jha and James Huynh
    Teacher: Ms. Krasteva
    Date: November 15th, 2021 (2021-11-15)
    Assignment: My Creations
*/

// The "FishSchool" class.

/*

This code is for the school of fish, utilizes overloaded methods.

Variable Name     Type     Description

c                Console   Where everything will be drawn.

ocean            Color     Color for the eraser shape
limbsFish1       Color     Color for the fins and tail of the first (blue-bodied) fish
limbsFish2       Color     Color for the fins and tail of the 2nd (orange-bodied) fish
limbsFish3       Color     Color for the fins and tail of the third (violet-bodied) fish

bodyFish1        Color     Color for the body of the first (blue-bodied) fish
bodyFish2        Color     Color for the body of the 2nd (orange-bodied) fish
bodyFish3        Color     Color for the body of the third (violet-bodied) fish

stripesFish1     Color     Color for the stripes of the first (blue-bodied) fish
stripesFish2     Color     Color for the stripes of the 2nd (orange-bodied) fish
stripesFish3     Color     Color for the stripes of the third (violet-bodied) fish

body             Color     Saves the color for the fish to be drawn when the thread is called.
stripes          Color     Saves the color for the fish to be drawn when the thread is called.
i                int       The x coordinate for the fish when the thread is called.
j                int       The y coordinate for the fish when the thread is called.
speed            int       The speed coordinate for the fish when the thread is called.
*/

import java.awt.*;
import hsa.Console;

public class FishSchool extends Thread
{
    static Console c;

    private Color ocean = new Color (130, 194, 237);
    private Color limbsFish1 = new Color (123, 201, 121);
    private Color limbsFish2 = new Color (255, 83, 73);
    private Color limbsFish3 = new Color (190, 155, 239);

    private Color bodyFish1 = new Color (73, 203, 255);
    private Color bodyFish2 = new Color (255, 174, 73);
    private Color bodyFish3 = new Color (239, 132, 204);

    private Color stripesFish1 = new Color (96, 141, 181);
    private Color stripesFish2 = new Color (213, 124, 73);
    private Color stripesFish3 = new Color (213, 73, 204);
    private Color limbs; 
    private Color body; 
    private Color stripes; 
    private int i; 
    private int j;
    private int speed;

    public FishSchool (Console con, int sp)  // Overloaded Constructor
    {
	c = con;
	limbs = limbsFish1;
	body = bodyFish1;
	stripes = stripesFish1;
	i = 500;
	j = 100;
	speed = sp;
    }
    
    public FishSchool (Console con, int sp, boolean identifier)  // Overloaded Constructor
    {
	c = con;
	limbs = limbsFish2;
	body = bodyFish2;
	stripes = stripesFish2;
	i = 500;
	j = 150;
	speed = sp;
    }
    
    public FishSchool (Console con, int sp, int identifier)  // Overloaded Constructor
    {
	c = con;
	limbs = limbsFish3;
	body = bodyFish3;
	stripes = stripesFish3;
	i = 500;
	j = 200;
	speed = sp;
    }



    /*
    This private method is where the command for drawing a single fish is actually in. Will be called in run().

    Variable Name   Type    Description
    limbs           Color   Variable identifier for fins + tail color of fish.
    body            Color   Variable identifier for body color of fish.
    stripes         Color   Variable identifier for stripes color of fish.
      i              int    Variable identifier for x-value of points.
      j              int    Variable identifier for y-value of points.

    */
    private void fish ()
    {
	for (int l = i ; l >= -300 ; l--)
	{
	    c.setColor (ocean);
	    c.fillRect (l, j - 5, 131, 50);
	    c.setColor (body);
	    c.fillOval (l, j, 100, 40);

	    c.setColor (limbs);
	    int x[] = {l + 100, l + 130, l + 130};
	    int y[] = {j + 20, j + 45, j - 5};
	    c.fillPolygon (x, y, 3);

	    int a[] = {l + 45, l + 45, l + 65};
	    int b[] = {j + 10, j + 30, j + 20};
	    c.fillPolygon (a, b, 3);

	    c.setColor (stripes);
	    c.fillRect (l + 67, j + 28, 18, 5);
	    c.fillRect (l + 67, j + 18, 18, 5);
	    c.fillRect (l + 67, j + 8, 18, 5);


	    c.setColor (Color.WHITE);
	    c.fillOval (l + 17, j + 12, 15, 15);

	    c.setColor (Color.BLACK);
	    c.fillOval (l + 20, j + 15, 9, 9);


	    c.drawArc (l - 45, j - 16, 100, 50, 280, 30);
	    sleep (speed);
	}

    }


    //This private method is used in animation to delay it.
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
    
    //This public method is used to 
    public void run(){
	fish();
    }
}
