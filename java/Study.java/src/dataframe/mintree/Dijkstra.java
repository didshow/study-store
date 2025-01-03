package dataframe.mintree;

public class Dijkstra {
    //接受一个有向图的权重矩阵，和一个起点编号start（从0编号，顶点存在数组中)
    // 返回一个int[] 数组，表示从start到它的最短路径长度
    public static int[] Dijsktra(int[][] weight, int start) {
        int length = weight.length;
        int[] shortPath = new int[length];
        shortPath[0] = 0;
        String path[] = new String[length];
        for (int i = 0; i < length; i++) {
            path[i] = start + "->" + i;
        }
        int visited[] = new int[length];
        visited[0] = 1;
        for (int count = 1; count < length; count++) {
            int k = -1;
            int dmin = Integer.MAX_VALUE;
                 for (int i = 0; i < length; i++) {
                     if (visited[i] == 0 && weight[start][i] < dmin) {
                         dmin = weight[start][i];
                         k = i;
                     }
                 }
                //选出一个距离start最近的未标记的顶点，将新选出的顶点标记为已求出最短路径，且到start的最短路径为dmin。
                shortPath[k] = dmin;
                visited[k] = 1;
                //以k为中间点，修正从start到未访问各点的距离
                for(int i=0; i<length; i++){
                    if(visited[i]==0 && weight[start][k]+weight[k][i]<weight[start][i]){
                        weight[start][i] = weight[start][k]+weight[k][i];
                        path[i] = path[k]+"->"+i;
                    }
                }
            }
            for(int i=0;i<length;i++){
                System.out.println("从"+start+"出发到"+i+"的最短路径为："+path[i]+"="+shortPath[i]);
            }
        return shortPath;
    }
    static final int MAX = 10000;
    public static void main(String[] args) {
        int[][] weight = {
                {0, 3, 2000, 7, MAX},
                {3, 0, 4, 2, MAX},
                {MAX,4,0,5,4},
                {7,2,5,0,6},
                {MAX,MAX,4,6,0}
        };
        int start = 0;
        int[] dijsktra = Dijsktra(weight,start);
    }
}
