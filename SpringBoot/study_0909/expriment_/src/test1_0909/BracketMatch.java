package test1_0909;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatch {
    public static boolean isMatch(String str){
        Stack<Character> stack = new Stack();
        int length = str.length();

        for (int i = 0;i<length;i++) {
            if (stack.peek()== null){
                if (str.charAt(i)=='}' || str.charAt(i)==')'){
                    return false;
                }
            }
            if (str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i)=='{'){
                stack.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(stack.peek()!= '('){
                    return false;
                }
                stack.pop();
            }else if(str.charAt(i)=='}'){
                if (stack.peek()!='{'){
                    return false;
                }
                stack.pop();
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入只含(){}的括号串：");
        String str = scanner.next();
        if (isMatch(str)){
            System.out.println("括号匹配正确");
        }else {
            System.out.println("括号匹配失败");
        }
    }
}
