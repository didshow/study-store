package Package01;

import java.util.Scanner;

public class CageProblem {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();//ͷ�ĸ���
		int n = scan.nextInt();//�ŵĸ���
		int x,y;//xΪ���ĸ��� yΪ�õĸ���
		if(n % 2 == 0) {
			x = 2*m - n/2;
			y = m - x;
			if(x > 0 && y > 0) {
				System.out.println(x+"  "+y);
			}
		}
		
		}
	
}
