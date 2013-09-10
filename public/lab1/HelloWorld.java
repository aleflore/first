// sample program called HelloWorld
	// written by AD LeFlore
	// date: 01/27/2009
	// assignment number: 1 
	// Description of Program: This program prints the words hello
	// world out to the screen when it is
	// displayed on a web page

	// import statements
	import java.applet.*;
	import java.awt.*;

	//Main section of Program
	public class HelloWorld extends Applet
	{

		//paint method is used to paint the screen with the Hello World string
        		public void paint(Graphics g)
        		{
                		g.drawString("Hello World",25,25);
        		}

	}
	//end of program
