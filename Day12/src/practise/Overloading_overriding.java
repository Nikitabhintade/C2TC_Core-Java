package practise;

class C
{
	public void meth1()//overriding with class D method 1
	{
		System.out.println("Show Method 1 of class A");
	}
	public void meth2()
	{
		System.out.println("Show Method 2 of class A");
	}
}
class D extends C
{
	public void meth1()//overriding with class c method 1
	{
		System.out.println("Show Method 1 of class B");
	}
	public void meth3()
	{
		System.out.println("Shoe method 3 of class B");
	}
}

public class Overloading_overriding {
//	static void foo()
//	{
//		System.out.println("Chetan Sonar");
//	}
//	static void foo(int a)//overloading
//	{
//		System.out.println("Roll No. "+a);
//	}
//	static void foo(int a, int b)
//	{
//		System.out.println("Roll No. "+a);
//		System.out.println("Roll No. "+b);
//	}
	public static void main(String[] args) {
//		foo();
//		foo(21);
//		foo(22,23);
		
		C a;
		a= new C();
		a.meth1();
		
		D b=new D();
		b.meth1();

}
}