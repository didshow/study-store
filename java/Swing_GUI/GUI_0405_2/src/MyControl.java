import javax.swing.*;
import java.awt.*;

public class MyControl extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = this.getWidth();
        int height = this.getHeight();
        //底色为白色
        g.setColor(Color.YELLOW);
        // 绘制一个矩形，长宽分别为：自定义的长、宽
        g.fillRect(100,0,200,200);


    }
}
