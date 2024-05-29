package experiment.two;
import java.util.Scanner;
public class GamePlayer {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("启动游戏，请输入人物移动按键码"
			+ "（0：Up 1：Down 2：Left 3：Right）...");
		int keyCode=-1;
		
		while(true) {
				keyCode=in.nextInt();
			switch(keyCode) {
			case 0:
				System.out.println("人物向上移动");
				break;
			case 1:
				System.out.println("人物向下移动");
				break;
			case 2:
				System.out.println("人物向左移动");
				break;
			case 3:
				System.out.println("人物向右移动");
				break;
			default:
				System.out.println("无效输入");
		}
			if(keyCode==-1) {
				System.out.println("退出游戏");
				break;
			}
		}
	}
}

