package ch08;

public class BookUse {

	public static void main(String[] args) {
		//Book b1=new Book();
		Book b1=new Book("Java","홍길동","영진", 2019,35000, 5 );
		//b1.input("DB", "아무개", "한빛", 2021, 25000, 3);
		b1.print();
		
		Book b2=new Book();
		b2.print();
		
		
	}

}
