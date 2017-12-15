package ch7_OOP2;

public class ShapeTest {
	public static double sumArea(Shape[] arr) {
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rect(3,4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}
}
