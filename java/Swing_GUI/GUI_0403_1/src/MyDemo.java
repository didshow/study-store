import javax.swing.*;

public class MyDemo {
    public static void main(String[] args) {
        JFrame frame = new MyFrame("Swing example");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
