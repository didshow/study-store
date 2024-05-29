package Package04;

public class TestJoin {
	public static void main(String []args) {
		CalcThread t1 = new CalcThread();
		t1.start();
		CalcThread t2 = new CalcThread();
		t2.start();
		try {
			t1.join();
			t2.join();
			System.out.println("Thread:"+t1+"Result:"+t1.getResult());
			System.out.println("Thread:"+t2+"Result:"+t2.getResult());
		}catch(InterruptedException e) {
			System.out.println("No answer:interrupted!");
		}
	}
}
