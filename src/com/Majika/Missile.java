package com.Majika;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Missile extends Sprite {

    private final int BOARD_WIDTH1 = 792;
    private final int BOARD_WIDTH2 = 100;

    private final int MISSILE_SPEED = 3;
    private int power1 = 0, power2 = 0;
    private boolean isDisappear;

    private char choose1='h', choose2='h';
    File directory1 = new File("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\"+choose1);
    File directory2 = new File("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\left\\"+choose2);
    int fileCount1 = directory1.list().length;
    int fileCount2 = directory2.list().length;
    // System.out.println("fileCount: " + fileCount);

    public Missile(int x, int y) {
        super(x, y);

        initMissile();
    }

    private void initMissile() {

        loadImage("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\");
        getImageDimensions();

    }

    Timer TP = new Timer(100, new ActionListener() { //200 ++slower
        public void actionPerformed(ActionEvent e) {
            power1++;
            for (int i = 0; i < fileCount1; i++) {
                loadImage("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\"+choose1+"\\Layer "+power1+".png");
            }

            if (power1 == fileCount1) {
                isDisappear = true;
                TP.stop();
            }
        }
    });

    Timer TP2 = new Timer(100, new ActionListener() { //200 ++slower
        public void actionPerformed(ActionEvent e) {
            power2++;
            for (int i = 0; i < fileCount2; i++) {
                loadImage("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\left\\"+choose2+"\\Layer "+power2+".png");
            }

            if (power2 == fileCount2) {
                isDisappear = true;
                TP2.stop();
            }
        }
    });

    //move for player1
    public void move() {
        TP.start();
        if (power1 >= (fileCount1/2)) {
            x += 0;

        } else {
            x += MISSILE_SPEED;
        }
        if (isDisappear) {
            TP.stop();
            visible = false;
        }

        if (x >= BOARD_WIDTH1) {

            visible = false;
            TP.stop();
            isDisappear = false;
        }
    }

    //move for player2
    public void move2() {
        TP2.start();
        if (power2 >= (fileCount2/2)) {
            x += 0;
        } else {
            x -= MISSILE_SPEED;
        }
        if (isDisappear) {
            TP2.stop();
            visible = false;
        }

        if (x <= BOARD_WIDTH2) {

            visible = false;
            TP2.stop();
            isDisappear = false;
        }
    }

}
