package Design;
import java.util.Scanner;
import org.junit.Test;

public class Factorial {
	public static void main(String[]ags) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����룺");
		int m = scan.nextInt();
		System.out.println(m+"�Ľ׳�Ϊ��"+calcFac(m));
	}
	@Test
	public static int calcFac(int n) {			//����׳�
		if(n == 0) {
			return 1;
		}else if(n<1 || n>100) {
			System.out.println("��������ִ�����Ŷ��");
		}
		return n*calcFac(n-1);
		
	}
}
