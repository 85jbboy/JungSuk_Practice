package ch7_OOP2;

public class MktPlace {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; 						 // Product배열 cart에 사용될 index	

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 구입할 수 없습니다.");
			return;
		}
			
		money -= p.price;
		add(p);

	}
	void add(Product p) {
		if(i>=cart.length) {
			Product[] tmpArray = new Product[cart.length*2];
			//System.arraycopy(cart, 0, tmpArray, 0, cart.length);
			for(int i=0; i<cart.length; i++) {
				tmpArray[i] = cart[i];
			}
			cart = tmpArray;
		}
		cart[i++] = p; 

	}
	void summary() {
		System.out.println("장바구니에 담긴 물건 목록");
		for(int i=0; i<cart.length; i++) {
			
			System.out.printf("%d: "+ cart[i]+"%n", i+1);
		}
		System.out.println("사용금액: "+(1000-money));
		System.out.println("남은 돈: "+ money);
	}
}
class Product {
	int price;
	Product() {}
	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {super(100);}
	public String toString() {return "Tv";}
}
class Computer extends Product {
	Computer() {super(200);}
	public String toString() {return "Computer";}
}
class Audio extends Product {
	Audio() {super(50);}
	public String toString() {return "Audio";}
}

