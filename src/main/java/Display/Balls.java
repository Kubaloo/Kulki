package Display;

import java.awt.*;
import java.util.ArrayList;

public class Balls {
    private int width;
    private int height;
    private int numberOfBalls = 10;
    private Color colorTab[] = new Color[]{Color.CYAN, Color.red, Color.green, Color.pink, Color.blue, Color.GRAY, Color.yellow};
    private ArrayList<Ball> allBalls = new ArrayList<Ball>();
    private Ball ball;

    int licz = 0;


    public Balls(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public void paint(Graphics g) {
        for (int i = 0; i < numberOfBalls; i++) {
            if (allBalls.isEmpty() == false) {
                for (int tmp = 0; tmp < ball.getAllBallsPos().size(); tmp++) {
                    for (int tmp2 = 0; tmp2 < ball.getAllBallsPos().size(); tmp2++) {
                        if (ball.getAllBallsPos().get(tmp) != ball.getAllBallsPos().get(tmp2) && tmp != tmp2) {
                            ball = new Ball(width, height);
                        }
                    }
                }
            } else {
                ball = new Ball(width, height);
            }
            ball = new Ball(width, height);
            allBalls.add(ball);
        }

        for (Ball ball : allBalls) {
            g.setColor(colorTab[ball.getBallColor()]);
            g.fillOval(ball.getBallPos().x * 70, ball.getBallPos().y * 70, ball.getBallWidth(), ball.getBallHeight());
            System.out.println(ball.getBallPos());
        }

        licz++;
        System.out.println(licz);
    }


}
