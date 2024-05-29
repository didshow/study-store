package test_0910;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputeNum {

    public static void main(String[] args) {
        JFrame frame = new MyFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ComputeNum();
            }
        });
    }
}
