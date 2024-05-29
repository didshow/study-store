public class TestExtends{
	public static void main(String[] args){
		Cat mycat = new Cat(5.5f,80,true);
			mycat.eat();
			mycat.breath();
			mycat.purr();
			System.out.println(mycat.toString());
	}
	class Animal{
		private String name;
		protected flloat weight;
		public void eat();
	}
	class Mammal extends Animal{
		public int heartRate;
		boolean longHair;
		public void breath();
	}
	class Cat extends Mammal{
		public Cat(float w,int hr,bloolean lh){
			this.weight=w;
			this.heartRate=hr;
			this.longHair=lh;
			this.name="konan";
	}
	public void purr();
	publc String toString(){
		String s="Cat["+this.weight+";s+=","+this.heartRate;s+=","+this.longHair+"]";
		return s;
	}
}