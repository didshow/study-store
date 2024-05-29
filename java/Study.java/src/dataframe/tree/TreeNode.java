package dataframe.tree;

import java.util.LinkedList;

    public class TreeNode<E>{
        //������
        private E data;
        //������������洢���ǣ����ӽڵ���±꣩
        LinkedList<Integer> firstChild;
        //������
        public TreeNode(){
            //�����Ϊ�գ��򴴽�һ���µ�����
            this.firstChild = new LinkedList<>();
        }
        //get��set����
        public E getData(){
            return data;
        }
        public void setData(E data){
            this.data = data;
        }
        //��Ӻ��ӽڵ㣨addChild��:�ں��������������
        public void addChild(int index){
            firstChild.add(index);
        }
        //ͨ�����ӽڵ��������е��������������к��ӽڵ���±�
        public int getChild(int index){
            return firstChild.get(index);
        }
}
