package my;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MyFrame extends JFrame {
    public MyFrame(String title){
        super(title);

        // 设置一个容器
        JPanel panel = new JPanel();
        this.setContentPane(panel);

        // new一个PictureView的对象，并且通过这个对象来对图片对象进行操作
        PictureView p = new PictureView();
        panel.add(p);

        // 设置大小
        p.setPreferredSize(new Dimension(400,300));

        // 设置背景色
        p.setBgColor(Color.WHITE);

        // 设置图片
        try {
            Image image = ImageIO.read(new File("data/ftcy.jpg"));
            p.setImage(image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
