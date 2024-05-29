package dataframe.tree;

import java.util.Stack;

//通过算术表达式建立二叉树(返回值为一棵二叉树)
public class ExpressionTree<E> extends Tree<E> {
    //先声明一个树根(声明为null是因为不知道树根是否为空,类型为String(因为操作数和操作符))
    BinaryNode<String> root = null;
    //写一个方法：通过后缀表达式计算算术表达式的值的方式建立二叉树(名字为createTree)
    //问题：不知道应该传什么参数进去
    public BinaryLinkTree createtTree(String expression){
        //方法内容：先建立一个栈(栈里每一个都是节点类型)
        Stack<BinaryNode<Character>> stack = new Stack<>();

        //用一个字符类型的类接收
        //问题：不知道用什么来调用charAt从而遍历(通过传入的表达式)：解决
        for(int i = 0;i < expression.length()-1;i++){
            char ch = expression.charAt(i);
            //遍历表达式里所有的元素，如果为操作符，则建立一个类型为Character的节点将操作符放入节点
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                BinaryNode<Character> node = new BinaryNode<Character>(null,null,ch);
                //将栈里的操作数弹出，先弹出的为右子树的节点，后弹出的是左子树的节点
                BinaryNode rightchild = stack.pop();
                BinaryNode leftchild = stack.pop();
                //然后将pop();出的操作数set给右孩子和左孩子
                node.setlChild(leftchild);
                node.setrChild(rightchild);
                //然后将此二叉树进栈
                stack.push(node);
            }else{
                //如果为操作数，则创建一个新的节点，将操作数放进去然后进栈
                BinaryNode node = new BinaryNode<>(null,null,ch);
                stack.push(node);
            }
        }
        return new BinaryLinkTree((BinaryNode)stack.pop());
    }
}
