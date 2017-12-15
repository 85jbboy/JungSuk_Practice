package ch7_OOP2;

public abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea(); // 도형 면적계산해 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p = p;
	}
}
