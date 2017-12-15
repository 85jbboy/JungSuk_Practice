package ch7_OOP2;

public class Rect extends Shape{

	double width;
	double height;
	
	Rect(double width, double height) {
		this(new Point(0,0), width, height);
	}
	
	Rect(Point p, double width, double height) {
		super(p);		// 조상의 멤버는 조상의 생성자가 최기화하도록 한다.
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width*height;
	}

	boolean isSquare() {
		return width*height!=0 && width==height ? true : false;
	}
}
