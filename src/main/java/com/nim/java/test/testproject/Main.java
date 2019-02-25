/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nim.java.test.testproject;

import com.nim.java.test.testproject.classes.Card;

/**
 *
 * @author Nimrod
 */
public class Main {

    public static void main(String[] args) {
        Card card = new Card(Card.Suit.CLUB,Card.Rank.ACE);
        System.out.println("As de Tréboles: "+card);
    }
    
}
