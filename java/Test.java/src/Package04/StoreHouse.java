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
		available = false;		//�޸������������ֿ��ѿ�
		notifyAll();			//���������������߳�
		return contents;
	}
	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			}catch(InterruptedException e) {e.printStackTrace();}
		}
		contents = value;		//�ֿⱻװ���Ʒ
		available = true;		//�޸������������ֿ����ȡ��Ʒ
		notifyAll();			//���������������߳�
	}
}
