package test_0911;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class DocumentApp {
    public static void main(String[] args) {
        String filename = JOptionPane.showInputDialog("请输入数据文件名：");

        // 创建文本区
        JTextArea textArea = new JTextArea();

        // 创建滚动面板，用于展示文本区
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 创建窗口
        JFrame frame = new JFrame("Data File Application");

        // 将滚动面板添加到窗口中
        frame.add(scrollPane);

        try {
            // 读取文件内容并显示到文本区中
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            // 如果文件读取出错，显示错误信息
            JOptionPane.showMessageDialog(null, "文件读取出错：" + e.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
        }

        // 设置窗口大小并显示
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
