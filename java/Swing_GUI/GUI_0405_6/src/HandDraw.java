import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class HandDraw extends JPanel {
    // 记录鼠标是否按下
    private boolean isPressed = false;
    private List<Point> points = new ArrayList<Point>();
    public HandDraw(){
        MyMouseListener l = new MyMouseListener();
        this.addMouseMotionListener(l);
        this.addMouseListener(l);
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

        // 当点集的个数大于2的时候，依次取出各个点，并绘制
        if(points.size() > 1){
            Point pointBegin = points.get(0);
            for (int i = 1; i < points.size(); i++) {
                Point pointEnd = points.get(i);

                // 设置连线颜色
                g.setColor(Color.RED);

                // 将点集里的每个点进行连线
                g.drawLine(pointBegin.x,pointBegin.y,pointEnd.x,pointEnd.y);

                // 迭代
                pointBegin = pointEnd;
            }
        }
    }
   private class MyMouseListener extends MouseAdapter{
       public MyMouseListener() {

       }

       @Override
       public void mousePressed(MouseEvent e) {
           isPressed = true;
           // 每次点击鼠标，清理点集
           points.clear();
           // 将鼠标点下的点设置为起始点，加入点集
           Point pointBegin = e.getPoint();
           points.add(pointBegin);
           repaint();
       }

       @Override
       public void mouseReleased(MouseEvent e) {
           isPressed = false;
       }

       @Override
       public void mouseDragged(MouseEvent e) {
           if( isPressed ){
               points.add(e.getPoint());
               repaint();
           }

       }
   }
}
