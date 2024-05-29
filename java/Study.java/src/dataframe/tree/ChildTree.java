package dataframe.tree;

import java.util.LinkedList;
import java.util.Queue;

class treeNode<T>{
    T data;
    LinkedList<Integer> firstChild;
    public treeNode(){
        this.firstChild=new LinkedList<>();
    }
    public void setData(T ele){
        this.data=ele;
    }
    public void addChild(int index){
        firstChild.add(index);
    }
    public T getData(){
        return data;
    }
    public int getChild(int idx){
        return firstChild.get(idx);
    }
}
public class ChildTree<T> {
    private treeNode<T>[] tree;
    public ChildTree(int n){
        this.tree=new treeNode[n];
    }
    public treeNode getNode(int idx){
        return tree[idx];
    }
    public treeNode<T>[] addtreeNode(int idx, T ele){
        treeNode node=new treeNode();
        node.setData(ele);
        tree[idx]=node;
        return tree;
    }
    public void addTreeChild(int rootIdx,int idx){
        tree[rootIdx].firstChild.add(idx);
    }
    public int depth(int rootIdx){
        int height,max =0;//height为当前高度，max为记录当前的最大高度
        if (tree[rootIdx].firstChild.size()==0){
            return 1;
        }
        for (int i=0;i<tree[rootIdx].firstChild.size();i++){
            height=depth(tree[rootIdx].firstChild.get(i));
            if (height>max)
                max=height;
        }
        return max+1;
    }
    public T parent(T node){
        for (int i=0;i<tree.length;i++){
            for (int j=0;j<tree[i].firstChild.size();j++){
                if (tree[tree[i].firstChild.get(j)].data.equals(node))
                    return tree[i].data;
            }
        }
        return null;
    }
    public T[] children(T node){
        if (node==null)
            return null;
        int idx=-1;
        for (int i=0;i<tree.length;i++){
            if (tree[i].data.equals(node))
                idx=i;
        }
        T[]childs=(T[])new Object[tree[idx].firstChild.size()];
        for (int i=0;i<tree[idx].firstChild.size();i++){
            childs[i]=(T)tree[tree[idx].firstChild.get(i)].data;
        }
        return childs;
    }
    public void traverse(){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()){
            int nodeIdx=queue.poll();
            System.out.print(tree[nodeIdx].data+" ");
            int idx=0;
            Queue<Integer> p=tree[nodeIdx].firstChild;
            for (int i=0;i<p.size();i++){
                Integer ele=tree[nodeIdx].firstChild.get(idx);
                queue.add(ele);
                idx++;
            }
        }
        System.out.println();
    }
}
class ChildTreeTest{
    public static void main(String[] args) {
        ChildTree childTree=new ChildTree(9);
        childTree.addtreeNode(0,'A');
        childTree.addtreeNode(1,'B');
        childTree.addtreeNode(2,'C');
        childTree.addtreeNode(3,'D');
        childTree.addtreeNode(4,'E');
        childTree.addtreeNode(5,'F');
        childTree.addtreeNode(6,'G');
        childTree.addtreeNode(7,'H');
        childTree.addtreeNode(8,'I');

        childTree.addTreeChild(0,1);
        childTree.addTreeChild(0,2);

        childTree.addTreeChild(1,3);
        childTree.addTreeChild(1,4);
        childTree.addTreeChild(1,5);

        childTree.addTreeChild(2, 6);
        childTree.addTreeChild(2,7);

        childTree.addTreeChild(4,8);
        childTree.traverse();
        System.out.println("树的深度为：" + childTree.depth(0));

        System.out.println("节点 I 的双亲节点是： " + childTree.parent('I'));

        System.out.print("节点 C 的孩子节点有：" );
        Object[] chlds =childTree.children('C');
        for( int i = 0; i < chlds.length; i++)
            System.out.print(chlds[i].toString() +" ");
    }
}

