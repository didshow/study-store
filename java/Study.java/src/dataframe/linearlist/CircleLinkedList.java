package dataframe.linearlist;

public class CircleLinkedList <E>{

    //����һ���ڲ���
    public class Node{
        E data;
        protected Node next;

        public Node(E data,Node next){
            this.data = data;
            this.next = next;
        }
    }
        //���һ���ڵ�(����Ϊprotected��Ŀ����:������joseph����),
         protected Node last;
        //��һ���ڵ�
        protected Node first;
        //ѭ������ĳ���
        protected int size;
        //Ĭ�ϳ�ʼ��������
        public CircleLinkedList(){
            this.first = null;
            this.last = null;
            this.size = 0;
    }
        //�ж������Ƿ�Ϊ��
         public boolean isEmpty(){
            return first == null;
    }
        //ͨ��index��ȡ�ڵ�
        public Node getNode(int index) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("illegal");
            }
            //�ӵ�һ���ڵ㿪ʼ��ѯ��indexλ�õ�Node
            Node node = first;
            for(int i = 0;i < index;i++){
                node = node.next;
            }
            return node;
        }

        //��ȡindexλ�õ�����
        public E get(int index){

            return getNode(index).data;
        }

        //��ĩβ���Ԫ��
        public void addAtTail(E data){
            //���ù���������nextΪnull����ʵ������newNodeΪtail
            Node newNode = new Node(data,null);
            //�ж������Ƿ�Ϊ��
            if(size == 0){
                first = newNode;
                last = newNode;
                //Ϊʲôfirst.next = newNode;������first.next = last;
                first.next = newNode;
            }else{
                last.next = newNode;
                newNode.next = first;
                //���������һ��
                last = newNode;
            }
            size ++;
        }
        //��ָ��λ��ɾ��
        public E remove(int index) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("illegal");
            }
            //������������data
            E ret = null;
            //���ɾ�����ǵ�һ��λ�õ�Ԫ��
            if (index == 0) {
                ret = first.data;
                first = first.next;
                last.next = first;
            } else {
                //��λ��Ŀ��ɾ��λ�õ�ǰһ��λ��
                Node prev = getNode(index - 1);
                ret = prev.next.data;
                prev.next = prev.next.next;
                //���ɾ����ĩβ��
                if (index == size - 1) {
                    last = prev;
                }
            }
            size--;
            return ret;
        }
        //����ָ��Ԫ�ص��±꣬����з���index�����û�з���-1
        public int locate(E element){
            //�ӵ�һ��Ԫ�ؿ�ʼ
            //Node current = first;
           //�Լ�д�ģ�
           // for(int i = 0;i < index;i++){
           //     if (current.data.equals(element)){
           //         return index;
           //     }
           //     current = current.next;
           // }
            Node current = first;
            if(current.data.equals(element)){
                return 0;
            }
            int index = 1;
            while (current.next != first) {
                if(current.next.data.equals(element)) {
                    return index;
                }
                current = current.next;
                index++;
            }
            return -1;
        }
        //��ȡ������
        public int getSize(){
            return size;
        }
        //toString����
    public String toString(){
            StringBuffer res = new StringBuffer();
            res.append(String.format("Array:size%d\n",size));
            res.append("[");
            Node current = first;
            //���δ�ӡ�������������
            for(int i = 0;i < size;i++){
                res.append(current.data.toString());
                if(i != size - 1){
                    res.append(",");
                }
                current = current.next;
            }
            res.append("]");
            return res.toString();
    }
    public static void main(String [] args){
            CircleLinkedList<String> list1 = new CircleLinkedList<>();
            list1.addAtTail("����");
            list1.addAtTail("����");
            list1.addAtTail("����");
            list1.addAtTail("����");
            list1.addAtTail("����");

            for(int i = 0;i < 5;i++){
                String ele = list1.get(i);
                System.out.println(ele);
            }
            System.out.println(list1);
            list1.remove(3);
            System.out.println(list1);
            try {
                System.out.println(list1.get(5));
            }catch(IllegalArgumentException e){
                System.out.println(e);
            }
            list1.remove(0);
            System.out.println(list1);
            list1.remove(1);
            System.out.println(list1);
            list1.remove(1);
             System.out.println(list1);
        try {
            list1.remove(3);
            System.out.println(list1);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
