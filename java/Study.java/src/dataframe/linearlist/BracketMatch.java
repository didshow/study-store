package dataframe.linearlist;

import java.util.Scanner;
public class BracketMatch {
    public static boolean isMatch(String str){
        LinkedListStack<Character> stack3 = new LinkedListStack<>();
        char [] chars = str.toCharArray();
        for(int i = 0;i < chars.length;i++){
            Character temp = stack3.pop();
            if(temp == null){
                stack3.push(chars[i]);
            }else if(temp == '[' && chars[i] == ']'){
            }else if(temp == '(' && chars[i] == ')'){
            }else if(chars[i] != '[' || chars[i] != '('){
                System.out.println("��������");
            } else{
                //temp��chars[i]����һ��
                 stack3.push(temp);
                 stack3.push(chars[i]);
            }
        }
        if(!stack3.isEmpty()){
            System.out.println("����");
            return false;
        }else{
            System.out.println("����");
            return true;
        }
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("����������");
        String str = scan.next();
        BracketMatch.isMatch(str);
    }
}

