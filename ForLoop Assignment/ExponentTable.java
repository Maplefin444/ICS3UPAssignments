// The "ExponentTable" class.
/*
* James Huynh
* Oct 7 2021
* This program will ask for a base, then output the result of the base to the exponents 6-17.
*/

import java.awt.*;
import hsa.Console;

public class ExponentTable
{
    static Console c;
    int base;
    public ExponentTable(){
	c = new Console ("The 6-17 Exponent Machine");
    }
    public void introOutput(){ //writes title and description
	c.setTextColor(Color.MAGENTA);
	c.print("",27);
	c.println("The 6-17 Exponent Machine\n");
	c.print("",20);
	c.println("Given a base I will calculate the result");
	c.print("",30);
	c.println("with exponents 6-17.");
    }
    public void input(){ //asks for input
	c.setTextColor(Color.RED);
	c.println();
	c.print("",25);
	c.println("Enter the base you would like:");
	c.print("",39);
	base = c.readInt();
	c.println("");
    }
    public void columnTitle(){ //creates the tile of the columns
	c.setTextColor(Color.LIGHT_GRAY);
	c.print("",14);
	c.print("Base");
	c.print("",18);
	c.print("Exponent");
	c.print("",18);
	c.println("Result");
	c.println();
	c.setTextColor(Color.BLACK);
    }
    public void baseExpoOutput(){ //does the math for the table, and outputs it
	for(int expoNum = 6;expoNum <18;expoNum++){
	    c.setTextColor(Color.RED);
	    c.print(base,17);
	    c.setTextColor(Color.BLACK);
	    c.print("",3);
	    c.print("to the power of");
	    c.setTextColor(Color.RED);
	    c.print(expoNum,6);
	    c.setTextColor(Color.BLACK);
	    c.print("",6);
	    c.print("is equal to");
	    long output = base;
	    for(int repeat = 0;repeat<expoNum-1;repeat++){ //nested for loop to calculate the exponents
		output*=base;
	    }
	    c.print("",6);
	    c.setTextColor(Color.RED);
	    c.println(output);
	}
    }
    public static void main (String[] args)
    {
	ExponentTable g = new ExponentTable();
	g.introOutput();
	g.input();
	g.columnTitle();
	g.baseExpoOutput();
    }
}
