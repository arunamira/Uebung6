package h3;

public class H3_main { public static void main(String[] args) {
int[] array1 = {2, 1, 2, 3};
int[] array2 = {1,2, 3, 2};
System.out.print(compareArraysVal(array1, array2));
	
}

public static boolean compareArraysVal(int[] a, int[] b) {
	if (a.length != b.length) {
		return false;
	}
	
	
	for (int i = 0; i < a.length; i++) {
		int anzahla = 0;
		int anzahlb = 0;
		for(int j = 0; j < a.length; j++) {
			if (a[i] == a[j]){
				anzahla += 1;}
			if (a[i] == b[j]) {
				anzahlb +=1;}	
		}
		
		if (anzahla != anzahlb) {
			return false;}
	}
	
	
	return true;
}


}
