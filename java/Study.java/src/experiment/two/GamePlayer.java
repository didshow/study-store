package experiment.two;
import java.util.Scanner;
public class GamePlayer {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("������Ϸ�������������ƶ�������"
			+ "��0��Up 1��Down 2��Left 3��Right��...");
		int keyCode=-1;
		
		while(true) {
				keyCode=in.nextInt();
			switch(keyCode) {
			case 0:
				System.out.println("���������ƶ�");
				break;
			case 1:
				System.out.println("���������ƶ�");
				break;
			case 2:
				System.out.println("���������ƶ�");
				break;
			case 3:
				System.out.println("���������ƶ�");
				break;
			default:
				System.out.println("��Ч����");
		}
			if(keyCode==-1) {
				System.out.println("�˳���Ϸ");
				break;
			}
		}
	}
}

