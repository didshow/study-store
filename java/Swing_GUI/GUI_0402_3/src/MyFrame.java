import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);

        JPanel panel = new JPanel();
        this.setContentPane(panel);

        JLabel label = new JLabel();
        panel.add(label);

        label.setText("熊师傅你好!");
        label.setFont(new Font("楷体",Font.PLAIN,18));
        label.setForeground(new Color(255,0,0));
        label.setOpaque(true);
        label.setBackground(new Color(0,0,0));
        label.setPreferredSize(new Dimension(160,30));
        label.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
