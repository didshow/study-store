package dataframe.sort;
//其实是一个递归的过程
//注意：一次只有一个指针移动并且依次交替进行
public class QuickSort {
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    //low high分别为数组的第一个元素和最后一个元素
    private static void quickSort(int[]a,int low,int high){
        if(low >= high){
            return;
        }
        int left = low;
        int right = high;
        //pivot为基准数，选取最左边的元素为基准数
        //问题：如果最左边的数字最小，怎么处理：递归方法时，往右边移动了一位
        int pivot = a[left];
        while (left < right){
            //右边的数字大于基准数那么，right指针减1不对其做出改变
           while(left < right && a[right] >= pivot){
               right --;
           }
           //右边的数小于基准数则将左边的数与右边的数交换位置
           a[left] = a[right];
           while(left < right && a[left] <= pivot){
               left ++;
           }
           //左边的数大于基准数则将右边的数和左边的数交换位置
           a[right] = a[left];
        }
        //每次排序基准数都为第一个元素
        a[left] = pivot;
        //分别递归左边和右边的部分直到所有数字完成排序
        quickSort(a,low,left-1);
        quickSort(a,left+1,high);
    }
}
