package experiment.four;

public class Dog extends Animal{
	public Dog(String name) {
      super(name);
    }
    public void shout() {
        System.out.println("����.....");
    }
    public void eat(Edible f) {
        System.out.println("С�� " +getName() + " ���ڳ��� " + f.getName());
    }

}
