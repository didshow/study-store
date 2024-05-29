package dataframe.sort;
//�󶥶����򣺸Ľ���������
public class Max_heapify {
    //���ڵ�����Һ��ӣ�2i+1,2i+2�����бȽϣ��ҳ����ģ�����i�����ڵ㣩��λ��
    public static void toMaxHeap(int []arr,int size,int index){
       //��ȡ���ҽڵ������
        int leftNodeIndex = index*2+1;
        int rightNodeIndex = index*2+2;
        //��������Ҷ�ӽڵ��Ӧ������
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
        //��ȡ���һ����Ҷ�ӽڵ������
        int startIndex = arr.length/2-1;
        //�������Ͻ��ѣ�һ���ݹ�Ĺ��̣�
        for(int i = startIndex;i >= 0;i--){
            toMaxHeap(arr,arr.length,i);
        }
        //��������ĵ������Ƿ������������Ӱ��
        for(int i = arr.length;i > 0;i--){
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;
            //i����������Ҫ����ĸ���
            toMaxHeap(arr,i,0);
        }
    }
}
