//	와이파이 : 1 << 3 = 8
//	주차장   : 1 << 2 = 4
//	흡연실   : 1 << 1 = 2
//	24시간   : 1 << 0 = 1
public class AMain4 {
	public static void main(String[] args) {
		int option = 13;
		String[] options = { "24시간", "흡연실", "주차장", "와이파이" };
		for (int i = (options.length - 1); i >= 0; i--) {
			if (option >= (1 << i)) {
				System.out.println(options[i]);
				option -= (1 << i);
			}
		}
	}
}
