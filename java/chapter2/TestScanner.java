import java.util.Scanner;
public class TestScanner{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int i=0;
		System.out.println("������һ������:");
		while(true){
			i=s.nextInt();
			if(i==-1)break;
			System.out.println("�������������>>>"+i);
		}
	}
}