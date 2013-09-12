//Program Name: Lab3
//Program Description: A template file that can be used to start an applet
//Developed By AD LeFlore
//

//import statements
import java.applet.*;
import java.awt.*;

//Lab3  

public class lab3 extends Applet
{
	public void  init()
	{
		System.out.println("begin init method");
		setBackground(Color.white);
		System.out.println("end init method");			
	}

	public void paint(Graphics g)
	{
		System.out.println("begin paint");
		//Make a new color for the since there is no brown
		Color TV = new Color(128,64,0);
		g.setColor(TV);
		g.fillRect(62,55,(62+366),(55+284));
		//makes the viewing screen of the tv blue
		g.setColor(Color.blue);
		g.fillRoundRect(71,64,(71+281),(64+262),15,15);
		//for the tv dial
		g.setColor(Color.black);
		g.fillOval(424,64,(36+30),(64+25));
		g.drawLine(156,0,185,55);
		g.drawLine(185,55,221,0);
		//this is the part of the knob too
		g.setColor(Color.gray);	
		g.fillRect(453,64,10,(64+25));
		//for a big yellow sun in the blue sky
		g.setColor(Color.yellow);
		g.fillOval(71,64,(71+281),(55+271));			
		
		System.out.println("end paint");	
	}	
}
