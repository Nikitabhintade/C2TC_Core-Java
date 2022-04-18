package day3;


class A{
	public void n1() {//superclass
		System.out.println("Hello Everyone!!");
	}
}
class B extends A{//subclass
	public void n2() {
		System.out.println("Welcome To C2TC");
	}
	public void n1() {
		System.out.println("Good Morning!!");
	}
	public void n1(String s) {
		System.out.println(s);
	}
}
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a,a1;
		B b;
		a= new A();
		a= new A();
		a1 = new A();//Instantiating the object
		b = new B();
		a1=a;
		a1.n1();//Hello Everyone!!
		a1=b;
		a1.n1();//Good Morning!!
		b.n2();//Welcome To C2TC
	}

}
