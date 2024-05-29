package dataframe.linearlist;

public class PriorityQueue <E> {
    public class PriorityNode<E> {
        private E data;
        private PriorityNode nextNode;
        private int priority;

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public PriorityNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(PriorityNode nextNode) {
            this.nextNode = nextNode;
        }

        public PriorityNode() {
            this(null, null,0);
        }
        public PriorityNode(E data,PriorityNode<E>nextNode,int priority){
            this.data = data;
            this.priority = priority;
            this.nextNode = nextNode;
        }
    }
    private int size;
    private PriorityNode dummyHead;
    PriorityNode front = dummyHead.nextNode;
    PriorityNode rear;

    public int getSize(){
        return size;
    }
    public E peek(){
        if(size == 0){
            return null;
        }
        return (E) dummyHead.getNextNode().getData();
    }
    //���(��������ԽСpriorityԽ��)
    //�Ƚ��б������ҵ����ȼ����ִ��ڵ�ǰ�ڵ�Ľڵ㣬Ȼ��
    public boolean enqueue(E data,int priority){
        PriorityNode pnode = new PriorityNode(data,null,priority);
        //��ǰ�ڵ��ǰһ���ڵ�
        PriorityNode pre = dummyHead;
        //��ǰ�ڵ�
        PriorityNode current = pnode.getNextNode();
        //����������ǰ���ȼ����ִ��ڴ�����ڵ���ֹͣ
        //pre �Ǵ�����ڵ�ǰһ���ڵ� current �Ǵ�����ڵ�ĺ�һ�� pnode�Ǵ�����ڵ㡣���������ڵ�����ֱ���һ���ڵ��������ǰ��
        while(current.getPriority() <= priority && current != null){
            //��λpre
            pre = current;
            current = current.getNextNode(); 
        }
        pre.setNextNode(pnode);
        pnode.setNextNode(current);
        if(current == null){
            rear = pnode;
        }
        size++;
        return true;
    }
    //����
    public PriorityNode<E> dequeue(){
        PriorityNode pnode =dummyHead.getNextNode();
        E e1 = (E) front.getData();
        if(size == 0){
            return null;
        }else if(front.getNextNode() == null){
            front = rear;
        }else{
            dummyHead.setNextNode(pnode.getNextNode());
            pnode.setNextNode(null);
        }
       size--;
        if(size == 0){
            rear = front;
        }
        return pnode;
    }

}
