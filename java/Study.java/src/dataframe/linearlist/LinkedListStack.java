package dataframe.linearlist;

import dataframe.linearlist.ArrayStack;

public class LinkedListStack<E> {
    public class Node{
        private E data;
        private Node next;

        //�ղι�����
        public Node() {
            //this �������������Ĺ��������и�ֵ
            this(null, null);
        }

        //ֻ֪��data�����Ĺ�����
        public Node(E data) {
            this(data, null);
        }

        //��֪��dataҲ֪����һ���ڵ�Ĺ�����
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
            System.out.println("û��Ԫ��");
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



