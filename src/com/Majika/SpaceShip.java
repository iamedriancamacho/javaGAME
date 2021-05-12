package com.Majika;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class SpaceShip extends Sprite {

    private int dx;
    private int dy;
    private List<Missile> missiles;
    private int right = 0;
    private boolean isWalking;
    private int cntFire;
    private boolean isFire;
    public int spaceTempX;

    public SpaceShip(int x, int y) {
        super(x, y);
        initSpaceShip();
    }

    private void walking(boolean isWalking) {
        //walking animation

        Timer T = new Timer(50, (ActionEvent e) -> {
            right++;
            //System.out.println("right" + right);

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
    
    int tempfire=0; //for stopFire
    private void stopFire(boolean isFire){
        //fire animation

        Timer T = new Timer(1000, (ActionEvent e) -> {
            tempfire++;
            switch (tempfire) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            
            }
            //System.out.println("tempfire" + tempfire);
        }
                
        );
         if (tempfire == 3) {
                tempfire = 0;
                T.stop();
            }else 
        T.start();
    
    }
    

    private void initSpaceShip() {
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

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_A) {
            if (x <= 100) {
                x = 100;
            } else {
                dx = -2;
                isWalking = true;
                walking(isWalking);
            }

        }

        if (key == KeyEvent.VK_D) {
            if (x >= 792) {
                x = 792; //X border
            } else {
                dx = 2;
                isWalking = true;
                walking(isWalking);
            }

        }

        if (key == KeyEvent.VK_W) {
            if (y <= 148) { //Y border
                y = 148;
                System.out.println("Ylimit: " + y);
            } else {
                dy = -2;
                isWalking = true;
                walking(isWalking);
            }

        }

        if (key == KeyEvent.VK_S) {
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
        cntFire++;
        System.out.println("cntFire" + cntFire);
        if (cntFire>=3) {
            isFire=true;
            stopFire(isFire);
              cntFire=0;
        }else 
            
        missiles.add(new Missile(x + width - 50, y + height - 80 / 2));
        for (int i = 0; i < missiles.size(); i++) {
            
        }
        isFire=false;
        
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A) {
            dx = 0;
            isWalking = false;
            walking(isWalking);

        }

        if (key == KeyEvent.VK_D) {
            dx = 0;
            isWalking = false;
            walking(isWalking);

        }

        if (key == KeyEvent.VK_W) {
            dy = 0;
            isWalking = false;
            walking(isWalking);

        }

        if (key == KeyEvent.VK_S) {
            dy = 0;
            isWalking = false;
            walking(isWalking);

        }
    }
}
