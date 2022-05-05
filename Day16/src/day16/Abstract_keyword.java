package day16;

abstract class A
{
	static int a;
	final int b=10;
	private int c;
	
	public int getc()
	{
		return c;
	}
	public void setc(int c)
	{
		this.c=c;
	}
	void a1()
	{
		System.out.println("hii!");
	}
	abstract void a2();	
	//abstract A();
	//abstract int b;
	//abstract final void M1();
	//abstract static void M1();
	//abstract private void M1();
	
}
class X extends A
{
	void a2()
	{
		System.out.println("hey..");
	}
}

public class Abstract_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj =new X();
		obj.a1();
		obj.a2();
		obj.setc(24);
		System.out.println(obj.getc());
	}

}
