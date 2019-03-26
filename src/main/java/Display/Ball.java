package Display;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ball {
    private int width;
    private int height;
    private int ballWidth;
    private int ballHeight;
    private Point ballPos;
    private ArrayList<Point> allBallsPos = new ArrayList<Point>();
    private int ballColor;
    private int posX;
    private int posY;

    public Ball(int width, int height) {
        this.width = width;
        this.height = height;

        ballWidth = width / 10;
        ballHeight = height / 10;

        randomBallColor();
        randomBallPos();
        allBallsPos.add(ballPos);

    }

    public void randomBallColor() {
        Random r = new Random();
        ballColor = r.nextInt(7);

    }

    public void randomBallPos() {
        Random r = new Random();
        Random r2 = new Random();

        posX = r.nextInt(10);
        posY = r2.nextInt(10);

        ballPos = new Point(posX, posY);

    }
    public int getBallColor(){
        return ballColor;
    }

    public Point getBallPos() {
        return ballPos;
    }

    public ArrayList<Point> getAllBallsPos() {
        return allBallsPos;
    }

    public int getBallHeight() {
        return ballHeight;
    }

    public int getBallWidth() {
        return ballWidth;
    }
}
