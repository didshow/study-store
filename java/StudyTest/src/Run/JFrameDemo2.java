package Run;

import java.awt.*;
import javax.swing.*;

public class JFrameDemo2 {
	public static void main(String[]args) {
		JFrame frame = new JFrame("JFrameDemo2");			//创建一个JFrame实例
		JButton button = new JButton("Press me");			//创建一个JButton实例
		JPanel contentPane = new JPanel();					//创建一个JPanel实例
		contentPane.setLayout(new BorderLayout());			//为JPaner设置BorderLayout布局管理器
		contentPane.add(button,BorderLayout.CENTER);		//将JButton放到Jpanel中央
		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
