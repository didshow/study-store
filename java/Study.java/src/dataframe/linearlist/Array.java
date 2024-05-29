package dataframe.linearlist;

import java.util.Scanner;

public class Array {
	public static void main(String[]args) {
		Array array = new Array();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你需要的容量：");
		int capacity = sc.nextInt();
		System.out.println("请输入你要在哪个位置添加/删除");
		int index = sc.nextInt();
		System.out.println("请输入你要添加/删除的值");
		int n = sc.nextInt();
		array.add(index, n);
		array.delete(index, capacity);
	}
	//泛型数组直接把int类型变成<E>;  
		//数组的容量
		private int capacity;
		//存放数组的载体
		private int [] data;
		//已经有的元素的个数
		private int size;
		//把capacity作为数组的容量
		public Array(int capacity) {
			data = new int[capacity];
			size = 0;
		}
		//默认构造器size为10
		public Array() {
			this(10);
		}
		//get方法
		public void getCapicity(int capacity) {
			this.capacity = capacity;
		}
		public void getSize(int size){
			this.size = size;
		}
		//判断size是否为0
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
		//在指定位置插入一个元素
		public void add(int index,int b) {
			//1.判断size<capacity才执行add方法
			//2.索引要大于等于0
			//3.顺序排列不能留空
			if(index < 0 || size == capacity || index > size) {
				System.out.println("不符合");
			}else {
				//插入元素
				data[index] = b;
				//移位置(从最后一个元素开始移动）
				for(int i = size-1;i > index;i--) {
					data[i+1] = data[i];
				}
				//size增加
				size++;
				System.out.println("您已成功在"+index+"添加"+b);
			}
		}
		//删除指定位置的元素
		public void delete(int index,int a) {
			if (index < 0 || size == 0 || index > size-1) {
				System.out.println("输入的值不正确");
			}else {
				int temp = data[index];
				for(int i = size -1;i > index;i++) {
					data[i+1] = data[i];
				}
				size --;
				System.out.println("您已成功删除"+index+"位置"+a);
			}	
		}
	}


