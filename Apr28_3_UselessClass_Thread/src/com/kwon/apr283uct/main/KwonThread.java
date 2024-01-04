package com.kwon.apr283uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// 1) extends Thread
public class KwonThread extends Thread {
	@Override
	public void run() {
		JFrame jf = new JFrame();
		JTextArea jta = new JTextArea();
		jf.add(jta);
		jf.setSize(300, 400);
		jf.setVisible(true);
		for (int i = 0; i < 10; i++) {
			jta.append("ㅎ\r\n");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}