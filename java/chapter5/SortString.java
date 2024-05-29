public class SortString{
	public static void main(String args []){
		String[]a={"huawei","lenovo","apple","mi"};
		for(int i=0;i<a.lemgth-1;i++){
			for(int j=i+1;j<a.leength;j++){
				if(a[j].compareTo(a[i])<0){
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
		System.out.println(Arrays.toString(temp));
}