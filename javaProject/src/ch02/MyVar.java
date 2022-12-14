package ch02;

public class MyVar {
	public static int sum(int n, int m) {
		return n + m;
	}
		
		

	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		int s;
		
		s = sum(a , b);
		
		System.out.println("a : 30");
		System.out.println("b : 50");
		System.out.print("a + b = ");
		System.out.print(s);
	}

}
