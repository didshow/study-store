package dataframe.tree;

import java.util.Arrays;
import java.util.Stack;

//二叉树：遍历、获取双亲节点
public class BinaryLinkTree <E> extends Tree<E> {
    private BinaryNode<E> root;
    public BinaryLinkTree(BinaryNode<E> root){
        this.root = root;
    }
    public BinaryLinkTree(){
        this(null);
    }
    public E getRoot(){
        return (E) root;
    }
    public void setRoot(BinaryNode<E>root){
        this.root = root;
    }

    //前序遍历(从根节点到左子树再到右子树)
    public void preOrder(BinaryNode<E>root){
        if(root != null){
            System.out.println(root.getData().toString());
            preOrder(root.getlChild());
            preOrder(root.getrChild());
        }
    }
    //非递归算法
    public void infixOrderNoRec(BinaryNode<E>root){
        Stack<BinaryNode> stack = new Stack<>();
        BinaryNode<E> node = root;
        while(node != null || !stack.isEmpty()){
            if(node != null){
                stack.push(node);
                node = node.getlChild();
            }else{
                node = stack.pop();
                System.out.println(node.getData().toString()+"\t");
                node = node.getrChild();
            }
        }
    }

    //中序遍历
    public void midOrder(BinaryNode<E>root){
        if(root != null){
            preOrder(root.getlChild());
            System.out.println(root.getData().toString());
            preOrder(root.getrChild());
        }
    }
    //后序遍历
    public void lasOrder(BinaryNode<E>root){
        if(root != null){
            preOrder(root.getlChild());
            preOrder(root.getrChild());
            System.out.println(root.getData().toString());
        }
    }
    //获取双亲节点
    //1.如果树为空
    //2.如果为根节点的孩子节点
    //3.如果为其他节点
    public BinaryNode<E> parent(BinaryNode<E>root,BinaryNode<E> d){
        //为空则返回空
        if(root == null){
            return null;
        }
        //双亲节点为根节点的话，返回root
        if(root.getlChild() == d || root.getrChild() == d){
            return root;
        }
        //为其他节点的话，用数据判断如果不为空且和双亲节点的数据相同，则返回
        BinaryNode<E> e;
       if(((e = parent(root.getlChild(),d))) != null){
           return e;
        }
       return parent(root.getrChild(),d);
    }
    public BinaryNode<E> getParent(BinaryNode<E> data){
        if(root == null || data == data){
            return null;
        }
        return parent(root,data);
    }
    //获取树叶节点的个数
    //左子树所有叶子节点的个数加上右子树所有叶子节点的个数
    public int countLeaf(BinaryNode<E>node){
        int cleft = 0;
        int cright = 0;
        if(root == null){
            return 0;
        }
        if(node.getlChild() == null && node.getrChild() == null){
            return 1;
        }
        cleft = countLeaf(node.getlChild());
        cright = countLeaf(node.getrChild());
        return cleft+cright;
    }
    //获取节点的个数（遍历）的方式
    public int countNode(BinaryNode<E>node){
        int cnl = 0;
        int cnr = 0;
        if(root == null){
            return 0;
        }
        cnl = countNode(node.getlChild());
        cnr = countNode(node.getrChild());
        return cnl + cnr +1;
    }
    public int getMax(int a,int b){
        int max = 0;
        if(a > b){
            max = a;
            return max;
        }else{
            max = b;
            return b;
        }
    }
    //获取树的深度
    //左子树的深度和右子树的深度比较，取较大的一个，然后加一
    public int getHigh(BinaryNode<E>node){
        int hl = 0;
        int hr = 0;

        if(root == null){
            return 0;
        }else if(root.getlChild() == null && root.getrChild() == null){
            return 1;
        }else{
            if(node.getlChild() != null){
                hl ++;
            }
            if(node.getrChild() != null){
                hr ++;
            }
        }
        return getMax(hl,hr)+1;
    }
    //查找
    public int search(int start,int end,E[] data,E ele){
        for(int i = 0;i <= end;i++){
            if(data[i].equals(ele)){
                return i;
            }
        }
        return -1;
    }
    //基于前序和中序建立二叉树
    public BinaryNode<E> buildTree(E[] preOrder,E[] infixOrder){
        if(preOrder.length == 0 && infixOrder.length == 0 ){
            return null;
        }
        BinaryNode<E> root = new BinaryNode<E>(null,null,preOrder[0]);
        int index = search(0,infixOrder.length - 1,infixOrder,preOrder[0]);

        root.setlChild(buildTree(Arrays.copyOfRange(preOrder,1,index+1),Arrays.copyOfRange(infixOrder,0,index)));
        root.setrChild(buildTree(Arrays.copyOfRange(preOrder,index+1,preOrder.length),Arrays.copyOfRange(infixOrder,index+1,infixOrder.length)));
        return root;
    }
    //前序扩展树建立二叉树
    int index = 0;
    public BinaryNode<E> buildTree1(E[] preOrder,E val){
        //首先建立根节点(声明为空)，判断
        BinaryNode<E> root = null;
        //然后判断输入的字符是否为特殊的操作符#
        //如果不是就从根节点开始set左右孩子(记得跳到下一个元素)
        if (!preOrder[index].equals(val)) {
            root = new BinaryNode<E>(null,null,preOrder[index]);
            index++;
            //递归时调用了这个方法，所以set左子树调用后，index++
            root.setlChild(buildTree1(preOrder,val));
            root.setrChild(buildTree1(preOrder,val));
        }else{
            //如果是就什么也不干只是到下一个数据元素
            index++;
        }
        return root;
    }
}
