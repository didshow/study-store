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
	        System.out.println("���������");
            Scanner sc=new Scanner(System.in);
	        int x = sc.nextInt();
	        //����һ����ά�������洢*��
	        String[][] chs=new String[x][x];
	        //ʹ��ѭ�����д洢*��
	        for (int i=0;i<x;i++){
	            //x-i��ʾһ�д洢���ٸ�*��
	            for (int m=0;m<x-i;m++){
	                chs[i][m]="*";
	            }
	        }
	       
	        sysremOut(chs,x+1);

	    }
	    //num����ΪҪ���������
	    void sysremOut(String[][] num,int height){				//����һ������
	        int c=0;
	        for (int i = 0; i < num.length; i++) {
	            for (int j = 0; j < num[i].length; j++) {

	                if(num [i][j]==null) {
	                    continue;
	                }
	                //j==0��ʾ��ǰ���ڵ�һ��Ԫ��,Ӧ���\t����
	                if (j==0) {
	                //���i==0��ʾ�ڵ�һ��->ʲôҲ����
	                if (i==0){
	                	
	                }else {
	                for (c=0;c<i;c++){
	                    System.out.print("\t");
	                }
	             }
	         }

	                System.out.print( num[i][j]);
	                //�����ǿ�����״��
	                System.out.print("\t\t");
	            }
	            System.out.println();
	        }
	    }
}
