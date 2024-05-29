package Package02;
 
public class Example5_5 {
	public static void main(String args[]) {
		CreatChinese creat = new CreatChinese();
		Chinese zhang = creat.creatPeople();	//creat调用重写的方法
		zhang.speak();
	}

}
class CreatPeople{
	public People creatPeople(){
		People p = new People();			//方法的类型是People类
		return p;
	}
}
class CreatChinese extends CreatPeople{
	public Chinese creatPeople() {
		Chinese chinese = new Chinese();
		return chinese;
	}
}
