package dataframe.tree;

public class ArrayTree <E>{
    private E []array;
    public ArrayTree(E[] array){
        this.array =  array;
    }
    //前序遍历
    public void preOrder(int index){
        //数组为空和数组的长度为0有什么区别
        if(array.length == 0 || array == null){
            System.out.println("数组为空");
        }
        System.out.print(array[index].toString()+"\t");
        //向左递归遍历(判断是否有左孩子,+1是因为index从0开始)
        if((index * 2 + 1) < array.length){
            preOrder(index * 2 + 1);
        }
        //向右递归遍历
        if((index * 2 + 2) < array.length){
            preOrder(index * 2 + 1);
        }
    }

}
