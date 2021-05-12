/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Majika;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Edrian
 */
class Potion {

    ImageIcon imageP = new ImageIcon("E:\\BSIT 2\\BSIT 2 - 2nd Sem\\JAVA\\Finals\\Project_Majika\\Images\\powers\\potion.png");
    Image potion = imageP.getImage();
    Spawn s = new Spawn();
    boolean potionUse;
    int point;
    int potionTime =5 ;
    int potionTimeOut = potionTime + 10;
    int immuneDur = 0;
    boolean potion1 = false, potion2 = false;
    SpaceShip spaceShip;
    SpaceShip2 spaceShip2;
    float lifep1, lifep2;

    public Potion() {

    }

    private int TempX() {
        int temp = (int) s.getRandomIntegerRange(100, 792);
        return temp;

    }

    private int TempY() {
        int temp = (int) s.getRandomIntegerRange(148, 424);
        return temp;

    }

    public void Potion(Graphics2D g2d, Rectangle p1, Rectangle p2, int randx, int randy) {
        int tempx = randx;
        int tempy = randy;
        if (potionUse== false) {
            immuneDur = 0;
        }
        g2d.drawImage(potion, tempx, tempy, null);
        g2d.drawRect(tempx, tempy, 40, 40); //for apple
        Rectangle apple = new Rectangle(tempx, tempy, 40, 40);
        if (apple.intersects(p1)) {
            tempx = TempX();
            tempy = TempY();
            //potionUse = true;
            point = 1;
            if (lifep1 <= 1) {
                lifep1 = 1;
            } else {
                lifep1 -= 2;
            }
            potionTimeOut = potionTime;
            potionTime += 30;
            potionTimeOut = potionTime + 10;
        }

        if (potionUse) {
            if (point == 1) {
                immuneDuration(g2d, spaceShip.getX(), spaceShip.getY()); //immunity
                potion1 = true;
                if (lifep1 <= 1) {
                    lifep1 = 1;
                }

            } else if (point == 2) {
                immuneDuration(g2d, spaceShip2.getX(), spaceShip2.getY()); //immunity
                potion2 = true;
                if (lifep2 <= 1) {
                    lifep2 = 1;
                }

            }
        }

    }

    private void immuneDuration(Graphics2D x, int a, int b) {

        Timer ff = new Timer(1000, null);
        ff.start();
        immuneDur++;
        //System.out.println("time is: " + immuneDur / 1500);
        if (immuneDur / 1500 <= 6) {
            x.drawImage(potion, a - 23, b - 20, null);
        } else {
            ff.stop();
            potionUse = false;
        }

    }

}
