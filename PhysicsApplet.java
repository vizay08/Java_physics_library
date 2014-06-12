import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.lang.Math;
import java.lang.Thread;
//<applet code="PhysicsApplet" width=750 height=750></applet>
public class PhysicsApplet extends Applet implements MouseListener,MouseMotionListener
{
	private final double PI=22/7;
	static Point pnew,pold;
	int x,y;
	int i;
	int angle;
	Acceleration acc;
	Velocity vel;
	boolean entered;
	public void init()
	{
		
		angle=180;
		acc=new Acceleration(0,0.1);
		vel=new Velocity(1.0*Math.sin(angle*PI/180),-1.0*Math.cos(angle*PI/180));
		pold=new Point();
		pnew=new Point();
		pold.x=100;
		pold.y=300;

		i=0;
		entered=false;
		x=10;
		y=10;
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.white);
		setForeground(Color.gray);
	}
	public void mouseEntered(MouseEvent e)
	{
		
		entered=true;
		//repaint();
	}
	public void mouseExited(MouseEvent e)
	{
		
		entered=false;
	//	repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		
	//	repaint();
	}
	public void mousePressed(MouseEvent e)
	{
	}
	public void mouseReleased(MouseEvent e)
	{
	}
	public void mouseMoved(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		//repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
	//	repaint();
	}
	public void paint(Graphics g)
	{
		int j=0;
		setForeground(Color.black);
		try{
		
		g.fillOval(pold.x,pold.y,100,100);
		
		pnew=MyPhysicsLibrary.positionAfterTime(pold,acc,vel,i);
		pold=pnew;
		i++;
		j++;
		Thread.sleep(10);
		repaint();
		//g.drawString(pold.x+" "+pold.y,50,50);
		}
		catch(Exception e)
		{
		}
	}
}
