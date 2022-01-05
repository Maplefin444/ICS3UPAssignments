/*
* James Huynh
* Oct 8, 2021
* This program contains a method that will draw a hollow rectangle given the symbol to draw it with, and the height and length.
*/
import java.awt.*;
import hsa.Console;

public class JamesHuynhA3
{
    static Console a;
    static char symbol;
    static int width;
    static int height;
    public JamesHuynhA3(){
	a = new Console();
    }
    public void printHollowRect (char c, int width, int height) {
	for(int i = 0;i < width;i++){ //first line
	    a.print(c);
	}
	a.println();
	for(int j = 0;j < height-2;j++){ //middle rows
	    a.print(c);
	    for(int k = 0; k < width-2;k++){
		a.print(" ");
	    }
	    a.println(c);
	}
	for(int l = 0;l < width;l++){ //last line
	    a.print(c);
	}
    }
    public void getInput(){
	a.print("Enter the character you want to make your rectangle out of: ");
	symbol = a.readChar();
	a.print("Enter the width of the rectangle (DO NOT ENTER 1): ");
	width = a.readInt();
	a.print("Enter the length of the rectangle (DO NOT ENTER 1): ");
	height = a.readInt();
	a.println();
    }
    public static void main (String[] args){
	JamesHuynhA3 g = new JamesHuynhA3();
	g.getInput();
	g.printHollowRect (symbol,width,height);
    }
}
