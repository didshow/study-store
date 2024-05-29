package dataframe.linearlist;

public class Joseph<E> extends CircleLinkedList {
    Node helper;
    //�����������ø���Ĺ��췽����
    public Joseph(){
        super();
        this.helper = null;
    }
    //startNo��ʾ�ӵڼ�����ʼ����countNum��ʾ�����£�nums��ʾ����
    public void countPeople(int startNo,int countNum,int nums){
        if(first == null || startNo < 1 || startNo > nums){
            System.out.println("illegal");
            return;
        }
        //�γ�һ��ѭ��(Ϊʲô��helper����first)
        helper = last;
        //����ǰ������first��helper�ƶ�startNo - 1�Σ��ƶ�����ʼ��λ�ã�
        for(int i = 1;i < startNo;i++){
            helper = helper.next;           //�����
        }
        //������ǽ���ֻʣһ���ˣ�ɱ��һ����֮���һ���˾ͱ����һ��
        while(first != last){
            for(int j = 0;j < countNum;j++){
                helper = helper.next;
            }
            //��¼��ɱ���˵�����
            System.out.println(helper.data);
            int index = this.locate(helper.data);
            this.remove(index);
        }
        System.out.println(first.data);
    }
    public static void  main(String[]args){
        Joseph<String>josephCircle = new Joseph<String>();
        josephCircle.addAtTail("joseph");
        josephCircle.addAtTail("john");
        josephCircle.addAtTail("Bill");
        josephCircle.addAtTail("Alice");
        josephCircle.addAtTail("Bob");
        josephCircle.addAtTail("Clare");

        josephCircle.countPeople(6,3,6);
    }
}
