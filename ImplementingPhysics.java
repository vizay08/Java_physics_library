import java.awt.Point;
class ImplementingPhysics
{
	public static void main(String args[])
	{
	int i=0;
	Point pold,pnew;
	pold=new Point();
	pnew=new Point();
	pold.x=100;
	pold.y=400;
		for(int j=0;j<10;i++,j++)
		{
			pnew=MyPhysicsLibrary.positionAfterTime(pold,2.3,5,i);
			pold=pnew;
			System.out.println(pold.x+" "+pold.y);
		}
	}
}
		