package com.kwon.apr283uct.main;

// mainThread : 0.5초마다 ㅋ찍기 x 10
// subThread : 0.5초마다 ㅎ찍기 x 무한
// 이 프로그램의 메인기능이 0.5초마다 ㅋ찍기 x 10
// 10번찍고나면 프로그램 끝나는데 => subThread쪽은?
// => mainThread끝난다고 subThread도 끝나는거 아님
public class UCTMain2 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				while (true) {
					System.out.println("ㅎ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
		
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
