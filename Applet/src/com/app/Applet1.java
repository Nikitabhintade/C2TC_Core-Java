package com.app;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet1 extends Applet{
	Button b;
	TextField t;
	public void init() {
		b = new Button("Submit");
		add(b);
		t = new TextField();
		add(t);
	}
}
