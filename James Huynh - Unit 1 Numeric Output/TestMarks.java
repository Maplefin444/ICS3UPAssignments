import hsa.Console;

/*
* This program writes out an organizer with marks and averages.
* Author: James Huynh
* Sept. 22 2021
*/

public class TestMarks{
    Console c;
    public TestMarks(){
	c = new Console();
    }
    public void drawTitle(){
	c.print("Student");
	c.print("", 7);
	c.print("Test 1");
	c.print("", 7);
	c.print("Test 2");
	c.print("", 7);
	c.println("Test Average");
    }
    public void displayMarks(){
	c.print("\nDonald");
	c.print("", 8);
	c.print("45");
	c.print("", 11);
	c.print("80");
	c.print("", 11);
	c.println((45.0+80)/2,0,2);
	c.print("Mickey");
	c.print("", 8);
	c.print("33");
	c.print("", 11);
	c.print("39");
	c.print("", 11);
	c.println((33.0+39)/2,0,2);
	c.print("Bugs");
	c.print("", 10);
	c.print("79");
	c.print("", 11);
	c.print("92");
	c.print("", 11);
	c.println((79.0+92)/2,0,2);
    }
    public static void main(String[] args){
	TestMarks g = new TestMarks();
	g.drawTitle();
	g.displayMarks();
    }
}
