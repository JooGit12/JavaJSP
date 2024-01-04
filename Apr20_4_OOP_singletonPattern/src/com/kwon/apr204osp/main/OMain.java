package com.kwon.apr204osp.main;

import java.util.Calendar;

import com.kwon.apr204osp.kku.KwonKiung;
import com.kwon.apr204osp.tv.TV903;

public class OMain {
	public static void main(String[] args) {
		// 본인을 만든다니...
		// KwonKiung kku = new KwonKiung("권기웅", "분당");
		KwonKiung kku = KwonKiung.getKku();
		kku.introduce();
		
		KwonKiung kku2 = KwonKiung.getKku();
		kku.introduce();
		
		System.out.println(kku);
		System.out.println(kku2);
		
		System.out.println("-----");
		
		TV903 t = TV903.getTv();
		t.showInfo();
		
		// Calendar c = Calendar.getInstance();
	}
}





