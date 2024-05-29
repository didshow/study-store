package dataframe.linearlist;


    //单链表的实现

    public class LinkedList<E> {

        //(内部类)节点
        private class Node {

            //数据流
            private E data;

            //下一个节点
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

        //链表长度
        private int size;
        public int getSize(){
            return this.size;
        }
        //虚拟头节点(防止头文件为空)
        private Node dummyHead;

        //空参构造器
        public LinkedList() {
            this.size = 0;
            //创建dummyHead的对象(dummyHead为Node类型)
            dummyHead = new Node();
        }

        //在指定位置添加(添加成功返回true，添加失败返回false)
        public boolean add(int index, E data) {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("illegal");
            }
            //让初始位置在dummyHead从而定位
            Node prev = dummyHead;          //prev为目标元素的前一个元素

            //定位到指定位置的前一个位置
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            //目标元素
            Node node = new Node();

            //1. 将prev的下一个节点传给node的下一个节点
            node.next = prev.next;
            //prev的下一个节点为node
            prev.next = node;
            size++;
            return true;
        }

        //删除指定位置的元素
        public E delete(int index, E data) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("illegal");
            }
            if (size == 0) {
                throw new IllegalArgumentException("out");
            }

            //从dummyHead开始，便于定位
            Node prev = dummyHead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            //目标删除元素
            Node result = new Node();
            //1.让prev指向result的下一个（断开了prev和result的联系）
            prev.next = result.next;
            //2.让result为空（删除result）
            result.next = null;
            //维护size的值
            size--;
            //返回result的数据
            return result.data;
        }

        //查询是否包含有一个元素element
        public boolean contain(E element) {
            //从头结点的下一个节点开始
            Node current = dummyHead.next;
            for (int i = 0; i < size; i++) {
                if (current.data.equals(element)) {
                    return true;
                }
            }
            return false;
    }
}
