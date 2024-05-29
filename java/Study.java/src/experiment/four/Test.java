package experiment.four;

public class Test {
	public static void main(String[] args) {
        Customer c1 = new Customer ("张三");
        Customer c2 = new Customer ("李四");
        Dog dog = new Dog("二哈");
        Edible f1 = new Bone();
        c1.speak(dog);
        c1.feed(dog, f1);
        
        Cat cat = new Cat("柯南");
        Edible f2 =new Fish();
        c2.speak(cat);
        c2.feed(cat, f2);
	}
}
