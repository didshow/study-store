package test_0911;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileDataReader {
    public static String txtToString(File file){
        String result = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s=bufferedReader.readLine())!=null){
                result = result +"\n" + s;
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String str = scanner.next();
        String catalog = "D:\\Study\\study_0909\\expriment_\\src\\test_0911\\"+str;
        File file = new File(catalog);
        System.out.println(txtToString(file));
    }
}
