package experiment.four;

public class Dog extends Animal{
	public Dog(String name) {
      super(name);
    }
    public void shout() {
        System.out.println("汪汪.....");
    }
    public void eat(Edible f) {
        System.out.println("小狗 " +getName() + " 正在吃着 " + f.getName());
    }

}
