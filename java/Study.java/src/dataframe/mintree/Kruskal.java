package dataframe.mintree;
import java.util.ArrayList;
import java.util.List;

public class Kruskal {
    public static void main(String[] args) {
        //默认以a为根节点的最小生成树
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
        //遍历所有数组内的元素
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j < arr.length;i++){
                //如果权值大于0，则添加边到链表中
                if(arr[i][j]>0){
                    list.add(new Edge(i,j,arr[i][j]));
                }
            }
        }
    }
}
