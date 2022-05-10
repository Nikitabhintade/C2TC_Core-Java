package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part3 extends Applet{
	Button b1,b2;
    TextField t;
	public void init() {
		add(b1=new Button("Click"));
		add(t= new TextField(15));
		add(b2= new Button("Clear"));
		E e =new E();
		e.takeRef(this);
		b1.addActionListener(e);
		//F f =new F(this);
		b2.addActionListener(new F(this));
		
	}
}
class E implements ActionListener{
	Applet2Part3 ap;
	public void takeRef(Applet2Part3 ap) {
		this.ap=ap;
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ap.t.setText("Hello World");
		
	}
	
}
class F implements ActionListener{
	Applet2Part3 ap;
	public F(Applet2Part3 ap) {
		this.ap = ap;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ap.t.setText("");
	}
}
