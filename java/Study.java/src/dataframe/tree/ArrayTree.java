package dataframe.tree;

public class ArrayTree <E>{
    private E []array;
    public ArrayTree(E[] array){
        this.array =  array;
    }
    //ǰ�����
    public void preOrder(int index){
        //����Ϊ�պ�����ĳ���Ϊ0��ʲô����
        if(array.length == 0 || array == null){
            System.out.println("����Ϊ��");
        }
        System.out.print(array[index].toString()+"\t");
        //����ݹ����(�ж��Ƿ�������,+1����Ϊindex��0��ʼ)
        if((index * 2 + 1) < array.length){
            preOrder(index * 2 + 1);
        }
        //���ҵݹ����
        if((index * 2 + 2) < array.length){
            preOrder(index * 2 + 1);
        }
    }

}
