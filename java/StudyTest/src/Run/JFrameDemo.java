package Run;

import java.awt.*;
import javax.swing.*;

public class JFrameDemo {
	public static void main(String []args) {
		JFrame frame = new JFrame("JFrameDemo");
		//����һ��JFrame��ʵ�����б���
		JButton button = new JButton("Press me");						//����һ��JButton��ʵ������ť��������
		frame.getContentPane().add(button, BorderLayout.CENTER);		//�����ŵ�JFrame������
		frame.pack();													//��JFrame����Ϊ���ʵĴ�С
		frame.setVisible(true);											//��ʾJframe
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//�˳�ʱ�رմ���
	}
}
