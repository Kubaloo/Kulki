package Game;

import Display.Balls;
import Display.Display;
import Display.Map;
import Mouse.MouseListen;

import javax.swing.*;

public class Game extends JFrame {
    private int width;
    private int height;
    private Display display;
    private Balls balls;
    private Map map;

    public Game(int width, int height) {
        super("Rysowanie");
        this.width = width;
        this.height = height;
        display = new Display(width, height);
        map = new Map(width, height);
        balls = new Balls(width, height);

        JPanel panel = new Display(width, height);
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MouseListen(width, height));
        setVisible(true);


    }

}




