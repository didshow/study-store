package Run;

import java.awt.*;
import javax.swing.*;

public class FrameWithPanel {
	public static void main(String []args) {
		JFrame frame = new JFrame("Frame with Panel");			//带有标题的JFrame实例
		Container contentPane = frame.getContentPane();			//获取内容窗格
		contentPane.setBackground(Color.cyan);					//将JFrame实例背景色设置为蓝绿色
		JPanel panel = new JPanel();							//创建一个JPanel实例
		panel.setBackground(Color.yellow);						//将JPanel实例背景色设置为黄色
		JButton button = new JButton("Press me");
		panel.add(button);										//将JButton实例加到JPanel中
		contentPane.add(panel,BorderLayout.SOUTH);				//将JPanel实例添加到JFrame的南侧
		frame.setSize(300,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//退出时关闭窗口
		
	
	}
}
