package ganderpoke;


class Card {
     
    private static final String[] rank = {"*", "*", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private static final String[] suit = {"*","Hearts", "Clubs", "Spades", "Diamonds"};
    private static final String[] color = {"Black", "red"};
    
    public static final int spades   = 4;
    public static final int hearts   = 3;
    public static final int clubs    = 2;
    public static final int diamonds = 1;
    
    private int rankOfCard;
    private int suitOfCard;

    public Card( int suit, int rank ) {
       if ( rank == 1 )
          rankOfCard = 14;     
      else
          rankOfCard = (int) rank;

       suitOfCard = (int) suit;
    }
    
    public void getCard(){
        
    }
    
    public void replaceCard(){
        
    }
    
    //Returns the getSuit of the card entered in the arguments of the instance of Card class
    public int getSuit() {
       return ( this.suitOfCard );     
    }
    
    //Returns the a string of the getSuit of the card
    public String suitStr() {
       return( this.suit[ this.suitOfCard ] );  
    }

    //Returns the getRank of the card entered in the arguments of the instance of Card class
    public int getRank() {
       return ( this.rankOfCard );
    }
    
    //Returns the a string of the getRank of the card
    public String rankStr() {
       return ( rank[ this.rankOfCard ] );
    }
    
    //Returns the a string of the getRank and getSuit together
    public String toString() {
       return ( rank[ this.rankOfCard ] + " of "+ suit[ this.suitOfCard ] );
    }
 }

