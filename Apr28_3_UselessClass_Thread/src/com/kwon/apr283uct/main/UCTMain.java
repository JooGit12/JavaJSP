package com.kwon.apr283uct.main;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// 한국어로 설계 -> ...
// JVM이 thread를 하나 만들어서 UCTMain.main(...)으로 보냄

// thread : 프로그램 흐름
//		위 -> 아래, 왼쪽 -> 오른쪽

// multithread
//		JVM이 만들어준 thread : main thread
//		개발자가 만들어서 쓰는 thread : sub thread
public class UCTMain {
	public static void main(String[] args) {
		KwonThread kt = new KwonThread();
		// kt.run();
		kt.start(); // 새 thread하나 만들어서 run으로

		Thread t = new Thread(new KwonThread2());
		t.start();
		
		// 3) 사실상 1번
		Thread tt = new Thread() {
			@Override
			public void run() {
				JFrame jf = new JFrame();
				JTextArea jta = new JTextArea();
				jf.add(jta);
				jf.setSize(300, 400);
				jf.setLocation(600, 0);
				jf.setVisible(true);
				for (int i = 0; i < 10; i++) {
					jta.append("ㅠㅠ\r\n");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		tt.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ㅋ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
