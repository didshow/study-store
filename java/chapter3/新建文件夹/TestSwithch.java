import java.util.Scanner;
public class TestSwitch{
	public static void main(String[]args){
	Scanner s= new Scanner(System.in);
	int i=0;
	System.out.println("请输入成绩:");
	i=s.nextlnt();
	switch (i){
		case 60:
			System.out.println("及格");
			break;
		case 70:
			System.out.println("良好");
			break;
		case 80:
			Syetem.out.println("优秀");
			break;
		default:
			System.out.println("不知道");
		}
	}
}