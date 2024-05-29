import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);

        // 设置面板容器组件
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        // 添加两个彩色标签
        ColorLabel label1 = new ColorLabel("1", Color.cyan);
        ColorLabel label2 = new ColorLabel("2",Color.yellow);

        // 将标签添加进面板容器
        panel.add(label1);
        panel.add(label2);

        // 添加边框的两种不同的方式
        Border border1 = new LineBorder(Color.BLACK,2);
        label1.setBorder(border1);
        Border border2 = BorderFactory.createLineBorder(Color.red,2);
        label2.setBorder(border2);
    }
}
