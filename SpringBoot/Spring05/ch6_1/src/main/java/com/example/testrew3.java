package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangchao on 2022/1/12.
 */
public class testrew3 {
    public static void main(String[] args) {
        System.out.println(isNumeric("001"));
    }



    public static boolean isNumeric(String str){
        //Pattern pattern = Pattern.compile("(^0.([0-9])+$)|(^([1-9])+.([0-9])+$)|(^([1-9][0-9]*)$)");
        Pattern pattern = Pattern.compile("^[+-]?\\d+(\\.\\d+)?$");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }  return true;
    }
    public static int excelColStrToNum(String colStr, int length) {
        int num = 0;
        int result = 0;
        for(int i = 0; i < length; i++) {
            char ch = colStr.charAt(length - i - 1);
            num = (int)(ch - 'A' + 1) ;
            num *= Math.pow(26, i);
            result += num;
        }
        return result;
    }
}
