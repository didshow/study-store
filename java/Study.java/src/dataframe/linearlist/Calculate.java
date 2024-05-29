package dataframe.linearlist;

import java.util.List;
import java.util.Stack;

//运算
public class Calculate {
     public static int Cal(List<String>list){
         Stack<Integer> stack = new Stack<>();
            for(String item : list){
                //判断是否是数字，是数字直接入栈
                if(item.matches("\\d+")){
                    //item是String类型的，将String类型转换为int类型
                    stack.push(Integer.parseInt(item));
                    //是运算符就取出两个数字
                }else{
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int num = 0;
                    if(item.equals("+")){
                        num = num1 + num2;
                        stack.push(num);
                    }else if(item.equals("-")){
                        num = num2 - num1;
                        stack.push(num);
                    }else if(item.equals("*")){
                        num = num1*num2;
                        stack.push(num);
                    }else if(item.equals("/")){
                        num = num2/num1;
                        stack.push(num);
                    }else{
                        throw new RuntimeException("运算符错误");
                    }
                }
            }
         return stack.pop();
     }
}
