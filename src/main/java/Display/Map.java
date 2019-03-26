package Display;


import javax.swing.*;
import java.awt.*;


public class Map extends JPanel {
    private int width;
    private int height;



    public Map(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void paint(Graphics g) {

        for (int i = width / 10; i <= width; i += height / 10) {
            g.drawLine(i, 0, i, height);
            g.drawLine(0, i, width, i);
        }

    }

}