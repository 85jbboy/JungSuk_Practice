package ch7_OOP2;

public class Circle extends Shape{
	double r;
	
	Circle(double r) {
		this(new Point(0,0), r); // Circle(Point p, double r) 호출
	}
	Circle(Point p, double r) {
		super(p);	// 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
		this.r = r;
	}
	
	double calcArea() {
		return r*r*Math.PI;
	}
	

}
