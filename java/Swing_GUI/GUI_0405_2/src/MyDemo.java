import javax.swing.*;

public class MyDemo {
    public static void main(String[] args) {
        // 创建一个框架
        JFrame frame = new MyFrame("demo");

        // 设置默认关闭方式
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 设置框架大小
        frame.setSize(400,300);

        // 设置可见
        frame.setVisible(true);
    }
}
