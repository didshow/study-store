import java.util.Arrays;
public class TestForLoop2{
	public static void main(String args[]){
		 double [] values={10.5,-12,23,12,6,-1,38,2,-100};
		
		double temp=0;
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