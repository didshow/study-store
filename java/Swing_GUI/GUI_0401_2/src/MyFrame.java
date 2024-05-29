import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        // 向容器内添加一个标签控件
        //root.add(new JLabel("handsome bear"));
        root.add(timeLabel);
        jButton.addActionListener( (e)-> {
            System.out.println("***按钮被点到了***");
            showTime();
        });
    }

    // 打印时间
    public void showTime(){
        // 获取当前时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
        String timeStr = simpleDateFormat.format(new Date());
        // 控制台打印当前时间
        System.out.println(timeStr);
        //窗口标签显示当前时间
        timeLabel.setText(timeStr);
    }
}
