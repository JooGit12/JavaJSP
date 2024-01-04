package com.kwon.apr251uch.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// 통신
//		HTTP통신 : 요청-응답(인터넷)
//		Socket통신 : 실시간통신(카톡)

// JSP/Spring... : HTTP서버 구현하는 기술(웹개발)
//	- 웹사이트
//	- 데이터만 제공하는 시스템

// https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1111061500
// 기상청의 HTTP서버쓰고

// HTTP클라이언트
public class UCHMain {
	public static void main(String[] args) {
		// HTTP통신 관련 기능이 Java에 없음 => 직접 만들어야
		// 다른 어떤 개발자가 만들어놨을텐데
		try {
			DefaultHttpClient dhc = new DefaultHttpClient();

			// 서버에 요청 : GET방식, POST방식 두 종류인데
			// GET방식이 기본
			HttpGet hg = new HttpGet("https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1111061500");

			HttpResponse hr = dhc.execute(hg);

			HttpEntity he = hr.getEntity(); // 응답 내용
			InputStream is = he.getContent(); // 응답 내용을 꺼낼 수 있는 빨대
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			dhc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
