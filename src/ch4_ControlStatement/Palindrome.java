package ch4_ControlStatement;

public class Palindrome {
	public static void main(String[] args) {
		int number = 123464321;
		int tmp = number;
		int result = 0;

		while(tmp != 0) {
			result = result*10 + tmp % 10;
			tmp /= 10;
		}
		
		if(number == result)
			System.out.println(number+"는 회문수다.");
		else
			System.out.println(number+"는 회문수가 아니다.");
	}
}
