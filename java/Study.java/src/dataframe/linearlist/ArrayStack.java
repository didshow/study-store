package dataframe.linearlist;

public class ArrayStack <E>{
    //栈的容量
     int capacity;
    //数据
     E[] data;
    //元素个数
     int size;

    //构造器
    public ArrayStack(){
        this(10);
    }
    public ArrayStack(int capacity){
        this.size = 0;
        data = (E[])new Object[capacity];
    }

    //判断是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //求栈深
    public int getSize(){
        return size;
    }

    //读取栈顶元素
    public E peek() {
        if(size < 0){
            System.out.println("错误了！");
        }
        if (size == 0) {
            System.out.println("没有元素哦亲！");
        }
            return data[size - 1];
    }
    //入栈
    public void push(E obj){
        data[size] = obj;
        size ++;
    }

    //出栈
    public E pop(){
        if(size == 0) {
            return null;
        }
        size--;
        return data[size];
    }
    //栈置空
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
                stack.push("溢出");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("peek的结果为"+stack.peek());
            for(int j = 0;j < 10;j++){
                System.out.println(stack.pop());
            }
            String item = String.valueOf(stack.pop());
            System.out.println(item);

    }


}

