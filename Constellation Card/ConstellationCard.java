/*
* James Huynh and Pradyumn Jha
* Oct 20 2021
* Ms. Krasteva ICS3UP
* Graphics Assignment
* This program will create a card with a constellation on it, and a description.

Variable Name      Type        Description

c               ConsoleClass   This variable is for the Console Class which is where everything is drawn in.
backgroundColor    Color       This variable stores the color value used in the background.
dividerColor       Color       This variable stores the color value used in the divider lines.
starColor          Color       This variable stores the color value used in the stars.
cardColor          Color       This variable stores the color value used on the card.
*/
import java.awt.*;
import hsa.Console;

public class ConstellationCard
{
    static Console c;           // The output console
    Color backgroundColor = new Color (102, 64, 255);
    Color dividerColor = new Color (166, 64, 255);
    Color starColor = new Color (255, 238, 128);
    Color cardColor = new Color (128, 168, 255);
    public ConstellationCard ()
    { //ConstellationCard Constructor
	c = new Console (24, 37, "Constellation Card");
    }


    public void intro ()
    { //This public method will draw the screen right at the beginning, and ask for the user to press any key to show their card.
	c.setColor (backgroundColor);
	c.fillRect (15, 13, 280, 465);
	c.setColor (dividerColor);
	c.fillRect (17, 200, 276, 150);
	c.setColor (starColor);
	c.fillStar (130, 120, 50, 50);
	c.setColor (Color.WHITE);
	c.setFont (new Font ("Bahnschrift", Font.BOLD, 15));
	c.drawString ("COSMIC FIGHTERS", 85, 230);
	c.drawString ("Constellation Collectibles", 63, 50);
	c.drawString ("Booster Pack", 105, 70);
	c.drawString ("ONLINE", 125, 90);
	c.drawString ("Press any key to open your", 55, 300);
	c.drawString ("FREE booster pack!", 85, 320);
	c.drawString ("James and Pradyumn, Oct 20",50,400);
	c.getChar ();
    }


    public void card ()
    { //This public method will draw the card, it will be used after the intro() method.
	c.clear ();
	c.setColor (cardColor);
	c.fillRect (15, 13, 280, 465);
	c.setColor (Color.BLACK);
	c.drawRect (14, 12, 281, 466);
	c.drawRect (15, 13, 279, 464);
	c.drawRect (16, 14, 277, 462);
	c.fillRect (50, 50, 210, 200);
	c.setColor (Color.WHITE);
	c.setFont (new Font ("Bahnschrift", Font.BOLD, 15));
	c.drawString ("Rarity: 5", 50, 365);
	c.setColor (dividerColor);
	c.drawRect (50, 50, 210, 200);
	c.drawRect (51, 51, 208, 198);
	c.drawRect (52, 52, 206, 196);
	animateStars ();
	c.setColor (starColor);
	c.drawLine (174, 75, 136, 220);
	c.drawLine (84, 115, 215, 120);
	c.setColor (Color.WHITE);
	c.drawString ("The Crux", 50, 270);
	c.setFont (new Font ("Bahnschrift", Font.BOLD, 12));
	c.drawString ("The Crux is the smallest constellation,", 35, 285);
	c.drawString ("but one of the brightest and interesting.", 35, 300);
	c.drawString ("It is prevalent in Australia, New Zealand,", 35, 315);
	c.drawString ("Brazil, Papua New Guinea and regions of", 35, 330);
	c.drawString ("Chile and Argentina. The Crux was visible", 35, 345);
	c.drawString ("to the Ancient Greeks, who regarded it as", 35, 360);
	c.drawString ("part of the constellation Centaurus.", 35, 375);
	c.drawString ("Information from: globeatnight.com", 35, 400);
    }


    /*
    This private method animates all of the stars. It is to be used in card().

    For Loop #1: This one animates the first star.
    For Loop #2: This one animates the second star, and draws all the stars before it.
    For Loop #3: This one animates the third star, and draws all the stars before it.
    For Loop #4: This one animates the fourth star, and draws all the stars before it.
    For Loop #5: This one animates the fifth star, and draws all the stars before it.

    Variable Name       Type        Description
    i                   int         This variable controls the first loop.
    j                   int         This variable controls the second loop.
    k                   int         This variable controls the third loop.
    l                   int         This variable controls the fourth loop.
    m                   int         This variable controls the fifth loop.
    */
    private void animateStars ()
    {
	for (int i = -20 ; i < 170 ; i++)
	{
	    c.setColor (Color.WHITE);
	    c.fillRect (i - 1, 70, 10, 10);
	    cardEraser ();
	    c.setColor (starColor);
	    c.fillStar (i, 70, 10, 10);
	    sleep (3);
	}
	for (int j = -20 ; j < 130 ; j++)
	{
	    c.setColor (Color.WHITE);
	    c.fillRect (j - 1, 220, 10, 10);
	    cardEraser ();
	    c.setColor (starColor);
	    c.fillStar (j, 220, 10, 10);
	    c.fillStar (170, 70, 10, 10);
	    sleep (3);
	}
	for (int k = -20 ; k < 80 ; k++)
	{
	    c.setColor (Color.WHITE);
	    c.fillRect (k - 1, 110, 10, 10);
	    cardEraser ();
	    c.setColor (starColor);
	    c.fillStar (k, 110, 10, 10);
	    c.fillStar (170, 70, 10, 10);
	    c.fillStar (130, 220, 10, 10);
	    sleep (3);
	}
	for (int l = -20 ; l < 210 ; l++)
	{
	    c.setColor (Color.WHITE);
	    c.fillRect (l - 1, 115, 10, 10);
	    cardEraser ();
	    c.setColor (starColor);
	    c.fillStar (l, 115, 10, 10);
	    c.fillStar (170, 70, 10, 10);
	    c.fillStar (130, 220, 10, 10);
	    c.fillStar (80, 110, 10, 10);
	    sleep (3);
	}
	for (int m = -20 ; m < 180 ; m++)
	{
	    c.setColor (Color.WHITE);
	    c.fillRect (m - 1, 150, 10, 10);
	    cardEraser ();
	    c.setColor (starColor);
	    c.fillStar (m, 150, 10, 10);
	    c.fillStar (170, 70, 10, 10);
	    c.fillStar (130, 220, 10, 10);
	    c.fillStar (80, 110, 10, 10);
	    c.fillStar (210, 115, 10, 10);
	    sleep (3);
	}
    }


    private void sleep (int sleepTime)
    { //This private method is the try and catch that is needed to run Thread.sleep(). This method will be used in animateStars().
	try
	{
	    Thread.sleep (sleepTime);
	}
	catch (Exception e)
	{
	}
    }


    private void cardEraser ()
    { //This private method is used in conjunction with a white eraser shape to animate the stars in animateStars().
	c.setColor (cardColor);
	c.fillRect (15, 13, 280, 465);
	c.setColor (Color.BLACK);
	c.drawRect (14, 12, 281, 466);
	c.drawRect (15, 13, 279, 464);
	c.drawRect (16, 14, 277, 462);
	c.fillRect (50, 50, 210, 200);
	c.setColor (Color.WHITE);
	c.setFont (new Font ("Bahnschrift", Font.BOLD, 15));
	c.drawString ("Rarity: 5", 30, 35);
	c.setColor (dividerColor);
	c.drawRect (50, 50, 210, 200);
	c.drawRect (51, 51, 208, 198);
	c.drawRect (52, 52, 206, 196);
    }


    public static void main (String[] args)
    { //The Main method
	ConstellationCard g = new ConstellationCard ();
	g.intro ();
	g.card ();
    }
} // ConstellationCard class
