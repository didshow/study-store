package experiment.three;
import java.util.Scanner;
	class Fibonacci{
		int s;
	public Fibonacci(int s){
	       this.s = s;
	}
	public void print(){
	       if(s < 2) {
	    	   if(s == 0) {
	    		   System.out.print("0");
	    	   }else{
	    		   System.out.println("0"+"\n"+"1");
	    	   }
	    	   }else {
	    		   System.out.println("0"+"\n"+"1");
	    		   long f[] = new long[s];
	    		   f[0] = 0;
	    		   f[1] = 1;
	    		   for(int n = 2;n<s;n++) {
	    			   f[n] = f[n-1]+f[n-2];
	    			   System.out.println(f[n]);
	    			   System.out.print("");
	    		   }
	       }
	    }
	    public static void main(String[] args){
	        Fibonacci f=new Fibonacci(100);
	        f.print();
	        System.out.println();
	        FibonacciApp.main(args);
	    }
	}
	public class FibonacciApp{
	    public static void main(String[] args){
	    	System.out.println("请输入斐波那契数列的位数：");
	        Scanner input = new Scanner(System.in);
	        int len = input.nextInt();
	       
	Fibonacci f=new Fibonacci(len);
	        f.print();
	    //输入斐波拉契长度
	}
}
