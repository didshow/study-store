package dataframe.linearlist;


    //�������ʵ��

    public class LinkedList<E> {

        //(�ڲ���)�ڵ�
        private class Node {

            //������
            private E data;

            //��һ���ڵ�
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

        //������
        private int size;
        public int getSize(){
            return this.size;
        }
        //����ͷ�ڵ�(��ֹͷ�ļ�Ϊ��)
        private Node dummyHead;

        //�ղι�����
        public LinkedList() {
            this.size = 0;
            //����dummyHead�Ķ���(dummyHeadΪNode����)
            dummyHead = new Node();
        }

        //��ָ��λ�����(��ӳɹ�����true�����ʧ�ܷ���false)
        public boolean add(int index, E data) {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("illegal");
            }
            //�ó�ʼλ����dummyHead�Ӷ���λ
            Node prev = dummyHead;          //prevΪĿ��Ԫ�ص�ǰһ��Ԫ��

            //��λ��ָ��λ�õ�ǰһ��λ��
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            //Ŀ��Ԫ��
            Node node = new Node();

            //1. ��prev����һ���ڵ㴫��node����һ���ڵ�
            node.next = prev.next;
            //prev����һ���ڵ�Ϊnode
            prev.next = node;
            size++;
            return true;
        }

        //ɾ��ָ��λ�õ�Ԫ��
        public E delete(int index, E data) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("illegal");
            }
            if (size == 0) {
                throw new IllegalArgumentException("out");
            }

            //��dummyHead��ʼ�����ڶ�λ
            Node prev = dummyHead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            //Ŀ��ɾ��Ԫ��
            Node result = new Node();
            //1.��prevָ��result����һ�����Ͽ���prev��result����ϵ��
            prev.next = result.next;
            //2.��resultΪ�գ�ɾ��result��
            result.next = null;
            //ά��size��ֵ
            size--;
            //����result������
            return result.data;
        }

        //��ѯ�Ƿ������һ��Ԫ��element
        public boolean contain(E element) {
            //��ͷ������һ���ڵ㿪ʼ
            Node current = dummyHead.next;
            for (int i = 0; i < size; i++) {
                if (current.data.equals(element)) {
                    return true;
                }
            }
            return false;
    }
}
