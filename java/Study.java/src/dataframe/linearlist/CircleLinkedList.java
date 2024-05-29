package dataframe.linearlist;

public class CircleLinkedList <E>{

    //定义一个内部类
    public class Node{
        E data;
        protected Node next;

        public Node(E data,Node next){
            this.data = data;
            this.next = next;
        }
    }
        //最后一个节点(声明为protected的目的是:可以在joseph里用),
         protected Node last;
        //第一个节点
        protected Node first;
        //循环链表的长度
        protected int size;
        //默认初始化构造器
        public CircleLinkedList(){
            this.first = null;
            this.last = null;
            this.size = 0;
    }
        //判断链表是否为空
         public boolean isEmpty(){
            return first == null;
    }
        //通过index获取节点
        public Node getNode(int index) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("illegal");
            }
            //从第一个节点开始查询到index位置的Node
            Node node = first;
            for(int i = 0;i < index;i++){
                node = node.next;
            }
            return node;
        }

        //获取index位置的数据
        public E get(int index){

            return getNode(index).data;
        }

        //在末尾添加元素
        public void addAtTail(E data){
            //调用构造器，让next为null，就实现了让newNode为tail
            Node newNode = new Node(data,null);
            //判断链表是否为空
            if(size == 0){
                first = newNode;
                last = newNode;
                //为什么first.next = newNode;而不是first.next = last;
                first.next = newNode;
            }else{
                last.next = newNode;
                newNode.next = first;
                //忘记了最后一步
                last = newNode;
            }
            size ++;
        }
        //在指定位置删除
        public E remove(int index) {
            if (index < 0 || index >= size) {
                throw new IllegalArgumentException("illegal");
            }
            //用来接受数据data
            E ret = null;
            //如果删除的是第一个位置的元素
            if (index == 0) {
                ret = first.data;
                first = first.next;
                last.next = first;
            } else {
                //定位到目标删除位置的前一个位置
                Node prev = getNode(index - 1);
                ret = prev.next.data;
                prev.next = prev.next.next;
                //如果删除最末尾的
                if (index == size - 1) {
                    last = prev;
                }
            }
            size--;
            return ret;
        }
        //查找指定元素的下标，如果有返回index，如果没有返回-1
        public int locate(E element){
            //从第一个元素开始
            //Node current = first;
           //自己写的：
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
        //获取链表长度
        public int getSize(){
            return size;
        }
        //toString方法
    public String toString(){
            StringBuffer res = new StringBuffer();
            res.append(String.format("Array:size%d\n",size));
            res.append("[");
            Node current = first;
            //依次打印链表里面的数据
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
            list1.addAtTail("张三");
            list1.addAtTail("李四");
            list1.addAtTail("王五");
            list1.addAtTail("赵六");
            list1.addAtTail("王七");

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
