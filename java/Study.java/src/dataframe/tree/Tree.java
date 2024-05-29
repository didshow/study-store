package dataframe.tree;

import java.util.LinkedList;

public class Tree <E>{
    class BinaryNode <E>{
        private BinaryNode lChild;
        private BinaryNode rChild;
        private E data;

        public BinaryNode(){
            this(null,null,null);
        }
        public BinaryNode(BinaryNode<E>lChild,BinaryNode<E>rChild,E data){
            this.data = data;
            this.lChild = lChild;
            this.rChild = rChild;
        }
        public E getData(){
            return data;
        }
        public void setData(E data){
            this.data = data;
        }
        public BinaryNode<E> getlChild(){
            return  lChild;
        }
        public void setlChild(BinaryNode<E>lChild){
            this.lChild = lChild;
        }
        public BinaryNode<E> getrChild(){
            return rChild;
        }
        public void setrChild(BinaryNode<E>rChild){
            this.rChild = rChild;
        }
    }
}
