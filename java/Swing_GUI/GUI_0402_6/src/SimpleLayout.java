import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SimpleLayout extends LayoutAdapter {
    List<Component> list = new ArrayList<>();

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        list.add(comp);
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        list.remove(comp);
    }

    // 布局管理器重点写
    @Override
    public void layoutContainer(Container parent) {
        System.out.println("***layoutContainer()...***");

        int width = parent.getWidth();
        int height = parent.getHeight();
        int x = 0;
        int y = 0;

//        Component children [] = parent.getComponents();
        for(int i = 0; i < list.size(); i++){
            Component c = list.get(i);
            c.setBounds(0,0,100,100);
            x += 100;
            if (x > width){
                x = 0;
                y += 100;
            }
        }
    }

}
