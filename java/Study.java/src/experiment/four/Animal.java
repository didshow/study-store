package experiment.four;

public abstract class Animal {
	protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void shout();
    public abstract void eat(Edible food);
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


