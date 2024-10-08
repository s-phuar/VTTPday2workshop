package cards;

public class Cards {

    //parameters of the car object to be initialised
    private final String suite;
    private final String rank;
    private final int value;


    //constructor to initialise card object with suite, rank and value
    //you cannot create a blank card
    public Cards(String suite, String rank, int value){
        this.suite = suite;
        this.rank = rank;
        this.value = value;
    }

    //getters only
    public String getSuite(){return suite;}
    public String getRank(){return rank;}
    public int getValue(){return value;}

    //Cards card1 = new Cards("Diamond", "Five", 5);

    //Cards card2 = new Cards("Diamond", "Five", 5);
    

    
    //same as printf
    @Override
    public String toString(){
        return "Card{suit: %s, rank: %s, value %d}".formatted(suite, rank, value);
    }



}
