//��for����sum = 1 + 1/2 + 1/3 + ... +1/n

package Design;
import java.util.Scanner;
public class ForTest {
	public static void main(String []ags) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����������m��ֵ:");
		int m = scan.nextInt();
		System.out.println("sum��ֵΪ��"+caclSum(m));
	}
	public static double caclSum(double m){
		double sum = 0;
		for(int i=1;i<m+1;i++) {
			sum += 1/i;
		 	}
		return sum;
		}
		
}
