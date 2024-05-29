import java.util.Scanner;
public class IfTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个分数");
		int score=sc.nextInt();
		if(score>=100||score<0){
			System.out.println("你输入的分数有误");
		}else if(score>=95&&score<=100){
			System.out.println("山地自行车一辆");
		} else if(score>=90 && score<=94){
			System.out.println("游乐场玩一次");
		} else if(score>=80&&score<=89){
			System.out.println("变形金刚玩具一个");
		}else {
			System.out.println("胖揍一顿");
		}
	}
}