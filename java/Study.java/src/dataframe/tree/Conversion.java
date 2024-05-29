package dataframe.tree;

public class Conversion<E> extends Tree<E> {
    private TreeNode<E> [] tree;
    public TreeNode<E> getNode(int index){
        return tree[index];
    }
    public BinaryNode toBinaryTreeNode(TreeNode<E> treeNode){
        //new一个类型为BinaryNode的对象bTreeNode
        BinaryNode bTreeNode = new BinaryNode<>(null,null,null);
        //给bTreeNode数据域赋值为：TreeNode类型的treeNode的数据
        bTreeNode.setData(treeNode.getData());
        //创建一个临时节点为bTreeNode
        BinaryNode temp = bTreeNode;

        //判断是否有子节点，如果有则遍历所有的子节点，并且递归调用，让每个子节点转换为二叉树的节点
        if(treeNode.firstChild != null){
            for(int i = 0;i < treeNode.firstChild.size();i++){
                BinaryNode ttemp = toBinaryTreeNode(getNode(treeNode.getChild(i)));
                if(i == 0){
                    //如果i=0则把左孩子设置为刚才的那个二叉树节点，
                    temp.setlChild(ttemp);
                    //游标指向第一子节点（第一子结点就是孩子节点）
                    temp = (BinaryNode) temp.getlChild();
                }else{
                    //否则就把第二个子节点放在第一个子节点的右子树上
                    temp.setrChild(ttemp);
                    //临时变量指向右孩子
                    temp = (BinaryNode) temp.getrChild();
                }
            }
        }
        return bTreeNode;
    }
}

