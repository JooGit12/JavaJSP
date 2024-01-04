import java.util.Random;

public class Enemy {
	Random brain;
		
	public Enemy() {
		brain = new Random();
	}

	public int fire() {
		return brain.nextInt(3) + 1;
	}
}
