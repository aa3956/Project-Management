/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganderpoke;

import java.util.List;

public class PokerHand {
    
     public static final int numOfCards = 5;
     public static final String[] combo = {"1 pair", "2 pair", "3 pair", "straight", "flush", "full house", "four of a kind", "straight flush"};
     public static final String[] score = {"1", "2", "3", "5", "8", "10"};
     public static int highestHand;
     public static int lowestHand;
     
     public static List<String> produceHighestCombo(PlayerHand highCombo ){
         return highCombo;
     }
     
      public static List<String> lowestHighestCombo(PlayerHand lowCombo ){
         return lowCombo;
     }
    
}
