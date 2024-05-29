package dataframe.sort;
//希尔排序：对直接插入排序进行改进
//思路：运用了插入排序在基本排好的情况下，排序十分快的特点
//将所给数组元素分成很多个组，依次减少组别数量，依次把序列排好
public class ShellSort {
    public static void shellSort(int arr[]){
        int d = arr.length;
        while (d >= 1){
            d = d/2;
            //控制外层循环，d为每组的几个元素
            for(int x = 0;x < d;x++){
                //下面两个循环干的事情是：给同组元素排序
                for(int i = x+d;i < arr.length;i=i+d){
                    int temp = arr[i];
                    int j;
                    for(j =i-d;j >= 0 && arr[j] > temp;j=j-d){
                        arr[j+d] = arr[j];
                    }
                    arr[j+d] = temp;
                }
            }
        }
    }
}
