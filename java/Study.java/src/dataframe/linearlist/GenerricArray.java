package dataframe.linearlist;

//Ŀ�ģ�һ�����Ͷ�̬������
public class GenerricArray<E> {
	//������ֻ�Ƕ�̬�����һ����ʱ��������
	//capacity = data.length
	private int capacity;
	//��������E���Դ���������͵�����
	private E[] data;
	//Ԫ�ظ���
	private int size;
	//ȫ�ֱ���(���븳ֵ)�ô�������ά��
	private static final int DEFAULT_CAPACITY = 10;
	
	//�ղι�����(�����ڱ�����������ǰ��)
	public GenerricArray() {
		//�е㲻����
		this(DEFAULT_CAPACITY);
	}
	
	//һ�������Ĺ�����
	public GenerricArray(int capacity) {
		this.size = 0;
		//ǿ��ת��(��Object��ǿתΪE[]���͵�)
		data = (E[])new Object[capacity];
	}
	
	//�ڵ�һ��λ��������(��������ǵ�һ��λ�ú����һ��λ��)
	public void addFirst(E e) {
		data[0] = e;
		//ά��size��ֵ
		size ++;
	}
	//�����һ��λ������
	public void addLast(E e) {
		data[size] = e;
		size ++;
	}
	//��һ������������Ԫ�ص�����
	E getIndex(int index) {
		//getIndex ʱ��index != size
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("λ�ô���");
		}
		return data[index];
	}
	
	//�޸��ض�λ�õ�Ԫ��(�޸ĺ�getһ��)
	public void set(int index,E e) {
			if(index < 0 || index >= size) {
				throw new IllegalArgumentException("λ�ô���");
			}
			data[index] = e;
		}
	//��ָ��λ������Ԫ��(index ���� = size����index = size ʱ���ڴ���������һ��λ������Ԫ��)
	public boolean add(int index,E e) {
		//�ж�index��ֵ�Ƿ����
		 if(index < 0 || index > size) {
			 throw new IllegalArgumentException("λ�ô���");
		 }
		 if(size == data.length){
			 reSize(2*data.length);
		 }
		 
		 //�Ƚ�index���Ԫ�������ƶ���Ȼ���ڸ�indexλ�ø�ֵΪe
			 for (int i = size;i > index;i--) {
				 data[i] = data[i-1];
			 }
			 data[index] = e;
			 
		 //ά��size��ֵ
		 size ++;
		 return true;
	}
	
	//ɾ���ض�λ�õ�Ԫ��
	public E delete(int index,E e) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("λ�ô���");
		}
		
		//����size��С����ֵ
		if(size < 1/4*data.length) {
			reSize(1/2*data.length);
		}
		
		//ֱ�Ӹ���
		for(int i = 1;i > index;i++) {
			data[i] = data[i-1];
		}
		
		E value = data[index];
		size --;
		return value;
	}
	
	//ʵ�ֶ�̬���飺reSize
	public void reSize(int newCapacity) {
		//�״���=��boolean�� �� == �����ڣ�
		//��Ϊ��̬����û��capacity�������capacity�Ļ��ڶ��ε������������׳���������data.length
		if (size == data.length) {
		//����һ������Ϊԭ������������
		//���⣺�Լ�����ʱ��֪������ʲô���͵Ķ���
			E[] newData = (E[]) new Object[newCapacity];
			//��data���ÿһ��ֵ������newData:ע���ж��ٽ�ֵ
			for(int i = 0;i < size;i++) {
				newData[i] = data[i];
			}
			//��newData�ĵ�ַ��ֵ��data
			newData = data;
		}
	}
	
	//��������Ķ�̬���飬�����Ƿ�������ͬ��Ԫ��
	public int indexOf(E e) {
		
		for(int i = 0;i < size;i++) {
			if(e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}
	
	//��һϵ���ַ����γ�һ�������Ļ�
	public String toString() {
		StringBuffer res = new StringBuffer();
		//������%d����˼
		res.append(String.format("Array:size = %d,capacity= %d\n",size,data.length));
		
		res.append("[");
		
		for(int i = 0;i < size;i++) {
			res.append(data[i]);
			if(i != size-1) {
				res.append(",");
			}
		}
		res.append("]");
		
		return res.toString();
	}
	public static void main (String [] args) {
		//new����Ϊ5���ַ������͵�����
		GenerricArray<String> gal = new GenerricArray<String>(5);
		
		gal.add(0, "����");
		gal.add(1, "����");
		gal.add(2, "����");
		gal.add(3, "����");
		gal.add(4, "����");
		
		//�������ӵ��������
		for(int i = 0;i < 5;i++) {
			String ele = gal.getIndex(i);
			System.out.println(gal);
			try {
				System.out.println(gal.getIndex(4));
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}
			try {
				gal.add(6,"Խ��");
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}
			
		}
		System.out.println(gal);
		
		
		System.out.printf("index of ���� is:%d",gal.indexOf("����"),gal.indexOf("..."));
		//�Ǿ�̬���������
		GenerricArray<Integer> ga2 = new GenerricArray<>(5);
		
		for (int i = 0;i < 5;i++) {
			System.out.println(ga2.getIndex(i));
		}
		try {
			ga2.add(3,100);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		System.out.println(ga2);
		try {
			ga2.getIndex(100);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}