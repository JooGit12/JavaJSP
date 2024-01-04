package com.kwon.apr215g.main;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.kwon.apr215g.doctor.Doctor;

// 최종프로젝트 : 본인의 미래에 도움이 되는 거

// JFrame : 윈도우프로그램 바탕이 되는 판[행성]
// Layout : 입주전략
public class GMain {
	
	public static void main(String[] args) {
		JFrame jf = new JFrame("비만도 검사");
		
		GridLayout gl = new GridLayout(4, 2);
		jf.setLayout(gl);
		
		jf.add(new JLabel("이름 : "));
		JTextField nameTF = new JTextField();
		jf.add(nameTF);
		
		jf.add(new JLabel("키 : "));
		JTextField heightTF = new JTextField();
		jf.add(heightTF);
		
		jf.add(new JLabel("몸무게 : "));
		JTextField weightTF = new JTextField();
		jf.add(weightTF);
		
		JLabel resultLB = new JLabel("결과");
		jf.add(resultLB);
		JButton b = new JButton("확인");
		jf.add(b);
		
		Doctor d = new Doctor(nameTF, heightTF, weightTF, resultLB);
		b.addActionListener(d);
		
		jf.setSize(300, 350);
		jf.setVisible(true);
	}
}
