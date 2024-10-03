package cards;

public class Main {
    public static void main(String[] args){

        //generate entirely new deck object, does not need parameter inputs
        Deck deck = new Deck();

        Cards chosenCard = deck.get(51);
        System.out.printf("suite: %s, name: %s, value: %d\n", chosenCard.getSuite(), chosenCard.getRank(), chosenCard.getValue());

        //shuffled deck
        deck.shuffleDeck();
        Cards randomCard = deck.get(51);
        System.out.printf("suite: %s, name: %s, value: %d\n", randomCard.getSuite(), randomCard.getRank(), randomCard.getValue());
    

    }
}
