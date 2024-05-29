import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame{
    // 2.创建全局变量：JLable
    JLabel timeLabel = new JLabel();
    public MyFrame(String title){

        super(title);
        // 创建一个面板，并将这个面板作为根容器
        JPanel root = new JPanel();
        this.setContentPane(root);

        // 向容器中添加一个JButton控件
        JButton jButton = new JButton("按钮");
        root.add(jButton);

        // 向button添加一个监听类
        // ActionListener myActionListener = new MyActionListener();
        // jButton.addActionListener(myActionListener);
        jButton.addActionListener(new MyActionListener());

        // 向容器内添加一个标签控件
        //root.add(new JLabel("handsome bear"));
        root.add(timeLabel);
    }

    // 监听类
    public class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("***按钮被点击了***");

            // 1.获取当前时间
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
            String timeStr = simpleDateFormat.format(new Date());

            // 显示timeStr这个时间
            System.out.println(timeStr);
            timeLabel.setText(timeStr);
        }
    }

}
