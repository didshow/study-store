package package02;

public class Cylinder extends Circle{
	private double length;//Բ����ĸ�
	public Cylinder() {
		length = 1.0;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public double findVolume(double length){//��Բ��������
		//return Math.PI*getRadius()*getRadius()*length;
		return findArea(getRadius())*getLength();
	}
}
