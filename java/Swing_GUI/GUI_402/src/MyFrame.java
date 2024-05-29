import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    // 创建一个文本框:20个英文字符长度
    JTextField jTextField = new JTextField(20);
    JButton jButton = new JButton("ok");
    JCheckBox jCheckBox = new JCheckBox("同意协议内容");
    JButton jButton1 = new JButton("下一步");
    // 构造器
    public MyFrame(String title){
        super(title);

        // 创建一个面板容器
        JPanel jPanel = new JPanel();
        this.setContentPane(jPanel);

        jPanel.add(jTextField);

        // 创建一个按钮
        jPanel.add(jButton);

        // 创建一个复选框控件
        jPanel.add(jCheckBox);

        // 创建一个按钮控件
        jPanel.add(jButton1);
        jButton1.setEnabled(false);
        // 没有勾选复选框，则按钮不能使用，勾选复选框才能使用下一步按钮
        jCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jCheckBox.isSelected()){
                    jButton1.setEnabled(true);
                }else {
                    jButton1.setEnabled(false);
                }
            }
        });
        // 当按下按钮时，取出文本框中输入的值
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAction();
            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action();
            }
        });
    }
    // 当按钮被点击，取出文本框里的数据
    public void showAction(){
        String str = jTextField.getText();
        System.out.println(str);
    }
    public void action(){
        System.out.println("***哪个大帅比点我啊！***");
    }
}
