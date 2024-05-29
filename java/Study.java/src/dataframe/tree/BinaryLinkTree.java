package dataframe.tree;

import java.util.Arrays;
import java.util.Stack;

//����������������ȡ˫�׽ڵ�
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

    //ǰ�����(�Ӹ��ڵ㵽�������ٵ�������)
    public void preOrder(BinaryNode<E>root){
        if(root != null){
            System.out.println(root.getData().toString());
            preOrder(root.getlChild());
            preOrder(root.getrChild());
        }
    }
    //�ǵݹ��㷨
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

    //�������
    public void midOrder(BinaryNode<E>root){
        if(root != null){
            preOrder(root.getlChild());
            System.out.println(root.getData().toString());
            preOrder(root.getrChild());
        }
    }
    //�������
    public void lasOrder(BinaryNode<E>root){
        if(root != null){
            preOrder(root.getlChild());
            preOrder(root.getrChild());
            System.out.println(root.getData().toString());
        }
    }
    //��ȡ˫�׽ڵ�
    //1.�����Ϊ��
    //2.���Ϊ���ڵ�ĺ��ӽڵ�
    //3.���Ϊ�����ڵ�
    public BinaryNode<E> parent(BinaryNode<E>root,BinaryNode<E> d){
        //Ϊ���򷵻ؿ�
        if(root == null){
            return null;
        }
        //˫�׽ڵ�Ϊ���ڵ�Ļ�������root
        if(root.getlChild() == d || root.getrChild() == d){
            return root;
        }
        //Ϊ�����ڵ�Ļ����������ж������Ϊ���Һ�˫�׽ڵ��������ͬ���򷵻�
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
    //��ȡ��Ҷ�ڵ�ĸ���
    //����������Ҷ�ӽڵ�ĸ�����������������Ҷ�ӽڵ�ĸ���
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
    //��ȡ�ڵ�ĸ������������ķ�ʽ
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
    //��ȡ�������
    //����������Ⱥ�����������ȱȽϣ�ȡ�ϴ��һ����Ȼ���һ
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
    //����
    public int search(int start,int end,E[] data,E ele){
        for(int i = 0;i <= end;i++){
            if(data[i].equals(ele)){
                return i;
            }
        }
        return -1;
    }
    //����ǰ���������������
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
    //ǰ����չ������������
    int index = 0;
    public BinaryNode<E> buildTree1(E[] preOrder,E val){
        //���Ƚ������ڵ�(����Ϊ��)���ж�
        BinaryNode<E> root = null;
        //Ȼ���ж�������ַ��Ƿ�Ϊ����Ĳ�����#
        //������ǾʹӸ��ڵ㿪ʼset���Һ���(�ǵ�������һ��Ԫ��)
        if (!preOrder[index].equals(val)) {
            root = new BinaryNode<E>(null,null,preOrder[index]);
            index++;
            //�ݹ�ʱ�������������������set���������ú�index++
            root.setlChild(buildTree1(preOrder,val));
            root.setrChild(buildTree1(preOrder,val));
        }else{
            //����Ǿ�ʲôҲ����ֻ�ǵ���һ������Ԫ��
            index++;
        }
        return root;
    }
}
