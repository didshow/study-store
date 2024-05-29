package dataframe.graph;

//����ͼ��ʵ�֣��ڽӾ���
public class MatrixNDG {
    //ͼ����ĸ�����size
    int size;
    //ͼ�������ƣ���һά���飩vertexs
    char[] vertexs;
    //ͼ��ϵ���󣨶�ά���飩matrix
    int [][] matrix;
    //���������趨�����С������ͼ�����ͼ��ϵ��������
    public MatrixNDG(char[]vertexs,char[][]edges) { //edgesΪ��ά�����ԭ���ǣ���������
        size = vertexs.length;                  //�洢�ߵģ�ÿ���ߴ洢�������˵㣬���ж���
        matrix = new int[size][size];           //�γ�һ����С��Ϊsize�Ķ�ά���飬������
        this.vertexs = vertexs;
        //���ݶ�������ȷ����Ӧ�����±꣨�������У�
        for (char[] c : edges) {                //���þ���ֵ
            //���ݶ�������ȷ����Ӧ�����±�            //forѭ���������˼�ǣ�����һ���µ�����
            int p1 = getPosition(c[0]);         //����edges�ĵ�һλ���飬���������һ��
            int p2 = getPosition(c[1]);         //edges��ֻ������Ԫ�أ��ߵ������˵�
            //����ͼ���Գƴ洢
            matrix[p1][p2] = 1;
            matrix[p2][p1] = 1;
        }
    }
    //ͼ�ı������
    public void print(){
        for(int[]i:matrix){
            for(int j:i){
                System.out.println(j+"  ");
            }
            System.out.println();
        }
    }
    //���ݶ������ƻ�ȡ��Ӧ�ľ����±�
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
    //����ͼ����ȱ������ڽӾ���
    public void DFS(){
        boolean[] beTraversed=new boolean[size];    //����һ���Ѿ����ʹ������飺��СΪsize
        for(int i=0;i<size;i++){    //���Ƚ����Ƕ���ֵΪfalse
            beTraversed[i]=false;
        }
        System.out.print(vertexs[0] + " ");
        beTraversed[0]=true;        //���ȷ��ʵ�һ��Ԫ��
        DFS(0,0,beTraversed);//�ٵ�������ķ������θ����ʹ��Ķ��㸳ֵΪtrue
    }
    private void DFS(int x,int y,boolean[] beTraversed){  //x,yΪ�����پ����е�λ��
        while(y<=size-1){                                 //�������ж���
            if(matrix[x][y]!=0&beTraversed[y]==false){    //�бߵĹ�ϵ����û���������
                System.out.print(vertexs[y] + " ");
                beTraversed[y]=true;
                DFS(y,0,beTraversed);
            }
            y++;
        }
    }
}
