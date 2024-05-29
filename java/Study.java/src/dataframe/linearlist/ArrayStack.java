package dataframe.linearlist;

public class ArrayStack <E>{
    //ջ������
     int capacity;
    //����
     E[] data;
    //Ԫ�ظ���
     int size;

    //������
    public ArrayStack(){
        this(10);
    }
    public ArrayStack(int capacity){
        this.size = 0;
        data = (E[])new Object[capacity];
    }

    //�ж��Ƿ�Ϊ��
    public boolean isEmpty(){
        return size == 0;
    }

    //��ջ��
    public int getSize(){
        return size;
    }

    //��ȡջ��Ԫ��
    public E peek() {
        if(size < 0){
            System.out.println("�����ˣ�");
        }
        if (size == 0) {
            System.out.println("û��Ԫ��Ŷ�ף�");
        }
            return data[size - 1];
    }
    //��ջ
    public void push(E obj){
        data[size] = obj;
        size ++;
    }

    //��ջ
    public E pop(){
        if(size == 0) {
            return null;
        }
        size--;
        return data[size];
    }
    //ջ�ÿ�
    public void clear(){
        for(int i = 0;i < size - 1;i++){
            data[i] = null;
        }
    }

    public static void main(String[]args){
        ArrayStack<String> stack = new ArrayStack<>(10);
        for(int i = 0;i < 10;i++) {
            stack.push("item" + i);
        }
            try{
                stack.push("���");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("peek�Ľ��Ϊ"+stack.peek());
            for(int j = 0;j < 10;j++){
                System.out.println(stack.pop());
            }
            String item = String.valueOf(stack.pop());
            System.out.println(item);

    }


}

