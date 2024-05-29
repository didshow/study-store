package Package04;

class TestVariable {
	 public int calc (int x,int y) {
		 return x*x+y*y;
	 }
	 public int calc(int x,int y,int z) {
		 return x*x+y*-z*z;
	 }
	 public static void main(String []args) {
		 TestVariable tv = new TestVariable();
		 int i = tv.calc(10, 10);
		 int j = tv.calc(10, 10,10);
	 }
}
