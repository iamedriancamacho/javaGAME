package com.Majika;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

public class SpaceShip2 extends Sprite {

    private int dx;
    private int dy;
    private List<Missile> missiles;
    private int right = 0;
    private boolean isWalking;

    public SpaceShip2(int x, int y) {
        super(x, y);
        initSpaceShip();
    }

    private void walking(boolean isWalking) {
        //walking animation

        Timer T = new Timer(50, (ActionEvent e) -> {
            right++;
            System.out.println("right" + right);

            switch (right) {
                case 1:
                    loadImage("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\char\\a.png");
                    break;
                case 2:
                    loadImage("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\char\\b.png");
                    break;
                case 3:
                    loadImage("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\char\\c.png");
                    break;
            }

            if (right == 3) {
                //count++;
                //System.out.println("count: " + count);
                right = 0;
            }

        }
        );
        if (isWalking) {
            T.setRepeats(false);
            T.start();
        } else {
            T.stop();
        }

    }

    public void initSpaceShip() {
        missiles = new ArrayList<>();
        loadImage("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\char\\a.png");
        getImageDimensions();
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public List<Missile> getMissiles() {
        return missiles;
    }

   public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SLASH) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            if (x <= 100) {
                x = 100;
            } else {
                dx = -2;
                isWalking = true;
                walking(isWalking);
            }

        }

        if (key == KeyEvent.VK_RIGHT) {
            if (x >= 792) {
                x = 792; //X border
            } else {
                dx = 2;
                isWalking = true;
                walking(isWalking);
            }

        }

        if (key == KeyEvent.VK_UP) {
            if (y <= 148) { //Y border
                y = 148;
                System.out.println("Ylimit: " + y);
            } else {
                dy = -2;
                isWalking = true;
                walking(isWalking);
            }

        }

        if (key == KeyEvent.VK_DOWN) {
            if (y >= 424) {
                y = 424;
            } else {
                dy = 2;
                isWalking = true;
                walking(isWalking);

            }

        }

    }

    public void fire() {
        missiles.add(new Missile(x + width - 30, y + height - 100 / 2));
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
            isWalking = false;
            walking(isWalking);
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
            isWalking = false;
            walking(isWalking);
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
            isWalking = false;
            walking(isWalking);
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
            isWalking = false;
            walking(isWalking);
        }
    }
}
