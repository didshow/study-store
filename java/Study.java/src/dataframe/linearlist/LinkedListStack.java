package dataframe.linearlist;

import dataframe.linearlist.ArrayStack;

public class LinkedListStack<E> {
    public class Node{
        private E data;
        private Node next;

        //空参构造器
        public Node() {
            //this 调用两个参数的构造器进行赋值
            this(null, null);
        }

        //只知道data参数的构造器
        public Node(E data) {
            this(data, null);
        }

        //既知道data也知道下一个节点的构造器
        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private int size;
    private Node dummyHead;

    public LinkedListStack(){
        this.size = 0;
        dummyHead = new Node();
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int getSize(){
        return size;
    }
    public E peek(){
        if(size == 0){
            System.out.println("没有元素");
        }
        Node top = dummyHead;
        for(int i = 0;i < size -1;i++){
            top = top.next;
        }
        return top.data;
    }
    public E pop(){
        if(size == 0){
            return null;
        }
        Node top = dummyHead;
        for(int i = 0;i < size;i++){
            top = top.next;
        }
        top.data= null;
        size--;
        return top.data;
    }
    public void push(E obj){
        Node top = dummyHead;
        if(size == 0){
            Node node = new Node(obj);
        }else{
            for (int i = 0;i < size;i++){
                top = top.next;
            }
            top.next = new Node(obj);
            size ++;
        }
    }
    public void clear(){
        size = 0;
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



