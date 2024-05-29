package Run;

public class Test1 {
	public static void main(String []args) {
		char[]a = {'1','2','3','4','5','6','7'};
		String s1 = new String(a,2,4);String s2 = "JavaWorld";
		System.out.println(s1);
		System.out.println(s2.indexOf("a"));
		System.out.println(s2.replace("t", "r"));
		System.out.println(s2.substring(4,6));
	}
}
