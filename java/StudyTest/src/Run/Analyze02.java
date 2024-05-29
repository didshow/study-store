package Run;

public class Analyze02 {
	 float m_float;
	 void change1(int pi) {
		 pi = 100;
	 }
	 void change2(String ps) {
		 ps = new String("Right");
	 }
	 void change3(Analyze02 po) {
		 po.m_float = 100.0f;
	 }
	 public static void main(String []args) {
		 Analyze02 pt = new Analyze02();
		 int i = 22;
		 pt.change1(i);
		 System.out.println("i value is"+i);
		 String s = new String("Hello");
		 pt.change2(s);
		 System.out.println("s value is"+s);
		 pt.m_float = 22.0F;
		 pt.change3(pt);
		 System.out.println("Current pt.m_float is	"+pt.m_float);
	 }
}
