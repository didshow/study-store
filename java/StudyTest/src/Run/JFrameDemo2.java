package Run;

import java.awt.*;
import javax.swing.*;

public class JFrameDemo2 {
	public static void main(String[]args) {
		JFrame frame = new JFrame("JFrameDemo2");			//����һ��JFrameʵ��
		JButton button = new JButton("Press me");			//����һ��JButtonʵ��
		JPanel contentPane = new JPanel();					//����һ��JPanelʵ��
		contentPane.setLayout(new BorderLayout());			//ΪJPaner����BorderLayout���ֹ�����
		contentPane.add(button,BorderLayout.CENTER);		//��JButton�ŵ�Jpanel����
		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
