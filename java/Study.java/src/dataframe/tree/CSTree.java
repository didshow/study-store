package dataframe.tree;
import java.util.*;

class CSNode
{
    /**结点的数据*/
    char data;
    /**第一个孩子节点的位置*/
    private CSNode nextSibling;
    /**下一个兄弟节点的位置*/
    private CSNode firstChild;

    /**
     * 构造一个结点（同时设置下一个孩子节点和兄弟节点，以及当前节点的数据）
     *
     * @param d char 数据
     * @param c CSNode 下一个孩子结点的引用
     * @param s CSNode 下一兄弟结点的引用
     */
    public CSNode(char d,CSNode c,CSNode s)
    {
        data = d;
        nextSibling = s;
        firstChild = c;
    }

    /**
     * 获得第一个孩子结点
     *
     * @return CSNode 第一个孩子结点
     */
    public CSNode getFirstChild()
    {
        return firstChild;
    }

    /**
     * 获得下一个兄弟结点
     *
     * @return CSNode 下一个兄弟结点
     */
    public CSNode getNextSibling()
    {
        return nextSibling;
    }

    /**
     * 获得结点的数据
     *
     * @return char 结点的数据
     */
    public char getData()
    {
        return data;
    }
    /**
     * 设置下一个兄弟节点
     *
     * @param CSNode n 下一个兄弟结点
     */
    public void setNextSibling(CSNode n)
    {
        nextSibling = n;
    }

    /**
     * 设置第一个孩子结点
     *
     * @param CSNode n 第一个孩子结点
     */
    public void setFirstChild(CSNode n)
    {
        firstChild = n;
    }

    /**
     * 显示提示“输入子结点”,显示当前结点的数据并提示输入其孩子结点
     *
     */
    public void showInputChild()
    {
        System.out.println("请输入"+data+"的孩子结点，回车结束：");
    }
}
/**
 *
 本类实现了树（多叉）的孩子-兄弟存储

 * @version 1.0, 2008-01-23
 * @author 北京交通大学
 * @since JDK1.6
 */
public class CSTree
{
    /**孩子-兄弟树的头结点*/
    private CSNode head;

    /**
     * 构造函数，调用构造生成树
     *
     */
    public CSTree()
    {
        createTree();
    }

    /**
     * 构造函数，调用构造树
     *
     */
    public void createTree()
    {
//构造扫描器
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        String str = null;
        LinkedList<CSNode> list = new LinkedList<CSNode>();
        CSNode node = null,node1 = null;

//得到根节点的信息
        System.out.println("请输入根结点的数值:");
        str = scan.next();
        head = node = new CSNode(str.charAt(0),null,null);
        list.add(head);

//输入所有孩子结点
        while(!list.isEmpty())
        {
            node = list.removeFirst();
            node.showInputChild();
            str = scan.next();
            if(str.length()==0)
            {
                continue;
            }
            else
            {
                node1 = new CSNode(str.charAt(0),null,null);
                node.setFirstChild(node1);
                list.add(node1);

                for(int i=1;i<str.length();i++)
                {
                    node = node1;
                    node1 = new CSNode(str.charAt(i),null,null);
                    list.add(node1);
                    node.setNextSibling(node1);

                }
            }//else
        }//while

//处理垃圾
        list = null;
    }//function

    /**
     * 查找某结点
     * @param char c 要查找的结点的数据
     * @return CSNode 若找到则
     */
    private CSNode find(char c)
    {
        CSNode node = null,node1 = null;
        LinkedList<CSNode> list = new LinkedList<CSNode>();
        list.add(head);

        while(!list.isEmpty())
        {
            node = list.removeFirst();

            if(node!=null)
            {
                if(node.getData()==c)
                {
                    return node;
                }

                if(node.getFirstChild()!=null)
                {
                    list.add(node.getFirstChild());
                }

                if(node.getNextSibling()!=null)
                {
                    list.add(node.getNextSibling());
                }
            }

        }

        list = null;

        return null;
    }

    /**
     * 查找某结点的双亲结点
     * @param char c 要查找的结点的数据
     * @return CSNode 若找到双亲结点则返回其引用，否则返回null
     */
    public CSNode getParent(char c)
    {
        CSNode node = null,node1 = null;
        LinkedList<CSNode> list = new LinkedList<CSNode>();

        list.add(head);

        while(!list.isEmpty())
        {
            node = list.removeFirst();
            if(node!=null)
            {
                node1 = node.getFirstChild();
                while(node1!=null)
                {
                    list.add(node1);
                    if(node1.getData() == c)
                    {
                        return node;
                    }
                    node1 = node1.getNextSibling();
                }
            }//if
        }//while

        return null;

    }//function

    /**
     * 查找某结点的最左孩子结点
     * @param char c 要查找的结点的数据
     * @return CSNode 若找到最左孩子结点则返回其引用，否则（无孩子或者无该结点）返回null
     */
    public CSNode leftChild(char c)
    {
        CSNode node = find(c);
        if(node==null)
        {
            System.out.println("结点"+c+"不存在.");
            return null;
        }

        return node.getFirstChild();
    }

    /**
     * 查找某结点的右兄弟结点
     * @param char c 要查找的结点的数据
     * @return CSNode 若找到最右兄弟结点则返回引用，否则（无孩子或者无该结点）返回null
     */
    public CSNode rightSibling(char c)
    {
        CSNode node = find(c);
        if(node==null)
        {
            System.out.println("结点"+c+"不存在.");
            return null;
        }

        return node.getNextSibling();
    }

    /**
     * 查找某结点的最右孩子结点
     * @param char c 要查找的结点的数据
     * @return CSNode 若找到最右孩子结点则返回其引用，否则（无孩子或者无该结点）返回null
     */
    public CSNode rightChild(char c)
    {
        CSNode node = find(c);
        if(node==null)
        {
            System.out.println("结点"+c+"不存在.");
            return null;
        }

        node = node.getFirstChild();
        while(node.getNextSibling()!=null)
        {
            node = node.getNextSibling();
        }

        return node;
    }

    /**
     * 显示某结点的所有孩子结点(仅仅一层)
     *
     */
    public void printChilds(char c)
    {
//找到数据为char c的结点
        CSNode node = find(c);

//没找到
        if(node==null)
        {
            System.out.println("结点" + c + "不存在.");
            return ;
        }

//找到了，输入其孩子结点
        node = node.getFirstChild();
        System.out.print(c+"的孩子结点有：");
        while(node!=null)
        {
            System.out.print(node.getData() + " ");
            node = node.getNextSibling();
        }

        System.out.print("\n");

    }

    /**
     * 后根序遍历树的递归调用
     *
     *
     */
    private void postFun(CSNode node)
    {

        if(node!=null)
        {
            if(node.getFirstChild()==null)
            {
//若无孩子结点，则打印当前结点，然后遍历下一个兄弟结点
                System.out.print(node.getData()+ " ");
                postFun(node.getNextSibling());
            }
            else
            {
//若右孩子结点，则先访问孩子结点，再访问自己，最后是下一个兄弟节点
                postFun(node.getFirstChild());
                System.out.print(node.getData()+ " ");
                postFun(node.getNextSibling());
            }
        }
    }

    /**
     * 后根序遍历树(调用递归)
     *
     */
    public void postOrderTraverse()
    {
        System.out.print("后根序遍历树:");
        postFun(head);
        System.out.println(" ");
    }

    /**
     * 层序遍历树(非递归)
     *
     */
    public void leveTraverse()
    {
        CSNode node = head,node1 = null;
        LinkedList<CSNode> list = new LinkedList<CSNode>();
        list.add(node);
        System.out.print("层序遍历树：");
        while(!list.isEmpty())
        {
            node = list.remove();
            while(node!=null)
            {
                if(node.getFirstChild()!=null)
                {
                    list.add(node.getFirstChild());
                }
                System.out.print(node.getData() + " ");
                node = node.getNextSibling();
            }
        }

        System.out.print("\n");
        list = null;
    }
    /**
     * 先根序遍历树的递归调用
     *
     *
     */
    public void preFun(CSNode node)
    {
        if(node!=null)
        {
            System.out.print(node.getData() + " ");
            preFun(node.getFirstChild());
            preFun(node.getNextSibling());
        }
    }

    /**
     * 先根序遍历树(递归)
     *
     */
    public void preOrderTraverse()
    {
        CSNode node = head;
        System.out.print("先根序遍历树:");
        preFun(head);

    }

    /**
     * 测试函数
     *
     */
    public static void main(String [] args)
    {
        CSTree t = new CSTree();

        t.printChilds('B');
        System.out.println("F的双亲为:"+t.getParent('F').getData());

//System.out.println("B的左孩子结点为:"+t.leftChild('B').getData());
        System.out.println("R的右孩子结点为:"+t.rightChild('R').getData());
        t.postOrderTraverse();
        t.leveTraverse();
        t.preOrderTraverse();
    }
}
