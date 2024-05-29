package dataframe.graph;
import java.util.LinkedList;
//有向图的实现：邻接矩阵
public class MatrixDG {
    int size;
    char[] vertexs;
    int[][] matrix;

    public MatrixDG(char[] vertexs,char[][] edges){
        size=vertexs.length;
        matrix=new int[size][size];
        this.vertexs=vertexs;

        //和邻接矩阵无向图差别仅仅在这里
        for(char[] c:edges){
            int p1 = getPosition(c[0]);
            int p2 = getPosition(c[1]);

            matrix[p1][p2] = 1;
        }

    }

    public void print(){
        for(int[] i:matrix){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private int getPosition(char ch) {
        for(int i=0; i<vertexs.length; i++)
            if(vertexs[i]==ch)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        char[] vexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H','I','J','K'};
        char[][] edges = new char[][]{
                {'A', 'C'},
                {'A', 'D'},
                {'A', 'F'},
                {'B', 'C'},
                {'C', 'D'},
                {'E', 'G'},
                {'D', 'G'},
                {'I', 'J'},
                {'J', 'G'},
                {'E', 'H'},
                {'H', 'K'}};
        MatrixDG pG = new MatrixDG(vexs, edges);
        pG.print();
        pG.BFS();
    }

    //有向图的广度遍历：邻接矩阵
    public void BFS(){
        boolean[] beTraversed=new boolean[size];
        for(int i=0;i<size;i++){
            beTraversed[i]=false;
        }
        System.out.print(vertexs[0] + " ");
        beTraversed[0]=true;
        BFS(0,beTraversed);
    }

    public void BFS(int x,boolean[] beTraversed){
        LinkedList<Character> list=new LinkedList<Character>();
        int y=0;
        while(y<=size-1){
            if(matrix[x][y]!=0&beTraversed[y]==false){
                System.out.print(vertexs[y] + " ");
                beTraversed[y]=true;
                list.add(vertexs[y]);
            }
            y++;
        }
        while(!list.isEmpty()){
            char ch=list.pop();
            int t=getPosition(ch);
            BFS(t,beTraversed);
        }
    }

}
