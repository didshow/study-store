package test1_0909;

import java.util.Scanner;

public class CharCount {

    public static void main(String[] args) {
        // 从键盘读入一个字符串并且将其转化为小写字符
       Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String line = scan.nextLine();
        line = line.toLowerCase();
        int letterCount = 0;
        int numberCount = 0;
        // 判断字符是数字还是英文字符，若为数字则numberCount++ 若为字符则letterCount++
        for (int i=0;i<line.length();i++) {
            char ch = line.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                letterCount++;
            }
            if (ch >= '0' && ch <= '9'){
                numberCount++;
            }
        }
        System.out.println("数字有："+numberCount+"个");
        System.out.println("英文字符有："+letterCount+"个");
    }

}

