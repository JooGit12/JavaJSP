package com.kwon.apr271uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// 위도 : 37.5693582
// 경도 : 126.9858652

// b159d788bacf5fc0bbb9779600c92fa5

// 프로토콜://Host/폴더/폴더/.../파일명
public class UCHMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		Scanner k = new Scanner(System.in);
		try {
			System.out.print("뭐 : ");
			String what = k.next();
			what = URLEncoder.encode(what, "utf-8");

			String s = "https://dapi.kakao.com/v2/local/search/keyword.json";
			s += "?x=126.9858652&y=37.5693582&radius=3000&query=" + what;
			URL u = new URL(s);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("Authorization", "KakaoAK b159d788bacf5fc0bbb9779600c92fa5");

			InputStream is = huc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			
			JSONParser jp = new JSONParser();
			JSONObject locData = (JSONObject) jp.parse(isr);
			JSONArray locs = (JSONArray) locData.get("documents");
			
			JSONObject l = null;
			for (int i = 0; i < locs.size(); i++) {
				l = (JSONObject) locs.get(i);
				System.out.println(l.get("place_name"));
				System.out.println(l.get("road_address_name"));
				System.out.println(l.get("phone"));
				System.out.println(l.get("distance"));
				System.out.println("-----");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		k.close();
		huc.disconnect();
	}
}
