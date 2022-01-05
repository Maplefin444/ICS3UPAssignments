/*
* Pradyumn Jha, James Huynh
* Ms. Krasteva ICS3UP
* Nov 15 2021
* My Creation
* This program will handle all of the dialogue said by the characters.

Variable Name             Type               Description
c                        Console             This is where everything will be drawn.
ocean                    Color               Stores the RGB value of the associated colour.
*/
import java.awt.*;
import hsa.Console;

public class Dialogue
{
    private Console c;           // The output console
    private Color ocean = new Color(130, 194, 237);
    
    public Dialogue(Console con){ //Constructor, accepts a console to draw in.
	c = con;
    }

    /*
    All of the public methods under here are all different variations of eachother, each having different text, position and time.
    */
    public void crabDia1(){
	c.setColor(Color.WHITE);
	c.fillRect(270,355,125,22);
	c.setColor(Color.BLACK);
	c.drawString("Today feels a bit off....",275,370);
	sleep(3000);
	c.setColor(ocean);
	c.fillRect(270,355,125,22);
    }
    
    public void crabDia2(){
	c.setColor(Color.WHITE);
	c.fillRect(270,355,125,22);
	c.setColor(Color.BLACK);
	c.drawString("Maybe that's why.",275,370);
	sleep(3000);
	c.setColor(ocean);
	c.fillRect(270,355,125,22);
    }
    
    public void swimDia(){
	c.setColor(Color.WHITE);
	c.fillRect(270,255,125,22);
	c.setColor(Color.RED);
	c.drawString("SWIM!!!!!!!",275,270);
	sleep(3000);
	c.setColor(ocean);
	c.fillRect(270,255,125,22);
    }
    
    public void turtleDia(){
	c.setColor(Color.WHITE);
	c.fillRect(270,255,130,48);
	c.setColor(Color.BLACK);
	c.drawString("A school of fish",275,270);
	c.setColor(Color.BLACK);
	c.drawString("swimming at you is never",275,282);
	c.setColor(Color.BLACK);
	c.drawString("a good thing.",275,294);
	sleep(7000);
	c.setColor(ocean);
	c.fillRect(270,255,130,48);
    }
    
    public void scaredDia(){
	c.setColor(Color.WHITE);
	c.fillRect(170,205,125,22);
	c.setColor(Color.BLACK);
	c.drawString("Please don't eat me!",175,220);
	sleep(5000);
	c.setColor(ocean);
	c.fillRect(170,205,125,22);
    }
    
    public void sharkDia1(){
	c.setColor(Color.WHITE);
	c.fillRect(270,205,125,35);
	c.setColor(Color.BLACK);
	c.drawString("Why do you think",275,220);
	c.drawString("I'm going to eat you?",275,232);
	sleep(5000);
	c.setColor(ocean);
	c.fillRect(270,205,125,35);
    }
    
    public void sharkDia2(){
	c.setColor(Color.WHITE);
	c.fillRect(270,205,135,35);
	c.setColor(Color.BLACK);
	c.drawString("That's not very nice,",275,220);
	c.drawString("those are just stereotypes.",275,232);
	sleep(5000);
	c.setColor(ocean);
	c.fillRect(270,205,135,35);
    }
    
    public void sharkDia3(){
	c.setColor(Color.WHITE);
	c.fillRect(270,205,125,22);
	c.setColor(Color.BLACK);
	c.drawString("Sure!",275,220);
	sleep(5000);
	c.setColor(ocean);
	c.fillRect(270,205,125,22);
    }
    
    public void fishDia1(){
	c.setColor(Color.WHITE);
	c.fillRect(170,205,125,22);
	c.setColor(Color.BLACK);
	c.drawString("I'm so sorry.",175,220);
	sleep(5000);
	c.setColor(ocean);
	c.fillRect(170,205,125,22);
    }
    
    public void fishDia2(){
	c.setColor(Color.WHITE);
	c.fillRect(170,205,155,47);
	c.setColor(Color.BLACK);
	c.drawString("Do you want to",175,220);
	c.drawString("join our secret anti-",175,232);
	c.drawString("stereotype society?",175,244);
	sleep(5000);
	c.setColor(ocean);
	c.fillRect(170,205,155,47);
    }
    
    public void end(){
	c.setColor(Color.WHITE);
	c.fillRect(298,220,100,50);
	c.setColor(Color.RED);
	c.drawString("THE END!",320,250);
    }
    
    private void sleep(int time){ //This private mthod is used to create a delay.
	try{
	    Thread.sleep(time);
	}
	catch(Exception e){
	}
    }

} // Dialogue class
