package dataframe.test;

public class Search {
    //���չؼ��ֲ���
    public int search(int a[],int key){
        for(int i = 0;i < a.length-1;i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
    //�����±����
    public int find(int a[],int index){
        return a[index];
    }
}
