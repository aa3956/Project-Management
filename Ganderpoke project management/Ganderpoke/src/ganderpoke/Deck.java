/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganderpoke;

class Deck {
       public static final int noOfCards = 52;
       private Card[] cardDeck;         
       private int currentCard;            
 
       public Deck( ) {
          cardDeck = new Card[ noOfCards ];
          int i = 0;
 
          for (int suit = Card.diamonds; suit <= Card.spades; suit++)
             for ( int rank = 1; rank <= 13; rank++ )
                 cardDeck[i++] = new Card(suit, rank);
                 currentCard = 0;
       }
      //shuffle the card deck
       public void shuffle(int n) {
          int i, j, k;
 
          for ( k = 0; k < n; k++ ){ 
          i = (int) ( noOfCards * Math.random() );  
          j = (int) ( noOfCards * Math.random() );  
           
          //swap the random two cards that are picked
          Card temp = cardDeck[i];
          cardDeck[i] = cardDeck[j];
          cardDeck[j] = temp;
          }
          currentCard = 0;   
       }
        
       //deal the current card out 
       public Card deal() {
           
          if (currentCard < noOfCards) {
             return ( cardDeck[currentCard++] );
          }
          else{
             System.out.println("Out of cards error");
             return ( null ); 
          }
       }
 
       //Print the cards
       public String toString() {
          String s = "";
          int k;
          k = 0;
           
          for ( int i = 0; i < 4; i++ ) {        
              for ( int j = 1; j <= 13; j++ )
                 s += (cardDeck[k++] + " ");
                 s += "\n";
         }
          return (s);
       }
    }