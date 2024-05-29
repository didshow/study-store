import javax.swing.*;
import java.awt.*;

public class ColorLabel extends JLabel {
    public ColorLabel(String text, Color bgColor){
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(100,50));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("楷体",Font.PLAIN,18));
        this.setText(text);
        this.setBackground(bgColor);
    }
}
