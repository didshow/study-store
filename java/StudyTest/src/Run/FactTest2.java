package Run;
import java.util.Scanner;
public class FactTest2 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fact(n));
	}
	static long fact(int n) {
		long f = 1;
		for(int i=1;i<n+1;i++) {
			f=f*i;					//f!=f*(f-1)!
		}
		return f;
	}
}
