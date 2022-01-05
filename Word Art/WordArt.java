/*
* James Huynh and Pradyumn Jha
* Oct 20 2021
* Ms. Krasteva ICS3UP
* Graphics Assignment
* This program will create a word art that is animated. Our theme is Math.

Variable Name       Type        Description

c                ConsoleClass   This is the variable used to represent the console I will be drawing in.
mathBlue            Color       This variable stores the colour that I associate with math.
chalkboardGreen     Color       This variable stores the colour of the chalkboard.
chalkboardWood      Color       This variable stores the colour of the frame of the chalkboard.
catColor            Color       This variable stores the colour of the wall in the background.
catA
*/
import java.awt.*;
import hsa.Console;

public class WordArt
{
    static Console c;           // The output console
    Color mathBlue = new Color (41, 160, 204);
    Color chalkboardGreen = new Color (77, 120, 82);
    Color chalkboardWood = new Color (145, 116, 81);
    Color catColor = new Color (240, 229, 24);
    Color catSnout = new Color (191, 153, 78);

    public WordArt ()
    { //Constructor for the WordArt class
	c = new Console ("Math Word Art");
    }


    public void background ()
    { //This public method will write out the background of the word art.
	c.setColor (chalkboardGreen);
	c.fillRect (50, 50, 560, 420);
	c.setColor (chalkboardWood);
	c.fillRect (40, 50, 580, 10);
	c.fillRect (40, 60, 10, 420);
	c.fillRect (610, 60, 10, 420);
	c.fillRect (40, 470, 580, 10);
    }


    public void words ()
    { //This public method will write out the words in my word art.
	c.setColor (new Color (229, 213, 237));
	c.setFont (new Font ("Calibri", Font.BOLD, 75));
	c.drawString ("MATH", 225, 275);
	c.setFont (new Font ("Calibri", Font.BOLD, 25));
	c.drawString ("Division", 300, 200);
	c.drawString ("Multiplication", 350, 100);
	c.drawString ("Addition", 400, 400);
	c.drawString ("Subtraction", 150, 150);
	c.setColor (new Color (233, 101, 143));
	c.drawString ("Quadratics", 350, 350);
	c.drawString ("Lines", 400, 150);
	c.drawString ("Equations", 200, 450);
	c.drawString ("Ruler", 75,100);
	c.setColor (new Color (152, 188, 118));
	c.drawString ("Education", 100, 400);
	c.drawString ("School", 150, 225);
	c.drawString ("Protractor", 500,360);
	c.drawString ("Measure",500,200);

    }
    
    public void decoration(){ //This public method will draw the decorations on the word art.
	c.setColor(new Color (229, 213, 237));
	c.fillOval(150,300,25,25);
	c.fillOval(150,250,25,25);
	c.fillRect(125,283,75,10);
	c.drawArc(500,125,50,200,180,180);
	c.drawLine(525,210,525,340);
	c.drawLine(500,325,550,325);
    }
    
    /*
    Loop: It is used to repeat the animation of the cat and move it by 1 pixel each time.
    */
    public void animateCat ()
    {
	for (int i = -150 ; i <= 350 ; i++)
	{
	    eraseCat (i);
	    background ();
	    cat (i);
	    sleep (3);
	}
    }


    public void introScreen ()
    { //This public method will ask you to press any button to start the animation
	c.drawString ("Press any key to start the magic math cat.", 225, 250);
	c.getChar ();
    }

    /*
    This private method will draw the cat to create the word art. The input is an integer i, which will control where it's drawn. It is intended to be used in animateCat().
    
    Variable Name     Type     Description
    
    i                 int      The variable adjusts where the cat is drawn.
    */
    private void cat (int i)
    {
	c.setColor (catColor);
	c.drawStar (160+i,85+i,10,10);
	c.fillRect (100 + i, 100 + i, 58, 25);
	c.fillRect (80 + i, 90 + i, 30, 20);
	c.fillRect (95 + i, 85 + i, 10, 5);
	c.fillRect (110 + i, 125 + i, 7, 10);
	c.fillRect (145 + i, 125 + i, 7, 10);
	c.fillRect (158 + i, 105 + i, 25, 7);
	c.fillRect (176 + i, 95 + i, 7, 10);
	c.setColor (new Color (191, 153, 78));
	c.fillRect (75 + i, 100 + i, 5, 10);
	c.setColor (new Color (102, 0, 0));
	c.fillRect (176 + i, 87 + i, 7, 8);
	c.setColor (new Color (0, 145, 15));
	c.fillRect (80 + i, 93 + i, 7, 7);
	c.setColor (new Color (255, 255, 255));
	c.fillRect (87 + i, 93 + i, 7, 7);
    }

    /*
    This private method is an eraser shape that will erase the cat, it takes an integer i, which should be the same as the integer i inputted into cat(). It is intended to be used in animateCat().
    
    Variable Name     Type     Description
    
    i                 int      The variable adjusts where the eraser shape for the cat is drawn.
    */
    private void eraseCat (int i)
    {
	c.setColor (new Color (255, 255, 255));
	c.fillRect (74 + i, 84 + i, 109, 51);
    }

    /*
    This private method is a shortened version of the try and catch.
    
    Variable Name     Type     Description
    
    sleepTime         int      The sleepTime adjusts how long is slept in milliseconds.
    */
    private void sleep (int sleepTime)
    {
	try
	{
	    Thread.sleep (sleepTime);
	}
	catch (Exception e)
	{
	}
    }


    public static void main (String[] args)  //Main method, public methods are introScreen(), background(), animateCat(), words(), and decoration().
    {
	WordArt g = new WordArt ();
	g.introScreen ();
	g.background ();
	g.animateCat ();
	g.words ();
	g.decoration();
    }
}
