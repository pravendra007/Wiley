
public class Circle {
	private int radius;
	private double area;
	
	Circle(int radius){
		this.radius=radius;
	}
	Circle(){
		//default constructor
	}
	
	public double calculateArea() {
		return area=Math.PI*radius*radius;
	}
}
