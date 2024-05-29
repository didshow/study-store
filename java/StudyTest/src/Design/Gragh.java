package Design;

import java.util.Scanner;

import org.junit.Test;

//* * * * * * *
// * * * * * *
//  * * * * *
//   * * * *
//    * * *
//      *
public class Gragh {
	 @Test
	    public void Test08(){
	        System.out.println("请输入层数");
            Scanner sc=new Scanner(System.in);
	        int x = sc.nextInt();
	        //定义一个二维数组来存储*号
	        String[][] chs=new String[x][x];
	        //使用循环进行存储*号
	        for (int i=0;i<x;i++){
	            //x-i表示一行存储多少个*号
	            for (int m=0;m<x-i;m++){
	                chs[i][m]="*";
	            }
	        }
	       
	        sysremOut(chs,x+1);

	    }
	    //num数组为要输出的数组
	    void sysremOut(String[][] num,int height){				//这是一个方法
	        int c=0;
	        for (int i = 0; i < num.length; i++) {
	            for (int j = 0; j < num[i].length; j++) {

	                if(num [i][j]==null) {
	                    continue;
	                }
	                //j==0表示当前处在第一个元素,应输出\t符号
	                if (j==0) {
	                //如果i==0表示在第一行->什么也不做
	                if (i==0){
	                	
	                }else {
	                for (c=0;c<i;c++){
	                    System.out.print("\t");
	                }
	             }
	         }

	                System.out.print( num[i][j]);
	                //下面是控制形状的
	                System.out.print("\t\t");
	            }
	            System.out.println();
	        }
	    }
}
