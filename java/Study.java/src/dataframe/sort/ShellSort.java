package dataframe.sort;
//ϣ�����򣺶�ֱ�Ӳ���������иĽ�
//˼·�������˲��������ڻ����źõ�����£�����ʮ�ֿ���ص�
//����������Ԫ�طֳɺܶ���飬���μ���������������ΰ������ź�
public class ShellSort {
    public static void shellSort(int arr[]){
        int d = arr.length;
        while (d >= 1){
            d = d/2;
            //�������ѭ����dΪÿ��ļ���Ԫ��
            for(int x = 0;x < d;x++){
                //��������ѭ���ɵ������ǣ���ͬ��Ԫ������
                for(int i = x+d;i < arr.length;i=i+d){
                    int temp = arr[i];
                    int j;
                    for(j =i-d;j >= 0 && arr[j] > temp;j=j-d){
                        arr[j+d] = arr[j];
                    }
                    arr[j+d] = temp;
                }
            }
        }
    }
}
