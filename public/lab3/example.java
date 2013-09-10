//simple example program
//written by Vincent Ford

//imports

import java.awt.*;
import java.applet.*;

public class example extends Applet
{

	public void init()
	{
		setBackground(Color.red);
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawLine(0,0,100,100);
		g.setColor(Color.blue);
		g.drawLine(0,100,100,0);
	}

}
