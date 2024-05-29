package dataframe.linearlist;

import java.util.List;
import java.util.Stack;

//����
public class Calculate {
     public static int Cal(List<String>list){
         Stack<Integer> stack = new Stack<>();
            for(String item : list){
                //�ж��Ƿ������֣�������ֱ����ջ
                if(item.matches("\\d+")){
                    //item��String���͵ģ���String����ת��Ϊint����
                    stack.push(Integer.parseInt(item));
                    //���������ȡ����������
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
                        throw new RuntimeException("���������");
                    }
                }
            }
         return stack.pop();
     }
}
