/*
* James Huynh and Pradyumn Jha
* Ms. Krasteva
* My Creation Assignment ICS3U
* This program will not contain any draw methods, but rather will instance the classes in the other programs. It will run the My Creation Assignment
* Nov. 5 2021

The title of the story is "Fish Tale". It begins with a crab walking by the screen, while bubbles appear on the left from a boat.
It is a peaceful day, until a school of fish quickly swim through the screen, being chased by a shark.
They continue this chase, and a turtle's peaceful day is interrupted by them.
Eventually, a fish gets tired and is caught by the shark, where it pleads for mercy from the shark.
The shark asks why they think it's going to eat them, and that it's a stereotype.
The fish apologizes and invites the shark to join their secret society, and they swim off screen.
This is where the story ends, for now...

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
d                        Dialogue            This writes the dialogue, it is here so that I don't have to make a new object for each piece of dialogue.
*/
import java.awt.*;
import hsa.Console;

public class MyCreation
{
    Console c;           // The output console
    static Dialogue d;
    
    public MyCreation(){ //Constructor, creates a new Dialogue object.
	c = new Console("Fish Tale - My Creation - James and Pradyumn");
	d = new Dialogue(c);
    }
    
    public void intro(){
	IntroScreen in = new IntroScreen(c);
	in.finalDisplay();
    }
    
    public void schoolFish1(){ //Overloaded thread, draws the school of fish on background 1
	FishSchool f1 = new FishSchool (c,16);
	f1.start();
	FishSchool f2 = new FishSchool (c,18, true);
	f2.start();
	FishSchool f3 = new FishSchool (c, 15,1);
	f3.start();
    }
    
    public void schoolFish2(){ //Overloaded thread, draws the school of fish on background 2
	FishSchool f1 = new FishSchool (c,6);
	f1.start();
	FishSchool f2 = new FishSchool (c,5, true);
	f2.start();
	FishSchool f3 = new FishSchool (c, 7,1);
	f3.start();
    }
    
    public void slowFish1(){ //Draws the slow fish on background 1
	SlowFish sf1 = new SlowFish(c);
	sf1.start();
	try{
	    sf1.join();
	}
	catch(InterruptedException e){
	}
    }
    
    public void slowFish2(){ //Draws the slow fish on background 2 at the beginning
	SlowFish sf2 = new SlowFish(c, 1);
	sf2.start();
	try{
	    sf2.join();
	}
	catch(InterruptedException e){
	}
    }
    
    public void slowFish3(){ //Draws the slow fish on background 2 at the end
	SlowFish sf3 = new SlowFish(c, true);
	sf3.start();
	try{
	    sf3.join();
	}
	catch(InterruptedException e){
	}
    }
    
    public void drawBG1(){ //Draws the first background
	BackgroundOne bg1 = new BackgroundOne(c);
    }
    
    public void drawBG2(){ //Draws the second background
	BackgroundTwo bg2 = new BackgroundTwo(c);
    }
    
    public void shark1(){//Draws the shark on background 1
	Shark s1 = new Shark(c);
	s1.start();
	try{
	    s1.join();
	}
	catch(InterruptedException e){
	}
    }
    
    public void shark2(){ //Draws the slow fish on background 2 at the beginning
	Shark s2 = new Shark(c,1);
	s2.start();
	try{
	    s2.join();
	}
	catch(InterruptedException e){
	}
    }
    
    public void shark3(){ //Draws the slow fish on background 2 at the end
	Shark s3 = new Shark(c,true);
	s3.start();
	try{
	    s3.join();
	}
	catch(InterruptedException e){
	}
    }
    
    public void crabThread(){ //Runnable, Draws the crab on background 1
	Crab f = new Crab(c);
	Thread t1 = new Thread(f);
	t1.start();
    }
    
    public void bubbles(){ //Draws the bubbles on background 1
	Bubbles l = new Bubbles(c);
	l.start();
	try{
	    l.join();
	}
	catch(InterruptedException e){
	}
    }
    
    public void turtle(){ //Thread, draws the turtle on background 2
	Turtle t = new Turtle(c);
	t.start();
    }
    
    public static void main (String[] args) //This is where everything is called
    {
	MyCreation g = new MyCreation();
	g.intro();
	g.drawBG1();
	g.crabThread();
	g.bubbles();
	d.crabDia1();
	g.schoolFish1();
	d.swimDia();
	g.slowFish1();
	d.crabDia2();
	g.shark1();
	g.drawBG2();
	g.turtle();
	d.turtleDia();
	g.schoolFish2();
	d.swimDia();
	g.slowFish2();
	g.shark2();
	d.scaredDia();
	d.sharkDia1();
	d.sharkDia2();
	d.fishDia1();
	d.fishDia2();
	d.sharkDia3();
	g.slowFish3();
	g.shark3();
	d.end();
	// Place your program here.  'c' is the output console
    } // main method
} // MyCreation class
