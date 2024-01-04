package com.kwon.apr261uch.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

// 2015/01/01 ~ 2022/12/31
// subway.csv
//		2015,01,01,1호선,종로3가,5000,3000
//		....
public class UCHMain3 {
	public static void main(String[] args) {
		HttpURLConnection huc = null;
		BufferedWriter bw = null;
		try {
			FileOutputStream fos = new FileOutputStream("C:/Kwon/subway.csv", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
			bw = new BufferedWriter(osw);

			for (int y = 2015; y < 2023; y++) {
				for (int m = 1; m < 13; m++) {
					for (int d = 1; d < 32; d++) {
						String date = String.format("%d%02d%02d", y, m, d);
						String s = "http://openapi.seoul.go.kr:8088/575a4655496b636839386f58586542/xml/CardSubwayStatsNew/1/610/" + date;
						URL u = new URL(s);
						huc = (HttpURLConnection) u.openConnection();
						InputStream is = huc.getInputStream();
						
						XmlPullParser xpp = XmlPullParserFactory.newInstance().newPullParser();
						xpp.setInput(is, "utf-8");
						
						int type = xpp.getEventType();
						String tagName = null;
						String when = null;
						while (type != XmlPullParser.END_DOCUMENT) {
							if (type == XmlPullParser.START_TAG) {
								tagName = xpp.getName();
							} else if (type == XmlPullParser.TEXT) {
								if (tagName.equals("USE_DT")) {
									when = xpp.getText();
									bw.write(when.substring(0, 4) + "," + when.substring(4, 6) + "," + when.substring(6, 8) + ",");
								} else if (tagName.equals("LINE_NUM") || tagName.equals("SUB_STA_NM") || tagName.equals("RIDE_PASGR_NUM")) {
									bw.write(xpp.getText() + ",");
								} else if (tagName.equals("ALIGHT_PASGR_NUM")) {
									bw.write(xpp.getText() + "\r\n");
									bw.flush();
								}
							} else if (type == XmlPullParser.END_TAG) {
								tagName = "";
							}
							xpp.next();
							type = xpp.getEventType();
						}
						System.out.println(date);
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
