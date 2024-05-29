package dataframe.search;

public class SeqList {
    //˳����¼�ڵ�����
    private RecordNode[] r;
    //˳�����
    private int curlen;
    public SeqList(int maxSize){
        //����һ������ΪmaxSize�����飨�洢��Ԫ��
        this.r = new RecordNode[maxSize];
        this.curlen = 0;
    }
    //˳�����
    public int seqSearch(Comparable key){
        int i = 0,n = curlen;
        while(i < n && r[i].getKey().compareTo(key)!=0){
            i++;
        }
        if(i<n){
            return i;
        }else{
            return -1;
        }
    }
    //˳����ң������ڱ���
    public int seqSearchWithGuard (Comparable key) {
        int i = curlen;
        r[0].setKey(key);
        //�ڱ�
        while (r[i].getKey().compareTo(key) != 0) {
            i--;
        }
        if (i>0)
            return i;
        else
            return -1; }
    //���ֲ��ҷ�(��������ź���)

    public int BinarySearch(Comparable key){
        if(curlen > 0){
            int low = 0;
            int high = curlen-1;
            while (low <= high){
                int mid = (low + high)/2;
                if(r[mid].getKey().compareTo(key)==0){
                    return mid;
                }else if(r[mid].getKey().compareTo(key)>0){         //����0��ʱ���������ֵ��Ҫ���ҵ�ֵ��
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
    //������
    static class IndexItem{
        public int index;
        public int start;
        public int length;
        public IndexItem(int index,int start,int length){
            this.index = index;
            this.start = start;
            this.length = length;
        }
        //����
        static int[] mainList = new int[]{
                101,102,103,104,105,0,0,0,0,0,
                201,202,203,204,205,0,0,0,0,0,
                301,302,303,304,305,0,0,0,0,0};
        //������
        static IndexItem[] indexItemList = new IndexItem[]{
                new IndexItem(1,0,5),
                new IndexItem(2,10,4),
                new IndexItem(3,20,3)
        };
        public static int indexSearch(int key){
            IndexItem indexItem = null;
            //������������
            int index = key/100;
            //����������
            for(int i = 0;i < indexItemList.length;i++){
                //�ҵ�������
                if(indexItemList[i].index == index){
                    indexItem = indexItemList[i];
                    break;
                }
            }
            if(indexItem == null){
                return -1;
            }
            for(int i = indexItem.start;i<indexItem.start+indexItem.length;i++){
                if (mainList[i]==key){
                    return i;
                }
            }
            return index;
        }
    }
}
