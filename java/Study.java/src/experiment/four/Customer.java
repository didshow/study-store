package experiment.four;

public class Customer {
	 private String name;
	    public Customer (String name) {
	        this.name = name;
	    }
	public void speak(Animal a) {
	    if(a instanceof Dog)
	          System.out.println("��ֻСè\""+a.getName()+"\"��ɰ���");
	if(a instanceof Cat)
	          System.out.println("��ֻС��\""+a.getName()+"\"��ɰ���");
	    }
	    public void feed(Animal a, Edible food) {
	        a.eat(food);
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	}


