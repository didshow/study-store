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
    //入队(按照数字越小priority越大)
    //先进行遍历，找到优先级数字大于当前节点的节点，然后
    public boolean enqueue(E data,int priority){
        PriorityNode pnode = new PriorityNode(data,null,priority);
        //当前节点的前一个节点
        PriorityNode pre = dummyHead;
        //当前节点
        PriorityNode current = pnode.getNextNode();
        //遍历，当当前优先级数字大于待插入节点则停止
        //pre 是待插入节点前一个节点 current 是待插入节点的后一个 pnode是待插入节点。如果待插入节点的数字比下一个节点大则在它前面
        while(current.getPriority() <= priority && current != null){
            //定位pre
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
    //出队
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
