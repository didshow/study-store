package Example02;

import java.util.Scanner;
class PascalTriangle{
	static int[][] Triangle(int height) {
		int [][] num= new int[height][height];
		for (int i = 0; i < height; i++) {
			if(i==0) {
				num[0][0]=0;
				num[0][1]=1;
				continue;
			}
			for(int x=1;x<i+1;x++) {
				
				num[i][x]=num[i-1][x-1]+num[i-1][x];
			}
		}	
		return num;
	}
	static String[][] space( int height){
		String[][] num=new String [height][height];		
		int x=0;
		for (int i = 0; i < height; i++) {
		
			for(int m=0;m<height;m++) {
				num[i][m]="\t";
			}
			
		}
		return num;
	}
	
}
public class Angels {
public static void main(String[] args) {
	int[][] num;
	String[][] space;
	Scanner sc=new Scanner(System.in);
	PascalTriangle pr=new PascalTriangle();
	System.out.println("ÇëÊäÈë½×Êý");
	int height=sc.nextInt()+1;
	num=pr.Triangle(height);
	space=pr.space(height);
	int c=0;
	for (int i = 1; i < num.length; i++) {
	for (int j = 0; j < num[i].length; j++) {
	
		if(num [i][j]==0) {
			continue;
		}
		if(j==1) {
		for(c=0;c<height-i-1;c++) {
			System.out.print(space[i][c]);
		}
		}
		System.out.print( num[i][j]);
		System.out.print("\t\t");
	}
	System.out.println();
	}
	
}
}
