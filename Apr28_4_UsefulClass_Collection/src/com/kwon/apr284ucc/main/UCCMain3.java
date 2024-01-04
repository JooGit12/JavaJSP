package com.kwon.apr284ucc.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

import com.kwon.apr284ucc.subway.SubwayStationInfo;

// 2015/01/01 ~ 2022/12/31까지 서울 지하철 운행정보
// 가장 이용객수(탄+내린)가 많았던 건
//		언제 몇호선 무슨역
//		=> 순서개념으로 정렬
public class UCCMain3 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:/Kwon/subway.csv");
			InputStreamReader isr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(isr);

			String line = null;
			SubwayStationInfo ssi = null;
			// 총 데이터수를 몰라서, 배열을 못만들겠
			// SubwayStationInfo[] ssis = new SubwayStationInfo[????];
			ArrayList<SubwayStationInfo> ssis = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				ssi = new SubwayStationInfo(line);
				ssis.add(ssi);
			}
			
			ssis.sort(new Comparator<SubwayStationInfo>() {
				@Override
				public int compare(SubwayStationInfo o1, SubwayStationInfo o2) {
					Integer o1Sum = o1.getRide() + o1.getAlight();
					Integer o2Sum = o2.getRide() + o2.getAlight();
					return o2Sum.compareTo(o1Sum);
				}
			});
			
			ssis.get(0).printInfo();
			// ssis.get(1).printInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



