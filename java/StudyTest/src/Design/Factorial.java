package Design;
import java.util.Scanner;
import org.junit.Test;

public class Factorial {
	public static void main(String[]ags) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入：");
		int m = scan.nextInt();
		System.out.println(m+"的阶乘为："+calcFac(m));
	}
	@Test
	public static int calcFac(int n) {			//计算阶乘
		if(n == 0) {
			return 1;
		}else if(n<1 || n>100) {
			System.out.println("输入的数字错误了哦！");
		}
		return n*calcFac(n-1);
		
	}
}
