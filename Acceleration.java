public class Acceleration
	{
		public double accelerationX;
		public double accelerationY;
		public Acceleration()
		{
		}
		public Acceleration(double x,double y)
		{	
			accelerationX=x;
			accelerationY=y;
		}
		public void setAcclerationVector(double x,double y)
		{	
			accelerationX=x;
			accelerationY=y;
		}
		public Acceleration getAccelerationVector()
		{
			Acceleration ob=new Acceleration();
			ob.accelerationX=accelerationX;
			ob.accelerationY=accelerationY;
			return(ob);
		}
	}