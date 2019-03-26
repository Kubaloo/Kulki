package Display;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {
    private Balls balls;
    private Map map;
    private int width;
    private int height;
    private Graphics g;
    private JPanel panel;

    public Display(int width, int height) {
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width , height));
        map = new Map(width, height);
        balls = new Balls(width, height);


    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        //rysowanie mapy
        map.paint(g2d);

        //rysowanie kuleczek
        balls.paint(g2d);

    }

}
