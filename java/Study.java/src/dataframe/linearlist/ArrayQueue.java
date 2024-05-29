package dataframe.linearlist;

public class ArrayQueue<E>{
    Object [] data;
    static final int DEFAULT_CAPACITY = 10;
    int capacity;
    int front = 0;
    int rear = 0;

    public ArrayQueue(int capacity){
        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    public ArrayQueue() {
        this(10);
        this.data = new Object[10];
    }

    public boolean isFull(){
        if(front == (rear + 1) % capacity){
            return true;
        }
            return false;
    }
    public boolean isEmpty(){
        if(front == rear){
            return true;
        }
        return false;
    }
    public int size(){
        return (rear - front + capacity)%capacity;
    }

    //入队操作
    public boolean enqueue(E e){
        if(isFull() == true){
            return false;
        }
        data[rear] = e;
        rear = (rear + 1)%capacity;
        return true;
    }
    //出队操作
    public E dequeue(){
        if(isEmpty() == true){
            return null;
        }
        E result = (E) data[front];
        data[front] = null;
        front = (front + 1)%capacity;
        return result;
    }
    public E peek(){
        return (E) data[0];
    }
}
