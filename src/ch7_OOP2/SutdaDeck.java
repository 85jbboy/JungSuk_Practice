package ch7_OOP2;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
//		int[] mixCard= {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
//		
//		int i = 0;
//		while(i<mixCard.length) {
//			int j = (int) (Math.random()*cards.length);
//			
//			if(cards[j].num != 0) {
//				continue;
//			} else {
//				cards[j].num = mixCard[i];
//			}
//			if(i==0 || i==4 || i==14)
//				cards[j].isKwang = true;
//			else
//				cards[j].isKwang = false;
//			i++;
//		}	
	}
	public void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	public SutdaCard pick(int index) {	
		if(index<0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	
	public SutdaCard pick() {
		return cards[(int)(Math.random()*cards.length)];
	}
}
