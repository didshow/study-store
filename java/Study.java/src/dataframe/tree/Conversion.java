package dataframe.tree;

public class Conversion<E> extends Tree<E> {
    private TreeNode<E> [] tree;
    public TreeNode<E> getNode(int index){
        return tree[index];
    }
    public BinaryNode toBinaryTreeNode(TreeNode<E> treeNode){
        //newһ������ΪBinaryNode�Ķ���bTreeNode
        BinaryNode bTreeNode = new BinaryNode<>(null,null,null);
        //��bTreeNode������ֵΪ��TreeNode���͵�treeNode������
        bTreeNode.setData(treeNode.getData());
        //����һ����ʱ�ڵ�ΪbTreeNode
        BinaryNode temp = bTreeNode;

        //�ж��Ƿ����ӽڵ㣬�������������е��ӽڵ㣬���ҵݹ���ã���ÿ���ӽڵ�ת��Ϊ�������Ľڵ�
        if(treeNode.firstChild != null){
            for(int i = 0;i < treeNode.firstChild.size();i++){
                BinaryNode ttemp = toBinaryTreeNode(getNode(treeNode.getChild(i)));
                if(i == 0){
                    //���i=0�����������Ϊ�ղŵ��Ǹ��������ڵ㣬
                    temp.setlChild(ttemp);
                    //�α�ָ���һ�ӽڵ㣨��һ�ӽ����Ǻ��ӽڵ㣩
                    temp = (BinaryNode) temp.getlChild();
                }else{
                    //����Ͱѵڶ����ӽڵ���ڵ�һ���ӽڵ����������
                    temp.setrChild(ttemp);
                    //��ʱ����ָ���Һ���
                    temp = (BinaryNode) temp.getrChild();
                }
            }
        }
        return bTreeNode;
    }
}

