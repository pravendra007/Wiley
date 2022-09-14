
public class CircleTest {
	public static void main(String args[]) {
		
		Circle c1 = new Circle();     //using default constructor
		System.out.println(c1.calculateArea());
		
		Circle c2 = new Circle(5);     // using parameterized constructor
		System.out.println(c2.calculateArea());
	}
}
