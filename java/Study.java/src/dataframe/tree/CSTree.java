package dataframe.tree;
import java.util.*;

class CSNode
{
    /**��������*/
    char data;
    /**��һ�����ӽڵ��λ��*/
    private CSNode nextSibling;
    /**��һ���ֵܽڵ��λ��*/
    private CSNode firstChild;

    /**
     * ����һ����㣨ͬʱ������һ�����ӽڵ���ֵܽڵ㣬�Լ���ǰ�ڵ�����ݣ�
     *
     * @param d char ����
     * @param c CSNode ��һ�����ӽ�������
     * @param s CSNode ��һ�ֵܽ�������
     */
    public CSNode(char d,CSNode c,CSNode s)
    {
        data = d;
        nextSibling = s;
        firstChild = c;
    }

    /**
     * ��õ�һ�����ӽ��
     *
     * @return CSNode ��һ�����ӽ��
     */
    public CSNode getFirstChild()
    {
        return firstChild;
    }

    /**
     * �����һ���ֵܽ��
     *
     * @return CSNode ��һ���ֵܽ��
     */
    public CSNode getNextSibling()
    {
        return nextSibling;
    }

    /**
     * ��ý�������
     *
     * @return char ��������
     */
    public char getData()
    {
        return data;
    }
    /**
     * ������һ���ֵܽڵ�
     *
     * @param CSNode n ��һ���ֵܽ��
     */
    public void setNextSibling(CSNode n)
    {
        nextSibling = n;
    }

    /**
     * ���õ�һ�����ӽ��
     *
     * @param CSNode n ��һ�����ӽ��
     */
    public void setFirstChild(CSNode n)
    {
        firstChild = n;
    }

    /**
     * ��ʾ��ʾ�������ӽ�㡱,��ʾ��ǰ�������ݲ���ʾ�����亢�ӽ��
     *
     */
    public void showInputChild()
    {
        System.out.println("������"+data+"�ĺ��ӽ�㣬�س�������");
    }
}
/**
 *
 ����ʵ����������棩�ĺ���-�ֵܴ洢

 * @version 1.0, 2008-01-23
 * @author ������ͨ��ѧ
 * @since JDK1.6
 */
public class CSTree
{
    /**����-�ֵ�����ͷ���*/
    private CSNode head;

    /**
     * ���캯�������ù���������
     *
     */
    public CSTree()
    {
        createTree();
    }

    /**
     * ���캯�������ù�����
     *
     */
    public void createTree()
    {
//����ɨ����
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        String str = null;
        LinkedList<CSNode> list = new LinkedList<CSNode>();
        CSNode node = null,node1 = null;

//�õ����ڵ����Ϣ
        System.out.println("�������������ֵ:");
        str = scan.next();
        head = node = new CSNode(str.charAt(0),null,null);
        list.add(head);

//�������к��ӽ��
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

//��������
        list = null;
    }//function

    /**
     * ����ĳ���
     * @param char c Ҫ���ҵĽ�������
     * @return CSNode ���ҵ���
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
     * ����ĳ����˫�׽��
     * @param char c Ҫ���ҵĽ�������
     * @return CSNode ���ҵ�˫�׽���򷵻������ã����򷵻�null
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
     * ����ĳ���������ӽ��
     * @param char c Ҫ���ҵĽ�������
     * @return CSNode ���ҵ������ӽ���򷵻������ã������޺��ӻ����޸ý�㣩����null
     */
    public CSNode leftChild(char c)
    {
        CSNode node = find(c);
        if(node==null)
        {
            System.out.println("���"+c+"������.");
            return null;
        }

        return node.getFirstChild();
    }

    /**
     * ����ĳ�������ֵܽ��
     * @param char c Ҫ���ҵĽ�������
     * @return CSNode ���ҵ������ֵܽ���򷵻����ã������޺��ӻ����޸ý�㣩����null
     */
    public CSNode rightSibling(char c)
    {
        CSNode node = find(c);
        if(node==null)
        {
            System.out.println("���"+c+"������.");
            return null;
        }

        return node.getNextSibling();
    }

    /**
     * ����ĳ�������Һ��ӽ��
     * @param char c Ҫ���ҵĽ�������
     * @return CSNode ���ҵ����Һ��ӽ���򷵻������ã������޺��ӻ����޸ý�㣩����null
     */
    public CSNode rightChild(char c)
    {
        CSNode node = find(c);
        if(node==null)
        {
            System.out.println("���"+c+"������.");
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
     * ��ʾĳ�������к��ӽ��(����һ��)
     *
     */
    public void printChilds(char c)
    {
//�ҵ�����Ϊchar c�Ľ��
        CSNode node = find(c);

//û�ҵ�
        if(node==null)
        {
            System.out.println("���" + c + "������.");
            return ;
        }

//�ҵ��ˣ������亢�ӽ��
        node = node.getFirstChild();
        System.out.print(c+"�ĺ��ӽ���У�");
        while(node!=null)
        {
            System.out.print(node.getData() + " ");
            node = node.getNextSibling();
        }

        System.out.print("\n");

    }

    /**
     * �����������ĵݹ����
     *
     *
     */
    private void postFun(CSNode node)
    {

        if(node!=null)
        {
            if(node.getFirstChild()==null)
            {
//���޺��ӽ�㣬���ӡ��ǰ��㣬Ȼ�������һ���ֵܽ��
                System.out.print(node.getData()+ " ");
                postFun(node.getNextSibling());
            }
            else
            {
//���Һ��ӽ�㣬���ȷ��ʺ��ӽ�㣬�ٷ����Լ����������һ���ֵܽڵ�
                postFun(node.getFirstChild());
                System.out.print(node.getData()+ " ");
                postFun(node.getNextSibling());
            }
        }
    }

    /**
     * ����������(���õݹ�)
     *
     */
    public void postOrderTraverse()
    {
        System.out.print("����������:");
        postFun(head);
        System.out.println(" ");
    }

    /**
     * ���������(�ǵݹ�)
     *
     */
    public void leveTraverse()
    {
        CSNode node = head,node1 = null;
        LinkedList<CSNode> list = new LinkedList<CSNode>();
        list.add(node);
        System.out.print("�����������");
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
     * �ȸ���������ĵݹ����
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
     * �ȸ��������(�ݹ�)
     *
     */
    public void preOrderTraverse()
    {
        CSNode node = head;
        System.out.print("�ȸ��������:");
        preFun(head);

    }

    /**
     * ���Ժ���
     *
     */
    public static void main(String [] args)
    {
        CSTree t = new CSTree();

        t.printChilds('B');
        System.out.println("F��˫��Ϊ:"+t.getParent('F').getData());

//System.out.println("B�����ӽ��Ϊ:"+t.leftChild('B').getData());
        System.out.println("R���Һ��ӽ��Ϊ:"+t.rightChild('R').getData());
        t.postOrderTraverse();
        t.leveTraverse();
        t.preOrderTraverse();
    }
}
