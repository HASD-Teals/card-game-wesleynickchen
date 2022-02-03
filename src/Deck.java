public class Deck {
    // PROPERTIES
    private Card cards[];
    private int cardsPerSuit;
    private boolean AceValueHigh;
    private char suitarr[];
    private String coorColor[];

    // CONSTRUCTORS
    public Deck() {
        this.cards = new Card[52];
    }

    public Deck(char suitarr[], String coorColor[], int cardsPerSuit, boolean AceValueHigh) {
        this.suitarr = suitarr;
        this.coorColor = coorColor;
        this.cardsPerSuit = cardsPerSuit;
        this.AceValueHigh = true;
    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }
    public int RetCardAmm() {
        return this.cards.length;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
    }
    public void CreateDeck(){
        int indexTest = 0;
        cards = new Card[this.suitarr.length * this.cardsPerSuit];
        for (int i = 0; i < this.suitarr.length; i++) {
            for (int j = 0; j < this.cardsPerSuit; j++) {
                this.cards[indexTest] = new Card(this.coorColor[i], this.suitarr[i] , j, true);
                System.out.println(indexTest);
                indexTest++;
            }
        }
    }
    public void toString2() {
        // TODO Auto-generated method stub
        for (Card card : cards) {
            System.out.println(card.getColor() + " " + card.getRank() + " " + card.getValue() + " " + card.getPlayable() + " " + '\n');
        }
    }

}
