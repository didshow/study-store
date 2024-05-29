package experiment.three;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(40,50,60);
		System.out.println("三角形面积："+t1.area()
		+"三角形周长："+t1.perimeter());
	}
}

class Triangle extends Shape{
	private double length1;
	private double length2;
	public double length3;
	public Triangle(double x,double y,double z) {
		this.length1 = x;
		this.length2 = y;
		this.length3 = z;
	}
	public double getLength1() {
		return length1;
	}
	public void setLength1(double lenth1) {
		this.length1=length1;
	}
	public double getLength2() {
		return length2;
	}
	public void setLength2(double lenth2) {
		this.length2=length2;
	}
	public double getLength3() {
		return length3;
	}
	public void setLength3(double lenth3) {
		this.length3=length3;
	}
	public double area() {
		double s = 0.25*(getLength1()*(getLength2()*getLength3()));
		return s;
	}
	public double perimeter() {
		return (getLength1()+getLength2()+getLength3());
	}
}
