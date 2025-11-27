package p1;

public class P1_main { public static void main(String[] args) {
		int x = 8;
		x = squared(x);
		System.out.print(x);
		
	}
 public static int squared(int i) {
	 int y = 0;
	y =  (i+1)*(i+1);
	 return y;
 }
}
