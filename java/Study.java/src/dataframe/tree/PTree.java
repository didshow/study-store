package dataframe.tree;

public class PTree <E>{
    //����һ���ڲ��ࣨ����ΪPTNode��������ָ�루һ��������˫�׽ڵ㣩
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
        //������
        public PTNode(E data){
            this.data = data;
        }
        public PTNode(E data,int parent){
            this.data = data;
            this.parent = parent;
        }
    }


    //����һ��PTNode���͵���������Ϊnodes���൱��˫��������һ��һλ������ɣ���������˫�׽ڵ���±꣩
    PTNode nodes[];
    public PTree(int size){
        nodes = new PTNode[size];
    }
    //createPTree����:�����ÿһ��Ԫ�ض���һ���ڵ㣬�ڵ��ﴢ���������ָ�루���ݺ�˫�׽ڵ���±꣩
    public void createPTree(E[]data,int[]index){
        for(int i = 0; i < nodes.length; i++){
            nodes[i] = new PTNode(data[i],index[i]);
        }
    }
    //���������ӡ���ڵ㣬��forѭ����ӡÿһ��Ԫ�أ�
    public void levelOrder(){
        System.out.print(nodes[0].getData());
        //�������߼���iΪÿһ�У�jΪi��һ�еĺ��ӽڵ�ı��������ӽڵ㲻���ܱ�˫�׽ڵ���±�С
        for(int i = 0; i < nodes.length; i++){
            for(int j = i + 1; j < nodes.length;j++){
                if(nodes[j].getParent() == i){
                    System.out.print(nodes[j].getData());
                }
            }
        }
        //����
        System.out.println();
    }
    //Ѱ��˫�׽ڵ㣨getParentNode��:�������нڵ㣬�����һ���ڵ�����ݺʹ����Ԫ��ele�����ô�ͷ�������˫�׵�����
    public E getParentNode(E ele){
        for(int i = 0; i < nodes.length; i++){
            if(nodes[i].getData().equals(ele)){
                //�򵥵���⣺���ӽڵ��˫�׽ڵ��±�����֪��
                return (E) nodes[nodes[i].getParent()].getData();
            }
        }
        return null;
    }
    //Ѱ�Һ��ӽڵ㣨getChildNode��������һ�����飬�����ӽڵ��Ž�ȥ��Ϊ�˱�������������С������������������������Ϊ���нڵ�ĸ���
    public E[] getChildNode(E ele){
        //������¼һ���ڵ��м�������
        int num = 0;
        //���ȴ���һ������Ϊnodes.length������
        Object[] children = new Object[nodes.length];
        //�������еĽڵ�,����˽ڵ��˫�׽ڵ�Ϊi����ô������i�ĺ��ӽڵ�
        for(int i = 1; i < nodes.length; i++){
            if(nodes[nodes[i].getParent()].getData().equals(ele)){
                children[num] = (E) nodes[i].getData();
                num++;
            }
        }
        //û���õ����鳤����Ϊnull
        for(int i = num ; i < nodes.length; i++){
            children[i] = null;
        }
        //��󷵻�������ӽڵ������
        return (E[])children;
    }
    //��ȡ��ȣ�getDepth��:��ȡÿ���ڵ����ڵĲ�����ÿ�αȽϼ�¼�ϴ��һ��
    public int getDepth(){
        //���������ȵ�����
        int parent = 0;
        int max = 0;
        int height = 0;
        for(int i = 0; i < nodes.length; i++){
            //��ʼ����ÿ��ѭ������height��ʼΪ1�������ҵ�parent��λ��
            height = 1;
            parent = nodes[i].getParent();
            //��while����if��ԭ��Ҫ�ҵ���i���ڵ㵽���ڵ��ܹ�Ҫ�������㣬�����if�Ļ�ֻ�����һ��
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
    //���Դ��룺cv��
    public static void main(String[] args) {
        Character[] data = {'A','B','C','D','E','F','G','H','I'};
        int[] idx = {-1, 0, 0, 1, 1, 1, 2, 2, 4};

        PTree<Character> ptree = new PTree<>(9);
        ptree.createPTree(data, idx);
        System.out.println("���ĸ߶�Ϊ��"+ ptree.getDepth());
        ptree.levelOrder();
        System.out.println("�ڵ� D ��˫���ǣ� " + ptree.getParentNode('D'));

        Object[] chlds = ptree.getChildNode('B');
        System.out.print("�ڵ� B�ĺ��ӽڵ��У� ");
        for(int i = 0; i < chlds.length; i++)
            if(chlds[i] != null)
                System.out.print(chlds[i] + " ");

        System.out.println();
    }

}
