/**
 * I am hungry
 * @author kwon
 *
 */
public class Coffee {
	String name;
	int price;
	
	/**
	 * How are you?
	 */
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
	
	/**
	 * I'm fine thank you
	 * @param sec and
	 * @return you
	 */
	public int toMilliSec(int sec) {
		return sec * 1000;
	}
}


