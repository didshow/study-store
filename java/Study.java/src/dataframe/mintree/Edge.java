package dataframe.mintree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Edge{
    //起始点
    private int begin;
    // 终止点
    private int end;
    //权值
    private int weight;

    public Edge(int begin,int end,int weight){
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }
    public int getBegin(){
        return begin;
    }
    public void setBegin(int begin){
        this.begin = begin;
    }
    public int getEnd(){
        return end;
    }
    public void setEnd(int end){
        this.end = end;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int compareTo(Edge o){
        if(o.weight > this.weight){
            return -1;
        }else{
            return 1;
        }
    }
}
