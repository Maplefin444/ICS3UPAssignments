/*
   Name: xxx
   Teacher: Ms. Dyke
   Date: xxxx
   Assignment: Simple thread example.  MyCreation.java runs the other classes.
   DO NOT put any draw cmds etc in this file!!!
   NOTE:  each class should be organized into several methods
   which are then executed by the run() method
   The MovingCloud2 class demonstrates an OVERLOADED constructor which enables the programmer to create only 1 class but
   alter it in many ways.

*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;           // The output console
    
    //adds the Background thread to MyCreation
    public void background ()
    {
	//not a thread because it's not animated!!!
	Background b = new Background (c);
    }



    //adds the MovingCloud2 thread to MyCreation
    public void movingCloud ()
    {
	//creates the cloud thread
	//comment out 2 of the 3 instances to see how the overloads work
      MovingCloud2 h1 = new MovingCloud2 (c);
	//starts the thread
	h1.start ();
	MovingCloud2 h2 = new MovingCloud2 (c, Color.green);
	//starts the thread
	h2.start ();
	MovingCloud2 h3= new MovingCloud2 (c, Color.red, 200);
	//starts the thread
	h3.start ();
    }





    //adds the Lightning thread to MyCreation
    public void lightning ()
    {
	//creates the thread
	Lightning j = new Lightning (c);
	//starts the thread
	j.start ();

	//joins with SinkingBoat thread so that it only executes when lightning thread is done
	try
	{
	    j.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the SinkingBoat thread to MyCreation
    public void sinkingBoat ()
    {
	//creates the thread
	SinkingBoat i = new SinkingBoat (c);
	//starts the thread
	i.run ();
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Fishing in a Storm");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background ();
	z.movingCloud ();
	z.lightning ();
	z.sinkingBoat ();
    }
} // MyCreation class


