package package02;

public class CylinderTest {
	public static void main(String []args) {
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume(cy.getLength());
		System.out.println("Բ��������Ϊ��" + volume);
		
		double area = cy.findArea(cy.getRadius());
		System.out.println("����Բ�������" + area);
		
	}

}
