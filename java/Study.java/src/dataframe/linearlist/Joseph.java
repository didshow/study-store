package dataframe.linearlist;

public class Joseph<E> extends CircleLinkedList {
    Node helper;
    //构造器（调用父类的构造方法）
    public Joseph(){
        super();
        this.helper = null;
    }
    //startNo表示从第几个开始数，countNum表示数几下，nums表示人数
    public void countPeople(int startNo,int countNum,int nums){
        if(first == null || startNo < 1 || startNo > nums){
            System.out.println("illegal");
            return;
        }
        //形成一个循环(为什么用helper不用first)
        helper = last;
        //报数前，先让first和helper移动startNo - 1次（移动到开始的位置）
        for(int i = 1;i < startNo;i++){
            helper = helper.next;           //不理解
        }
        //如果不是仅仅只剩一个人，杀了一个人之后第一个人就变成下一个
        while(first != last){
            for(int j = 0;j < countNum;j++){
                helper = helper.next;
            }
            //记录被杀的人的数据
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
