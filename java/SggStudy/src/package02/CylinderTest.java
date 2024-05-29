package package02;

public class CylinderTest {
	public static void main(String []args) {
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume(cy.getLength());
		System.out.println("圆柱体的体积为：" + volume);
		
		double area = cy.findArea(cy.getRadius());
		System.out.println("底面圆的面积：" + area);
		
	}

}
