// 조건문 
//		if - else if - else : 주력
//		switch - case : 권한부여하는 상황에 유리

// DBA(Admin) : 관리자
//		전원/계정관리
//		백업/복구
//		CRUD(데이터를 CreateReadUpdateDelete)
//		서비스 활용
// DBP(Programmer) : DB와 연동된 프로그램 만드는 개발자
//		CRUD
//		서비스 활용
// DBU(User) : DB가 뭔지는 모르는데, 쓰고 있는 사람
//		서비스 활용

public class CSMain6 {
	public static void main(String[] args) {
		String role = "DBA";
		
		switch (role) {
		case "DBA":
			System.out.println("전원/계정 관리");
			System.out.println("백업/복구");
		case "DBP":
			System.out.println("CRUD");
		case "DBU":
			System.out.println("서비스 활용");
		default:
			break;
		}

		System.out.println("-----");
		String grade = "일병";
		
		switch (grade) {
		case "이병":
			System.out.println("눈치");
		case "일병":
			System.out.println("관등성명");
		case "상병":
			System.out.println("훈련");
		default:
			System.out.println("잠");
		}
	}
}
