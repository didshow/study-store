package Package04;

public class SeparateGroups {
	private double aVal = 0.0;
	private double bVal = 1.1;
	protected Object lockA = new Object();
	protected Object lockB = new Object();
	public double getA() {
		synchronized(lockA) {
			return aVal;
		}
	}
	public double getB() {
		synchronized(lockB) {
			return bVal;
		}
	}
}
