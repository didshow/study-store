package dataframe.linearlist;

import dataframe.linearlist.ArrayStack;

//目的：括号配对
//如果是左括号则进栈
public class Brackets {
    public static boolean isMatch(String str){
        //新建一个栈对象
        ArrayStack<Character> stack2 = new ArrayStack<>();
        //字符型数组打印所有字符(目的是啥：不理解)
        char [] arr = str.toCharArray();
        //遍历char型数组（简便写法）
        for(char c:arr){
            Character temp = stack2.pop();
            if(temp == null){
                stack2.push(c);
                //如果配对成功则什么也不做
            }else if(temp == '[' && c == ']'){

            }else if(temp == '(' && c == ')'){

            }else{
                stack2.push(temp);
                stack2.push(c);
            }
        }
        return false;
    }
}
