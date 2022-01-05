/*
* James Huynh
* Dec 3 2021
* Ms. Krasteva ICS3UP
* Exercise 19 Part 2
* This program takes dataIn.txt and prints it backwards to dataOut.txt.
*/
import java.awt.*;
import hsa.Console;
import java.io.*;

public class Ex19_P2
{
    Console c;           // The output console
    final int STRINGS = 5;
    String[] inputs = new String [5];
    public Ex19_P2(){
    }
    public void readInput () throws IOException
    {
	BufferedReader input = new BufferedReader (new FileReader ("dataIn.txt"));
	for (int i = STRINGS-1 ; i >= 0 ; i--)
	{
	    inputs [i] = input.readLine ();
	}
	input.close();
    }


    public void writeInput () throws IOException
    {
	PrintWriter output = new PrintWriter (new FileWriter ("dataOut.txt"));
	for (int i = 0 ; i < STRINGS ; i++)
	{
	    output.println (inputs [i]);
	}
	output.close();
    }


    public static void main (String[] args) throws IOException
    {
	Ex19_P2 g = new Ex19_P2();
	g.readInput();
	g.writeInput();
    } // main method
} // Ex19_P2 class
