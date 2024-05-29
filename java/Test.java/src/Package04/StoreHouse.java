package Package04;

public class StoreHouse {
	private int contents;
	private boolean available = false;
	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			}catch(InterruptedException e) { e.printStackTrace();}
		}
		available = false;		//修改条件变量，仓库已空
		notifyAll();			//唤醒所有阻塞的线程
		return contents;
	}
	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			}catch(InterruptedException e) {e.printStackTrace();}
		}
		contents = value;		//仓库被装入产品
		available = true;		//修改条件变量，仓库可以取产品
		notifyAll();			//唤醒所有阻塞的线程
	}
}
