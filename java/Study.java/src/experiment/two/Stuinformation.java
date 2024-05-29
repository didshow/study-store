package experiment.two;

import java.util.Scanner;

import java.util.Arrays;

public class Stuinformation {
	public static void main(String[] args) {
	//初始化
		Student []student = Student.inputStudentInfo();
	//显示信息
	System.out.println("\t\t\t学生信息表");
	System.out.println("\t学号\t\t姓名\t性别\t年龄\t成绩");
	Student.sort(student);     				//根据成绩对学生进行排序
	for(int i = 0;i<student.length;i++){
	    System.out.print("\t"+student[i].getNO()+"\t"+student[i].getName());
System.out.println("\t"+student[i].getSex()+"\t"+student[i].getAge()+"\t"+student[i].getPoint());
	}
	
	Student.getMaxAndMin(student);
	System.out.println("\t平均得分:"+Student.getAverageScore(student)	
	+"("+Student.judge(Student.getAverageScore(student))+")");
	System.out.println("\t总人数:"+student.length);
}

}


class Student{
	
	String sNO,sName,sSex;
	int sAge,sJava;
	
	public Student(String num,String name,String sex,int age,int point){//构造方法
		sNO = num;
		sName = name;
		sSex = sex;
		sAge = age;
		sJava = point;
	}
	
	public static char judge(double point){//返回分数对应等级
		if(point <= 100 && point >= 90){
			return 'S';
		}
		else if(point < 90 && point >= 80){
			return 'A';
		}
		else if(point < 80 && point >= 70){
			return 'B';
		}
		else if(point < 70 && point >= 60){
			return 'C';
		}
		else{
		    return 'D';
		}
	}
	
	public static double getAverageScore(Student arr[]){//计算平均分
		double sum = 0;
		int i;
		for(i = 0;i<arr.length;i++){
			sum += arr[i].sJava;
		}
		return sum / arr.length;
	}
	
	public static void getMaxAndMin(Student arr[]){//计算最大值与最小值
		int max = -1;
		int min = 100;
		for(int i = 0;i<arr.length;i++){
			if(arr[i].sJava > max)
				max = arr[i].sJava;
		}
		for(int i = 0;i<arr.length;i++){
			if(arr[i].sJava < min){
				min = arr[i].sJava;
			}
		}
		System.out.println("\tMax: "+max+" "+judge(max));
		System.out.println("\tMin: "+min+" "+judge(min));	
	}
	public static Student[] inputStudentInfo() { //从命令行中录入学生信息与成绩
		Student[] stu=new Student[10];
		Scanner sc=new Scanner(System.in);
		for(int i = 0;i < stu.length;i++) {
			System.out.println("请输入学生"+(i+1)+"的信息");
			stu[i]=new Student(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
		}
		return stu;
	}
	public static void sort(Student[] stus) {
		Student[] stu=new Student[stus.length];
		for (int i = 0;i < stus.length-1;i++) {
			for(int j = 0;j<stus.length-i-1;j++) {
				if(stus[j].getPoint()>stus[j+1].getPoint()) {
					stu[i]=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=stu[i];
				}
			}
		}
	}
	public String getNO(){
		return sNO;
	}
	
	public String getName(){
		return sName;
	}
	
	public String getSex(){
		return sSex;
	}
	public int getAge(){
		return sAge;
	}
	
	public int getPoint(){
		return sJava;
	}
}