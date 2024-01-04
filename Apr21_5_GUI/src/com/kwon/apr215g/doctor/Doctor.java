package com.kwon.apr215g.doctor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Doctor implements ActionListener {
	private JTextField nametf;
	private JTextField heighttf;
	private JTextField weighttf;
	private JLabel resultlb;
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(JTextField nametf, JTextField heighttf, JTextField weighttf, JLabel resultlb) {
		super();
		this.nametf = nametf;
		this.heighttf = heighttf;
		this.weighttf = weighttf;
		this.resultlb = resultlb;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = nametf.getText();
		String height = heighttf.getText();
		// String -> double[다음 진도]
		double height2 = Double.parseDouble(height);
		
		String weight = weighttf.getText();
		double weight2 = Double.parseDouble(weight);

		double bmi = weight2 / (height2 * height2);
		String status = "저체중";
		if (bmi >= 35) {
			status = "고도 비만"; 
		} else if (bmi >= 30) {
			status = "중도 비만";
		} else if (bmi >= 25) {
			status = "경도 비만";
		} else if (bmi >= 23) {
			status = "과체중";
		} else if (bmi >= 18.5) {
			status = "정상";
		}
		// 다음진도
		String result = String.format("%.1f, %s씨는 %s", bmi, name, status);
		resultlb.setText(result);
	}

}

