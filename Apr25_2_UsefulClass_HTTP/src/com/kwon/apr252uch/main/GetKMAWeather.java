package com.kwon.apr252uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// 1) 오늘것만 나오게
// 2) kmaWeather.csv에 
//		2023,04,26,12,11.0,흐림
//		2023,04,26,15,13.0,맑음
//		...
public class GetKMAWeather {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			// 기상청 - 실패 확률이 꽤
			String s = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1111061500";
			URL u = new URL(s);
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			
			// 파일 열 - 거의 성공
			FileOutputStream fos = new FileOutputStream("C:/Kwon/kmaWeather.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");

			
			String tagName = null;
			int what = xpp.getEventType();
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,");
			String now2 = sdf.format(now);
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) { 		
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) { 
					if (tagName.equals("hour")) {
						if (xpp.getText().equals("3")) {
							break;
						}
						bw.write(now2);
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("temp")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("wfKor")) {
						bw.write(xpp.getText() + "\r\n");
					}
				} else if (what == XmlPullParser.END_TAG) { 
					tagName = "";
				}
				xpp.next();
				what = xpp.getEventType();
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
