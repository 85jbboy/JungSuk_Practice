package ch5_Array;

public class Change2 {
	public static void main(String[] args) {
		
		//문자열을 숫자로 변환. 입력한 값이 숫자가 아닐 경우 예외 발생
		int money = Integer.parseInt("3510");
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			coinNum = money/coinUnit[i];
			if(coinNum > coin[i]) 
				coinNum = coin[i];
			coin[i] -= coinNum;
			money -= coinNum*coinUnit[i];
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		System.out.println("=남은 동전의 개수 =");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"월: "+coin[i]);
		}
	}

}
