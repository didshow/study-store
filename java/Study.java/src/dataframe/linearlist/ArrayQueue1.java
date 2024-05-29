package dataframe.linearlist;
//—≠ª∑∂”¡–
public class ArrayQueue1 <E> implements IQueue<E>{
    Object[] data;
    static final int DEFAULTCAPACITY=10;
    int capacity;
    int front = 0;
    int rear =0;
    public ArrayQueue1(int capacity){
        this.capacity = capacity;
        this.data = new Object[capacity];
    }
    public boolean enqueue(E t) {
        if(isFull())return false;
        data[rear]=t;
        rear=(rear+1)%capacity;
        return true;
    }
    public int size(){
        return (rear-front+capacity)%capacity;
    }
    public E dequeue() {
        if(isEmpty())return null;
        E t = (E) data[front];
        data[front]=null;
        front=(front+1)%capacity;
        return t;
    }
    public boolean isEmpty(){
        if(rear==front)return true;
        return false;
    }
    public boolean isFull() {
        if((rear+1)%capacity==front)return true;
        return false;
    }
    public E peek(){
        return (E) data[front];
    }
    public int capacity(){
        return capacity;
    }
}
