package dataframe.test;

public class BinaryTreeTest <T>{

    static class BinaryTreeNode1<T>{
        private T data;
        private BinaryTreeNode1<T> lChild;
        private BinaryTreeNode1<T> rChild;
        private BinaryTreeNode1(T data,BinaryTreeNode1<T> l,BinaryTreeNode1<T> r){
            this.data = data;
            this.lChild = l;
            this.rChild = r;
        }
        public void setData(){
            this.data=data;
        }
    }
    private BinaryTreeNode1 root;
    public BinaryTreeTest(BinaryTreeNode1<T> root){
        new BinaryTreeNode1(root,null,null);
    }
    public void printNoLeafNode(BinaryTreeNode1 root){
        if(root.lChild == null ||  root.rChild==null){
            System.out.print(root+" ");
        }
    }
    public static void main(String[]args){
        BinaryTreeNode1<String> g = new BinaryTreeNode1<>("G",null,null) ;

    }
}
