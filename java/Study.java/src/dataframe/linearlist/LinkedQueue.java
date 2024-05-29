package dataframe.linearlist;

public class LinkedQueue<E> {
    public class Node<E>{

        private E data;
        private Node nextNode;

        public Node(){
            this(null,null);
        }
        public Node(E data,Node<E> nextNode){
            this.data = data;
            this.nextNode = nextNode;
        }
        public E getData(){
            return data;
        }
        public void setData(E data){
            this.data = data;
        }
        public Node<E> getNextNode(){
            return nextNode;
        }
        public void setNextNode(Node<E> nextNode){
            this.nextNode = nextNode;
        }

    }
    private Node dummyHead;
    private int size;
    Node front = dummyHead.nextNode;
    Node rear;
    public int getSize(){
        return size;
    }
    //���(�Ӷ�β���)
    public boolean enqueue(E e){
        Node node = new Node(e,null);
        if(size == 0){
            front = rear;
        }else{
            rear.setNextNode(node);
            rear = node;
        }
        size ++;
        return true;
    }
    //����(�Ӷ�ͷ����)
    public E dequeue(){
        Node node = front.getNextNode();
        E e = (E) node.getData();
        if(size == 0){
            return null;
        }else if(node.getNextNode() == null){
            rear =front;
        }else{
            front = front.getNextNode();
        }
        size --;
        return e;
    }
}
