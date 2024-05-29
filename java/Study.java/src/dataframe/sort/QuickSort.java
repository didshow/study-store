package dataframe.sort;
//��ʵ��һ���ݹ�Ĺ���
//ע�⣺һ��ֻ��һ��ָ���ƶ��������ν������
public class QuickSort {
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    //low high�ֱ�Ϊ����ĵ�һ��Ԫ�غ����һ��Ԫ��
    private static void quickSort(int[]a,int low,int high){
        if(low >= high){
            return;
        }
        int left = low;
        int right = high;
        //pivotΪ��׼����ѡȡ����ߵ�Ԫ��Ϊ��׼��
        //���⣺�������ߵ�������С����ô�����ݹ鷽��ʱ�����ұ��ƶ���һλ
        int pivot = a[left];
        while (left < right){
            //�ұߵ����ִ��ڻ�׼����ô��rightָ���1�����������ı�
           while(left < right && a[right] >= pivot){
               right --;
           }
           //�ұߵ���С�ڻ�׼������ߵ������ұߵ�������λ��
           a[left] = a[right];
           while(left < right && a[left] <= pivot){
               left ++;
           }
           //��ߵ������ڻ�׼�����ұߵ�������ߵ�������λ��
           a[right] = a[left];
        }
        //ÿ�������׼����Ϊ��һ��Ԫ��
        a[left] = pivot;
        //�ֱ�ݹ���ߺ��ұߵĲ���ֱ�����������������
        quickSort(a,low,left-1);
        quickSort(a,left+1,high);
    }
}
