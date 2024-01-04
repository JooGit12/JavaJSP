package com.kwon.apr214os.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.kwon.apr214os.hero.Hulk;

// awt/swing(Java GUI프로그래밍)
//		1) 웹기반으로 바꾸는 중
//		2) 윈도우프로그램 : C# -> WinSDK
//		3) 웹, BD/AI에 1도 도움이 안됨 : Android에는 도움이 되는데
public class OMain2 {
	public static void main(String[] args) {
		JFrame p = new JFrame("지구"); // 제목이 지구인 JFrame
		
		// JTextField h = new JTextField("홍길동");
		// JFileChooser h = new JFileChooser();
		JButton h = new JButton("홍길동"); // 텍스트가 홍길동인 JButton
		p.add(h); // 저 JFrame에 저 JButton 추가
		
		// 반드시 actionPerformed() : ActionListener interface[Java]
		
		Hulk i = new Hulk(); // ActionListener인 헐크
		h.addActionListener(i); // 저 JButton이 담당 ActionListener로 헐크를 찜
		
		// 도움요청 -> 클릭
		
		p.setSize(500, 300); // 그 JFrame 사이즈가 500, 300
		p.setVisible(true); // 그 JFrame 보이게
		
		
	}
}


