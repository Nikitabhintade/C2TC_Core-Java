package com.guiapps;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo4 extends Frame implements Runnable{
	Thread th1;
	TextField t1,t2;
	int i,j;
	public ThreadDemo4() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		th1 = new Thread(this);
		th1.start();
		G g = new G();
		g.start();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e ) {
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
				t1.setText(String.valueOf(i));
				if(i==20)
					i=0;
				else 
				    i++;
			try {
				Thread.sleep(40);
			}
			catch(Exception e) {
			}
		}
		
	}
	class G extends Thread{
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
					t2.setText(String.valueOf(j));
					if(j==20)
						j=0;
					else 
					    j++;
				try {
					Thread.sleep(40);
				}
				catch(Exception e) {
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo4();
	}

}

