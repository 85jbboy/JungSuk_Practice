package ch7_OOP2;

class OuterClass {
	int value = 10;
	
	class InnerClass {
		int value = 20;
		
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value );
			System.out.println(OuterClass.this.value);
		}
	}
}

public class InnerClass2 {
	public static void main(String args[]) {
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		inner.method1();
	}

}
