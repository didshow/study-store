package package02;

public class Circle {
	private double radius;	//�뾶
	public Circle() {
		radius = 1.0;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea(double radius) {
		//�����
		return Math.PI*radius*radius;
	}
}
