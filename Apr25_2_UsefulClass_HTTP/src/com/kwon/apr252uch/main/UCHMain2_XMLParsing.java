package com.kwon.apr252uch.main;

import java.io.InputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// 데이터를 주고 받을 때 약속된 형식이 필요할 것
// XML  : 데이터를 HTML형식을 빌려서 표현해놓은
// JSON : 데이터를 JavaScript형식을 빌려서 표현해놓은

// parsing : 쓸데없는 부분 걷어내고 원하는 형태로 가공하는

// DOM(Document Object Model)객체
// 		<태그명 속성명="값" 속성명="값"> : 시작태그
// 		텍스트							 : 텍스트
// 		</태그명>						 : 종료태그

//~18시까지
//11.0℃
//흐림
//---------------
//~21시까지
//10.0℃
//맑음
public class UCHMain2_XMLParsing {
	public static void main(String[] args) {
		HttpsURLConnection huc = null;
		try {
			String s = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1111061500";
			URL u = new URL(s);
			// HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			huc = (HttpsURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			////////////////////////////////////////
			// XML파싱 : Java에 기본적으로 없음
			// 전세계의 수많은 개발자가 XML파싱기능 만들어놨을것
			// 제가 그 중에 하나 소개
			// kxml : 안드로이드에는 내장
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "utf-8");
			// xpp.setInput(isr);

			String tagName = null;
			int what = xpp.getEventType(); // 지금 빨아낸게 셋 중에 뭐냐
			while (what != XmlPullParser.END_DOCUMENT) {
				if (what == XmlPullParser.START_TAG) { 		
					tagName = xpp.getName();
				} else if (what == XmlPullParser.TEXT) { 
					if (tagName.equals("hour")) {
						System.out.println(xpp.getText() + "시까지");
					} else if (tagName.equals("temp")) {
						System.out.println(xpp.getText() + "℃");
					} else if (tagName.equals("wfKor")) {
						System.out.println(xpp.getText());
						System.out.println("-----");
					}
				} else if (what == XmlPullParser.END_TAG) { 
					tagName = "";
					// tagName = null;
				}
				xpp.next();
				what = xpp.getEventType();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		huc.disconnect();
	}
}
