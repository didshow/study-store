import javax.swing.*;
import java.awt.*;

public class MyDemo {
    public static void main(String[] args) {
        // 创建框架
        MyFrame frame = new MyFrame("demo");

        // 设置关闭方式为默认关闭方式
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // 设置大小
        frame.setSize(400,300);

        // 设置可见
        frame.setVisible(true);
    }
}
