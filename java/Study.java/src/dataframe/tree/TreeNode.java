package dataframe.tree;

import java.util.LinkedList;

    public class TreeNode<E>{
        //数据域
        private E data;
        //孩子链表（里面存储的是：孩子节点的下标）
        LinkedList<Integer> firstChild;
        //构造器
        public TreeNode(){
            //如果树为空，则创建一个新的链表
            this.firstChild = new LinkedList<>();
        }
        //get、set方法
        public E getData(){
            return data;
        }
        public void setData(E data){
            this.data = data;
        }
        //添加孩子节点（addChild）:在孩子链表里面添加
        public void addChild(int index){
            firstChild.add(index);
        }
        //通过孩子节点在链表中的索引查找链表中孩子节点的下标
        public int getChild(int index){
            return firstChild.get(index);
        }
}
