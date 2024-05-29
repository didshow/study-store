import javax.swing.*;
import java.awt.*;

public class MyControl extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = this.getWidth();
        int height = this.getHeight();
        //底色为白色
        g.setColor(new Color(0xffffff));
        // 绘制一个矩形，长宽分别为：自定义的长、宽
        g.fillRect(0,0,width,height);

        g.setColor(new Color(0xffff));
        g.fillOval(30,20,100,30);

        g.setColor(new Color(0xffff));
        g.fillArc(100,50,50,30,-30,90);
    }
}
