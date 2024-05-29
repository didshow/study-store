import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyControl extends JPanel {
    private boolean hOver = false;

    public MyControl(){
        this.addMouseListener(new MyMouseListener());
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

        // 底色为白色
        g.setColor(Color.YELLOW);

        // 绘制一个矩形，长宽分别为：自定义的长、宽
        g.fillRect(0,0,width,height);

        if(hOver){// 边框颜色为黑色
            g.setColor(Color.RED);
            // 绘制边框
            g.drawRect(0, 0, width - 1, height - 1);
            repaint();
        }else {
            g.setColor(Color.BLACK);
            // 绘制边框
            g.drawRect(0, 0, width - 1, height - 1);
            repaint();
        }
    }
    private class MyMouseListener extends MouseAdapter{
        public MyMouseListener() {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            hOver = true;
            System.out.println("** mouseEntered() ... **");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            hOver = false;
            System.out.println("** mouseExited() ... **");
        }
    }
}
