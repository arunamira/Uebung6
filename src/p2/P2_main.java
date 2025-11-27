package p2;

public class P2_main {
	public static void main(String[] args) {
		int[] newInt = { 90, 0, 0, 97, 98, -5 };
		System.out.print(pairwiseDifferent(newInt));
	}

	public static boolean pairwiseDifferent(int[] someNumbers) {
		
		for (int i = 0; i < someNumbers.length; i++) {
			for (int j = i + 1; j < someNumbers.length; j++) {
				if (someNumbers[i] == someNumbers[j]) {
					return false;
				}

			}
		}
		return true;
	}
}
