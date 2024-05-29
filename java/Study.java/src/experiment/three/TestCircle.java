package experiment.three;

public class TestCircle {
	public static void main(String[]args) {
		Circle c1 = new Circle(25);
		System.out.println("圆的面积："+c1.area()+"圆的周长："+c1.perimeter());
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double r) {
		this.radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*getRadius()*getRadius();
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*getRadius()*getRadius();
	}
}