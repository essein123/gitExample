package ch04;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		char grade=' ';
		int kor=0, eng=0, mat=0,tot;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i < 3; i++) {
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			mat = sc.nextInt();
			
		}
		
		tot = kor+eng+mat;
		avg = tot / 3.0;
		
		if(avg >=90) {
			grade = '수';
		}else if(avg >=80) {
			grade = '우';
		}else if(avg >=70) {
			grade = '미';
		}else if(avg >=60) {
			grade = '양';
		}else {
			grade = '가';
		}
		
		for(int j=0; j < 3; j++) {
			System.out.println("======================================================");
			System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
			System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor,eng,mat,tot,avg,grade);
			System.out.println("======================================================");
		}
	}

}
