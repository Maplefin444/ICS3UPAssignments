/*
* James Huynh and Pradyumn Jha
* Ms. Krasteva
* MyCreation ICS3U
* This program will draw the shark when called in the main method in the MyCreation file. There are two methods to draw the shark, as there is one for the first background, and one for the second background.

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
ocean                     Color              This variable will store the color value of the specified color.
sharkBody                 Color              This variable will store the color value of the specified color.
speed                     int                This variable is the speed of the shark.
start                     int                This variable defines where the for loop will start.
end                       int                This veriable defines where the for loop will end.
*/
import java.awt.*;
import hsa.Console;

public class Shark extends Thread
{
    private Console c;
    private Color ocean = new Color (130, 194, 237);
    private Color sharkBody = new Color (207, 226, 243);
    private int speed;
    private int start;
    private int end;

    //Overloaded constructor for class Shark, draws the first shark
    public Shark (Console con)
    {
	c = con;
	speed = 5;
	start = 500;
	end = -500;
    }
    
    //Overloaded constructor for class Shark, draws the second shark
    public Shark (Console con, int identifier)
    {
	c = con;
	speed = 8;
	start = 500;
	end = 200;
    }
    
    //Overloaded constructor for class Shark, draws the third shark
    public Shark (Console con, boolean identifier)
    {
	c = con;
	speed = 8;
	start = 200;
	end = -500;
    }

    //This private method is used in animation, it is the try catch structure with a Thread.sleep(). It will recieve an integer named time to determine the amount of milliseconds to sleep for.
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

    /*
    This public method will draw the shark.
    
    For Loop: This for loop will animate the shark moving.
    Variable Name             Type               Description
    
    i                         int                This controls the for loop.
    sp                        int                This variable is short for speed, it is equal to the global variable speed.
    st                        int                This variable is short for start, it is equal to the global variable start.
    en                        int                This variable is short for end, it is equal to the global variable end.
    */
    public void drawShark (int sp,int st, int en)
    {
	for (int i = st ; i >= en ; i--)
	{
	    int[] xFin = {275 + i, 320 + i, 275 + i};
	    int[] yFin = {125, 135, 150};
	    c.setColor (ocean);
	    c.fillRect (101 + i, 65, 285, 107);
	    c.setColor (Color.WHITE);
	    c.fillRect (130 + i, 150, 30, 5);
	    c.fillRect (150 + i, 145, 30, 5);
	    c.fillRect (170 + i, 142, 30, 5);
	    c.fillRect (190 + i, 138, 30, 5);
	    c.fillRect (105 + i, 132, 30, 5);
	    c.fillRect (140 + i, 132, 30, 5);
	    c.setColor (sharkBody);
	    c.fillOval (220 + i, 65, 100, 100);
	    c.setColor (ocean);
	    c.fillOval (270 + i, 65, 100, 100);
	    c.setColor (sharkBody);
	    c.fillArc (100 + i, 100, 275, 70, 215, 325);
	    c.fillOval (360 + i, 97, 25, 75);
	    c.setColor (Color.WHITE);
	    c.fillOval (170 + i, 110, 30, 20);
	    c.setColor (Color.BLACK);
	    c.drawOval (170 + i, 110, 30, 20);
	    c.fillOval (180 + i, 113, 10, 15);
	    c.drawPolygon (xFin, yFin, 3);
	    c.drawArc (210 + i, 115, 25, 50, 0, 75);
	    c.drawArc (220 + i, 115, 25, 50, 0, 75);
	    c.drawArc (230 + i, 115, 25, 50, 0, 75);
	    c.setColor (sharkBody);
	    c.drawLine (275 + i, 150, 275 + i, 125);
	    sleep (sp);
	}
    }

    
    public void run(){ //This method will run the thread and draw the shark.
	drawShark(speed,start,end);
    }
}
