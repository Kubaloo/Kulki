package Mouse;

import Display.Balls;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseListen extends JPanel implements MouseListener, MouseMotionListener {

    private int width, height;
    private Balls balls;
    private int x;
    private int y;

    public MouseListen(int width, int height) {
        this.width = width;
        this.height = height;
        addMouseListener(this);
        addMouseMotionListener(this);
        balls = new Balls(width, height);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        System.out.println(x);
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e) {

    }
}
