import java.util.Arrays;
public class TestForVisitArrays{
	public static void main(String args[]){
		int[] scores ={78,63,71,86,72,97,84,75,78};
		int max=0,min=100; //max ��߷�  min ��ͷ�
		float total=0.0f,aver=0.0f; // total �ܷ�  aver ƽ����
			for(int s:scores){  //ѭ������s������scores���ͱ�����ͬ
			total=total+s;
			if(max<s)
				max=s;
			if(min>s)
				min=s;
			}
		aver=total/scores.length;
		System.out.println(Arrays.toString(scores));
		System.out.println("��߷�:"+max+"��ͷ�:"+min+"ƽ����:"+aver);
	}
}