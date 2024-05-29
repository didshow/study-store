public class Student {
	String sNO,sName,sSex;
	int sAge,sJava;
	
	public Student(String num,String name,String sex,int age,int point){    //构造方法
		sNO = num;
		sName = name;
		sSex = sex;
		sAge = age;
		sJava = point;
	}
	
	public static char judge(double point){                                //返回分数对应等级
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
	
	public static double getAverageScore(Student arr[]){                        //计算平均分
		double sum = 0;
		int i;
		for(i = 0;i<arr.length;i++){
			sum += arr[i].sJava;
		}
		return sum / arr.length;
	}
	
	public static void getMaxAndMin(Student arr[]){                             //计算最大值与最小值
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
	
	public static void main(String[] args) {
		//初始化
		Student[] student = new Student[10];
		student[0] = new Student("201900001","test1","女",18,88);
		student[1] = new Student("201900002","test2","女",18,97);
		student[2] = new Student("201900003","test3","男",19,89);
		student[3] = new Student("201900004","test4","男",20,96);
		student[4] = new Student("201900005","test5","女",19,88);
		student[5] = new Student("201900006","test6","男",19,82);
		student[6] = new Student("201900007","test7","女",20,83);
		student[7] = new Student("201900008","test8","男",20,89);
		student[8] = new Student("201900009","test9","女",19,90);
		student[9] = new Student("201900010","test10","男",18,88);
		
		
		//显示信息
		System.out.println("\t\t\t学生信息表");
		System.out.println("\t学号\t\t姓名\t性别\t年龄\t成绩");
		for(int i = 0;i<student.length;i++){
		    System.out.print("\t"+student[i].getNO()+"\t"+student[i].getName());
System.out.println("\t"+student[i].getSex()+"\t"+student[i].getAge()+"\t"+student[i].getPoint());
		}
		
		Student.getMaxAndMin(student);
		System.out.println("\t平均得分:"+Student.getAverageScore(student)	+"("+Student.judge(Student.getAverageScore(student))+")");
		System.out.println("\t总人数:"+student.length);
	}

}