package package01;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		//使用scanner,读取学生的个数
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生人数");
		int number = scanner.nextInt();
		//创建数组，存储学生成绩
		int[] scores = new int[number];
		//给每个数组的元素赋值
		System.out.println("请输入"+number+"个学生成绩");
		for(int i = 0;i < scores.length;i ++) {
			scores[i] = scanner.nextInt();
		}
		//获取数组中元素最大值：最高分
		int maxScore = scores[0];
		for(int i = 0;i < scores.length;i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}
		//根据每个学生成绩与最高分的差值得到每个学生的等级
		char level;
		for (int i = 0;i < scores.length;i++) {
			if(maxScore - scores[i] <= 10) {
				level = 'A';
			}else if (maxScore - scores[i] <= 20) {
				level = 'B';
			}else if (maxScore - scores[i] <= 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("student"+i+"score is "+
					scores[i]+",grade is "+level);
		}
		
	}
}
