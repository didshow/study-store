package dataframe.sort;
//选择排序
public class ChooseSort {
    public static void sort(int[]a){
        //外层循环控制循环到每一个元素
        for(int i = 0;i < a.length;i++){
            int min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
    }
}
