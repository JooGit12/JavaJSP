package com.kwon.apr205ofp.soldesk;

// 2) 같은 패키지에 factory역할을 할 클래스
public class Ahn {
	private int studentCount;
	
	// 3) 객체 만드는 메소드
	public Student talk(String name, int age) {
		studentCount++;
		return new Student(studentCount, name, age);
	}
}
