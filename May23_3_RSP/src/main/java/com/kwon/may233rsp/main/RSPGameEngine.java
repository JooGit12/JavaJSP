package com.kwon.may233rsp.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class RSPGameEngine {
	private int win;
	private int draw;
	private int lose;
	
	private static final RSPGameEngine RGE = new RSPGameEngine();

	private RSPGameEngine() {
	}

	public static RSPGameEngine getRge() {
		return RGE;
	}

	public void start(HttpServletRequest req) {
		req.setAttribute("uh", "img/start.gif");
		req.setAttribute("ch", "img/start.gif");
	}

	public void play(HttpServletRequest req) {
		int userHand = Integer.parseInt(req.getParameter("hand"));
		int comHand = new Random().nextInt(3) + 1;
		req.setAttribute("uh", "img/h" + userHand + ".png");
		req.setAttribute("ch", "img/h" + comHand + ".png");

		int t = userHand - comHand;
		if (t == 0) {
			req.setAttribute("result", "무승부");
			draw++;
		} else if (t == -1 || t == 2) {
			req.setAttribute("result", "유저 패");
			lose++;
		} else {
			req.setAttribute("result", "유저 승");
			win++;
		}
		
		String wdl = String.format("%d승 %d무 %d패", win, draw, lose);
		req.setAttribute("wdl", wdl);
	}
}
