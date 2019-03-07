/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganderpoke;

import java.util.List;

public class Game {
    public static void main (String [] args) { 
         
        Deck deck = new Deck();
        
        //shuffle the deck 1000 times 
        deck.shuffle(1000);
        
         Card player1Hand;
        
         player1Hand = deck.deal();
         System.out.println("Player 1:");
         System.out.println("Card 1: " + player1Hand);
         player1Hand = deck.deal();
         System.out.println("Card 2: " + player1Hand);
         player1Hand = deck.deal();
         System.out.println("Card 3: " + player1Hand);
         player1Hand = deck.deal();
         System.out.println("Card 4: " + player1Hand);
         player1Hand = deck.deal();
         System.out.println("Card 5: " + player1Hand); 
         player1Hand = deck.deal();
         System.out.println("Card 6: " + player1Hand);
         player1Hand = deck.deal();
         System.out.println("Card 7: " + player1Hand);
         player1Hand = deck.deal();
         System.out.println("Card 8: " + player1Hand);
         
         
         System.out.println("\n");
                 
         Card player2Hand;
        
         player2Hand = deck.deal();
         System.out.println("Player 2:");
         System.out.println("Card 1: " + player2Hand);
         player2Hand = deck.deal();
         System.out.println("Card 2: " + player2Hand);
         player2Hand = deck.deal();
         System.out.println("Card 3: " + player2Hand);
         player2Hand = deck.deal();
         System.out.println("Card 4: " + player2Hand);
         player2Hand = deck.deal();
         System.out.println("Card 5: " + player2Hand); 
         player2Hand = deck.deal();
         System.out.println("Card 6: " + player2Hand);
         player2Hand = deck.deal();
         System.out.println("Card 7: " + player2Hand);
         player2Hand = deck.deal();
         System.out.println("Card 8: " + player2Hand);
    }
    
    public static List<String> selectCard(List<String> card){
        return card;
    }
    
    public static List<String> flipCard(List<String> Square, List<String> card){
        return card;
    }
    
    public static List<String> addCard(List<String> PlayerHand, List<String> card){
        return card;
    }
    
    public static void getCard(Card card){
 
    }
    
    public static void replaceCard(Card card){
 
    }
    
    public static List<String> checkSquare(Square square, List<String> card){
        return card;
    }
    
    public static List<String> checkHand(PlayerHand playerHand, List<String> card){
        return card;
    }
    
    public static int calculateScore(int score){
        return score;
    }
    
    public static List<String> produceHighestCombo(List<String>PlayerHand, List<String> highCombo ){
         return highCombo;
     }
     
    public static List<String> lowestHighestCombo(List<String>PlayerHand, List<String> lowCombo ){
         return lowCombo;
     }
    
    
}  
