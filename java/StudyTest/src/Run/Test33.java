package Run;
//����Ҫ�������вſ���ʹ�ö��ֲ��ҷ�
	public class Test33 {
		//k��һ�����飬key��Ҫ���ҵ�����,���е�ֵ��Ӧ��������ֵ
		
		public static int binarySearch(int k[],int key) {
			int left = 0;
			//���һ��Ԫ�ص�����ֵ
			int right = k.length-1;
			while (left <= right) {
				int mid = (left + right)/2;			
				//������鲻����˳�����п�����
				if (k[mid] == key) {
					return key;
				}else if(k[mid] > key) {
					right = mid-1;
				}else {
					left = mid+1;
				}
			}
			//���н�����Ե�ԭ����return��ֵ����-1�������Ҳ�֪��Ӧ��returnʲô���Ҿ���return-1
			return (left+1);
		}
	        
	    public static void main(String[] args) {
	        int a[] = {8,5,2,1,0};
	        System.out.println("    "+binarySearch(a,1));
	    }
	}


