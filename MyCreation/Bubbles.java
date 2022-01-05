/*
* James Huynh and Pradyumn Jha
* Ms. Krasteva
* My Creation Assignment ICS3U
* This program will draw the bubbles that appear at the beginning of the animation.
* Nov. 10 2021

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
outline                   Color              Stores the color value of the associated color.
bubble                    Color              Stores the color value of the associated color.
star                      Color              Stores the color value of the associated color.
ocean                     Color              Stores the color value of the associated color.
*/
import java.awt.*;
import hsa.Console;

public class Bubbles extends Thread
{
    private Console c;

    private Color outline = new Color (204, 204, 204);
    private Color bubble = new Color (233, 244, 254);
    private Color star = new Color (255, 255, 0);
    private Color ocean = new Color (130, 194, 237);

    public Bubbles (Console con) // The constructor of the class, accepts a console to draw in.
    {
	c = con;
    }


    private void sleep (int time) // This private method delays the thread.
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
    This public method draws the first bubble and animates it.
    For Loop: This for loop animates the bubble.
    Variable Name             Type               Description
    i                         int                This variable controls the for loop.
    */
    public void bubble1 ()
    {
	for (int i = 0 ; i <= 290 ; i++)
	{
	    c.setColor (bubble);
	    c.fillOval (10, 340 - i, 30, 30);
	    c.setColor (outline);
	    c.drawOval (10, 340 - i, 30, 30);
	    c.drawArc (15, 345 - i, 15, 15, 90, 90);
	    c.setColor (star);
	    c.fillStar (30, 340 - i, 15, 15);
	    c.setColor (outline);
	    c.drawStar (30, 340 - i, 15, 15);
	    sleep (10);
	    c.setColor (ocean);
	    c.fillRect (10, 340 - i, 36, 31);
	}
    }
    
    /*
    This public method draws the second bubble and animates it.
    For Loop: This for loop animates the bubble.
    Variable Name             Type               Description
    i                         int                This variable controls the for loop.
    */
    public void bubble2 ()
    {
	for (int i = 0 ; i <= 200 ; i++)
	{
	    c.setColor (bubble);
	    c.fillRoundRect (50, 240 - i, 30, 30,20,20);
	    c.setColor (outline);
	    c.drawRoundRect (50, 240 - i, 30, 30,20,20);
	    c.drawArc (55, 245 - i, 15, 15, 90, 90);
	    c.setColor (star);
	    c.fillStar (70, 240 - i, 15, 15);
	    c.setColor (outline);
	    c.drawStar (70, 240 - i, 15, 15);
	    sleep (15);
	    c.setColor (ocean);
	    c.fillRect (50, 240 - i, 36, 31);
	}
    }
    
    public void run(){
	bubble1();
	bubble2();
    }
} // Bubbles class
