package com.kwon.apr261uch.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// 인터넷 주소 체계
//		프로토콜://서버주소/폴더명/폴더명/.../파일명?변수명=값&변수명=값&...
//		프로토콜 - 통신방식(http or https)

// 서버측에 정보를 보내
//		request parameter - 공개적
//		request header - 내부적(보안성이 높)
// 인터넷 주소에 한글 넣으면 안됨
//		ㅋ -> %2A(URL인코딩)
public class UCHMain2 {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			String q = URLEncoder.encode("스포츠", "utf-8");
			String s = "https://openapi.naver.com/v1/search/news.xml?query=" + q;
			URL u = new URL(s);
			huc = (HttpsURLConnection) u.openConnection();
			huc.addRequestProperty("X-Naver-Client-Id", "VewZqL22TvZP9yJsljMS"); // request header
			huc.addRequestProperty("X-Naver-Client-Secret", "1UiRCf2mgO");

			FileOutputStream fos = new FileOutputStream("C:/Kwon/naverNews.txt", true);
			bw = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"));
			
			XmlPullParser xpp = XmlPullParserFactory.newInstance().newPullParser();
			xpp.setInput(huc.getInputStream(), "utf-8");
			int what = xpp.getEventType();
			String tn = null;
			boolean data = false;
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) {
					tn = xpp.getName();
					if (tn.equals("item")) {
						data = true;
					}
				} else if (what == XmlPullParser.TEXT) {
					if (data) {
						if (tn.equals("title")) {
							bw.write(StringCleaner.clean(xpp.getText()) + "\t");
						} else if (tn.equals("description")) {
							bw.write(StringCleaner.clean(xpp.getText()) + "\r\n");
						}
					}
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
