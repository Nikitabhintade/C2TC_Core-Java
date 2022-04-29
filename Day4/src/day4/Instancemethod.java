package day4;

class Cars {
	private int gear, speed;
	boolean clutch, brake, accelerator;
	public void start()
	{
		
	}
	public void stop()
	{
		
	}
	public void setSpeed(int i)
	{
		speed = i;
	}
	public int getSpeed()
	{
		return speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
}

public class Instancemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c1,c2;
		c1 = new Cars();
		c2 = new Cars();
		c1.setSpeed(100);
		//c2.speed=200;
		c2.setSpeed(200);
		System.out.println(c1.getSpeed());
	
	}
}
