import java.awt.Point;
import java.lang.Math;
public class MyPhysicsLibrary
{
	public static double Distance(Point p1,Point p2)
	{
		return(Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2)));
	}
	public static double Distance(int x1,int y1,int x2,int y2)
	{
		return(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));
	}
	public static int positionAfterTimeinX(int x,double acc,double vel,int time)
	{		
		return (int)(x+((vel*time)+(0.5*acc*Math.pow(time,2))));
	}
	public static int positionAfterTimeinY(int y,double acc,double vel,int time)
	{		
		return (int)(y+((vel*time)+(0.5*acc*Math.pow(time,2))));
	}
	public static Point positionAfterTime(Point p,double acc,double vel,int time)
	{	
		Point result=new Point();
		result.x=positionAfterTimeinX(p.x,acc,vel,time);
		result.y=positionAfterTimeinY(p.y,acc,vel,time);
		return result;
	}
	public static Point positionAfterTime(Point p,Acceleration acc,Velocity vel,int time)
	{
		Point result=new Point();
		result.x=positionAfterTimeinX(p.x,acc.accelerationX,vel.velocityX,time);
		result.y=positionAfterTimeinY(p.y,acc.accelerationY,vel.velocityY,time);
		return result;
	}
}