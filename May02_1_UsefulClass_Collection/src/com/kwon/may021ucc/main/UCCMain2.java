package com.kwon.may021ucc.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// 조건문
// 반복문
// List + Map
// 특징 : OOP, 남의 lib잘쓰기
// ------------------------------------
// Avengers - Ironman, Hulk, ...
// List - ArrayList, Vector, ...
// Set - HashSet, TreeSet, ...
// Map - HashMap, HashTable, ...

// Collection
//	List계열 : 가변사이즈 배열
//	Set계열 : 중복자동제거, 순서?
//		기본형급(int, double, String...) List의 중복 제거
//		기본형급 중복 제거
//	Map계열(python의 dict) : 순서x, 키-값
public class UCCMain2 {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("탄수화물", 30.3);
		hm.put("지방", 10.0);
		hm.put("단백질", 43.2);
		hm.put("단백질", 11.1); // 이미 있는 키로 또 넣으면 값이 바뀜
		System.out.println(hm.get("단백질"));

		Set<String> keys = hm.keySet(); // 키값만 추출
		ArrayList<String> keys2 = new ArrayList<>(keys);
		for (String string : keys2) {
			System.out.println(string);
			System.out.println(hm.get(string));
			System.out.println("-----");
		}
		
		System.out.println(hm.containsKey("지방"));
		System.out.println(hm.containsKey("비타민"));
	}
}



