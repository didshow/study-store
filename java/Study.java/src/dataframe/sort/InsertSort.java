package dataframe.sort;
//插入排序：从第一个元素开始，认定第一个元素已经被排序，从剩下的序列中
//取出下一个元素，和已经排列好的元素比较，将大的排列在后面依次循环
public class InsertSort {
    public static void insertSort(int [] arr){
        //外层循环：从第二个元素开始比较（默认第一个元素已经排好序）
        for(int i = 1;i < arr.length;i++){
            //内层循环：和前面排好序的元素比较（大的元素放在后面）
            for(int j = i;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else{
                    //退出内层循环
                    break;
                }
            }
        }
    }
}
