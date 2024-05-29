import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    JLabel c1 = new ColorLabel("1", Color.CYAN);
    JLabel c2 = new ColorLabel("2",Color.LIGHT_GRAY);
    JLabel c3 = new ColorLabel("3",Color.YELLOW);
    JLabel c4 = new ColorLabel("4",Color.GREEN);
    JLabel c5 = new ColorLabel("5",Color.RED);
    public MyFrame(String title){
        super(title);

        JPanel panel = new JPanel();
        this.setContentPane(panel);

        panel.add(c1);

        panel.add(c2);

        panel.add(c3);

        panel.add(c4);

        panel.add(c5);

        panel.setLayout(new MyCustomLayout());
    }
    private class MyCustomLayout extends LayoutAdapter{

        @Override
        public void addLayoutComponent(Component comp, Object constraints) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public void layoutContainer(Container parent) {
            int width = parent.getWidth();
            int height = parent.getHeight();

            // 将c1放到左上角,c2放在右上角,c3放在左下角,c4放在右下角
            c1.setLocation(0,0);
            //没有setSize是运行不出来的
            c1.setSize(c1.getPreferredSize());
            c2.setLocation(width-c2.getPreferredSize().width,0);
            c2.setSize(c2.getPreferredSize());
            c3.setLocation(0,height-c3.getPreferredSize().height);
            c3.setSize(c3.getPreferredSize());
            c4.setLocation(width-c4.getPreferredSize().width,height-c4.getPreferredSize().height);
            c4.setSize(c4.getPreferredSize());
        }
    }
}
