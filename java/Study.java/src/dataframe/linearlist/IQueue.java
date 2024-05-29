package dataframe.linearlist;

public interface IQueue <E>{
        public boolean enqueue(E x) ;
        public E dequeue();
        public E peek();
        public int capacity();
        public int size();
        public boolean isEmpty();
        public boolean isFull();
}
