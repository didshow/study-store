package dataframe.linearlist;

import java.util.Scanner;

public class Array {
	public static void main(String[]args) {
		Array array = new Array();
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ҫ��������");
		int capacity = sc.nextInt();
		System.out.println("��������Ҫ���ĸ�λ�����/ɾ��");
		int index = sc.nextInt();
		System.out.println("��������Ҫ���/ɾ����ֵ");
		int n = sc.nextInt();
		array.add(index, n);
		array.delete(index, capacity);
	}
	//��������ֱ�Ӱ�int���ͱ��<E>;  
		//���������
		private int capacity;
		//������������
		private int [] data;
		//�Ѿ��е�Ԫ�صĸ���
		private int size;
		//��capacity��Ϊ���������
		public Array(int capacity) {
			data = new int[capacity];
			size = 0;
		}
		//Ĭ�Ϲ�����sizeΪ10
		public Array() {
			this(10);
		}
		//get����
		public void getCapicity(int capacity) {
			this.capacity = capacity;
		}
		public void getSize(int size){
			this.size = size;
		}
		//�ж�size�Ƿ�Ϊ0
		public boolean isEmpty() {
			return size == 0;
		}
		//
		public String toString() {
			StringBuffer res = new StringBuffer();
			res.append(String.format("Array:size = %d,capacity= %d\n",size,data.length));
			res.append("[");
			
			for(int i = 0;i < size;i++) {
				res.append(data[i]);
				if(i != size-1) {
					res.append(",");
				}
			}
			res.append("]");
			return res.toString();
		}
		//��ָ��λ�ò���һ��Ԫ��
		public void add(int index,int b) {
			//1.�ж�size<capacity��ִ��add����
			//2.����Ҫ���ڵ���0
			//3.˳�����в�������
			if(index < 0 || size == capacity || index > size) {
				System.out.println("������");
			}else {
				//����Ԫ��
				data[index] = b;
				//��λ��(�����һ��Ԫ�ؿ�ʼ�ƶ���
				for(int i = size-1;i > index;i--) {
					data[i+1] = data[i];
				}
				//size����
				size++;
				System.out.println("���ѳɹ���"+index+"���"+b);
			}
		}
		//ɾ��ָ��λ�õ�Ԫ��
		public void delete(int index,int a) {
			if (index < 0 || size == 0 || index > size-1) {
				System.out.println("�����ֵ����ȷ");
			}else {
				int temp = data[index];
				for(int i = size -1;i > index;i++) {
					data[i+1] = data[i];
				}
				size --;
				System.out.println("���ѳɹ�ɾ��"+index+"λ��"+a);
			}	
		}
	}


