package dataframe.linearlist;

//目的：一个泛型动态的数组
public class GenerricArray<E> {
	//容量（只是动态数组的一个临时的容量）
	//capacity = data.length
	private int capacity;
	//繁星数组E可以存放所有类型的数据
	private E[] data;
	//元素个数
	private int size;
	//全局变量(必须赋值)好处是利于维护
	private static final int DEFAULT_CAPACITY = 10;
	
	//空参构造器(声明在变量构造器的前面)
	public GenerricArray() {
		//有点不理解
		this(DEFAULT_CAPACITY);
	}
	
	//一个变量的构造器
	public GenerricArray(int capacity) {
		this.size = 0;
		//强制转换(将Object类强转为E[]类型的)
		data = (E[])new Object[capacity];
	}
	
	//在第一个位置上添加(最常出错的是第一个位置和最后一个位置)
	public void addFirst(E e) {
		data[0] = e;
		//维护size的值
		size ++;
	}
	//在最后一个位置添加
	public void addLast(E e) {
		data[size] = e;
		size ++;
	}
	//找一个泛型数组里元素的索引
	E getIndex(int index) {
		//getIndex 时，index != size
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("位置错误");
		}
		return data[index];
	}
	
	//修改特定位置的元素(修改和get一样)
	public void set(int index,E e) {
			if(index < 0 || index >= size) {
				throw new IllegalArgumentException("位置错误");
			}
			data[index] = e;
		}
	//在指定位置添加元素(index 可以 = size，当index = size 时，在此数组的最后一个位置添加元素)
	public boolean add(int index,E e) {
		//判断index的值是否符合
		 if(index < 0 || index > size) {
			 throw new IllegalArgumentException("位置错误");
		 }
		 if(size == data.length){
			 reSize(2*data.length);
		 }
		 
		 //先将index后的元素往后移动，然后在给index位置赋值为e
			 for (int i = size;i > index;i--) {
				 data[i] = data[i-1];
			 }
			 data[index] = e;
			 
		 //维护size的值
		 size ++;
		 return true;
	}
	
	//删除特定位置的元素
	public E delete(int index,E e) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("位置错误");
		}
		
		//降低size缩小的阈值
		if(size < 1/4*data.length) {
			reSize(1/2*data.length);
		}
		
		//直接覆盖
		for(int i = 1;i > index;i++) {
			data[i] = data[i-1];
		}
		
		E value = data[index];
		size --;
		return value;
	}
	
	//实现动态数组：reSize
	public void reSize(int newCapacity) {
		//易错：=（boolean） 和 == （等于）
		//因为动态数组没有capacity，如果用capacity的话第二次第三次扩容容易出错所以用data.length
		if (size == data.length) {
		//建立一个容量为原来两倍的数组
		//问题：自己做的时候不知道创建什么类型的对象
			E[] newData = (E[]) new Object[newCapacity];
			//把data里的每一个值都赋给newData:注意判断临界值
			for(int i = 0;i < size;i++) {
				newData[i] = data[i];
			}
			//把newData的地址赋值给data
			newData = data;
		}
	}
	
	//遍历上面的动态数组，查找是否有俩相同的元素
	public int indexOf(E e) {
		
		for(int i = 0;i < size;i++) {
			if(e.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}
	
	//把一系列字符串形成一段连续的话
	public String toString() {
		StringBuffer res = new StringBuffer();
		//忘记了%d的意思
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
		//new长度为5的字符串类型的数组
		GenerricArray<String> gal = new GenerricArray<String>(5);
		
		gal.add(0, "张三");
		gal.add(1, "李四");
		gal.add(2, "王五");
		gal.add(3, "赵六");
		gal.add(4, "王七");
		
		//遍历添加的五个数组
		for(int i = 0;i < 5;i++) {
			String ele = gal.getIndex(i);
			System.out.println(gal);
			try {
				System.out.println(gal.getIndex(4));
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}
			try {
				gal.add(6,"越界");
			}catch(IllegalArgumentException e) {
				System.out.println(e);
			}
			
		}
		System.out.println(gal);
		
		
		System.out.printf("index of 王五 is:%d",gal.indexOf("王五"),gal.indexOf("..."));
		//非静态数组造对象
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
