import java.util.Scanner;
public class TestSwitch{
	public static void main(String[]args){
	Scanner s= new Scanner(System.in);
	int i=0;
	System.out.println("������ɼ�:");
	i=s.nextlnt();
	switch (i){
		case 60:
			System.out.println("����");
			break;
		case 70:
			System.out.println("����");
			break;
		case 80:
			Syetem.out.println("����");
			break;
		default:
			System.out.println("��֪��");
		}
	}
}