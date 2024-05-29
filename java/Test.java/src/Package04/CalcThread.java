package Package04;

public class CalcThread extends Thread{
	private double result;
	public void run() {
		doCalculate();
		
	}
	public double getResult() {
		return result;
	}
public double getCalculate() {
	return result;
}
public void doCalculate() {
	for(int i = 0;i < 100000000;i++) 
		result ++;
	}
}
