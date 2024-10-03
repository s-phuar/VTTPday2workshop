package cards;

import cards.Cards;
import cards.Deck;

public class Main {
    public static void main(String[] args){
        Deck deck = new Deck();
        Cards card = deck.get(5);

        System.out.printf("suite: %s, name: %s, value: %d\n", card.getSuite(), card.getRank(), card.getValue());
    }
}
