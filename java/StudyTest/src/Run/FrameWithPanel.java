package Run;

import java.awt.*;
import javax.swing.*;

public class FrameWithPanel {
	public static void main(String []args) {
		JFrame frame = new JFrame("Frame with Panel");			//���б����JFrameʵ��
		Container contentPane = frame.getContentPane();			//��ȡ���ݴ���
		contentPane.setBackground(Color.cyan);					//��JFrameʵ������ɫ����Ϊ����ɫ
		JPanel panel = new JPanel();							//����һ��JPanelʵ��
		panel.setBackground(Color.yellow);						//��JPanelʵ������ɫ����Ϊ��ɫ
		JButton button = new JButton("Press me");
		panel.add(button);										//��JButtonʵ���ӵ�JPanel��
		contentPane.add(panel,BorderLayout.SOUTH);				//��JPanelʵ����ӵ�JFrame���ϲ�
		frame.setSize(300,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//�˳�ʱ�رմ���
		
	
	}
}
