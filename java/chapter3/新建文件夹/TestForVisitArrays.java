import java.util.Arrays;
public class TestForVisitArrays{
	public static void main(String args[]){
		int[] scores ={78,63,71,86,72,97,84,75,78};
		int max=0,min=100; //max 最高分  min 最低分
		float total=0.0f,aver=0.0f; // total 总分  aver 平均分
			for(int s:scores){  //循环变量s与数组scores类型必须相同
			total=total+s;
			if(max<s)
				max=s;
			if(min>s)
				min=s;
			}
		aver=total/scores.length;
		System.out.println(Arrays.toString(scores));
		System.out.println("最高分:"+max+"最低分:"+min+"平均分:"+aver);
	}
}