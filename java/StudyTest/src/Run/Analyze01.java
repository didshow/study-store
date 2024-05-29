package Run;

public class Analyze01 { 
	public static void main(String[]args) {
		int b1 = 1;
		int b2 = 2;
		System.out.println(b1);
		System.out.println(b2);     
		
		b1 <<= 31;						//1的二进制最后八位为：0000 0001 向左移动31位 最前面八位为 1000 0000后面全部是0第一位是符号位 b1 = 2^31.
		b2 <<= 31;                      //2的二进制最后八位为：0000 0010 向左移动31位 前面八位全为0 所以b2 = 0；
		System.out.println(b1);
		System.out.println(b2);
		
		b1 >>= 31;						//同理，b1右移31位，后面没有了，所以返回值-1
		b1 >>= 1;						//b2向右移动一位三十二位全部都为0 所以b2 = 2；
		System.out.println(b1);
		System.out.println(b2);
		
		b2 >>>= 31;						//对补码向右移动31位 返回值-1
		b2 >>>= 1;						//对于正数，b2的>>与>>>结果一样
		System.out.println(b1);
		System.out.println(b2);
		
		int b3 = -1;
		int b4 = 1;
		
		//取反码的规则，正数取反不变 负数（符号位为1）的符号位不变其余的位数依次取反码
		//补码是二进制的运算工具 正数的补码是本身 负数的补码是在反码的基础上+1。
		b3 >>>= 2;						
		b4 >>= 2;
		System.out.println(b3);
		System.out.println(b4);
	}
}
