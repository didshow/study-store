import java.util.Arrays;
public class TestForLoop1{
	public static void main(String args[]){
		int[] values={8,3,1,6,2,7,4,5,8};
		int temp=0;
		for(int i=0;i<values.length-1;i++){
			for(int j=0;j<values.length-1-i;j++){
				if(values[j]>values[j+1]){
					temp=values[j];
					values[j]=values[j+1];
					values[j+1]=temp;
				}
				System.out.println(Arrays.toString(values));	//每次循环输出数组所有元素
			}
		}
	}
}