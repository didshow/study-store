package test_0910;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JTextField textField1, textField2, resultField;

    public MyFrame(String title) {
        super(title);

        JPanel panel = new JPanel();
        this.setContentPane(panel);

        JLabel label1 = new JLabel("Number 1:");
        textField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        textField2 = new JTextField();
        JLabel label3 = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });
        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });
        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);

        panel.add(label3);
        panel.add(resultField);

        // 设置布局格式
        panel.setLayout(null);
        label1.setBounds(10,10,100,30);
        label2.setBounds(10,50,100,30);
        label3.setBounds(10,130,100,30);

        textField1.setBounds(140,10,100,30);
        textField2.setBounds(140,50,100,30);
        resultField.setBounds(140,130,100,30);

        addButton.setBounds(10,90,50,30);
        subtractButton.setBounds(70,90,50,30);
        multiplyButton.setBounds(130,90,50,30);
    }

    private void calculate(char operator) {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        resultField.setText(Double.toString(result));
    }

}
