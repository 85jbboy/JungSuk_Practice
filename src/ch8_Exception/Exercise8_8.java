package ch8_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_8 {
	public static void main(String[] args) {
		//1~100사이 임의값을 얻어 answer에 저장
		int answer = (int) (Math.random()*100) + 1;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수
		
		while(true) {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 :");
			Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt();	
			} catch(InputMismatchException e) {
				System.out.println("유효하지 않은 값이네요. 다시 입력해주세요.");
				continue;
			}
			if(answer > input) {
				System.out.println("더 큰 수 입력하세요.");
			} else if(answer < input) {
				System.out.println("더 작은 수 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break; //do-while문 벗어남.
			}
		}
	
	}
}
