package dataframe.sort;
//冒泡排序：交换排序
public class BubbleSort {
    public static void bubbleSort(int [] a){
        //外层循环控制比较的次数
        for(int i = 0;i < a.length-1;i++){
            //内层循环控制比较元素到达的位置
            for(int j = 0;j<a.length-i-1;i++){
                if(a[j] >a[j+1]){
                    //前面比后面大就交换位置
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}

