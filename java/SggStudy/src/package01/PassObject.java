package package01;

public class PassObject {
	public static void main(String []args) {
		PassObject test = new PassObject();
		Circle c = new Circle();
		test.printArea(c, 5);
	}
	public void printArea(Circle c,int time) {
		System.out.println("Radius\t\tArea");
		//ÉèÖÃÔ²µÄ°ë¾¶
		for(int i = 1;i <= time;i++) {
			c.radius = i;
			double area = c.getArea();
			System.out.println(c.radius+"\t\t"+area);
		}
	
	}
}
