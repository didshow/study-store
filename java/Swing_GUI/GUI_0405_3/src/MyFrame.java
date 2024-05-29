import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);

        // 设置一个容器
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        MyControl control = new MyControl();
        panel.add(control);

        // 设置控件大小
        control.setPreferredSize(new Dimension(400,300));

       control.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               System.out.println("** mouseClicked ... **");
           }

           @Override
           public void mousePressed(MouseEvent e) {
               System.out.println("** mousePressed ... **");
           }

           @Override
           public void mouseReleased(MouseEvent e) {
               System.out.println("** mouseReleased... **");
           }
       });
    }

}
