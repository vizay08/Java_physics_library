import java.awt.event.*;
import java.awt.*;
import java.applet.*;
//<applet code="MouseFollow" width=1000 height=1000></applet>
public class MouseFollow extends Applet implements MouseMotionListener
{
	int x[][]=new int[50][2];
	int numberOfCircles;
	int dimension;
	int i;
	int px;
	int py;
	int a;
	public void init()
	{
		i=0;
		dimension=2;
		numberOfCircles=3;
		for(int j=0;j<50;j++)
			for(int k=0;k<2;k++)
				x[j][k]=0;
		setBackground(Color.gray);
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent e)
	{
		px=e.getX();
		py=e.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		px=e.getX();
		py=e.getY();
		repaint();
	}
	synchronized public void paint(Graphics g)
	{
		
		a=i%50;
		setForeground(new Color(i%255,(i+1)%255,(i+2)%255));
		x[a][0]=px;
		x[a][1]=py;
		i++;
		for(int j=0;j<50;j++)
		g.fillOval(x[j][0]+40,x[j][1]+40,20,20);
			
	}
}