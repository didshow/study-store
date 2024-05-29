package dataframe.test;

public class Search {
    //按照关键字查找
    public int search(int a[],int key){
        for(int i = 0;i < a.length-1;i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }
    //按照下标查找
    public int find(int a[],int index){
        return a[index];
    }
}
