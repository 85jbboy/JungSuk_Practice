package ch8_Exception;

public class Test {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFunctionException("지원하지 않는 기능!", 100);
	}
}
