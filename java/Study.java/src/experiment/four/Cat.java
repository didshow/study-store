package experiment.four;

public class Cat extends Animal{
	public Cat(String name) {
	     super(name);
	    }
	public void shout() {
	        System.out.println("����.....");
	    }
	public void eat(Edible f) {
	        System.out.println("Сè " +getName() + " ���ڳ��� " + f.getName());
	    }

}
