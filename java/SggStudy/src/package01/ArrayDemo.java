package package01;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		//ʹ��scanner,��ȡѧ���ĸ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ������");
		int number = scanner.nextInt();
		//�������飬�洢ѧ���ɼ�
		int[] scores = new int[number];
		//��ÿ�������Ԫ�ظ�ֵ
		System.out.println("������"+number+"��ѧ���ɼ�");
		for(int i = 0;i < scores.length;i ++) {
			scores[i] = scanner.nextInt();
		}
		//��ȡ������Ԫ�����ֵ����߷�
		int maxScore = scores[0];
		for(int i = 0;i < scores.length;i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
			}
		}
		//����ÿ��ѧ���ɼ�����߷ֵĲ�ֵ�õ�ÿ��ѧ���ĵȼ�
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
