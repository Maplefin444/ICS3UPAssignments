/*
* James Huynh
* Oct 6 2021
* This program uses for loops to print out numbers using a single for loop
*/
import java.awt.*;
import hsa.Console;

public class JamesHuynh6A
{
    static Console c;
    public JamesHuynh6A ()
    {
	c = new Console ("Numbers Created Using For Loop");
    }
    public void output(){
	c.print("",30);
	c.println("Outputted Numbers");
	for(int i = 1; i < 6; i++){
	    c.print(i,5); // Different operations for each row
	    c.print(i+2,8);
	    c.print(i*12,15);
	    c.print((-i)-3,15);
	    c.print(31-i,13);
	    c.print("",20); // The 9 in the example is left aligned, therefore must place spaces first
	    c.print(8+i);
	    c.println();
	}
    }

    public static void main (String[] args)
    {
	JamesHuynh6A g = new JamesHuynh6A();
	g.output();
    }
}
