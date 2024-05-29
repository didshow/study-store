import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title){
        super(title);

        JPanel panel = new JPanel();
        this.setContentPane(panel);

        //
        MyPicture c = new MyPicture();
        panel.add( c );
        c.setPreferredSize(new Dimension(300,300));

    }
}
