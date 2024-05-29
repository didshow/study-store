package Run;
//必须要升序排列才可以使用二分查找法
	public class Test33 {
		//k是一个数组，key是要查找的数字,所有的值都应该是索引值
		
		public static int binarySearch(int k[],int key) {
			int left = 0;
			//最后一个元素的索引值
			int right = k.length-1;
			while (left <= right) {
				int mid = (left + right)/2;			
				//如果数组不按照顺序排列可以吗？
				if (k[mid] == key) {
					return key;
				}else if(k[mid] > key) {
					right = mid-1;
				}else {
					left = mid+1;
				}
			}
			//运行结果不对的原因是return的值不是-1，但是我不知道应该return什么，我就先return-1
			return (left+1);
		}
	        
	    public static void main(String[] args) {
	        int a[] = {8,5,2,1,0};
	        System.out.println("    "+binarySearch(a,1));
	    }
	}


