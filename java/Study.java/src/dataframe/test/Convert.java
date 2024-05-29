package dataframe.test;

import dataframe.linearlist.ArrayStack;

import java.util.Scanner;

public class Convert {

    //将十进制转换为八进制
    public static void conversion() {

        ArrayStack<Integer> stack1 = new ArrayStack<>(20);
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int number = scan.nextInt();
        System.out.println("请输入转换进制的基数：");
        int base = scan.nextInt();
        while (number > 0) {
           stack1.push(number%base);
           number /= 8;
        }
        //为什么要判断下面这句：如果对象不为空的话就打印出栈元素
        while(!stack1.isEmpty()){
            String str = "";
            System.out.print(str + stack1.pop());
        }

    }
    public static void main(String[]args){
        Convert.conversion();
    }
}
