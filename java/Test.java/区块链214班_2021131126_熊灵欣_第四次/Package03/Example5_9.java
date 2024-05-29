package Package03;

public class Example5_9 {
	public static void main(String args[]) {
		People people = new People();
		Anthropoid monkey = people;				//monkey 是people对象的上转型对象
		monkey.crySpeak("I love this game");	//等同于people调用重写的crySpeak方法
		//monkey.n = 100;						//	非法，因为n是子类新建的成员变量
		//monkey.computer(12,19);				//非法， 因为computer（）是子类新增的方法
		System.out.println(monkey.m);			//操作英藏的m，不等同于people.m
		System.out.println(people.m);			//操作子类的m
		People zhang = (People)monkey;			//把上转型对象强制转化为子类的对象
		zhang.computer(55,33);					//zhang是子类的对象
		zhang.m='T';							//草错子类声明的成员变量m
		System.out.println(zhang.m);
	
	}
}
