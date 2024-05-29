package package02;

public class Cylinder extends Circle{
	private double length;//圆柱体的高
	public Cylinder() {
		length = 1.0;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public double findVolume(double length){//求圆柱体的体积
		//return Math.PI*getRadius()*getRadius()*length;
		return findArea(getRadius())*getLength();
	}
}
