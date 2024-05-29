package dataframe.graph;
import java.util.LinkedList;

//有向图的实现：邻接链表
public class ListDG {
    Vertex[] vertexLists;
    int size;

    class Vertex{
        char ch;
        Vertex next;

        Vertex(char ch){
            this.ch=ch;
        }
        void add(char ch){
            Vertex node=this;
            while(node.next!=null){
                node=node.next;
            }
            node.next=new Vertex(ch);
        }

    }

    public ListDG(char[] vertexs,char[][] edges){

        size=vertexs.length;
        this.vertexLists=new Vertex[size];
        //设置邻接表每一个节点
        for(int i=0;i<size;i++){
            this.vertexLists[i]=new Vertex(vertexs[i]);
        }
        //存储边信息
        //只有这里和无序图不同
        for(char[] c:edges){
            int p=getPosition(c[0]);
            vertexLists[p].add(c[1]);
        }

    }

    private int getPosition(char ch) {
        for(int i=0; i<size; i++)
            if(vertexLists[i].ch==ch)
                return i;
        return -1;
    }

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

        ListDG pG = new ListDG(vexs, edges);
        pG.print();   // 打印图
        pG.BFS();
    }
    //有向图的广度遍历：邻接链表
    public void BFS(){
        boolean[] isTraversed=new boolean[size];
        for(int i=0;i<size;i++){
            isTraversed[i]=false;
        }
        System.out.print(vertexLists[0].ch + " ");
        isTraversed[0]=true;
        BFS(0,isTraversed);
    }

    public void BFS(int x,boolean[] isTraversed){
        Vertex temp=vertexLists[x];
        LinkedList<Vertex> list=new LinkedList<Vertex>();
        while(temp!=null){
            if(isTraversed[getPosition(temp.ch)]==false){
                System.out.print(temp.ch + " ");
                isTraversed[getPosition(temp.ch)]=true;
                list.add(temp);
            }
            temp=temp.next;
        }
        while(!list.isEmpty()){
            Vertex v=list.pop();
            int t=getPosition(v.ch);
            BFS(t,isTraversed);
        }
    }
}
