package dataframe.sort;
//ð�����򣺽�������
public class BubbleSort {
    public static void bubbleSort(int [] a){
        //���ѭ�����ƱȽϵĴ���
        for(int i = 0;i < a.length-1;i++){
            //�ڲ�ѭ�����ƱȽ�Ԫ�ص����λ��
            for(int j = 0;j<a.length-i-1;i++){
                if(a[j] >a[j+1]){
                    //ǰ��Ⱥ����ͽ���λ��
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}

