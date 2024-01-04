package com.kwon.apr271uch.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// ? -> String
// 		1) 공통적인 형변환 스타일
// 			String use_dt = (String) station.get("USE_DT");
// 		2) toString() 메소드 활용
// 			String use_dt = station.get("USE_DT").toString();
// 		3) + 연산자 활용
// 			String use_dt = station.get("USE_DT") + "";
public class UCHMain3 {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		HttpURLConnection huc = null;
		try {
			String year = "2015";
			FileOutputStream fos = new FileOutputStream("C:/Kwon/bus" + year + ".csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			for (int m = 1; m < 13; m++) {
				for (int d = 1; d < 32; d++) {
					for (int start = 1; start < 40002; start += 1000) {
						String ss = String.format("%d/%d/%s%02d%02d", start, start + 999, year, m, d);
						
						String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/json/CardBusStatisticsServiceNew/" + ss;
						huc = (HttpURLConnection) new URL(s).openConnection();
						InputStreamReader isr = new InputStreamReader(huc.getInputStream(), "utf-8");
						
						JSONObject busData = (JSONObject) new JSONParser().parse(isr);
						JSONObject cbssn = (JSONObject) busData.get("CardBusStatisticsServiceNew");
						if (cbssn != null) {
							JSONArray row = (JSONArray) cbssn.get("row");
							JSONObject station = null;
							for (int i = 0; i < row.size(); i++) {
								station = (JSONObject) row.get(i);
								String use_dt = station.get("USE_DT") + "";
								bw.write(use_dt.substring(0, 4) + "," + use_dt.substring(4, 6) + "," + use_dt.substring(6, 8) + ",");
								bw.write(station.get("BUS_ROUTE_NM") + "," + station.get("BUS_STA_NM") + ",");
								bw.write(station.get("RIDE_PASGR_NUM").toString().replace(".0", "") + ",");
								bw.write(station.get("ALIGHT_PASGR_NUM").toString().replace(".0", "") + "\r\n");
								bw.flush();
							}
						}
						System.out.println(ss);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
