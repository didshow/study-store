import java.util.Scanner;
public class IfTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int score=sc.nextInt();
		if(score>=100||score<0){
			System.out.println("������ķ�������");
		}else if(score>=95&&score<=100){
			System.out.println("ɽ�����г�һ��");
		} else if(score>=90 && score<=94){
			System.out.println("���ֳ���һ��");
		} else if(score>=80&&score<=89){
			System.out.println("���ν�����һ��");
		}else {
			System.out.println("����һ��");
		}
	}
}