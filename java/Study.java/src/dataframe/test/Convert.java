package dataframe.test;

import dataframe.linearlist.ArrayStack;

import java.util.Scanner;

public class Convert {

    //��ʮ����ת��Ϊ�˽���
    public static void conversion() {

        ArrayStack<Integer> stack1 = new ArrayStack<>(20);
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ��ʮ��������");
        int number = scan.nextInt();
        System.out.println("������ת�����ƵĻ�����");
        int base = scan.nextInt();
        while (number > 0) {
           stack1.push(number%base);
           number /= 8;
        }
        //ΪʲôҪ�ж�������䣺�������Ϊ�յĻ��ʹ�ӡ��ջԪ��
        while(!stack1.isEmpty()){
            String str = "";
            System.out.print(str + stack1.pop());
        }

    }
    public static void main(String[]args){
        Convert.conversion();
    }
}
