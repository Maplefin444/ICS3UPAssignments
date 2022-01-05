/*
* James Huynh
* Oct 6 2021
* This program will output a graphic made of asterisks and spaces.
*/
import java.awt.*;
import hsa.Console;

public class JamesHuynh6B
{
    static Console c;
    public JamesHuynh6B(){
	c = new Console("Special Drawing");
    }
    public void output(){
	for(int i = 0; i < 24; i++){
	    c.print("",i+3);
	    c.print("*",2);
	    c.print("*",2);
	    c.print("*",2);
	    c.print("*",2);
	    c.println("*",2);
	}
	c.print("",69);
	c.print("James Huynh");
    }
    public static void main (String[] args)
    {
	JamesHuynh6B g = new JamesHuynh6B();
	g.output();
    }
}
