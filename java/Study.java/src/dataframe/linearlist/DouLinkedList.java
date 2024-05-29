package dataframe.linearlist;

public class DouLinkedList <E>{
	//一个节点的内部类
	public class Node{
		//数据流
		private E data;
		//上一个节点
		private Node prev;
		//下一个节点
		private Node next;
		
		//空参构造器
		public Node() {
			this(null,null,null);
		}
		//只有一个元素的构造器
		public Node(E element) {
			this(element,null,null);
		}
		//三个元素的构造器
		public Node(E data,Node prev,Node next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}

			//链表长度
			private int size;
			//头节点
			private Node header;
			//尾节点
			private Node tail;
			
			//空参构造器（也可调用this）
			public DouLinkedList() {
				this.size = 0;
				header = null;
				tail = null;
			}
			
			//一个参数的构造器
			public DouLinkedList(E element) {
				//调用下面的构造器
				this.header = new Node(element,null,null);
				//只有一个元素头节点尾节点指向一个
				this.tail = this.header;
				this.size = 1;
			}
			
			//获取链表长度
			public int getLength() {
				return size;
			}

			//待插入节点
			Node newNode = new Node();
			
			//通过index查找节点
			public Node getNodeByIndex(int index) {
				if(index < 0 || index >= size) {
					throw new IllegalArgumentException("illegal");
				}
				//目标节点
				Node goal;
				if(index <= size/2) {

					goal = header;
					//定位到目标位置的前一个
					for (int i = 0;i < index;i++) {
						goal = goal.next;
					}
				}else{
					goal = tail;
					for(int i = size;i > index;i--) {
						goal = goal.prev;
					}
				}
				return goal;
			}
			
			//查找节点的index（如果找到返回i，没有找到返回-1）
			public int getIndex(E element) {
				
				//从第一个位置开始找
				Node goal = header;
				
				for(int i = 0;i < size;i++) {
					if(goal.data.equals(element)) {
						return i;
					}
					goal = goal.next;
				}
				return -1;
			}
			
			//在某个节点后面添加（目的是在后面写的方法中调用，使代码更加清晰)
			public void addAfter(Node node,Node newNode) {
				
				//使待插入节点的下一个为参考节点的下一个
				newNode.next = node.next;
				//使参考节点下一个的前一个节点为待插入节点（完成newNode和后一个元素的双向）
				node.next.prev = newNode;
				//使参考节点的下一个节点为待插入节点
				node.next = newNode;
				//完成待插入节点和参考节点的双向
				newNode.prev = node;
				
				//维护size的值
				size ++;
			}
			
			//在某个位置前添加
			public void addBefore(Node node,Node newNode) {
				
				//和上面的代码同理
				node.prev = newNode.prev;

				node.prev.next = node;

				node.prev = newNode;

				newNode.next = node;
				
				//维护size的值
				size ++;
			}
			
			//《头插法》：在第一个位置添加（有两种情况）
			public void addAtHead(E element) {
				//创建一个新的节点并且把它赋值为头节点
				header = new Node(element,null,header);
				//1.为空链表2.不为空链表
				if(tail == null) {
					tail = header;
				}
				size ++;
			}
			
			//《尾插法》
			public void addAtTail(E element) {
				//1.为空链表
				if(header == null) {
					header = new Node(element,null,null);
					header = tail;
				//2.不为空链表
				}else {
					//待插入节点
					Node newNode = new Node();
					newNode.prev = tail;
				//newNode插入后变成了最后一个元素（tail)
					tail = newNode;
				}

				size ++;
			}
			
			//在指定位置添加
			public void add(int index,E element) {

				if (index < 0 || index > size) {
					throw new IndexOutOfBoundsException("illegal");
				}
				//如果为空链表
				if(header == null) {
				//自己写的：	addAtHead(element);
				// 问题：不理解为什么header = null;要用尾插法(都可以)
					addAtTail(element);
				}else {
					if(index == 0) {
						addAtHead(element);
					}else {

						//获取指定位置的前一个节点
						Node prev = getNodeByIndex(index - 1);
						//获取待插入的节点的位置
						Node node = prev.next;
						//双向链接
						node.next = prev.next;
						prev.next.prev = node;
						prev.next = node;
						node.prev = prev;

						size ++;
					}
				}
			}

			//删除指定位置的元素
			public E delete(int index) {
				if(index < 0 || index >= size) {
					throw new IndexOutOfBoundsException("illegal");
				}
				//result为目标删除节点
				Node result = new Node();
				result = null;

				//如果删除第一个位置的元素，那么头节点就为原来头节点的下一个元素
				if(index == 0) {
					result = header;
					header = header.next;
					header.prev = null;
				}else{
					//定位到目标位置的前一个位置
					Node prev = getNodeByIndex(index - 1);
					//获取被删的元素result
					result = prev.next;
					//断开prev和result的联系
					prev.next =result.next;
					//如果不是删除最后一个位置,则断开目标位置后面节点与其的关系
					if(result.next != null){
						result.next.prev = prev;
					}
					//断开result前后指针域
					result.prev = null;
					result.next = null;
				}
				size --;

				//返回删除的result的数据
				return result.data;
			}
			//toString操作
			public String toString(){
				//链表为空链表
				if(size ==0){
					return "[]";
				}else{
					StringBuilder sb = new StringBuilder("[");
					for (Node current = header;current != null;current = current.next){
						sb.append(current.data.toString()+",");
					}
					int length = sb.length();
					return sb.delete(length - 1,length).append("]").toString();
				}
			}
		public static  void  main(String[]args){
			DouLinkedList<String> list1 = new DouLinkedList<String>();
			list1.add(0,"aaaa");
			list1.addAtTail("bbbb");
			list1.add(0,"cccc");
			list1.add(1,"dddd");

			System.out.println(list1);

			list1.delete(2);

			System.out.println(list1);

			System.out.println(list1.toString());

			System.out.println("cccc在链表中的位置："+list1.getIndex("cccc"));

			System.out.println("链表处索引为1的："+list1.getNodeByIndex(1));

			list1.delete(0);

			System.out.println("调用delete（）后的链表");

	}
}
