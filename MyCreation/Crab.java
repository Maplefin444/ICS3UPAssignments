/*
* James Huynh and Pradyumn Jha
* Ms. Krasteva
* My Creation ICS3UP
* Nov. 10, 2021
* This program draws and animates a crab.

Variable Name             Type             Description

c                         Console          This is where everything will be drawn.
ocean                     Color            This variable stores the color value of the associated color.
crab                      Color            This variable stores the color value of the associated color.
*/
import java.awt.*;
import hsa.Console;

public class Crab implements Runnable
{
    private Console c;           // The output console
    private Color ocean = new Color (130, 194, 237);
    private Color crab = new Color (207, 62, 67);

    public Crab (Console con) //Constructor, accepts a console to draw in
    {
	c = con;
    }

    public void run(){ //Public method run is used for Runnable
	crab();
    }
    /*
    This public method draws and animates the crab.
    
    For Loop: Animates the crab.
    Variable Name             Type             Description

    i                         int              This variable controls the for loop.
    */
    private void crab ()
    {
	for (int i = 400 ; i >= 0 ; i--)
	{
	    c.setColor (ocean);
	    c.fillRect (250+i, 430, 176, 70);
	    c.setColor (crab);
	    c.fillOval (250+i, 430, 50, 30);
	    c.fillOval (375+i, 430, 50, 30);
	    c.fillOval (302+i, 450, 70, 40);
	    c.drawLine (310+i, 470, 290+i, 450);
	    c.drawLine (360+i, 470, 390+i, 450);
	    c.drawArc (330+i, 480, 20, 40, 0, 75);
	    c.drawArc (340+i, 480, 20, 40, 0, 75);
	    c.drawArc (350+i, 480, 20, 40, 0, 75);
	    c.drawArc (300+i, 480, 20, 40, 90, 90);
	    c.drawArc (310+i, 480, 20, 40, 90, 90);
	    c.drawArc (320+i, 480, 20, 40, 90, 90);
	    c.setColor (ocean);
	    int[] leftTriX = {250+i, 250+i, 270+i};
	    int[] leftTriY = {455, 435, 443};
	    int[] rightTriX = {425+i, 425+i, 405+i};
	    int[] rightTriY = {455, 435, 443};
	    c.fillPolygon (leftTriX, leftTriY, 3);
	    c.fillPolygon (rightTriX, rightTriY, 3);
	    c.setColor (Color.WHITE);
	    c.fillOval (310+i, 435, 15, 30);
	    c.fillOval (345+i, 435, 15, 30);
	    c.setColor (Color.BLACK);
	    c.fillOval (313+i, 440, 10, 20);
	    c.fillOval (348+i, 440, 10, 20);
	    c.drawArc (328+i, 460, 15, 15, 200, 140);
	    sleep (15);
	}
    }


    private void sleep (int time) //This public method is used in crab() to delay it.
    {
	try
	{
	    Thread.sleep (time);
	}
	catch (Exception e)
	{
	}
    }
} // Crab class
