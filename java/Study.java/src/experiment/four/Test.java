package experiment.four;

public class Test {
	public static void main(String[] args) {
        Customer c1 = new Customer ("����");
        Customer c2 = new Customer ("����");
        Dog dog = new Dog("����");
        Edible f1 = new Bone();
        c1.speak(dog);
        c1.feed(dog, f1);
        
        Cat cat = new Cat("����");
        Edible f2 =new Fish();
        c2.speak(cat);
        c2.feed(cat, f2);
	}
}
