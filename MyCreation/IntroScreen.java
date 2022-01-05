/*
    Name: Pradyumn Jha and James Huynh
    Teacher: Ms. Krasteva
    Date: November 3rd, 2021 (2021-11-03)
    Assignment: My Creations
*/

// The "IntroScreen" class.


/*

This program will draw the intro screen.

Variable Name     Type     Description
ocean            Color     Color for the ocean
skyBlue          Color     Color for the sky

slowFishLimbs    Color     Color for the fins and tail of the green-bodied fish
slowFishBody     Color     Color for the body of the green-bodied fish
slowFishStripes  Color     Color for the stripes of the green-bodied fish

*/
import java.awt.*;
import hsa.Console;

public class IntroScreen
{
    Console c;

    Color ocean = new Color (130, 194, 237);
    Color skyBlue = new Color (207, 226, 243);
    Color slowFishLimbs = new Color (241, 237, 110);
    Color slowFishBody = new Color (123, 201, 121);
    Color slowFishStripes = new Color (191, 222, 45);


    public IntroScreen (Console con)  // Constructor
    {
	c = con;
    }


    private void water ()  //Draws the background
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


    /*
     This private overloaded method is where the command for drawing one stationary fish is actually in. Will be called in fishMoving().

     Variable Name   Type    Description
     limbs           Color   Variable identifier for fins + tail color of fish.
     body            Color   Variable identifier for body color of fish.
     stripes         Color   Variable identifier for stripes color of fish.
     eyes            Color   Variable identifier for eye color of fish.
     pupil           Color   Variable identifier for pupil color of fish.
       i              int    Variable identifier for x-value of points.

     */
    private void fishBody (int i, Color body, Color limbs, Color stripes, Color eye, Color pupil)
    {
	c.setColor (body);
	c.fillOval (i, 100, 120, 65);

	c.setColor (limbs);
	int x[] = {i + 120, i + 150, i + 150};
	int y[] = {135, 160, 110};
	c.fillPolygon (x, y, 3);

	int a[] = {i + 50, i + 50, i + 70};
	int b[] = {125, 145, 135};
	c.fillPolygon (a, b, 3);

	c.setColor (stripes);
	c.fillRect (i + 77, 143, 27, 5);
	c.fillRect (i + 77, 133, 27, 5);
	c.fillRect (i + 77, 122, 27, 5);

	c.setColor (eye);
	c.fillOval (i + 20, 115, 15, 15);

	c.setColor (pupil);
	c.fillOval (i + 23, 118, 9, 9);


	c.drawArc (i - 49, 100, 100, 50, 280, 30);
    }


    private void displayFish ()  //This private method draws the fish
    {
	fishBody (250, slowFishBody, slowFishLimbs, slowFishStripes, Color.WHITE, Color.BLACK);
    }


    private void title ()  //This private method draws the title screen and does getChar() to wait for input.
    {
	c.setFont (new Font ("Castellar", Font.BOLD, 15));
	c.setColor (Color.WHITE);
	c.drawString ("Pradyumn Jha and James Huynh", 160, 230);
	c.setFont (new Font ("Algerian", 1, 25));
	c.drawString ("Fish Tale", 260, 300);
	c.setFont (new Font ("Corbel", 1, 20));
	c.drawString ("Press any key to continue", 215, 350);
	c.getChar ();


    }


    public void finalDisplay ()  //All of the methods combined
    {
	water ();
	displayFish ();
	title ();

    }

}
