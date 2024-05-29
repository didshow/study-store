package dataframe.linearlist;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static dataframe.linearlist.Calculate.Cal;

public class Expression {
    //判断是否为运算符
    public static boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }
    //判断是否是数字
    public static boolean isNumber(String num){
        //\\为转义字符\
        return num.matches("\\d+");
    }
    //获取操作符的优先级
    public static int priority(String op){
        if(op.equals("*") || op.equals("/")){
            return 1;
        }else if(op.equals("+") || op.equals("-")){
            return 0;
        }
        return -1;
    }
    //将表达式转换为list
    public static List<String> expressionToList(String expression){
        int index = 0;
        List<String> list = new ArrayList<>();
        do{
            char ch = expression.charAt(index);
            if(ch < 48 ||ch > 57){
                index ++;
                list.add(ch+"");
            }else if(ch >= 48 && ch <= 57){
                String str = "";
                while (index < expression.length() && expression.charAt(index) >=48
                        && expression.charAt(index) <= 57){
                    str += expression.charAt(index);
                    index ++;
                }
                list.add(str);
            }
            //do-while循环，先do一次，如果满足while中的条件句则继续循环
            //即将表达式里面所有的字符都遍历一遍，看是否满足条件，满足条件就返回list的值
        }while(index < expression.length());
        return list;
    }
    //expressionList 是形参名字 其类型为 List<String>
    //注意：static类只能调用static的对象
    //四个步骤：判断是否为操作符、判断是否为数字、判断是否为(、判断是否为)
     private static List<String> parseToSuffixExpression(List<String>expressionList){
         //创建一个栈进行操作(保存操作符和‘(’)
         Stack<String> opStack = new Stack<>();
         //多态：ArrayList 是 List 的子类 父类的对象是子类
         //创建一个链表保存后缀表达式
         List<String> suffixList = new ArrayList<String>();
         //遍历 字符串中所有的字符(得到数字或者操作符)
         for(String item : expressionList){
             if(isOperator(item)){
                 //如果是操作符则要考虑栈是否为空还有与前面的运算符的优先级作比较,还要判断是否有"("
                 //如果栈为空或者优先级和前面优先级相同或者大于则直接进栈
                 //比较优先级的时候直接调用priority传入想要比较的字符串
                 if(opStack.isEmpty() || opStack.peek().equals("(") || priority(item) > priority(opStack.peek())){
                     opStack.push(item);
                 }else{
                 //否则堆栈中的运算符大于当前运算符则弹出并且进入队，直到遇到优先级比它低（等于）或者遇到（为止，应该用while，因为不知道要循环几次
                     //当栈不为空并且栈顶元素不为 ( 时
                     while (!opStack.isEmpty() && !opStack.peek().equals("(")){
                         //当前操作符优先级小于栈里面的操作符，弹出所有大于当前操作符的运算符,删除(
                         if(priority(item) <= priority(opStack.peek())){
                             suffixList.add(opStack.pop());
                         }
                     }
                     opStack.push(item);
                 }

                 //判断是否为数字，如果为数字则直接进入队里面
             }else if(isNumber(item)){
                 suffixList.add(item);
                 //判断是否为(,如果是则直接进栈
             }else if("(".equals(item)){
                 opStack.push(item);
                 //判断是否为右括号，如果是则弹出左括号后所有元素并且进入队中，删除左括号
             }else if(")".equals(item)){
                 while(!opStack.isEmpty()){
                     if(opStack.peek().equals("(")){
                         opStack.pop();
                         break;
                     }else{
                         suffixList.add(opStack.pop());
                     }
                 }
                 //为了程序的健壮性
             }else{
                throw new RuntimeException("有非法字符！");
             }
             }
         //如果此时栈中还有元素，那么直接加入队中
         while(!opStack.isEmpty()){
             suffixList.add(opStack.pop());
         }
         return suffixList;
    }


        public static void main(String [] args){
        String expression = "1+((2+3)*4)-5";
        List<String> expressionList = expressionToList(expression);
        System.out.println("中缀表达式转为list结构=" +expressionList);
        //将中缀表达式转换为后缀表达式
            List<String> suffixList = parseToSuffixExpression(expressionList);
            System.out.println("对应的后缀表达式列表结构="+suffixList);
            int calculateResult = Cal(suffixList);
            System.out.printf(expression+"=%d\n",calculateResult);
        }

}
