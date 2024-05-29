package dataframe.search;

public class RecordNode {
    //关键字
    private Comparable key;
    //数据元素
    private Object element;
    public Comparable getKey(){
        return key;
    }
    public Object getElement(){
        return element;
    }
    public void setKey(Comparable key){
        this.key = key;
    }
}
