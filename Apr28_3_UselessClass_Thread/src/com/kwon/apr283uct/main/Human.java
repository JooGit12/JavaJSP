package com.kwon.apr283uct.main;

// 여러 thread가 자원을 공유하게되면...
// critical section(임계영역) 설정

// synchronized메소드
//		한 synchronized메소드 끝날동안
//		다른 synchronized메소드는 대기
//		=> 한 순간에는 하나의 synchronized메소드만 실행

// 웹개발에서는 멀티쓰레드가 기본인데
// JSP/Spring에서는 알아서 다 처리됨
public class Human {
	private String brain;
	
	private synchronized void sayName() {
		for (int i = 0; i < 10; i++) {
			try {
				brain = "홍길동";
				Thread.sleep(300);
				System.out.printf("이름은 %s\n", brain);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void sayHobby() {
		for (int i = 0; i < 10; i++) {
			try {
				brain = "독서";
				Thread.sleep(700);
				System.out.printf("취미는 %s\n", brain);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void introduce() {
		new Thread() {
			public void run() {
				sayName();
			};
		}.start();
		
		sayHobby();
	}
}





