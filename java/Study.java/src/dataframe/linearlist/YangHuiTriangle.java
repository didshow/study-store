package dataframe.linearlist;
import java.util.Scanner;

public class YangHuiTriangle {
    public static void main(String[] args) {
        System.out.println("How many lines do you wang?");
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt() + 1;
        ArrayQueue<Integer> queue = new ArrayQueue<>(lines);
        queue.enqueue(1);
        for(int i = 2; i <= lines; i++){
                    queue.enqueue(1);
            for(int k = 0; k < lines-i; k++)
                System.out.print(" ");
            for(int j = 1; j <= i-2; j++){
                int x = queue.dequeue();
                System.out.printf("%d ",x);
                int t = queue.peek();
                queue.enqueue(t + x);
            }
            int y = queue.dequeue();
            System.out.println(y);
            queue.enqueue(1);
        }
    }
}
