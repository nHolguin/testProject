/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nim.java.test.testproject.classes;

/**
 *
 * @author Nimrod
 */
public final class Hands {
    
    public static final int CARD = 5;
    
    public enum TYPE {
        HIGH_CARD, ONE_PAIR, TWO_PAIR, THREE_OF_A_KING, STRAIGHT, FLUSH, FULL_HOUSE, FOUR_OF_A_KING, STRAIGHT_FLUSH
    }
    
    private Hands() {}
}
