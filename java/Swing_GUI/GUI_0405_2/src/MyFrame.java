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

       // 添加一个鼠标监听类(使用adapt)
        control.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("** mousePressed() ... **");
                System.out.println(e.getPoint());
                System.out.println(e.getLocationOnScreen());
                if (e.getButton() == MouseEvent.BUTTON1){
                    System.out.println("您点击了左键");
                }
                if(e.getButton() == MouseEvent.BUTTON2){
                    System.out.println("您点击了右键");
                }
                if(e.getButton() == MouseEvent.BUTTON3){
                    System.out.println("您点击了中键");
                }
            }
        });

        //  添加一个鼠标监听器(不使用addapt)
        control.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e.getPoint());
                System.out.println(e.getLocationOnScreen());
                if (e.getButton() == MouseEvent.BUTTON1){
                    System.out.println("您点击了左键");
                }
                if(e.getButton() == MouseEvent.BUTTON2){
                    System.out.println("您点击了右键");
                }
                if(e.getButton() == MouseEvent.BUTTON3){
                    System.out.println("您点击了中键");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

}
