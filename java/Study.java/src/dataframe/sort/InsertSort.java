package dataframe.sort;
//�������򣺴ӵ�һ��Ԫ�ؿ�ʼ���϶���һ��Ԫ���Ѿ������򣬴�ʣ�µ�������
//ȡ����һ��Ԫ�أ����Ѿ����кõ�Ԫ�رȽϣ�����������ں�������ѭ��
public class InsertSort {
    public static void insertSort(int [] arr){
        //���ѭ�����ӵڶ���Ԫ�ؿ�ʼ�Ƚϣ�Ĭ�ϵ�һ��Ԫ���Ѿ��ź���
        for(int i = 1;i < arr.length;i++){
            //�ڲ�ѭ������ǰ���ź����Ԫ�رȽϣ����Ԫ�ط��ں��棩
            for(int j = i;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }else{
                    //�˳��ڲ�ѭ��
                    break;
                }
            }
        }
    }
}
