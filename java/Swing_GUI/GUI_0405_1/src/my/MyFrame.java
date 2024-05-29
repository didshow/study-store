package my;

import util.PictureView;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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
        p.setPreferredSize(new Dimension(32,32));

        // 设置背景色
        p.setBgColor(Color.WHITE);

        // 简化
        p.setImage("/resouce/comment.png");
//        // 从资源文件加载并设置图片
//        try {
//            InputStream res = this.getClass().getResourceAsStream("/resouce/comment.png");
//            Image image = ImageIO.read(res);
//            p.setImage(image);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 设置图片
//        try {
//            Image image = ImageIO.read(new File("data/comment.png"));
//            p.setImage(image);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        
    }
}
