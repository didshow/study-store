package dataframe.tree;

import java.util.Stack;

//ͨ���������ʽ����������(����ֵΪһ�ö�����)
public class ExpressionTree<E> extends Tree<E> {
    //������һ������(����Ϊnull����Ϊ��֪�������Ƿ�Ϊ��,����ΪString(��Ϊ�������Ͳ�����))
    BinaryNode<String> root = null;
    //дһ��������ͨ����׺���ʽ�����������ʽ��ֵ�ķ�ʽ����������(����ΪcreateTree)
    //���⣺��֪��Ӧ�ô�ʲô������ȥ
    public BinaryLinkTree createtTree(String expression){
        //�������ݣ��Ƚ���һ��ջ(ջ��ÿһ�����ǽڵ�����)
        Stack<BinaryNode<Character>> stack = new Stack<>();

        //��һ���ַ����͵������
        //���⣺��֪����ʲô������charAt�Ӷ�����(ͨ������ı��ʽ)�����
        for(int i = 0;i < expression.length()-1;i++){
            char ch = expression.charAt(i);
            //�������ʽ�����е�Ԫ�أ����Ϊ������������һ������ΪCharacter�Ľڵ㽫����������ڵ�
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                BinaryNode<Character> node = new BinaryNode<Character>(null,null,ch);
                //��ջ��Ĳ������������ȵ�����Ϊ�������Ľڵ㣬�󵯳������������Ľڵ�
                BinaryNode rightchild = stack.pop();
                BinaryNode leftchild = stack.pop();
                //Ȼ��pop();���Ĳ�����set���Һ��Ӻ�����
                node.setlChild(leftchild);
                node.setrChild(rightchild);
                //Ȼ�󽫴˶�������ջ
                stack.push(node);
            }else{
                //���Ϊ���������򴴽�һ���µĽڵ㣬���������Ž�ȥȻ���ջ
                BinaryNode node = new BinaryNode<>(null,null,ch);
                stack.push(node);
            }
        }
        return new BinaryLinkTree((BinaryNode)stack.pop());
    }
}
