import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);

        JPanel panel = new JPanel();
        this.setContentPane(panel);
        panel.setLayout(new SimpleLayout());

        JLabel c1 = new ColorLabel("1", Color.CYAN);
        panel.add(c1);

        JLabel c2 = new ColorLabel("2",Color.LIGHT_GRAY);
        panel.add(c2);

        JLabel c3 = new ColorLabel("3",Color.YELLOW);
        panel.add(c3);

        JLabel c4 = new ColorLabel("4",Color.GREEN);
        panel.add(c4);

        JLabel c5 = new ColorLabel("5",Color.RED);
        panel.add(c5);

    }
}
