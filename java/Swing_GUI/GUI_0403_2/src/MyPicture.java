import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPicture extends JPanel {
    BufferedImage image;
    public MyPicture(){
        try {
            // 传入一个图片
            File file = new File("data/ftcy.jpg");
            this.image = ImageIO.read(file);                //this.image

            // 打印加载图片
            System.out.println("加载图片："+file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = this.getWidth();
        int height = this.getHeight();

        // 创建底色为白色的矩形组件
        g.setColor(new Color(0xffffff));
        g.fillRect(50,0,width,height);

        // 绘制图片
        g.drawImage(image,50,30,200,200,null);
    }
}
