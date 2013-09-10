import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.util.*;
import java.util.Random;

public class HiddenSquares extends Applet implements ActionListener, MouseListener
{
int x, y, boxChosen, thisBox;
int intBoxX =50;
int intBoxY = 50;
int width = 100;
int height = 100;
Box boxChoice, box1, box2;
Graphics g;
Box boxes[][] = new Box[4][4];

//this adds the button
	public void init()
	{
	Button myButton = new Button("New Game");
	this.add(myButton);
	myButton.addActionListener(this);
	addMouseListener(this);
	setBackground(Color.white);
	setNewGame();
	}

//this makes a grid of 4x4 boxes
	public void setNewGame()
	{
	Color colorArray[] = {Color.red,Color.blue,Color.cyan, Color.green, Color.magenta,Color.pink,Color.orange, Color.yellow};
	int chosenColors[] = {0,0,0,0,0,0,0,0};
		for(int col = 0; col <= 3; col++)
		{
		int localX = intBoxX + col * width;
			for(int row = 0; row <= 3; row++)
			{
			int localY = intBoxY + row * height;
			int rint = (int)(Math.random() * 8);
				while(chosenColors[rint] >= 2)
				{
				rint = (int)(Math.random() * 8);
				}
			chosenColors[rint] = chosenColors[rint] + 1;
			boxes[row][col] = new Box (localX, localY, height, width, colorArray[rint]);
			}}
		repaint();
	}

//puts the game on screen
	public void paint(Graphics g)
	{
	displayGame(g);
	}

//setup the rows and columns of the boxes
	public void displayGame(Graphics g)
	{	
		for(int i = 0; i <= 3; i++)
		{	
		for(int j = 0; j <= 3; j++)
		{
		boxes[i][j].display(g);
		}}	
	}

//where the game is played at
	public void playGame(Box boxChosen)
	{
		if(thisBox == 0)
		{
		thisBox = 1;
		box1 = boxChosen;
		} 
		else if(thisBox == 1)
		{
		thisBox = 2;
		box2 = boxChosen;
		} 
		else if(box1.boxColor == box2.boxColor)
		{
		box1 = boxChosen;
		thisBox = 1;
		}else
		{
		box1.picked();
		box2.picked();
		box1 = boxChosen;
		thisBox = 1;
		}
	  }
	
//reset the game  
	public void actionPerformed(ActionEvent e)
	{
	setNewGame();
	}
	
	public void mouseClicked(MouseEvent e)
	{	
	}
	
	public void mouseEntered(MouseEvent e)
	{
	}
	
	public void mouseExited(MouseEvent e)
	{
	}
	
	public void mousePressed(MouseEvent e)
	{
	}
	
//tells the box boxChoice what to do when something happens
	public void mouseReleased(MouseEvent e)
	{
	x = e.getX();
	y = e.getY();	
	int rowSub = (y - intBoxY)/height;
	int colSub = (x - intBoxX)/width;
	boxChoice=boxes[rowSub][colSub];
	boxChoice.picked();
	playGame(boxChoice);
	repaint();	
	}

//will send the boxChosen to playGame
	public void setBox(int thisBox)
	{
	boxChosen = thisBox;
	}
}

class Box
{
int x,y,height,width;
Color boxColor;
Graphics g;
boolean showColor = false;

//defines a box
	public Box(int X1, int Y1,int h, int w, Color myColor)
	{
	x = X1;
	y = Y1;
	height = h;
	width = w;
	boxColor = myColor;
	}

//shows what to display and sets up the grid	
	public void display(Graphics graph)
	{
	g = graph;
		if(showColor == false)
		{
		g.setColor(Color.gray);
		g.fillRect(x,y,height,width);
		}
		else
		{
		g.setColor(boxColor);
		g.fillRect(x,y,height,width);
		}
		for(int intBoxX = 50; intBoxX <= 400; intBoxX += 100)
		{
		for(int intBoxY = 50; intBoxY <= 400; intBoxY += 100)
		{
		g.setColor(Color.black);
		g.drawRect((intBoxX-1),(intBoxY-1),(width+1),(height+1));
		}}	

	}
	
//shows what happens when a box is picked
	public void picked()
	{	
	showColor = !showColor;
	}	
}