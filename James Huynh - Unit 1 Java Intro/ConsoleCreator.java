import hsa.Console;

public class ConsoleCreator
{
    Console c;
    Console d;
    Console e;
    Console f;
    int input;
    
    public ConsoleCreator()
    {
	c = new Console(10,50,"Greetings!");
	d = new Console(10,50,"My Face On The First Day");
	e = new Console(10,50,"Emoji");
	f = new Console(10,75,"Shapes");
    }
    
    public void greeting_assignment()
    {
	c.println("Please enter the language to be greeted in:\nEnter 1 to be greeted in English.\nEnter 2 to be greeted in French\nEnter 3 to be greeted in Spanish");
	input = c.readInt();
	if(input == 1){
	    c.println("Hello!");
	} else if (input == 2){
	    c.println("Bonjour!");
	} else if (input == 3){
	    c.println("Hola!");
	} else{
	    c.println("That is not a choice.");
	}
    }
    
    public void face_assignment()
    {
	d.println("____________\n|          |\n| (.)  (.) |\n|          |\n| \\______/ |\n|__________|");
    }
    
    public void emoji_assignment()
    {
	e.println("    #####");
	e.println("  #########");
	e.println("##()#####()##");
	e.println("#############");
	e.println("##^^^^^^^^^##");
	e.println("  ##     ##");
	e.println("    #####");
    }
    
    public void shapes_assignment()
    {
	f.println("#########     #############       ##########           ##");
	f.println("###########    ###########       ##########         ########");
	f.println("############    #########       ##########       ##############");
	f.println("############     #######       ##########     ####################");
	f.println("############      #####       ##########         ##############");
	f.println("###########        ###       ##########             ########");
	f.println("#########           #       ##########                 ##");
    }
    
    public static void main(String[] args){
	ConsoleCreator g = new ConsoleCreator();
	g.face_assignment();
	g.emoji_assignment();
	g.shapes_assignment();
	g.greeting_assignment();
    }
}
