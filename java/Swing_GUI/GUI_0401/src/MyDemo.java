import javax.swing.*;

public class MyDemo {
    public static void main(String[] args) {
        //创建一个框架，他的标题（titlt）是MyfirstDemo
        JFrame myFrame = new MyFrame("MyfirstDemo");

        //当关闭窗口时，退出整个程序
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //设置窗口大小(setSize(int width,int height))
        myFrame.setSize(400,300);

        //显示窗口
        myFrame.setVisible(true);
    }
}
