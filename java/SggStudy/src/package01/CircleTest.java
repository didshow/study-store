package package01;

public class CircleTest {
	public static void main(String []args) {
		Circle c = new Circle();
		c.radius = 2;
		double area = c.getArea();
		System.out.println("圆的面积是："+area);
	}
	
}
