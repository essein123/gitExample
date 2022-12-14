package ch04;
import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		int i = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		int num = input.nextInt();
		
		
		int j = 1;
		
		while(num <=9) {
			while(j<=9) {
				System.out.println(num + " x " + j +" = " + num*j);
				j++;
			}
		}
		j=1;
		num++;
		

	}

}
