package package02;

public class Circle {
	private double radius;	//°ë¾¶
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
		//ÇóÃæ»ı
		return Math.PI*radius*radius;
	}
}
