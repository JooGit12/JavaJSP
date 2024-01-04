package com.kwon.apr281ucss.main;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class UCSSMain2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(1233);
			System.out.println("서버 시작");
			System.out.println("접속 기다리는 중");

			Socket s = ss.accept();
			System.out.println("서 : 누가 접속함");

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			Robot r = new Robot();
			while (true) {
				String str = br.readLine();
				if (str.equals("l")) {
					r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				} else if (str.equals("r")) {
					r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
					r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
				} else {
					String[] str2 = str.split(",");
					int x = Integer.parseInt(str2[0]);
					int y = Integer.parseInt(str2[1]);
					r.mouseMove(x, y);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
