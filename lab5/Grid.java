//Gigi Blake
//Lab 5
//4x4 Grid
/* This program draws a 4x4 Grid with 13 colors each used at least once
*/
/* this imports every lab we could possibly need*/
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
/*the Grid class*/
public class Grid extends Applet
{
	
	
	public void init()
	{
		System.out.println("begin init method");
		System.out.println("end init method");
	}
	
	//this method will do the bulk of the painting
	public void paint(Graphics g)
	{
	System.out.println("begin paint");
		
		//these are my instance variables
		
		//draws the grid with a black outline
		drawGrid(g,0,0,99,99);
		drawGrid(g,0,0,100,100);
		drawGrid(g,0,0,101,101);
		drawGrid(g,0,0,199,199);
		drawGrid(g,0,0,201,201);
		drawGrid(g,0,0,301,301);
		drawGrid(g,0,0,401,401);
		
		//these rows fill in where the rectangles left off
		drawRow(g,0,1,400,1);
		drawRow(g,0,2,400,2);
		drawRow(g,0,0,0,399);
		drawRow(g,1,0,1,400);
		drawRow(g,2,0,2,400);
		drawRow(g,99,99,99,399);
		drawRow(g,99,99,399,99);
		drawRow(g,100,100,400,100);
		drawRow(g,100,100,100,399);
		drawRow(g,101,101,401,101);
		drawRow(g,101,101,101,400);
		drawRow(g,0,201,400,201);
		drawRow(g,199,199,399,200);
		drawRow(g,200,200,199,99);
		drawRow(g,200,200,399,199);
		drawRow(g,200,200,400,200);
		drawRow(g,201,201,400,200);
		drawRow(g,200,0,199,400);
		drawRow(g,200,0,200,400);
		drawRow(g,200,0,201,400);
		drawRow(g,299,0,299,400);
		drawRow(g,300,0,300,400);
		drawRow(g,301,0,301,400);
		drawRow(g,0,299,400,299);
		drawRow(g,0,300,400,300);
		drawRow(g,0,301,400,301);
		
		//so the grid is black
		outlineColor(g,Color.black);
		
		//fills the squares individually
		g.setColor(Color.black);
		g.fillRect(0,0,99,99);
		g.setColor(Color.magenta);
		g.fillRect(200,300,100,100);
		g.setColor(Color.cyan);
		g.fillRect(100,300,100,100);
		g.setColor(Color.black);			
		g.fillRect(300,300,100,100);
		g.setColor(Color.magenta);
		g.fillRect(100,0,100,100);
		g.setColor(Color.cyan);
		g.fillRect(200,0,100,100);
		g.setColor(Color.blue);
		g.fillRect(300,0,100,100);
		g.setColor(Color.red);
		g.fillRect(0,99,99,100);
		g.setColor(Color.yellow);
		g.fillRect(100,100,99,100);
		g.setColor(Color.gray);
		g.fillRect(200,100,99,100);
		g.setColor(Color.green);
		g.fillRect(300,100,99,100);
		g.setColor(Color.orange);
		g.fillRect(0,200,100,100);
		g.setColor(Color.pink);
		g.fillRect(100,200,100,100);
		g.setColor(Color.darkGray);
		g.fillRect(200,200,100,100);
		g.setColor(Color.white);
		g.fillRect(300,200,100,100);
		g.setColor(Color.lightGray);
		g.fillRect(0,300,100,100);


	

		System.out.println("end paint");
	}
	
	
	//My methods
	//this is to draw the 4 different rectangles 
	private void drawGrid(Graphics g, int X, int Y, int X2, int Y2)
	{ g.drawRect(X , Y, X2 , Y2 );	}
	
	//this is to fill in the lines where the rectangles didnt 
	private void drawRow(Graphics g, int X, int Y, int X2, int Y2)
	{	g.drawLine(X, Y, X2, Y2);		}
	
	//makes the outline of the grid black
	private void outlineColor(Graphics g, Color c)
	{	g.setColor(Color.black);		}
}