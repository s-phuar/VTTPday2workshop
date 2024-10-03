package cards;

import cards.Cards;

public class Deck {

    //static (not object specific) values for creating a deck
    public static final String[] SUITE = {"Diamond", "Spade", "Hearts", "Clubs"};
    public static final String[] NAMES =
    {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    public static final int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    //deck of 52 card objects, yet to fill it in each card object
    protected Cards[] cards = new Cards[52];

    public Deck(){
        int idx = 0;
        for(int i = 0; i < SUITE.length; i++){
            String suite = SUITE[i];
            for(int j = 0;  j < NAMES.length; j++){
                String name = NAMES[j];
                int value = VALUES[j];
                Cards card = new Cards(suite, name, value);
                //index for all 52 cards
                cards[idx] = card;
                idx++;
            }
        }
    }


    //overloaded get method
    public Cards get(){
        return this.get(0);
    }   

    public Cards get(int pos){
        return this.cards[pos];
    }
    
}
