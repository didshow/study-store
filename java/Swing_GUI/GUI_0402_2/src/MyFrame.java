import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JComboBox<String> comboBox = new JComboBox<>();
    JButton button = new JButton("确认");
    public MyFrame(String title){
        super(title);

        //
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        //
        panel.add(comboBox);
        comboBox.addItem("男");
        comboBox.addItem("女");

        //
        panel.add(button);

        //
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testComboBox();
            }
        });
        //
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testButton();
            }
        });
    }
    public void testButton(){
        System.out.println("帅气的熊：您已确认！");
        for(int i = 0;i < comboBox.getItemCount();i++){
            System.out.println("第"+i+"个index为："+ comboBox.getItemAt(i));
        }
    }
    public void testComboBox(){
        int index = comboBox.getSelectedIndex();
        String item = comboBox.getItemAt(index);
        System.out.println("用户选中的索引是：" + index + "，内容是：" + item);
    }
}
