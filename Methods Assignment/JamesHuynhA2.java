/*
* James Huynh
* Oct 8, 2021
* This program contains a method that will print a rectangle of the desired height and width given the letter to write it.
*/

import java.awt.*;
import hsa.Console;

public class JamesHuynhA2
{
    static Console a; //changed name to a to not have it interfere with char c
    static char symbol;
    static int width;
    static int height;
    public JamesHuynhA2(){
	a = new Console();
    }
    public void printRect(char c,int width,int height){
	for(int i =0;i < height;i++){ //repeats for each row
	    for(int j = 0;j < width;j++){ //repeats for each column
		a.print(c); //prints the symbol
	    }
	    a.println(); //skips to next row
	}
    }
    public void getInput(){
	a.print("Enter the character you want to make your rectangle out of: ");
	symbol = a.readChar();
	a.print("Enter the width of the rectangle: ");
	width = a.readInt();
	a.print("Enter the length of the rectangle: ");
	height = a.readInt();
	a.println();
    }
    public static void main (String[] args)
    {
	JamesHuynhA2 g = new JamesHuynhA2();
	g.getInput();
	g.printRect(symbol,width,height); //since it's static, doesn't need to act on an object
    }
}
