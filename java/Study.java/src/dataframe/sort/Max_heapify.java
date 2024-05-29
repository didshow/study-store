package dataframe.sort;
//大顶堆排序：改进交换排序
public class Max_heapify {
    //根节点和左右孩子（2i+1,2i+2）进行比较，找出最大的，放在i（根节点）的位置
    public static void toMaxHeap(int []arr,int size,int index){
       //获取左右节点的索引
        int leftNodeIndex = index*2+1;
        int rightNodeIndex = index*2+2;
        //查找最大非叶子节点对应的索引
        int maxIndex = index;
        if(leftNodeIndex < size && arr[leftNodeIndex] > arr[maxIndex]){
            maxIndex = leftNodeIndex;
        }
        if(rightNodeIndex < size && arr[rightNodeIndex] > arr[maxIndex]){
            maxIndex = rightNodeIndex;
        }
        if(maxIndex != index){
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[index];
            arr[index] = temp;
        }
        toMaxHeap(arr,size,maxIndex);
    }
    public static void maxHeapSort(int []arr){
        //获取最后一个非叶子节点的索引
        int startIndex = arr.length/2-1;
        //从下往上建堆（一个递归的过程）
        for(int i = startIndex;i >= 0;i--){
            toMaxHeap(arr,arr.length,i);
        }
        //经过上面的调整，是否对其他树产生影响
        for(int i = arr.length;i > 0;i--){
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;
            //i代表现在需要排序的个数
            toMaxHeap(arr,i,0);
        }
    }
}
