/*
* James Huynh
* Oct 8 2021
* This program will roll 2 die then output the results of each die, along with the sum of the numbers.
*/
import java.awt.*;
import hsa.Console;

public class JamesHuynhA1
{
    static Console c;
    public JamesHuynhA1(){
	c = new Console();
    }
    public void rollDice(){
	int dice1; //create integers to hold the results
	int dice2;
	dice1 = (int) (6*Math.random()+1); //randomizes from 6 to 1 (both inclusive)
	dice2 = (int) (6*Math.random()+1);
	c.print(dice1 + " and " + dice2 + " - a total of " + (dice1+dice2)); //output
    }
    public static void main (String[] args)
    {
	JamesHuynhA1 g = new JamesHuynhA1();
	g.rollDice();
    }
}
