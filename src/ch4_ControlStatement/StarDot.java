package ch4_ControlStatement;

public class StarDot {
	public static void main(String[] args) {
		
		int i = 0;
		while(i <= 10) {
			int j = 0;
			while(i >= j) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
//		for(int i = 0; i <= 10; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		
	}
}
