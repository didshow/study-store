package util;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class PictureView extends JPanel {
    private Image image;
    private Color bgColor;
    // 空参构造器
    public PictureView(){

    }

    public PictureView(Image image){

    }
    // 设置背景色
    public void setBgColor(Color bgColor){
        this.bgColor = bgColor;
        this.repaint();
    }

    // 设置图片(传入参数为图片)
    public void setImage(Image image){
        this.image = image;
        this.repaint();     //重新绘制
    }

    // 设置图片(传入参数为文件路径)
    public void setImage(File file){
        try {
            Image image = ImageIO.read( file );
            this.repaint();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //
    public void setImage(String resourcePath){
        try {
            InputStream res = this.getClass().getResourceAsStream( resourcePath );
            this.image = ImageIO.read(res);
            this.repaint();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 控制组件位置并绘制图片
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        // 长、宽
        int width = this.getWidth();
        int height = this.getHeight();

        // 如果传入的bgColor不为空，则设置背景颜色为bgColor
        if( bgColor != null){
            g.setColor(bgColor);
            g.fillRect(0,0,width,height);
        }

        // 传入图片不为空
        if( image != null ){
            // 绘制图片
            g.drawImage(image,0,0,width,height,null);
        }

        // 绘制边框
        g.setColor(Color.BLACK);
        g.drawRect(0,0,width-1,height-1);
    }
}
