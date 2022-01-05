/*
Name: Pradyumn Jha and James Huynh
Teacher: Ms. Krasteva
Date: November 3rd, 2021 (2021-11-03)
Assignment: My Creations

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
slowFishLimbs            Color               Stores the RGB value of the associated colour.
slowFishBody             Color               Stores the RGB value of the associated colour.
slowFishStripes          Color               Stores the RGB value of the associated colour.
ocean                    Color               Stores the RGB value of the associated colour.
speed                    int                 Stores speed of the fish.
forLoop1                 int                 Stores what the for loop starts at.
forLoop2                 int                 Stores what the for loop ends at.
*/

import java.awt.*;
import hsa.Console;
public class SlowFish extends Thread
{
    private Console c;
    private Color slowFishLimbs = new Color (241, 237, 110);
    private Color slowFishBody = new Color (123, 201, 121);
    private Color slowFishStripes = new Color (191, 222, 45);
    private Color ocean = new Color (130, 194, 237);
    private int speed;
    private int forLoop1;
    private int forLoop2;
    
    
    public SlowFish (Console con)  // Overloaded constructor for the SlowFish class, accepts a console to draw in.
    {
	c = con;
	speed = 15;
	forLoop1 = 500;
	forLoop2 = -300;
    }


    public SlowFish (Console con, int identifier)  // Overloaded constructor for the SlowFish class, accepts a console to draw in.
    {
	c = con;
	speed = 20;
	forLoop1 = 500;
	forLoop2 = 0;
    }


    public SlowFish (Console con, boolean identifier)  // Overloaded constructor for the SlowFish class, accepts a console to draw in.
    {
	c = con;
	speed = 20;
	forLoop1 = 0;
	forLoop2 = -300;
    }


    /*
    This public method draws the fish on the first background, swimming away from the shark.

    For Loop: Animates the fish.

    Variable Name             Type               Description
    i                         int                This is variable controls the for loop and offsets the fish.
    sp                        int                This variable defines the amount of milliseconds to sleep. It is equal to the speed variable.
    val1                      int                This variable defines the start point of the for loop, it is equal to the forLoop1 variable.
    val2                      int                This variable defines the end point of the for loop, it is equal to the forLoop2 variable.
    */
    public void displayFish1 (int sp, int val1, int val2)
    {
	for (int i = val1 ; i >= val2 ; i--)
	{
	    c.setColor (ocean);
	    c.fillRect (100 + i, 100, 151, 65);
	    c.setColor (slowFishBody);
	    c.fillOval (100 + i, 100, 120, 65);
	    c.setColor (slowFishLimbs);
	    int x[] = {220 + i, 250 + i, 250 + i};
	    int y[] = {135, 160, 110};
	    c.fillPolygon (x, y, 3);
	    int a[] = {150 + i, 150 + i, 170 + i};
	    int b[] = {125, 145, 135};
	    c.fillPolygon (a, b, 3);
	    c.setColor (slowFishStripes);
	    c.fillRect (177 + i, 143, 27, 5);
	    c.fillRect (177 + i, 133, 27, 5);
	    c.fillRect (177 + i, 122, 27, 5);
	    c.setColor (Color.WHITE);
	    c.fillOval (120 + i, 115, 15, 15);
	    c.setColor (Color.BLACK);
	    c.fillOval (123 + i, 118, 9, 9);
	    c.drawArc (51 + i, 100, 100, 50, 280, 30);
	    sleep (sp);
	}
    }


    public void run(){ //This public method draws the fish as a thread.
	displayFish1 (speed,forLoop1,forLoop2);
    }
    
    private void sleep (int time)  //This private method delays the thread by the specified time.
    {
	try
	{
	    Thread.sleep (time);
	}
	catch (Exception e)
	{
	}
    }
}
