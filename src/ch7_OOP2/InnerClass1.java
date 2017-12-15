package ch7_OOP2;

public class InnerClass1 {
	public static void main(String[] args) {

		Outer out = new Outer();
		Outer.Inner1 in1 = out.new Inner1();
		System.out.println(in1.iv);
		
		//static inner class는 그냥 내부 클래스와 달리 외부클래스의 인스턴스 생성 전세 사용가능하다. 
		Outer.Inner2 in2 = new Outer.Inner2();
		System.out.println(in2.iv);
	}
}

class Outer {
	class Inner1 {
		int iv = 100;
	}
	static class Inner2 {
		int iv = 200;
	}
}