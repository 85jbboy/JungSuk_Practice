package ch8_Exception;

public class Exercise8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b)
				System.exit(0);
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally { // System.exit(0); 으로 인해 실행되지 않음.
			System.out.println(5); 
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true); // 1
		method(false); // 실행되지 않음.
	}

}
