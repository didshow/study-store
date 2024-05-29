import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);

        JPanel panel = new JPanel();
        this.setContentPane(panel);

        JLabel c1 = new ColorLabel("1", Color.CYAN);

        panel.setLayout(null);
        panel.add(c1);
        c1.setBounds(100,60,30,60);
    }
}
