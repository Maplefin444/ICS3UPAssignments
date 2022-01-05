/*  
   Name: xxx
   Teacher: Ms. Dyke
   Date: xxxx
   This class is NOT a Thread!!!  There are no moving objects

*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Background
{
    //global variable used to a
    private Console c; 
    Paints col;

    //class to make background
    public void draw ()
    {
     Paints pp=new Paints();
    
	//local colour variable for the sky
	// Color skyblue = new Color (89, 172, 255);
	// //local colour variable for the ocean
	// Color oceanblue = new Color (0, 116, 232);
	// //local colour variable for the mountain
	// Color darkbrown = new Color (126, 64, 1);
	// //local colour variable for the roof
	// Color roofbeige = new Color (254, 237, 167);
	// //local colour variable for the hut
	// Color hutbeige = new Color (230, 185, 125);
	// //local colour variable for the roof
	// Color brown = new Color (254, 204, 51);
	// //local colour variable for the window
	// Color grey = new Color (202, 209, 186);
	// //local colour variable for the pink seaweed
	// Color pink = new Color (252, 173, 250);
	// //local colour variable for the magenta seaweed
	// Color magenta = new Color (247, 70, 185);
	// //local colour variable for the seaweed
	// Color lightgreen = new Color (125, 235, 73);
	// //local colour variable for the seaweed
	// Color green = new Color (163, 252, 169);
	// //local colour variable for the seaweed
	// Color emerald = new Color (117, 251, 140);

	//loop used to make the sky and ocean
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (pp.skyblue);
	    c.drawRect (0, 0, x, 250);
	    c.setColor (pp.oceanblue);
	    c.drawRect (0, 250, x, 250);
	}

	//loop used to create sun
	for (int x = 0 ; x < 40 ; x++)

	    {
		c.setColor (Color.yellow);
		c.drawOval (50 + x, 50 + x, 75 - 2 * x, 75 - 2 * x);
	    }

	//loop used to create the left mountain
	for (int x = 0 ; x < 280 ; x++)
	{
	    c.setColor (pp.darkbrown);
	    c.drawLine (430 + x, 250, 570, 20);
	}

	//loop used to create the right mountain
	for (int x = 0 ; x < 160 ; x++)
	    c.drawLine (580 + x, 250, 640, 80);



	//loop used to make the huts
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (pp.darkbrown);
	    c.drawRect (35, 245 - x, 3, 5);
	    c.drawRect (90, 245 - x, 3, 5);
	    c.drawRect (140, 245 - x, 3, 5);
	    c.drawRect (195, 245 - x, 3, 5);
	}

	//loop used to make the hut
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (pp.darkbrown);
	    c.drawRect (25, 235, x, 5);
	    c.drawRect (130, 235, x, 5);
	    c.setColor (pp.hutbeige);
	    c.drawRect (25, 212, x, 22);
	    c.drawRect (130, 212, x, 22);
	}

	//loop used to make the windows
	for (int x = 0 ; x < 38 ; x++)
	{
	    c.setColor (pp.grey);
	    c.drawRoundRect (65 - x, 219, 35, 12, 10, 10);
	    c.drawRoundRect (170 - x, 219, 35, 12, 10, 10);
	}

	//loop used to make the hut roof
	for (int x = 0 ; x < 100 ; x = x + 5)
	{
	    c.setColor (pp.brown);
	    c.drawLine (17 + x, 215, 65, 200);
	    c.drawLine (122 + x, 215, 170, 200);
	    c.setColor (Color.yellow);
	    c.drawLine (18 + x, 215, 65, 200);
	    c.drawLine (123 + x, 215, 170, 200);
	    c.setColor (pp.roofbeige);
	    c.drawLine (15 + x, 215, 65, 200);
	    c.drawLine (120 + x, 215, 170, 200);
	}


	//Name
	c.setColor (Color.cyan);
	c.drawString ("KAI", 53, 230);

	//loop used to make pink seaweed
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (pp.pink);
	    c.drawOval (30 + x, 480 + x, 95 - 2 * x, 35 - 2 * x);
	    c.drawOval (120 + x, 480 + x, 95 - 2 * x, 35 - 2 * x);
	    c.drawOval (220 + x, 480 + x, 95 - 2 * x, 35 - 2 * x);
	    c.drawOval (320 + x, 480 + x, 95 - 2 * x, 35 - 2 * x);
	}

	//loop used to make magenta seaweed
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (pp.magenta);
	    c.drawOval (90 + x, 480 + x, 45 - 2 * x, 25 - 2 * x);
	    c.drawOval (390 + x, 480 + x, 45 - 2 * x, 25 - 2 * x);
	}

	//loop used to make green seaweed
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (pp.green);
	    c.drawArc (-40 + x, 355 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (-41 + x, 355 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (178 - x, 390 - x, 200, 200, 180, 40);
	    c.setColor (pp.lightgreen);
	    c.drawArc (0 + x, 330 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (1 + x, 330 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (218 - x, 390 - x, 200, 200, 180, 40);
	    c.drawArc (75 + x, 350 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (76 + x, 350 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (293 - x, 390 - x, 200, 200, 180, 40);
	    c.setColor (pp.emerald);
	    c.drawArc (40 + x, 370 + x, 200, 180 + x, 310, 70 + x);
	    c.drawArc (41 + x, 370 + x, 200, 180 + x, 310, 70 + x);
	    c.drawArc (258 - x, 390 - x, 200, 200, 180, 40);
	    c.drawArc (110 + x, 380 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (111 + x, 380 + x, 200, 200 + x, 310, 80 + x);
	    c.drawArc (337 - x, 390 - x, 200, 200, 180, 40);
	}
    }


    public Background (Console con)
    {
	c = con;
	draw ();
    }
}


