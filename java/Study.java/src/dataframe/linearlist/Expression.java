package dataframe.linearlist;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static dataframe.linearlist.Calculate.Cal;

public class Expression {
    //�ж��Ƿ�Ϊ�����
    public static boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/");
    }
    //�ж��Ƿ�������
    public static boolean isNumber(String num){
        //\\Ϊת���ַ�\
        return num.matches("\\d+");
    }
    //��ȡ�����������ȼ�
    public static int priority(String op){
        if(op.equals("*") || op.equals("/")){
            return 1;
        }else if(op.equals("+") || op.equals("-")){
            return 0;
        }
        return -1;
    }
    //�����ʽת��Ϊlist
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
            //do-whileѭ������doһ�Σ��������while�е������������ѭ��
            //�������ʽ�������е��ַ�������һ�飬���Ƿ��������������������ͷ���list��ֵ
        }while(index < expression.length());
        return list;
    }
    //expressionList ���β����� ������Ϊ List<String>
    //ע�⣺static��ֻ�ܵ���static�Ķ���
    //�ĸ����裺�ж��Ƿ�Ϊ���������ж��Ƿ�Ϊ���֡��ж��Ƿ�Ϊ(���ж��Ƿ�Ϊ)
     private static List<String> parseToSuffixExpression(List<String>expressionList){
         //����һ��ջ���в���(����������͡�(��)
         Stack<String> opStack = new Stack<>();
         //��̬��ArrayList �� List ������ ����Ķ���������
         //����һ���������׺���ʽ
         List<String> suffixList = new ArrayList<String>();
         //���� �ַ��������е��ַ�(�õ����ֻ��߲�����)
         for(String item : expressionList){
             if(isOperator(item)){
                 //����ǲ�������Ҫ����ջ�Ƿ�Ϊ�ջ�����ǰ�������������ȼ����Ƚ�,��Ҫ�ж��Ƿ���"("
                 //���ջΪ�ջ������ȼ���ǰ�����ȼ���ͬ���ߴ�����ֱ�ӽ�ջ
                 //�Ƚ����ȼ���ʱ��ֱ�ӵ���priority������Ҫ�Ƚϵ��ַ���
                 if(opStack.isEmpty() || opStack.peek().equals("(") || priority(item) > priority(opStack.peek())){
                     opStack.push(item);
                 }else{
                 //�����ջ�е���������ڵ�ǰ������򵯳����ҽ���ӣ�ֱ���������ȼ������ͣ����ڣ�����������Ϊֹ��Ӧ����while����Ϊ��֪��Ҫѭ������
                     //��ջ��Ϊ�ղ���ջ��Ԫ�ز�Ϊ ( ʱ
                     while (!opStack.isEmpty() && !opStack.peek().equals("(")){
                         //��ǰ���������ȼ�С��ջ����Ĳ��������������д��ڵ�ǰ�������������,ɾ��(
                         if(priority(item) <= priority(opStack.peek())){
                             suffixList.add(opStack.pop());
                         }
                     }
                     opStack.push(item);
                 }

                 //�ж��Ƿ�Ϊ���֣����Ϊ������ֱ�ӽ��������
             }else if(isNumber(item)){
                 suffixList.add(item);
                 //�ж��Ƿ�Ϊ(,�������ֱ�ӽ�ջ
             }else if("(".equals(item)){
                 opStack.push(item);
                 //�ж��Ƿ�Ϊ�����ţ�������򵯳������ź�����Ԫ�ز��ҽ�����У�ɾ��������
             }else if(")".equals(item)){
                 while(!opStack.isEmpty()){
                     if(opStack.peek().equals("(")){
                         opStack.pop();
                         break;
                     }else{
                         suffixList.add(opStack.pop());
                     }
                 }
                 //Ϊ�˳���Ľ�׳��
             }else{
                throw new RuntimeException("�зǷ��ַ���");
             }
             }
         //�����ʱջ�л���Ԫ�أ���ôֱ�Ӽ������
         while(!opStack.isEmpty()){
             suffixList.add(opStack.pop());
         }
         return suffixList;
    }


        public static void main(String [] args){
        String expression = "1+((2+3)*4)-5";
        List<String> expressionList = expressionToList(expression);
        System.out.println("��׺���ʽתΪlist�ṹ=" +expressionList);
        //����׺���ʽת��Ϊ��׺���ʽ
            List<String> suffixList = parseToSuffixExpression(expressionList);
            System.out.println("��Ӧ�ĺ�׺���ʽ�б�ṹ="+suffixList);
            int calculateResult = Cal(suffixList);
            System.out.printf(expression+"=%d\n",calculateResult);
        }

}
