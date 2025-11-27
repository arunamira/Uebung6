package h1;

public class H1_main {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 2 };
		int[] array2 = { 2, 2, 1 };
		System.out.print(isMirrorArray(array1, array2));

	}

	public static boolean isMirrorArray(int[] a, int[] b) {

		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[a.length - 1 - i]) {
				return false;
			}
		}

		return true;
	}

}
