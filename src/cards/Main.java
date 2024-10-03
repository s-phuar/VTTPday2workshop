package cards;

public class Main {
    public static void main(String[] args){

        //generate entirely new deck object, does not need parameter inputs
        Deck deck = new Deck();

        //new Cards object takes the chosen card at position 51, taken from fresh deck
        Cards chosenCard = deck.get(51);
        System.out.printf("suite: %s, name: %s, value: %d\n", chosenCard.getSuite(), chosenCard.getRank(), chosenCard.getValue());

        //shuffled the fresh deck instantiated at line 7
        deck.shuffleDeck();
        //new Cards object takes the chosen card at position 51, taken from randomised deck
        Cards randomCard = deck.get(51);
        System.out.printf("suite: %s, name: %s, value: %d\n", randomCard.getSuite(), randomCard.getRank(), randomCard.getValue());
    

    }
}
