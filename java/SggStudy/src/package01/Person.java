package package01;

public class Person {
	String name;
	int age;
	//sex = 1 Ϊ����
	//sex = 0 ΪŮ��
	int sex; 
	public  void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println("age:"+age);
	}
	public int addAge(int i) {
		 age += i;
		 return age;
	}

}
