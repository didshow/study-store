package dataframe.graph;

//����ͼ��ʵ�֣��ڽ�����
public class ListNDG {
    Vertex[] vertexLists;//�ڽӱ�����
    int size;

    class Vertex{//�ڽӱ�ڵ��࣬���������ݽṹ
        char ch;
        Vertex next;

        Vertex(char ch){//��ʼ������
            this.ch=ch;
        }
        void add(char ch){//�ӵ�����β
            Vertex node=this;
            while(node.next!=null){
                node=node.next;
            }
            node.next=new Vertex(ch);
        }
    }

    public ListNDG(char[] vertexs,char[][] edges){
        size = vertexs.length;
        this.vertexLists = new Vertex[size];//ȷ���ڽӱ��С
        //�����ڽӱ�ÿһ���ڵ�
        for(int i=0;i<size;i++){
            this.vertexLists[i]=new Vertex(vertexs[i]);
        }

        //�洢����Ϣ
        for(char[] c:edges){
            int p1=getPosition(c[0]);
            vertexLists[p1].add(c[1]);
            int p2=getPosition(c[1]);
            vertexLists[p2].add(c[0]);
        }

    }

    //���ݶ������ƻ�ȡ�����±�
    private int getPosition(char ch) {
        for(int i=0; i<size; i++)
            if(vertexLists[i].ch==ch)
                return i;
        return -1;
    }

    //��������ڽӱ�
    public void print(){
        for(int i=0;i<size;i++){
            Vertex temp=vertexLists[i];
            while(temp!=null){
                System.out.print(temp.ch+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
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

        ListNDG pG = new ListNDG(vexs, edges);
        pG.print();   // ��ӡͼ
        pG.DFS();
    }
    //����ͼ����ȱ������ڽ�����
    public void DFS(){
        boolean[] beTraversed=new boolean[size];
        for(int i=0;i<size;i++){
            beTraversed[i]=false;
        }
        for (int i = 0; i < size; i++) {
            if (!beTraversed[i])
                DFS(beTraversed,vertexLists[i]);
        }

    }

    public void DFS(boolean[] beTraversed,Vertex temp){

        System.out.print(temp.ch + " ");
        beTraversed[getPosition(temp.ch)]=true;

        while(temp!=null){
            if(beTraversed[getPosition(temp.ch)]==false){
                DFS(beTraversed,vertexLists[getPosition(temp.ch)]);
            }
            temp=temp.next;
        }
    }
}
