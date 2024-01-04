package com.kwon.apr214os.main;

import com.kwon.apr214os.hero.Ironman;
import com.kwon.apr214os.human.Human;
import com.kwon.apr214os.planet.Planet;

public class OMain {
	public static void main(String[] args) {
		Planet p = new Planet("지구"); // 이름이 지구인 별
		
		Human h = new Human("홍길동"); // 이름이 홍길동인 사람
		p.add(h); // 저 별에 저 사람을 등록
		
		// [사수]
		// 영웅들은 공격하기를 반드시 할 줄 알아야
		// 반드시 -> 추상메소드 -> 추클/인중에 골라야
		// 추클은 상속라인을 막으니 -> 영웅 인터페이스 만들자
		Ironman i = new Ironman(); // 영웅인 아이언맨

		h.jjim(i); // 저 사람이 자기 전담영웅으로 아이언맨을 찜
		
		h.helpMe(); // 저 사람이 도움요청
		
		p.setSize(100); // 그 별 사이즈 100으로
		p.setVisible(true); // 그 별 보이게
	}
}
