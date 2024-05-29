package experiment.four;

public class Cat extends Animal{
	public Cat(String name) {
	     super(name);
	    }
	public void shout() {
	        System.out.println("喵喵.....");
	    }
	public void eat(Edible f) {
	        System.out.println("小猫 " +getName() + " 正在吃着 " + f.getName());
	    }

}
