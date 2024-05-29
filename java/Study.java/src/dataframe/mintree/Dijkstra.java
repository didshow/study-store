package dataframe.mintree;

public class Dijkstra {
    //����һ������ͼ��Ȩ�ؾ��󣬺�һ�������start����0��ţ��������������)
    // ����һ��int[] ���飬��ʾ��start���������·������
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
                //ѡ��һ������start�����δ��ǵĶ��㣬����ѡ���Ķ�����Ϊ��������·�����ҵ�start�����·��Ϊdmin��
                shortPath[k] = dmin;
                visited[k] = 1;
                //��kΪ�м�㣬������start��δ���ʸ���ľ���
                for(int i=0; i<length; i++){
                    if(visited[i]==0 && weight[start][k]+weight[k][i]<weight[start][i]){
                        weight[start][i] = weight[start][k]+weight[k][i];
                        path[i] = path[k]+"->"+i;
                    }
                }
            }
            for(int i=0;i<length;i++){
                System.out.println("��"+start+"������"+i+"�����·��Ϊ��"+path[i]+"="+shortPath[i]);
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
