package day22;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;

public class Applet5 extends Applet {
	Button b1,b2,b3,b4,b5;
	TextField t1,t2,t3;
	Label l;
	
	public void init()
	{
		add(t1 = new TextField(5));
		add(t2=new TextField(5));
		add(l=new Label("="));
		add(t3=new TextField(10));
		add(b1 = new Button("+"));
		add(b2 = new Button("-"));
		add(b3 = new Button("*"));
		add(b4 = new Button("/"));
		add(b5 = new Button("Clear"));
	}
	public boolean action(Event e, Object o)
	{
		int k;
		String s3;
		String s1 = t1.getText();
		int i = Integer.parseInt(s1);
		String s2 = t2.getText();
		int j = Integer.parseInt(s2);
		if(e.target.equals(b1))
		{
			k=i+j;
			s3=String.valueOf(k);
			t3.setText(s3);
		}
		if(e.target.equals(b2))
		{
			k=i-j;
			s3=String.valueOf(k);
			t3.setText(s3);
		}
		if(e.target.equals(b3))
		{
			k=i*j;
			s3=String.valueOf(k);
			t3.setText(s3);
		}
		if(e.target.equals(b4))
		{
			k=i/j;
			s3=String.valueOf(k);
			t3.setText(s3);
		}
		if(e.target.equals(b5))
			t3.setText(" ");
		return false;
			
	}	
		
		
	
}

