package Run;

public class Analyze01 { 
	public static void main(String[]args) {
		int b1 = 1;
		int b2 = 2;
		System.out.println(b1);
		System.out.println(b2);     
		
		b1 <<= 31;						//1�Ķ���������λΪ��0000 0001 �����ƶ�31λ ��ǰ���λΪ 1000 0000����ȫ����0��һλ�Ƿ���λ b1 = 2^31.
		b2 <<= 31;                      //2�Ķ���������λΪ��0000 0010 �����ƶ�31λ ǰ���λȫΪ0 ����b2 = 0��
		System.out.println(b1);
		System.out.println(b2);
		
		b1 >>= 31;						//ͬ��b1����31λ������û���ˣ����Է���ֵ-1
		b1 >>= 1;						//b2�����ƶ�һλ��ʮ��λȫ����Ϊ0 ����b2 = 2��
		System.out.println(b1);
		System.out.println(b2);
		
		b2 >>>= 31;						//�Բ��������ƶ�31λ ����ֵ-1
		b2 >>>= 1;						//����������b2��>>��>>>���һ��
		System.out.println(b1);
		System.out.println(b2);
		
		int b3 = -1;
		int b4 = 1;
		
		//ȡ����Ĺ�������ȡ������ ����������λΪ1���ķ���λ���������λ������ȡ����
		//�����Ƕ����Ƶ����㹤�� �����Ĳ����Ǳ��� �����Ĳ������ڷ���Ļ�����+1��
		b3 >>>= 2;						
		b4 >>= 2;
		System.out.println(b3);
		System.out.println(b4);
	}
}
