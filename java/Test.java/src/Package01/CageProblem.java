package Package01;

import java.util.Scanner;

public class CageProblem {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();//头的个数
		int n = scan.nextInt();//脚的个数
		int x,y;//x为鸡的个数 y为兔的个数
		if(n % 2 == 0) {
			x = 2*m - n/2;
			y = m - x;
			if(x > 0 && y > 0) {
				System.out.println(x+"  "+y);
			}
		}
		
		}
	
}
