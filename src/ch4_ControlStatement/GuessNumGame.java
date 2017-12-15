package ch4_ControlStatement;

import java.util.Scanner;

public class GuessNumGame {
	public static void main(String[] args) {
		Scanner sc;
		int ranNum = (int)(Math.random()*100)+1;
		int count = 0;
		while(true) {
			System.out.print("1에서 100사이의 수 하나를 입력하세요: ");
			sc = new Scanner(System.in);
			int guessNum = sc.nextInt();
			count++;
			if(ranNum > guessNum) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(ranNum < guessNum) {
				System.out.println("더 작은 수를 입력하세요.");
			} else break;
		}
		System.out.println(count+"번만에 맞추셨네요.");
		sc.close();
	}
}
