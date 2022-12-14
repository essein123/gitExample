package ch05;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		
		String[][] words= {{"chair","의자"}, {"computer","컴퓨터"}, {"integer","정수"}};
		
		
		Scanner scanner = new Scanner(System.in);
		
		program :
			
		while(true) {
			for(int i=0; i<words.length; i++) {
				System.out.printf("문제%d) %s의 뜻은? (프로그램을 종료하려면 -1을 입력하세요)", i+1, words[i][0]);
				String tmp = scanner.next();
				String end = "-1";
				
				if(tmp.equals(words[i][1])) {
					System.out.printf("정답입니다.%n%n");
				}else if(tmp.equals(end)) {
					System.out.println("프로그램을 종료합니다.");
					break program;
				}else {
					System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1] );
				}
			}
		}
		scanner.close();
	}
}


