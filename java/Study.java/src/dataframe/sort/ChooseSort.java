package dataframe.sort;
//ѡ������
public class ChooseSort {
    public static void sort(int[]a){
        //���ѭ������ѭ����ÿһ��Ԫ��
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
