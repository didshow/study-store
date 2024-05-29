package test1_0909;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    /**
     * 判断一个数字是否为质数
     * @param n
     * @return
     */
    public static boolean isPrime(int n){
        if (n<=1) {
            return false;
        }else {
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    return false;
                }
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于2的正整数：");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        if (n<2) {
            System.out.println("Invalid input");
        }else {
            for (int i=2;i<=n;i++) {
                if (isPrime(i)) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
