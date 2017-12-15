package ch5_Array;

public class Decoding {
	public static void main(String[] args) {
		char[] abcCode = 
			{'`', '~', '!', '@','#', '$','%', '^','&', '*','(', ')','-', '_',
					'=', '|','[', ']'};
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src = "abc123";
		String result = "";
		//문자열 의 문자를 하나씩 읽어서 변환 후 에 저장 
		
		for(int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			
			if('a' <= ch && ch <= 'z') {
				result += abcCode[ch-'a'];
			} else if('0' <= ch && ch <= '9') {
				result += numCode[ch-'0'];
			}
		}
		
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}
}
