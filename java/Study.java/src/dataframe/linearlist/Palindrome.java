package dataframe.linearlist;

import java.util.Scanner;
import java.util.Stack;
import java.util.PriorityQueue;

public class Palindrome <E>{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String line = in.nextLine();
            if (line.toLowerCase().equals("quit")) {
                break;
            }
            System.out.println(line);
            Stack<Character> stack = new Stack<Character>();
            ArrayQueue<Character> queue = new ArrayQueue<Character>();
            for (int i = 0; i < line.length(); i++) {
                stack.push(line.charAt(i));
                queue.enqueue(line.charAt(i));
            }
            boolean flag = true;
            while (!queue.isEmpty()) {
                if (!(queue.dequeue().equals(stack.pop()))) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(line + " is Palindrome");
            else
                System.out.println(line + " is not Palindrome");
        }
    }
}
