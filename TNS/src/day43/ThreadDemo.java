package day43;

public class ThreadDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ThreadDemo());
		t.start();
		System.out.println(t.getName());
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mansi");
	}

}
