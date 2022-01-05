// The "Test2" class.
import java.awt.*;
import hsa.Console;

public class EarlyAnim {
    public static void main(String args[]) throws InterruptedException {
	int x = 10;
	int y = 50;
	boolean xDirection = true;
	boolean yDirection = false;
	Console c = new Console();
	while(true){
	    if(x>=590){
		xDirection = false;
	    }
	    else if(x<=0){
		xDirection = true;
	    }
	    if(y>=590){
		yDirection = true;
	    }
	    else if(y<=0){
		yDirection = false;
	    }
	    if(xDirection == true){
		x+=1;
	    }
	    else if(xDirection == false){
		x+=1;
	    }
	    if(yDirection == true){
		y+=1;
	    }
	    else if(yDirection == false){
		y-=1;
	    }
	    c.clear();
	    c.fillRect(x,y,50,50);
	    Thread.sleep(5);
	}
    }
}
