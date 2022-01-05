/*
* James Huynh and Ethan Zhu
* Sept 22, 2021
* This program will ask for the cost of the items, the cash tendered, then will output the amount of change, and the amount of bills and coins to make up the change.
*/



import java.awt.*;
import hsa.Console;

public class ChangeCalc {
    static Console c;
    double price;
    double cashGiven;
    double change;
    int numOfCoins;
    public ChangeCalc(){
	c = new Console();
    }
    public void askInput(){
	c.println("Change Making Program");
	c.print("Please enter the total purchase: $");
	price = c.readDouble();
	c.print("Please enter the amount tendered: $");
	cashGiven = c.readDouble();
	change = cashGiven - price;
    }
    public void giveOutput(){
	c.print("The change will be: $");
	c.println(change,0,2);
	c.println("To make up this amount you will need:");
    }
    public void breakDownChange(){
	numOfCoins = (int) change/10; //this line figures out the amount of bills/coins that can go into the amount
	change = change - numOfCoins*10; //we subtract the amount of money in held in the bills/coins from the change
	c.println(numOfCoins + " ten-dollar bill(s)"); //we print out the amount of bills/coins
	numOfCoins = (int) change/5; //repeat all the way down to pennies
	change = change - numOfCoins*5;
	c.println(numOfCoins + " five-dollar bill(s)");
	numOfCoins = (int) change/2;
	change = change - numOfCoins*2;
	c.println(numOfCoins + " two-dollar coin(s)");
	numOfCoins = (int) change/1;
	change = change - numOfCoins*1;
	c.println(numOfCoins + " loonie(s)");
	numOfCoins = (int) (change/0.25);
	change = change - numOfCoins*0.25;
	c.println(numOfCoins + " quarter(s)");
	numOfCoins = (int) ((Math.round((change/0.10)*100))/100); //rounds the amount of coins (usually) up to make up for inaccuracy
	change = change - numOfCoins*0.10;
	c.println(numOfCoins + " dime(s)");
	numOfCoins = (int) ((Math.round((change/0.05)*100))/100); //rounds the amount of coins (usually) up to make up for inaccuracy
	change = change - numOfCoins*0.05;
	c.println(numOfCoins + " nickel(s)");
	numOfCoins = (int) ((Math.round((change/0.01)*100))/100); //rounds the amount of coins (usually) up to make up for inaccuracy
	change = change - numOfCoins*0.01;
	c.println(numOfCoins + " penny/pennies");
    }
    public void endingText(){
	c.println("Thank you for using the Change Making Program");
    }
    public static void main (String[] args) {
	ChangeCalc g = new ChangeCalc();
	g.askInput();
	g.giveOutput();
	g.breakDownChange();
	g.endingText();
    }
}
