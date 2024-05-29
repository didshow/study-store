package dataframe.tree;

public class PTree <E>{
    //创建一个内部类（名字为PTNode）有两个指针（一个数据域，双亲节点）
    public class PTNode<E>{
       private E data;
       private int parent;
        public void setData(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public void setParent(int parent) {
            this.parent = parent;
        }

        public int getParent() {
            return parent;
        }
        //构造器
        public PTNode(E data){
            this.data = data;
        }
        public PTNode(E data,int parent){
            this.data = data;
            this.parent = parent;
        }
    }


    //声明一个PTNode类型的数组名字为nodes（相当于双亲树是由一个一位数组组成，里面存的是双亲节点的下标）
    PTNode nodes[];
    public PTree(int size){
        nodes = new PTNode[size];
    }
    //createPTree方法:数组的每一个元素都是一个节点，节点里储存的是两个指针（数据和双亲节点的下标）
    public void createPTree(E[]data,int[]index){
        for(int i = 0; i < nodes.length; i++){
            nodes[i] = new PTNode(data[i],index[i]);
        }
    }
    //层遍历（打印根节点，用for循环打印每一个元素）
    public void levelOrder(){
        System.out.print(nodes[0].getData());
        //遍历的逻辑：i为每一行，j为i那一行的孩子节点的遍历，孩子节点不可能比双亲节点的下标小
        for(int i = 0; i < nodes.length; i++){
            for(int j = i + 1; j < nodes.length;j++){
                if(nodes[j].getParent() == i){
                    System.out.print(nodes[j].getData());
                }
            }
        }
        //换行
        System.out.println();
    }
    //寻找双亲节点（getParentNode）:遍历所有节点，如果有一个节点的数据和传入的元素ele相等那么就返回他的双亲的数据
    public E getParentNode(E ele){
        for(int i = 0; i < nodes.length; i++){
            if(nodes[i].getData().equals(ele)){
                //简单的理解：孩子节点的双亲节点下标是已知的
                return (E) nodes[nodes[i].getParent()].getData();
            }
        }
        return null;
    }
    //寻找孩子节点（getChildNode）：创建一个数组，将孩子节点存放进去，为了避免数组容量大小不够，将这个数组的容量声明为所有节点的个数
    public E[] getChildNode(E ele){
        //用来记录一个节点有几个孩子
        int num = 0;
        //首先创建一个容量为nodes.length的数组
        Object[] children = new Object[nodes.length];
        //遍历所有的节点,如果此节点的双亲节点为i，那么他就是i的孩子节点
        for(int i = 1; i < nodes.length; i++){
            if(nodes[nodes[i].getParent()].getData().equals(ele)){
                children[num] = (E) nodes[i].getData();
                num++;
            }
        }
        //没有用的数组长度设为null
        for(int i = num ; i < nodes.length; i++){
            children[i] = null;
        }
        //最后返回这个孩子节点的数组
        return (E[])children;
    }
    //获取深度（getDepth）:获取每个节点所在的层数，每次比较记录较大的一个
    public int getDepth(){
        //用来存放深度的数据
        int parent = 0;
        int max = 0;
        int height = 0;
        for(int i = 0; i < nodes.length; i++){
            //初始化：每次循环都把height初始为1，并且找到parent的位置
            height = 1;
            parent = nodes[i].getParent();
            //用while不用if的原因：要找到第i个节点到根节点总共要经历几层，如果用if的话只会遍历一层
            while(parent != -1){
                parent = nodes[parent].getParent();
                height ++;
            }
            if(height > max){
                max = height;
            }
        }
        return max;
    }
    //测试代码：cv大法
    public static void main(String[] args) {
        Character[] data = {'A','B','C','D','E','F','G','H','I'};
        int[] idx = {-1, 0, 0, 1, 1, 1, 2, 2, 4};

        PTree<Character> ptree = new PTree<>(9);
        ptree.createPTree(data, idx);
        System.out.println("树的高度为："+ ptree.getDepth());
        ptree.levelOrder();
        System.out.println("节点 D 的双亲是： " + ptree.getParentNode('D'));

        Object[] chlds = ptree.getChildNode('B');
        System.out.print("节点 B的孩子节点有： ");
        for(int i = 0; i < chlds.length; i++)
            if(chlds[i] != null)
                System.out.print(chlds[i] + " ");

        System.out.println();
    }

}
