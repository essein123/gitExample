package ch10;

//static => 메모리에 바로 로딩
//nonstatic => 객체생성 후에 로딩
public class A {
	//멤버변수
	String name = "kim";//nonstatic member
	static int n = 20;//static member
	//멤버메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	
	public static void main(String[] args) {//static member
		//지역변수
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		
		A aa = new A();
		System.out.println(aa.name);
		//nonstatic member는 반드시 객체생성이후에 사용가능하다.
	}

}
