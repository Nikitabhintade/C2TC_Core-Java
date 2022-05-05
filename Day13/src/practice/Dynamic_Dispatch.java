package practice;

class Phone
{
	public void ShowTime()
	{
		System.out.println(" time was 8 pm");
	}
	public void music()
	{
		System.out.println("play the music");
	}
}

class smartphone extends Phone
{
	public void on()
	{
		System.out.println("Smart phone is on");
	}
	public void music()
	{
		System.out.println("Play Music in smartphone");
	}
}

public class Dynamic_Dispatch {

	public static void main(String[] args) {
		Phone obj = new smartphone();//dynamic memory dispatch during run time
		obj.ShowTime();
		obj.music();
		//obj.on();
	

	}

}
