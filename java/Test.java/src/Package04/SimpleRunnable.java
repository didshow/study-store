package Package04;


public class SimpleRunnable implements Runnable{
	protected String msg;
	protected int iter;
	public SimpleRunnable(String msg,int iter) {
		this.msg=msg;
		this.iter=iter;
	}
	public void run() {
		for (int i = 0;i < iter;i+=1) {
			System.out.println(msg);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}