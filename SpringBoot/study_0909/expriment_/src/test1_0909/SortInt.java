package test1_0909;

import java.util.Scanner;

public class SortInt {
    // 冒泡排序
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 1;i<n;i++){
            if (arr[i-1]>arr[i]){
                int tmp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=arr[i];
            }
        }
        return arr;
    }
    // 从键盘录入数组信息
    public static int[] returnArray(int length){
        System.out.println("请输入数组信息：");
        Scanner scanner = new Scanner(System.in);
        int[]arr =new int[length];
        for (int i =0;i<length;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    // 打印排序后的数组信息
    public static void printSortedArray(int []arr){
        bubbleSort(arr);
        System.out.print("[");
        for (int i = 0;i< arr.length;i++){
            if (i!=arr.length-1){
                System.out.printf("%d,",arr[i]);
            }else {
                System.out.printf("%d",arr[i]);
            }

        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("请输入整数个数：");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = returnArray(length);
        printSortedArray(arr);
    }
}
