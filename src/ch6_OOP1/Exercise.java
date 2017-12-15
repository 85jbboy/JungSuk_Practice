package ch6_OOP1;

class MyPoint {
	int x, y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	 
	public double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(y1-1, 2) + Math.pow(x1-1, 2));
	}
}

public class Exercise {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2 ,2));
	}
}
