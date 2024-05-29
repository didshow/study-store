package dataframe.tree;

public class ChildLinkedTree<E> extends Tree<E> {
    //内部类TreeNode

    //建立一个数组（数组元素类型为TreeNode）名字为tree
    private TreeNode<E> [] tree;
    //声明数组的size
    private int size;
    private int root;
    //构造器只知道size
    public ChildLinkedTree(int size){
        this.size = size ;
        this.tree = new TreeNode[size];
        this.root = -1;
    }
    //getSize方法
    public int getSize(){
        return size;
    }
    //getNode方法：通过索引查找树的节点的下标（数组中）
    public TreeNode<E> getNode(int index){
        return tree[index];
    }
    //getNodeValue：通过index查找树节点的值（数组中）
    public E getNodeValue(int index){
        return tree[index].getData();
    }
    //获取树的深度（getDepth）:不理解
    public int getDepth(Integer integer){
        int max = 0;
        int height = 0;
        int rootindex = 0;
        //如果根节点没有孩子节点，返回1
        if(tree[rootindex].firstChild.size() == 0){
            return 1;
        }
        //循环：按照层遍历的方式遍历每一个元素
        //遍历根节点的每一个孩子然后寻找他们中深度最深的返回
        for(int i = 0;i < tree[rootindex].firstChild.size();i++){
            height = getDepth(tree[rootindex].firstChild.get(i));
            if(height > max){
                max = height;
            }
        }
        return max+1;
    }
    //找双亲节点（parent）:给出一个元素的数据，找它双亲节点的数据
    public E parent(E data){
        //遍历树的所有节点（层遍历）
        for(int i = 0; i < tree.length; i++){
            for(int j = i+1; i < tree.length; j++){
                //如果树的孩子链表里有元素数据与之相同，那么返回
                if(tree[tree[i].firstChild.get(j)].getData() == data){
                    return tree[i].getData();
                }
            }
        }
        //如果没有返回null
        return null;
    }
    //找孩子节点（Children）
    //为什么要把孩子节点设置为一个数组
    public E[] Children(E data){
        if(data == null){
            return null;
        }
        int index = -1;
        //遍历数组树的所有元素
        //数组里有元素和输入的数据相等，那么返回它的下标
        for(int i = 0; i < tree.length;i++){
            if(tree[i].getData().equals(data)){
                index = i;
            }
        }
        //创建一个孩子的数组（便于查找一个双亲节点的第几个孩子是谁）
        E[]child = (E[]) new Object[tree[index].firstChild.size()];
        for(int i = 0;i < tree[index].firstChild.size();i++){
            child[i] = (E)tree[tree[index].firstChild.get(i)].getData();
        }
        return child;
    }
    //测试代码：CV

}
