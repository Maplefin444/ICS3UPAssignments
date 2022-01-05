/*
* Oct 19, 2021
* James Huynh
* Ms. Krasteva
* Assignment 8 ICS3UP
* This program will ask for a symbol from the user and draw a special design using the symbol given.

Variable Name     Type     Purpose/Description

symbol            char      This variable holds the symbol inputted by the user, which the symbol will be made of.
c             ConsoleClass  This variable is an object for the HSA console to display text.
*/
import java.awt.*;
import hsa.Console;

public class ForLoops2
{
    static Console c; //Declares the console variable
    char symbol; //Declares the symbol variable
    
    public ForLoops2(){ //Constructor for the ForLoops2 class
	c = new Console ("Eld Sigul");
    }

    private void title(){ //Private method to draw the title, will be run in intro() method
	c.print("",32);
	c.println("The Design Machine");
	c.println();
    }
    
    public void intro(){ //Public method to draw the title and intro (brief summary), will run the title() method
	title();
	c.print("",22);
	c.println("Given a symbol, I, your robot overlord,");
	c.print("",16);
	c.println("will draw my special design (an eld sigul) with it.");
    }
    
    public void askData(){ //Public method for the user to input data
	c.print("",23);
	c.print("Enter your symbol or perish, human: ");
	symbol = c.readChar();
	c.clear();
    }
    
    public void display(){ //Public method that will hold all of the hard-coded output() statements.
	output(63,10,true);
	output(61,13,true);
	output(11,13);
	output(34,17,true);
	output(9,20);
	output(38,10,true);
	output(7,26);
	output(35,9,true);
	output(6,31);
	output(31,10,true);
	output(5,35);
	output(29,8,true);
	output(4,13);
	output(10,20);
	output(21,8,true);
	output(3,12);
	output(17,20);
	output(14,9,true);
	output(2,11);
	output(22,23);
	output(5,11,true);
	output(0,13);
	output(15,2);
	output(10,33,true);
	output(0,13);
	output(15,2);
	output(10,33,true);
	output(0,13);
	output(14,6);
	output(9,29,true);
	output(0,13);
	output(14,6);
	output(9,28,true);
	output(0,13);
	output(14,7);
	output(6,10);
	output(3,19,true);
	output(1,13);
	output(14,22);
	output(5,18,true);
	output(2,13);
	output(14,14);
	output(2,6);
	output(8,15,true);
	output(3,13);
	output(14,11);
	output(5,6);
	output(8,14,true);
	output(5,14);
	output(29,7);
	output(8,12,true);
	output(7,22);
	output(21,8);
	output(7,11,true);
	output(9,21);
	output(20,9);
	output(6,12,true);
	output(11,19);
	output(22,26,true);
	output(13,17);
	output(24,24,true);
	output(15,14);
	output(29,20,true);
    }
    /*
	This is a private method that will print out the symbol based on the amount of characters and spaces provided. It does not go to the next line.
	It contains a loop that will set the amount of chars.
	
	Variable Name     Type   Description
	
	spaces            int    This will be the amount of spaces before the characters printed.
	chars             int    This will be the amount of characters after the spaces.
	i                 int    This variable is used to control the loop.
    */
    private void output(int spaces, int chars){
	c.print("",spaces);
	for(int i = 0;i<=chars;i++){
	    c.print(symbol);
	}
    }
    
    /*
	This is a private overloaded method that will print out the symbol based on the amount of characters and spaces provided. It does go to the next line.
	It uses the other output method, but moves down a line after.
	
	Variable Name   Type     Description
	
	spaces          int      This will be the amount of spaces before the characters printed.
	chars           int      This will be the amount of characters after the spaces.
	yesNo           boolean  This will identify that you are using this second method rather than the first method.
    */
    private void output(int spaces, int chars, boolean yesNo){
	output(spaces,chars);
	c.println();
    }
    
    public static void main (String[] args) //The main method. The methods run in here are intro(), askData(), and display()
    {
	ForLoops2 g = new ForLoops2(); //Variable g to represent an instanced object of the class ForLoops2
	g.intro();
	g.askData();
	g.display();
    } // main method
} // ForLoops2 class
