package dataframe.graph;

//无向图的实现：邻接矩阵
public class MatrixNDG {
    //图顶点的个数：size
    int size;
    //图顶点名称：（一维数组）vertexs
    char[] vertexs;
    //图关系矩阵（二维数组）matrix
    int [][] matrix;
    //构造器（设定矩阵大小）：将图顶点和图关系矩阵输入
    public MatrixNDG(char[]vertexs,char[][]edges) { //edges为二维数组的原因是：它是用来
        size = vertexs.length;                  //存储边的，每条边存储的是俩端点，边有多条
        matrix = new int[size][size];           //形成一个大小都为size的二维数组，正矩阵
        this.vertexs = vertexs;
        //根据顶点名称确定对应矩阵下标（遍历所有）
        for (char[] c : edges) {                //设置矩阵值
            //根据顶点名称确定对应矩阵下标            //for循环代码的意思是：创建一个新的数组
            int p1 = getPosition(c[0]);         //接收edges的第一位数组，并遍历其第一层
            int p2 = getPosition(c[1]);         //edges内只有两个元素：边的两个端点
            //无向图，对称存储
            matrix[p1][p2] = 1;
            matrix[p2][p1] = 1;
        }
    }
    //图的遍历输出
    public void print(){
        for(int[]i:matrix){
            for(int j:i){
                System.out.println(j+"  ");
            }
            System.out.println();
        }
    }
    //根据顶点名称获取对应的矩阵下标
     int getPosition(char ch){
        for(int i = 0;i<vertexs.length;i++){
            if(vertexs[i]==ch){
                return i;
            }
        }
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
        MatrixNDG pG = new MatrixNDG(vexs, edges);
        pG.print();
        pG.DFS();
    }
    //无向图的深度遍历：邻接矩阵
    public void DFS(){
        boolean[] beTraversed=new boolean[size];    //创建一个已经访问过的数组：大小为size
        for(int i=0;i<size;i++){    //首先将他们都赋值为false
            beTraversed[i]=false;
        }
        System.out.print(vertexs[0] + " ");
        beTraversed[0]=true;        //首先访问第一个元素
        DFS(0,0,beTraversed);//再调用下面的方法依次给访问过的顶点赋值为true
    }
    private void DFS(int x,int y,boolean[] beTraversed){  //x,y为顶点再矩阵中的位置
        while(y<=size-1){                                 //访问所有顶点
            if(matrix[x][y]!=0&beTraversed[y]==false){    //有边的关系并且没访问则访问
                System.out.print(vertexs[y] + " ");
                beTraversed[y]=true;
                DFS(y,0,beTraversed);
            }
            y++;
        }
    }
}
