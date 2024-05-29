package dataframe.graph;

import dataframe.linearlist.LinkedList;

//顶点节点
public class VertexNode {
    //泛型顶点类型
    Object vertex;
    //边的下标
    LinkedList<Integer> edges;
    //给顶点赋值他的名字，建立一个新的链表存储这些边的下标
    public VertexNode(Object vertex){
        this.vertex = vertex;
        this.edges = new LinkedList<>();
    }
    public void setVertex(Object vertex){
        this.vertex = vertex;
    }
    public Object getVertex(){
        return this.vertex;
    }
    public LinkedList<Integer>getEdges(){
        return this.edges;
    }
}
