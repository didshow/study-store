import javax.swing.*;

public class MyDemo {
    public static void main(String[] args) {
        // 创建一个框架
        JFrame myFrame = new MyFrame("MysecondDemo");

        // 设置框架关闭方式为默认关闭方式
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 设置框架大小
        myFrame.setSize(400,300);

        // 显示框架
        myFrame.setVisible(true);
    }
}
