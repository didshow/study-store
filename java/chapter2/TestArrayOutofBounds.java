public class TestArrayOutofBounds{
	public static void main(String[]args){
		int scores[]=new int[10];
		scores[10]=89;			//发生数据越界错误Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
      						//at TestArrayOutofBounds.main(TestArrayOutofBounds.java:4)
	}
}