import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);

        JPanel panel = new JPanel();
        this.setContentPane(panel);

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);

        label1.setPreferredSize(new Dimension(60,30));
        label2.setPreferredSize(new Dimension(60,30));
        label3.setPreferredSize(new Dimension(60,30));
        label4.setPreferredSize(new Dimension(60,30));

        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);
        label4.setOpaque(true);

        label1.setForeground(new Color(0,0,0));
        label2.setForeground(new Color(0,0,0));
        label3.setForeground(new Color(0,0,0));
        label4.setForeground(new Color(0,0,0));

        label1.setBackground(Color.yellow);
        label2.setBackground(Color.CYAN);
        label3.setBackground(Color.GREEN);
        label4.setBackground(Color.pink);

        label1.setText("1");
        label2.setText("2");
        label3.setText("3");
        label4.setText("4");

        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
