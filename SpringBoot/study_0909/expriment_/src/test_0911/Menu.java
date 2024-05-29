package test_0911;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MenuExample");
        JMenuBar menuBar = new JMenuBar();
        // 第一个下拉菜单
        JMenu menu1 = new JMenu("Menu 1");
        JMenuItem menuItem11 = new JMenuItem("Menu Item 1-1");
        JMenuItem menuItem12 = new JMenuItem("Menu Item 1-2");
        JMenuItem menuItem13 = new JMenuItem("Menu Item 1-3");

        // 添加菜单项到菜单中
        menu1.add(menuItem11);
        menu1.add(menuItem12);
        menu1.add(menuItem13);

        // 第二个下拉菜单
        JMenu menu2 = new JMenu("Menu 2");
        JMenuItem menuItem21 = new JMenuItem("Menu Item 2-1");
        JMenuItem menuItem22 = new JMenuItem("Menu Item 2-2");

        // 添加菜单项到菜单中
        menu2.add(menuItem21);
        menu2.add(menuItem22);

        // 第三个下拉菜单
        JMenu menu3 = new JMenu("Menu 3");
        JMenuItem menuItem31 = new JMenuItem("Menu Item 3-1");
        JMenuItem menuItem32 = new JMenuItem("Menu Item 3-2");
        JMenuItem menuItem33 = new JMenuItem("Menu Item 3-3");

        // 添加菜单项到菜单中
        menu3.add(menuItem31);
        menu3.add(menuItem32);
        menu3.add(menuItem33);

        // 添加下拉菜单到菜单条中
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        // 添加菜单项的监听器
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String menuInfo = e.getActionCommand();
                JOptionPane.showMessageDialog(null, menuInfo);
            }
        };

        // 添加监听器到每个菜单项
        menuItem11.addActionListener(listener);
        menuItem12.addActionListener(listener);
        menuItem13.addActionListener(listener);
        menuItem21.addActionListener(listener);
        menuItem22.addActionListener(listener);
        menuItem31.addActionListener(listener);
        menuItem32.addActionListener(listener);
        menuItem33.addActionListener(listener);

        // 将菜单条添加到窗口中
        frame.setJMenuBar(menuBar);

        // 设置窗口大小并显示
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
