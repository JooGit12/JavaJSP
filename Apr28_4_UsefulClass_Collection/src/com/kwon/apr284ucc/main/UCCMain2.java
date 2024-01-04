package com.kwon.apr284ucc.main;

import java.util.ArrayList;
import java.util.Comparator;

import com.kwon.apr284ucc.student.Student;

public class UCCMain2 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 100, 90, 80);
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(s);
		students.add(new Student("김길동", 30, 55, 90));
		students.add(new Student("이길동", 33, 5, 99));
		students.add(new Student("최길동", 90, 85, 90));
		students.add(new Student("박길동", 70, 75, 70));
		
		// 첫번째 학생 국어점수
		System.out.println(students.get(0).getKor());
		
		// 학생 총 몇 명
		System.out.println(students.size());
		
		// 두번째 학생 수학점수 0점으로 수정
		students.get(1).setMat(0);
		
		// 이름 가나다순 정렬
		Comparator<Student> c = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				String o1Name = o1.getName();
				String o2Name = o2.getName();
				return o1Name.compareTo(o2Name);
			}
		};
		students.sort(c);
		
		// 전체 학생 정보출력
		for (Student student : students) {
			student.showInfo();
			System.out.println("-----");
		}
		
		// 1등학생 정보출력(성적순 정렬, 첫번째 학생)
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Sum = o1.getKor() + o1.getEng() + o1.getMat();
				Integer o2Sum = o2.getKor() + o2.getEng() + o2.getMat();
				return o2Sum.compareTo(o1Sum);
			}
		});
		students.get(0).showInfo();
		
		//int[][] score = { { 100, 90, 80 }, { 10, 30, 22 } };
		//score[0][1] = 0;
		//System.out.println(score[0][1]);
//		for (int[] is : score) {
//			for (int i : is) {
//				System.out.println(i);
//			}
//		}
	}
}


