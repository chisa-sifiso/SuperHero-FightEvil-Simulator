/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ct1.fightevil;

import java.util.Random;
import javax.swing.JOptionPane;
import oop.ct1.superhero.SuperHero;

/**
 *
 * @author samukelo
 */
public class FightEvil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     SuperHero su = new SuperHero();
     String name = JOptionPane.showInputDialog("Enter superhero name:", "");
     char gender = JOptionPane.showInputDialog("Enter superhero gender:", args).charAt(0);
     Random random = new Random();
     int strengthLevel=random.nextInt(su.MAX_STRENGTH_LEVEL-20+1)+20;
     su.setName(name);
     su.setGender(gender);
     su.setStrengthLevel(strengthLevel);
     
        for (int day = 1; day < 365; day++) {
          int event = random.nextInt(2);
          if(su.getStrengthLevel()>=0&&su.getStrengthLevel()<=100){
          if(event==0&&su.getStrengthLevel()!=0){
              su.fightEvil();
              System.out.println("FightEvil");
          }
          else{
              su.receivePraise();
               System.out.println("receivePrasise");
          }}
            System.out.println(su.getStrengthLevel());
        }
        System.out.println(su.getName());
        System.out.println(su.getGender());
        System.out.println(su.getStrengthLevel());
    }
    
}
