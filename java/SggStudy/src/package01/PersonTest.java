package package01;

public class PersonTest {
	public static void main(String []args) {
		Person p1 = new Person();
		p1.name = "Tom";
		
		p1.age = 18;
		//���sex = 1����Ϊ���� sex = 0;��ΪŮ��
		p1.sex = 1;
		
		p1.study();
		
		p1.addAge(2);
		
		p1.showAge();	
	}
}
