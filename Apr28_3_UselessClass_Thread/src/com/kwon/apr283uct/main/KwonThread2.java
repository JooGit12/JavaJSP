package com.kwon.apr283uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// 2) implements Runnable
public class KwonThread2 implements Runnable {
	@Override
	public void run() {
		JFrame jf = new JFrame();
		JTextArea jta = new JTextArea();
		jf.add(jta);
		jf.setSize(300, 400);
		jf.setLocation(300, 0);
		jf.setVisible(true);
		for (int i = 0; i < 10; i++) {
			jta.append("ㅇㅇ\r\n");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
