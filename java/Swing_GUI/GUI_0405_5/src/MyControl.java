import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyControl extends JPanel {
    private boolean hOver = false;

    public MyControl(){
        this.addMouseMotionListener(new MyMouseListener());
    }
    /**
     *  控件绘制
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = this.getWidth();
        int height = this.getHeight();

        // 绘制一个矩形，长宽分别为：自定义的长、宽，颜色为黄色
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,width,height);

        // 绘制边框,颜色为黑色
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width - 1, height - 1);
    }
    private class MyMouseListener implements MouseMotionListener {

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("** mouseDragged() ... **");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("** mouseMoved() ... **");
        }
    }
}
