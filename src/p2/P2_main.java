package p2;

public class P2_main { public static void main(String[] args) {
	int[]someNumbers = {90,9,0, 97,98,-5};
	System.out.print(pairwiseDifferent(someNumbers));
}

public static boolean pairwiseDifferent(int[] someNumbers) {
	boolean x = true;
	for (int i=0; i<someNumbers.length; i++) {
		for (int j = i+1; j<someNumbers.length; j++) {
			if (someNumbers[i]==someNumbers[j]) {
				x = false; }
				
			}
		}
	return x;
}
}
