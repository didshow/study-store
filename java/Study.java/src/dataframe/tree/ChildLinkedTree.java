package dataframe.tree;

public class ChildLinkedTree<E> extends Tree<E> {
    //�ڲ���TreeNode

    //����һ�����飨����Ԫ������ΪTreeNode������Ϊtree
    private TreeNode<E> [] tree;
    //���������size
    private int size;
    private int root;
    //������ֻ֪��size
    public ChildLinkedTree(int size){
        this.size = size ;
        this.tree = new TreeNode[size];
        this.root = -1;
    }
    //getSize����
    public int getSize(){
        return size;
    }
    //getNode������ͨ�������������Ľڵ���±꣨�����У�
    public TreeNode<E> getNode(int index){
        return tree[index];
    }
    //getNodeValue��ͨ��index�������ڵ��ֵ�������У�
    public E getNodeValue(int index){
        return tree[index].getData();
    }
    //��ȡ������ȣ�getDepth��:�����
    public int getDepth(Integer integer){
        int max = 0;
        int height = 0;
        int rootindex = 0;
        //������ڵ�û�к��ӽڵ㣬����1
        if(tree[rootindex].firstChild.size() == 0){
            return 1;
        }
        //ѭ�������ղ�����ķ�ʽ����ÿһ��Ԫ��
        //�������ڵ��ÿһ������Ȼ��Ѱ���������������ķ���
        for(int i = 0;i < tree[rootindex].firstChild.size();i++){
            height = getDepth(tree[rootindex].firstChild.get(i));
            if(height > max){
                max = height;
            }
        }
        return max+1;
    }
    //��˫�׽ڵ㣨parent��:����һ��Ԫ�ص����ݣ�����˫�׽ڵ������
    public E parent(E data){
        //�����������нڵ㣨�������
        for(int i = 0; i < tree.length; i++){
            for(int j = i+1; i < tree.length; j++){
                //������ĺ�����������Ԫ��������֮��ͬ����ô����
                if(tree[tree[i].firstChild.get(j)].getData() == data){
                    return tree[i].getData();
                }
            }
        }
        //���û�з���null
        return null;
    }
    //�Һ��ӽڵ㣨Children��
    //ΪʲôҪ�Ѻ��ӽڵ�����Ϊһ������
    public E[] Children(E data){
        if(data == null){
            return null;
        }
        int index = -1;
        //����������������Ԫ��
        //��������Ԫ�غ������������ȣ���ô���������±�
        for(int i = 0; i < tree.length;i++){
            if(tree[i].getData().equals(data)){
                index = i;
            }
        }
        //����һ�����ӵ����飨���ڲ���һ��˫�׽ڵ�ĵڼ���������˭��
        E[]child = (E[]) new Object[tree[index].firstChild.size()];
        for(int i = 0;i < tree[index].firstChild.size();i++){
            child[i] = (E)tree[tree[index].firstChild.get(i)].getData();
        }
        return child;
    }
    //���Դ��룺CV

}
