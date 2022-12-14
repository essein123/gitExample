package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		int i = 1;
		
		
		while(i<8) {
			if(i==8)break;
			System.out.println(i + "Hello World");
			i++;
		}
		System.out.println("n값이 8이며 while문 빠져나옴");
		
	}

}
