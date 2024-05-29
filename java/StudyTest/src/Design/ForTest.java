//用for计算sum = 1 + 1/2 + 1/3 + ... +1/n

package Design;
import java.util.Scanner;
public class ForTest {
	public static void main(String []ags) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入整数m的值:");
		int m = scan.nextInt();
		System.out.println("sum的值为："+caclSum(m));
	}
	public static double caclSum(double m){
		double sum = 0;
		for(int i=1;i<m+1;i++) {
			sum += 1/i;
		 	}
		return sum;
		}
		
}
