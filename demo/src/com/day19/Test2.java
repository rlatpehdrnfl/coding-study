package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame {

	public Test2() {

		setTitle("À©µµ¿ì");
		setSize(200, 300);

		addWindowListener(new MyWindowdAdapter());

		setVisible(true);

	}

	class MyWindowdAdapter extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);

		}

	}

	public static void main(String[] args) {

		new Test2();

	}

}
