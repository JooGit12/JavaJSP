package com.kwon.may084mp.main;

public class Calculator {
	public static CalcResult calculate(int x, int y) {
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		return new CalcResult(a, b, c, d);
	}
}
