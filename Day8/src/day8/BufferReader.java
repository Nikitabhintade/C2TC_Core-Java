package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class scannerDemo
{
	public void addition()
	{
		int num1,num2,sum;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number ");
		num1=s.nextInt();
		System.out.println("Enter the second number");
		num2=s.nextInt();
		s.close();
		sum=num1+num2;
		System.out.println("Addition of number"+sum);
		
	}
}

public class BufferReader {

		public static void main(String[] args) throws  IOException {
			int a , b, sc;
			InputStreamReader is = new InputStreamReader(System.in); 
			BufferedReader br= new BufferedReader(is);
			System.out.println("br- Enter the first number");
			a=Integer.parseInt(br.readLine());
			
			System.out.println("br- Enter the second number");
			b=Integer.parseInt(br.readLine());
			
			sc=a+b;
			
			System.out.println("This is the addition"+ sc);
			
			scannerDemo sd=new scannerDemo();
			sd.addition();
	}

}
