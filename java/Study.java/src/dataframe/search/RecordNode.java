package dataframe.search;

public class RecordNode {
    //�ؼ���
    private Comparable key;
    //����Ԫ��
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
