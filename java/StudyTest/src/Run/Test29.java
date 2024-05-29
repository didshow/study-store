package Run;

public class Test29 {
	public static void main(String[]ags) {
		String s = "This is A String!";
		String s1 = s.toLowerCase();			
		System.out.println("s1="+s1);
		StringBuffer s2 = new StringBuffer(s);
		System.out.println("s2.length="+s2.length());		//空格也占长度
		StringBuffer s3= s2.replace(2, 4, "at");
		System.out.println("s3="+s3);
	}
}
