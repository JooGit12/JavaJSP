import java.util.Arrays;

public class PMain {
	
	public static void bubbleSort(int[] ar) {
		int t;
		for (int turn = 0; turn < (ar.length - 1); turn++) {
			for (int i = 0; i < (ar.length - 1 - turn); i++) {
				if (ar[i] > ar[i + 1]) {
					t = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = t;
				}
			}
		}
	}

	public static void selectionSort(int[] ar) {
		int min;
		int minIndex;
		int t;
		for (int turn = 0; turn < (ar.length - 1); turn++) {
			min = ar[turn];
			minIndex = turn;
			for (int i = (turn + 1); i < ar.length; i++) {
				if (min > ar[i]) {
					min = ar[i];
					minIndex = i;
				}
			}
			t = ar[turn];
			ar[turn] = ar[minIndex];
			ar[minIndex] = t;
		}
	}
	
	public static void main(String[] args) {
		int[] ar = { 13, 3, 23, 45, 7, 123, 1213 };

		// bubbleSort(ar);
		// selectionSort(ar);
		Arrays.sort(ar);

		for (int i : ar) {
			System.out.println(i);
		}
	}
}
