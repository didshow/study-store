import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);

        // 设置一个容器
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        HandDraw control = new HandDraw();
        panel.add(control);

        // 设置控件大小
        control.setPreferredSize(new Dimension(200,200));
    }

}
