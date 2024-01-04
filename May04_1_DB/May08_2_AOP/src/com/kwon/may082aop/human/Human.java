package com.kwon.may082aop.human;

public class Human {
	private void ready() {
		System.out.println("씻고");
		System.out.println("옷입고");
		System.out.println("신발신고");
		System.out.println("나가서 엘베타고");
	}

	public void goSchool() {
		ready();
		System.out.println("걸어서");
		System.out.println("도착해서 쌤한테 인사하고");
		System.out.println("-----");
	}

	public void goMart() {
		ready();
		System.out.println("주차장 가서 차끌고");
		System.out.println("마트가서 주차하고 장보고...");
		System.out.println("-----");
	}

	public void goPark() {
		ready();
		System.out.println("자전거 끌고");
		System.out.println("공원 가서 한바퀴돌고...");
		System.out.println("-----");
	}
}
