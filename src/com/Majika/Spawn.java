/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Majika;
import java.util.Random;

/**
 *
 * @author Edrian
 */
public class Spawn {

    Random rand = new Random();

    public Spawn() {//CONSTRUCTOR
    }

    public double getRandomIntegerRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

}
