package dataframe.mintree;
import java.util.ArrayList;
import java.util.List;

public class Kruskal {
    public static void main(String[] args) {
        //Ĭ����aΪ���ڵ����С������
        List<Edge> list = new ArrayList<>();
        int[][] arr = new int[][]{
                {-1, 4, 0, 0, 0, 0, 0, 8, 0},
                {0, -1, 8, 0, 0, 0, 0, 11, 0},
                {0, 0, -1, 7, 0, 4, 0, 0, 2},
                {0, 0, 0, -1, 9, 14, 0, 0, 0},
                {0, 0, 0, 0, -1, 10, 0, 0, 0},
                {0, 0, 0, 0, 0, -1, 2, 0, 0},
                {0, 0, 0, 0, 0, 0, -1, 1, 6},
                {0, 0, 0, 0, 0, 0, 0, -1, 7},
                {0, 0, 0, 0, 0, 0, 0, 0, -1}};
        //�������������ڵ�Ԫ��
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;i++){
                //���Ȩֵ����0������ӱߵ�������
                if(arr[i][j]>0){
                    list.add(new Edge(i,j,arr[i][j]));
                }
            }
        }
    }
}
