package ch6_OOP1;

public class IsNumber {

	public static boolean isNumber(String str) {
		if(str == null || str == "")
			return false;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch < '0' || '9' < ch) {
				return false;
			}
		}
		return true;	
	}
	
	
	public static void main(String[] args) {
		String str = "";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "1234a";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

}
