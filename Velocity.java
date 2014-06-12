class Velocity
{
	double velocityX;
	double velocityY;
	public Velocity()
	{
	}
	public Velocity(double x,double y)
	{
		velocityX=x;
		velocityY=y;
	}
	public void setVelocityVector(double x,double y)
	{
		velocityX=x;
		velocityY=y;
	}
	public Velocity getVelcityVector()
	{
		Velocity ob=new Velocity();
		ob.velocityX=this.velocityX;
		ob.velocityY=this.velocityY;
		return(ob);
	}
}