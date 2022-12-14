package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char aValue = '\uAC15';
		char bValue = '\uD0DC';
		char cValue = '\uC6B4';
		
		System.out.println("강 태 운"); 
		
		
		
		System.out.println("char형(\'\\uAC15\') : " + aValue);
		System.out.println("char형(\'\\uD0DC\') : " + bValue);
		System.out.println("char형(\'\\uC6B4\') : " + cValue);
		

	}

}
