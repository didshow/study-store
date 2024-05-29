package Package04;

public class ThreadExample {
	public static void main(String aegs[]) {
		Thread t1,t2;
	t1 = new Thread (new SimpleRunnable("Thread 1",10));
	t2 = new Thread (new SimpleRunnable("Thread 2,",15));
	System.out.println("T1 p is:"+t1.getPriority());
	System.out.println("T2 p is:"+t2.getPriority());
	t2.setPriority(7);
	System.out.println("T2 after set p is:"+t2.getPriority());
	t1.start();
	t2.start();
	}
}
