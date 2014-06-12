import java.awt.*;
import java.applet.*;
import java.awt.event.*;

//<applet code="EyeApplet" width=900 height=750></applet>
public class EyeApplet extends Applet implements MouseMotionListener
{	
	int x,y,xold,yold;
	public void init()
	{
		x=0;
		y=0;
		xold=0;yold=0;
		addMouseMotionListener(this);
		setBackground(Color.white);
	}
	public void mouseMoved(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		showStatus("Mouse is at "+x+" , "+y);
		repaint();
		
	}
	public void mouseDragged(MouseEvent e)
	{
	}
	synchronized public void paint(Graphics g)
	{
		setForeground(Color.black);
		g.drawOval(500,212,400,400);
		if(x>502&&x<897&&y>214&&y<600)
		g.fillOval(643,355,100,100);
		else if(x<507&&xold<507)
		{
			if(y<17)
			g.fillOval(543+((x-xold)/3),255-((y+yold)/3),100,100);
			else
			g.fillOval(543+((x-xold)/3),255+((y+yold)/3),100,100);
		}
		else
		{
			if(y<17)
			g.fillOval(297-((xold-x)/3),255-((y+yold)/3),100,100);
			else
			g.fillOval(297-((xold-x)/3),255+((y+yold)/3),100,100);
		}
	}
}