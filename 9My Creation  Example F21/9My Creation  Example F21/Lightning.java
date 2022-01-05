/*  
   Name: xxx
   Teacher: Ms. Dyke
   Date: xxxx
   This class is draws lightening bolts!!!

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Lightning extends Thread
{
    private Console c;

    public void lightning ()
    {
	Color skyblue = new Color (89, 172, 255);
	Color yellow = new Color (243, 255, 26);

	//loop used to animate the lightning
	for (int x = 0 ; x < 20 ; x++)
	{
	    //array of local int varibles of x coordinates to make lightning
	    int lightningAx[] = {354, 364, 362};
	    //array of local int varibles of y coordinates to make lightning
	    int lightningAy[] = {73 + x, 99 + x, 68 + x};
	    //array of local int varibles of x coordinates to make lightning
	    int lightningBx[] = {356, 346, 337, 349};
	    //array of local int varibles of y coordinates to make lightning
	    int lightningBy[] = {77 + x, 46 + x, 54 + x, 85 + x};
	    //array of local int varibles of x eraser coordinates to erase lightning
	    int lightningEAy[] = {72 + x, 98 + x, 67 + x};
	    //array of local int varibles of y eraser coordinates to erase lightning
	    int lightningEBy[] = {76 + x, 45 + x, 52 + x, 84 + x};

	    c.setColor (skyblue);
	    c.fillPolygon (lightningAx, lightningEAy, 3);
	    c.fillPolygon (lightningBx, lightningEBy, 4);
	    c.setColor (yellow);
	    c.fillPolygon (lightningAx, lightningAy, 3);
	    c.fillPolygon (lightningBx, lightningBy, 4);

	    //if structure used to time eraser
	    if (x >= 19)
	    {
		//used to erase lightning
		for (int y = 0 ; y < 57 ; y++)
		{
		    c.setColor (skyblue);
		    c.fillRect (337, 45, 100, 10 + y);
		}
	    }

	    //used to delay the animation
	    try
	    {
		sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Lightning (Console con)
    {
	c = con;
    }


    public void run ()
    {
	lightning ();
    }
}

