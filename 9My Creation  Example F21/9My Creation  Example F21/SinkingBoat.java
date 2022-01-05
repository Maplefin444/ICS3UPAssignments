/*  
   Name: xxx
   Teacher: Ms. Dyke
   Date: xxxx
   This class animates a sinking boat.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class SinkingBoat implements Runnable
{
    private Console c;

    public void sinkingBoat ()
    {
	//local colour variable for sky
	Color skyblue = new Color (89, 172, 255);
	//local colour variable for ocean
	Color oceanblue = new Color (0, 116, 232);
	//local colour variable for sail
	Color sail = new Color (255, 255, 196);
	//local colour variable for boat
	Color rim = new Color (191, 112, 4);
	//local colour variable for skin
	Color skin = new Color (199, 138, 56);

	//loop used for animate the boat sinking
	for (int x = 0 ; x < 138 ; x++)
	{
	    //array of local int variables for x coordinates of sail
	    int leftsailx[] = {313, 365, 415};
	    //array of local int variables for y coordinates of sail
	    int leftsaily[] = {240 + x, 113 + x, 240 + x};
	    c.setColor (skyblue);
	    c.fillRect (235, 110, 190, 140);
	    c.setColor (sail);
	    c.fillPolygon (leftsailx, leftsaily, 3);
	    c.setColor (oceanblue); // ship bottom eraser
	    c.fillArc (313, 235 + x, 100, 30, 180, 180);
	    c.setColor (skyblue); //eraser
	    c.fillRect (314, 245 + x, 100, 5);
	    c.setColor (Color.white); //bottom of boat
	    c.fillArc (313, 235 + x, 100, 30, 180, 180);
	    c.setColor (rim);
	    c.fillRect (313, 245 + x, 100, 5);
	    //sail pole
	    c.setColor (Color.black);
	    c.fillRect (364, 117 + x, 3, 128);
	    //person
	    c.setColor (Color.red);
	    c.fillOval (307, 215 + x, 30, 8);
	    c.fillRect (313, 235 + x, 10, 10); //pants
	    c.fillRect (323, 215 + x, 12, 30); //shirt
	    c.setColor (skin); //hand
	    c.fillOval (306, 216 + x, 8, 6);
	    //the head imploded when the lightning hit

	    //fish rod
	    int fishingrodx[] = {310, 310, 270, 270};
	    int fishingrody[] = {215 + x, 220 + x, 140 + x, 135 + x};
	    c.setColor (Color.green);
	    c.fillPolygon (fishingrodx, fishingrody, 4);
	    c.setColor (oceanblue);
	    c.fillRect (235, 250, 210, 152);

	    //used to delay the animation
	    try
	    {
		Thread.sleep (100);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public SinkingBoat (Console con)
    {
	c = con;
    }


    public void run ()
    {
	sinkingBoat ();
    }
}



