import javax.swing.*;
import java.awt.*;

public class MyframeAdvanced extends JFrame {
    JPanel panel = new JPanel();
    public MyframeAdvanced(String title){
        super(title);

        this.setContentPane(panel);

        JLabel c1 = new CorlorLabel("1",Color.CYAN);
        panel.add(c1);

        JLabel c2 = new CorlorLabel("2",Color.LIGHT_GRAY);
        panel.add(c2);

        JLabel c3 = new CorlorLabel("3",Color.YELLOW);
        panel.add(c3);

        JLabel c4 = new CorlorLabel("4",Color.GREEN);
        panel.add(c4);

        JLabel c5 = new CorlorLabel("4",Color.RED);
        panel.add(c5);

        panel.setLayout(new BorderLayout());

        //设置布局管理器BorderLayout
        panel.add(c1,BorderLayout.NORTH);
        panel.add(c2,BorderLayout.SOUTH);
        panel.add(c3,BorderLayout.WEST);
        panel.add(c4,BorderLayout.EAST);
        panel.add(c5,BorderLayout.CENTER);

        c1.setPreferredSize(new Dimension(0,100));
        c2.setPreferredSize(new Dimension(0,100));
        c3.setPreferredSize(new Dimension(100,0));
        c4.setPreferredSize(new Dimension(100,0));
    }
    public static class CorlorLabel extends JLabel{
        public CorlorLabel(String text,Color bgColor){
            this.setOpaque(true);
            this.setPreferredSize(new Dimension(60,30));
            this.setHorizontalAlignment(SwingConstants.CENTER);
            this.setFont(new Font("楷体",Font.PLAIN,18));
            this.setText(text);
            this.setBackground(bgColor);
        }
    }
}

