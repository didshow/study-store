package dataframe.graph;

import dataframe.linearlist.LinkedList;

//����ڵ�
public class VertexNode {
    //���Ͷ�������
    Object vertex;
    //�ߵ��±�
    LinkedList<Integer> edges;
    //�����㸳ֵ�������֣�����һ���µ�����洢��Щ�ߵ��±�
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
