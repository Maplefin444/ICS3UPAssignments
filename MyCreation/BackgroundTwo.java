/*
* James Huynh and Pradyumn Jha
* Ms. Krasteva
* MyCreation ICS3U
* This program will draw the background when called in the main method in the MyCreation file.
* Nov. 4 2021

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
skyBlue                   Color              This variable will store the color value of the specified color.
ocean                     Color              This variable will store the color value of the specified color.
rock                      Color              This variable will store the color value of the specified color.
coralOrange               Color              This variable will store the color value of the specified color.
coralRed                  Color              This variable will store the color value of the specified color.
coralPink                 Color              This variable will store the color value of the specified color.
coralYellow               Color              This variable will store the color value of the specified color.
barnacle                  Color              This variable will store the color value of the specified color.
kelp                      Color              This variable will store the color value of the specified color.
boat                      Color              This variable will store the color value of the specified color.
*/
import java.awt.*;
import hsa.Console;

public class BackgroundTwo
{
    private Console c;           // The output console
    private Color skyBlue = new Color (207, 226, 243);
    private Color ocean = new Color (130, 194, 237);
    private Color rock = new Color (126, 118, 127);
    private Color coralOrange = new Color (255, 180, 133);
    private Color coralRed = new Color (193, 51, 77);
    private Color coralPink = new Color (248, 180, 211);
    private Color coralYellow = new Color (247, 255, 153);
    private Color barnacle = new Color (232, 226, 217);
    private Color kelp = new Color (83, 124, 80);
    private Color boat = new Color (193, 154, 107);

    public BackgroundTwo (Console con)  // This is the constructor, it accepts the console to draw in.
    {
	c = con;
	water ();
	plants ();
	rocks ();
	decor ();
    }


    /*
    This private method draws the water and the sky using 2 for loops

    For Loop 1:Draws the ocean by creating a rectangle that grows.
    Variable Name             Type               Description
    i                          int               This variable controls the for loop.

    For Loop 2:Draws the sky by drawing multiple circles side-by-side.
    Variable Name             Type               Description
    j                          int               This variable controls the for loop.
    */

    private void water ()
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


    private void rocks ()  //This private method draws the rocks and our names.
    {
	c.setColor (rock);
	c.fillOval (-100, 310, 250, 300);
	c.fillOval (360, 425, 200, 200);
	c.setColor (Color.WHITE);
	c.setFont (new Font("Arial",1,10));
	c.drawString ("Pradyumn J, James H", 10, 490);
    }


    /*
    This private method draws the various plants and coral amongst the background.

    For Loop: Draws the stem of the orange coral.
    Variable Name             Type               Description
    i                          int               This variable controls the for loop
    */
    private void plants ()
    {
	c.setColor (kelp);
	c.fillOval (200, 425, 70, 150);
	c.setColor (ocean);
	c.fillOval (220, 425, 70, 150);
	c.setColor (kelp);
	c.fillOval (250, 425, 70, 150);
	c.setColor (ocean);
	c.fillOval (270, 425, 70, 150);
	c.setColor (kelp);
	c.fillOval (300, 425, 70, 150);
	c.setColor (ocean);
	c.fillOval (320, 425, 70, 150);
	c.setColor (coralRed);
	c.fillOval (400, 400, 10, 80);
	c.fillOval (430, 350, 10, 130);
	c.fillOval (445, 360, 10, 150);
	c.fillOval (475, 400, 10, 60);
	c.fillOval (500, 380, 10, 90);
	for (int i = 0 ; i <= 70 ; i++)
	{
	    c.setColor (coralOrange);
	    c.drawRect (80, 270, i / 7, i);
	}
	c.setColor (coralOrange);
	c.fillRect (80, 300, 30, 10);
	c.fillRect (60, 280, 30, 10);
	c.setColor (barnacle);
	c.fillOval (80, 375, 70, 15);
	c.fillOval (90, 450, 100, 15);
	c.fillOval (515, 450, 40, 25);
    }


    private void decor ()  //This private method draws the various pieces of decor.
    {
	c.setColor (coralYellow);
	c.fillOval (10, 300, 30, 20);
	c.fillOval (120, 465, 50, 30);
	c.setColor (coralPink);
	c.fillOval (400, 470, 30, 20);
	c.setColor (coralOrange);
	c.fillOval (70, 375, 20, 20);
	c.setColor (boat);
	c.fillArc (560, 375, 150, 150, 135, 225);
    }
}
