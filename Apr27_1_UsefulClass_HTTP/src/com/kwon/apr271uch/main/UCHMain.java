package com.kwon.apr271uch.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// JSON(JavaScript Object Notation)
//		var 객체 = { name : "후추", age : 3 };
//		var 배열 = [ 1, 2, 3 ];

public class UCHMain {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			URL u = new URL(
					"https://api.openweathermap.org/data/2.5/weather?appid=baff8f3c6cbc28a4024e336599de28c4&q=seoul&units=metric&lang=kr");
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");

			FileOutputStream fos = new FileOutputStream("C:/Kwon/owmWeather.csv", true);
			bw = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"));
			//////////////////////////////////////////////////////////////////
			// json-simple.jar
			JSONParser jp = new JSONParser();
			// BufferedReader br = new BufferedReader(isr);
			// jp.parse(br.readLine());
			JSONObject jo = (JSONObject) jp.parse(isr); // 전체 다 불러오기
			// JSONArray ja = (JSONArray) jp.parse(isr);
			JSONArray ja = (JSONArray) jo.get("weather");
			JSONObject w = (JSONObject) ja.get(0);
			JSONObject m = (JSONObject) jo.get("main");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH,");
			String when = sdf.format(new Date());
			bw.write(when);
			bw.write(w.get("description") + ",");
			bw.write(m.get("temp") + ",");
			bw.write(m.get("humidity") + "\r\n");
			bw.flush();
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
