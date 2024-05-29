package dataframe.test;

public class Test01 {
    int size;
    int E[];
    public Test01(int size){
        this.size = size;
        this.E = new int[size];
    }
    public int getMinValue(int E[]){
        int min = E[0];
        for(int i = 0;i < E.length;i++){
            if(E[i]<min){
                min = E[i+1];
            }
        }
       return min;
    }
    public int getMinIndex(int E[]){
        int min = E[0];
        for(int i = 0;i < E.length;i++){
            if(E[i]<min){
                min = E[i+1];
            }
            return i;
        }
        return -1;
    }
}
