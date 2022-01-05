// The "CheckSum" class.
import java.awt.*;
import hsa.Console;

public class CheckSum
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	long input = c.readLong ();
	long sum = 0;
	for (int i = 0 ; i < 6 ; i++)
	{
	    long tempNum = 0;
	    if (i % 2 == 0)
	    {
		tempNum = (input % 10) * 2;
		sum += tempNum % 10;
		tempNum /= 10;
		sum += tempNum % 10;
	    }
	    else
	    {
		sum += input % 10;
	    }
	    input /= 10;
	}
	c.println(10-((sum+10)%10));
	// Place your program here.  'c' is the output console
    } // main method
} // CheckSum class
