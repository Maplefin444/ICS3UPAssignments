/*
* James Huynh, Pradyumn Jha
* Ms. Krasteva
* Bead Loom Assignment ICS3U
* Oct 24
* This program will prompt you to press a button to draw an indigenous bead loom. When the key is pressed, the bead loom will be slowly drawn.



Variable Name              Type             Description

c                      ConsoleClass         This is where all of the graphics will be drawn.
black                     Color             This variable stores the color value of the black color we'll be using.
red                       Color             This variable stores the color value of the red color we'll be using.
orange                    Color             This variable stores the color value of the orange color we'll be using.
yellow                    Color             This variable stores the color value of the yellow color we'll be using.
blue                      Color             This variable stores the color value of the blue color we'll be using.
*/
import java.awt.*;
import hsa.Console;

public class BeadLoom
{
    static Console c;           // The output console
    Color black = new Color (71, 71, 71); //Declaration statements
    Color red = new Color (255, 86, 86);
    Color orange = new Color (255, 163, 0);
    Color yellow = new Color (255, 248, 124);
    Color blue = new Color (86, 185, 255);

    public BeadLoom ()
    { //Constructor for the BeadLoom Class
	c = new Console (26, 80, "Indigenous Bead Loom"); // Creates a new console assigned to variable c
    }

    public void sleep (int time)
    { // This private method is used in many of the animated methods. It is a try catch structure with a Thread.sleep() to be tried.
	try
	{
	    Thread.sleep (time);
	}
	catch (Exception e)
	{
	}
    }


    public void intro ()
    { // This public method draws the intro screen and prompts the user to press a key to start the drawing.
	c.drawString ("Press any key to begin the drawing", 250, 250);
	c.drawString ("of the bead loom", 290, 270);
	c.drawString ("By: Pradyumn Jha and James Huynh", 245, 290);
	c.drawString ("This design is based on Canadian indigenous bead looms, as it uses",170,180);
	c.drawString("many colours in Indigenous culture, and it slightly altered from a picture found online.",130,200);
	c.getChar ();
	c.clear ();
    }

    /*
    This public method draws a grid using black lines.
    
    For Loop: Repeats 50 times to draw 50 lines twice, for a total of 100 lines to make a grid.
    
    Variable Name              Type             Description
    i                          int              Controls the for loop, to make it run 50 times, and is used to draw each line 10 pixels away from the last.
    */
    public void grid ()
    {
	c.setColor (Color.BLACK);
	for (int i = 0 ; i < 51 ; i++)
	{
	    c.drawLine (80 + i * 10, 10, 80 + i * 10, 510);
	    c.drawLine (80, 10 + i * 10, 580, 10 + i * 10);
	    sleep(10);
	}
    }


    public void rhombuses () //This public method draws all of the rhombuses, along with the squares in the middle of them. It uses drawRhombusRed(), drawRhombusOrange(), and drawRhombusYellow()
    { 

	// Red
	drawRhombusRed (50, 20); // Column 1
	drawRhombusRed (50, 160);
	drawRhombusRed (50, 300);
	drawRhombusRed (50, 440);
	drawRhombusRed (50, 580);

	drawRhombusRed (190, -50); // Column 2
	drawRhombusRed (190, 90);
	drawRhombusRed (190, 230);
	drawRhombusRed (190, 370);

	drawRhombusRed (330, -120); // Column 3
	drawRhombusRed (330, 20);
	drawRhombusRed (330, 160);
	drawRhombusRed (330, 300);
	drawRhombusRed (330, 440);

	drawRhombusRed (470, -50); // Column 4
	drawRhombusRed (470, 90);
	drawRhombusRed (470, 230);
	drawRhombusRed (470, 370);

	drawRhombusRed (610, -120); // Column 5
	drawRhombusRed (610, 20);
	drawRhombusRed (610, 160);
	drawRhombusRed (610, 300);
	drawRhombusRed (610, 440);

	// Orange
	drawRhombusOrange (50, 40); // Column 1
	drawRhombusOrange (50, 180);
	drawRhombusOrange (50, 320);
	drawRhombusOrange (50, 460);
	drawRhombusOrange (50, 600);

	drawRhombusOrange (190, -30); // Column 2
	drawRhombusOrange (190, 110);
	drawRhombusOrange (190, 250);
	drawRhombusOrange (190, 390);

	drawRhombusOrange (330, 40); // Column 3
	drawRhombusOrange (330, 180);
	drawRhombusOrange (330, 320);
	drawRhombusOrange (330, 460);

	drawRhombusOrange (470, -30); // Column 4
	drawRhombusOrange (470, 110);
	drawRhombusOrange (470, 250);
	drawRhombusOrange (470, 390);

	drawRhombusOrange (610, 40); // Column 5
	drawRhombusOrange (610, 180);
	drawRhombusOrange (610, 320);
	drawRhombusOrange (610, 460);

	// Yellow

	drawRhombusYellow (190, -10); // Column 2
	drawRhombusYellow (190, 130);
	drawRhombusYellow (190, 270);
	drawRhombusYellow (190, 410);

	drawRhombusYellow (330, 60); // Column 3
	drawRhombusYellow (330, 200);
	drawRhombusYellow (330, 340);
	drawRhombusYellow (330, 480);

	drawRhombusYellow (470, -10); // Column 4
	drawRhombusYellow (470, 130);
	drawRhombusYellow (470, 270);
	drawRhombusYellow (470, 410);

	//Blue
	c.setColor (blue);
	c.fillRect (180, 20, 20, 20); // Column 1
	c.fillRect (180, 160, 20, 20);
	c.fillRect (180, 300, 20, 20);
	c.fillRect (180, 440, 20, 20);

	sleep (120);

	c.fillRect (320, 90, 20, 20); // Column 2
	c.fillRect (320, 230, 20, 20);
	c.fillRect (320, 370, 20, 20);

	sleep (120);

	c.fillRect (460, 20, 20, 20); // Column 3
	c.fillRect (460, 160, 20, 20);
	c.fillRect (460, 300, 20, 20);
	c.fillRect (460, 440, 20, 20);

	sleep (120);

    }


    public void background () // This public method draws all of the background, using the zigZagTop() and zigZagBot() methods.
    {
	zigZagTop (50, 30); //Column 1
	zigZagBot (50, 20);
	zigZagTop (50, 170);
	zigZagBot (50, 160);
	zigZagTop (50, 310);
	zigZagBot (50, 300);
	zigZagTop (50, 450);
	zigZagBot (50, 440);

	zigZagBot (190, -50); //Column 2
	zigZagTop (190, 100);
	zigZagBot (190, 90);
	zigZagTop (190, 240);
	zigZagBot (190, 230);
	zigZagTop (190, 380);
	zigZagBot (190, 370);
	zigZagTop (190, 520);

	zigZagTop (330, 30); //Column 3
	zigZagBot (330, 20);
	zigZagTop (330, 170);
	zigZagBot (330, 160);
	zigZagTop (330, 310);
	zigZagBot (330, 300);
	zigZagTop (330, 450);
	zigZagBot (330, 440);

	zigZagBot (470, -50); //Column 4
	zigZagTop (470, 100);
	zigZagBot (470, 90);
	zigZagTop (470, 240);
	zigZagBot (470, 230);
	zigZagTop (470, 380);
	zigZagBot (470, 370);
	zigZagTop (470, 520);
    }

    /*
    This private method draws the top of a zigzag, going from the top right to the bottom left.
    
    For Loop: The for loop will change the squares to be drawn 10 pixels down, and 10 pixels to the left.
    
    Variable Name              Type             Description
    i                          int              Controls the for loop, and adjusts the squares to be drawn below eachother, and 10 pixels to the left.
    */
    private void zigZagTop (int a, int b)
    {
	for (int i = 0 ; i < 7 ; i++)
	{
	    c.setColor (black);
	    c.fillRect ((a + 120) + i * -10, i * 10 + (b - 70), 10, 10);
	    c.fillRect ((a + 110) + i * -10, i * 10 + (b - 70), 10, 10);
	    c.fillRect ((a + 100) + i * -10, i * 10 + (b - 70), 10, 10);
	    c.fillRect ((a + 90) + i * -10, i * 10 + (b - 70), 10, 10);
	    c.fillRect ((a + 80) + i * -10, i * 10 + (b - 70), 10, 10);
	    c.fillRect ((a + 70) + i * -10, i * 10 + (b - 70), 10, 10);
	    eraseOutside ();
	    sleep (45);
	}
    }

    
    /*
    This private method draws the top of a zigzag, going from the top left to the bottom right.
    
    For Loop: The for loop will change the squares to be drawn 10 pixels down, and 10 pixels to the right.
    
    Variable Name              Type             Description
    i                          int              Controls the for loop, and adjusts the squares to be drawn below eachother, and 10 pixels to the right.
    */
    private void zigZagBot (int a, int b)
    {
	for (int j = 0 ; j < 7 ; j++)
	{
	    c.setColor (black);
	    c.fillRect ((a + 10) + j * 10, j * 10 + b + 10, 10, 10);
	    c.fillRect ((a + 20) + j * 10, j * 10 + b + 10, 10, 10);
	    c.fillRect ((a + 30) + j * 10, j * 10 + b + 10, 10, 10);
	    c.fillRect ((a + 40) + j * 10, j * 10 + b + 10, 10, 10);
	    c.fillRect ((a + 50) + j * 10, j * 10 + b + 10, 10, 10);
	    c.fillRect ((a + 60) + j * 10, j * 10 + b + 10, 10, 10);
	    eraseOutside ();
	    sleep (45);
	}
    }

    
    private void eraseOutside () //This private method will erase everything outside of the grid. It is to be used in animation methods.
    {
	c.setColor (Color.WHITE);
	c.fillRect (0, 0, 80, 550);
	c.fillRect (0, 0, 600, 10);
	c.fillRect (581, 0, 80, 550);
	c.fillRect (0, 511, 600, 10);
    }

    /*
    This private method draws a large red rhombus.
    
    For Loop: The for loop will slowly make the squares converge from the middle of the rhombus to the top and bottom
    
    Variable Name              Type             Description
    i                          int              Controls the for loop, and adjusts the squares to be drawn closer to eachother each time, and up or down one.
    */
    private void drawRhombusRed (int a, int b)
    {

	for (int i = 7 ; i > 0 ; i--)
	{
	    c.setColor (red);
	    c.fillRect (a - (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a + 10) - (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 20) + (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 10) + (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 20) - (i * -10), (-i * 10) + (b + 150), 10, 10);
	    c.fillRect ((a - 10) - (i * -10), (-i * 10) + (b + 150), 10, 10);
	    c.fillRect (a + (i * -10), (-i * 10) + (b + 150), 10, 10);
	    c.fillRect ((a + 10) + (i * -10), (-i * 10) + (b + 150), 10, 10);
	    eraseOutside ();
	    sleep (45);
	}
    }

    /*
    This private method draws a medium orange rhombus.
    
    For Loop: The for loop will slowly make the squares converge from the middle of the rhombus to the top and bottom.
    
    Variable Name              Type             Description
    i                          int              Controls the for loop, and adjusts the squares to be drawn closer to eachother each time, and up or down one.
    */
    private void drawRhombusOrange (int a, int b)
    {
	for (int i = 5 ; i > 0 ; i--)
	{
	    c.setColor (orange);
	    c.fillRect (a - (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a + 10) - (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 20) + (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 10) + (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 20) - (i * -10), (-i * 10) + (b + 110), 10, 10);
	    c.fillRect ((a - 10) - (i * -10), (-i * 10) + (b + 110), 10, 10);
	    c.fillRect (a + (i * -10), (-i * 10) + (b + 110), 10, 10);
	    c.fillRect ((a + 10) + (i * -10), (-i * 10) + (b + 110), 10, 10);
	    eraseOutside ();
	    sleep (65);
	}
    }

    /*
    This private method draws a small yellow rhombus.
    
    For Loop: The for loop will slowly make the squares converge from the middle of the rhombus to the top and bottom
    
    Variable Name              Type             Description
    i                          int              Controls the for loop, and adjusts the squares to be drawn closer to eachother each time, and up or down one.
    */
    private void drawRhombusYellow (int a, int b)
    {
	for (int i = 3 ; i > 0 ; i--)
	{
	    c.setColor (yellow);
	    c.fillRect (a - (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a + 10) - (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 20) + (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 10) + (i * 10), i * 10 + b, 10, 10);
	    c.fillRect ((a - 20) - (i * -10), (-i * 10) + (b + 70), 10, 10);
	    c.fillRect ((a - 10) - (i * -10), (-i * 10) + (b + 70), 10, 10);
	    c.fillRect (a + (i * -10), (-i * 10) + (b + 70), 10, 10);
	    c.fillRect ((a + 10) + (i * -10), (-i * 10) + (b + 70), 10, 10);
	    eraseOutside ();
	    sleep (85);
	}
    }


    public static void main (String[] args) //Main method, we create a new instance of the class BeadLoom, and we use intro(), grid(), rhombuses(), and background().
    {

	BeadLoom t = new BeadLoom ();
	
	t.intro ();
	t.grid ();
	
	c.setColor (Color.BLACK);
	c.drawRect (80, 10, 500, 500); //Draws a box around the grid
	
	t.rhombuses ();
	
	c.setColor (Color.BLACK);
	c.drawRect (80, 10, 500, 500); //Draws a box around the grid
	
	t.background ();
	t.grid ();
	
	c.drawString ("James Huynh, Pradyumn Jha", 260, 520);
    } // main method
} // Testing class
