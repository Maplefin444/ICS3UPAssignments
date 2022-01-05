import hsa.Console;

/**
* This program draws a diamond and paralllogram using print and println statements.
* Assignment Name: String Output in the Console Class
* @author James Huynh
* Date: Sept 21, 2021
*/

public class MainClass{
    Console c;
    public MainClass(){
	c = new Console();
    }
    public void design_title(){
	c.print("\n\n\n\n");
	c.print("",37);
	c.println("Designs");
	c.print("\n\n");
    }
    public void draw_diamond(){
	c.print("",40);
	c.println("D");
	c.print("",39);
	c.println("III");
	c.print("",38);
	c.println("AAAAA");
	c.print("",37);
	c.println("MMMMMMM");
	c.print("",38);
	c.println("OOOOO");
	c.print("",39);
	c.println("NNN");
	c.print("",40);
	c.println("D");
	c.print("\n");
    }
    public void draw_parallelogram(){
	c.print("",35);
	c.println("PARALLELO");
	c.print("",36);
	c.print("A");
	c.print("",7);
	c.println("G");
	c.print("",37);
	c.print("R");
	c.print("",7);
	c.println("R");
	c.print("",38);
	c.print("A");
	c.print("",7);
	c.println("A");
	c.print("",39);
	c.println("LLELOGRAM");
    }
    public static void main(String[] args){
	MainClass d = new MainClass();
	d.design_title();
	d.draw_diamond();
	d.draw_parallelogram();
    }
}
