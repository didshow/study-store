package dataframe.linearlist;

import dataframe.linearlist.ArrayStack;

//Ŀ�ģ��������
//��������������ջ
public class Brackets {
    public static boolean isMatch(String str){
        //�½�һ��ջ����
        ArrayStack<Character> stack2 = new ArrayStack<>();
        //�ַ��������ӡ�����ַ�(Ŀ����ɶ�������)
        char [] arr = str.toCharArray();
        //����char�����飨���д����
        for(char c:arr){
            Character temp = stack2.pop();
            if(temp == null){
                stack2.push(c);
                //�����Գɹ���ʲôҲ����
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
