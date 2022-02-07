import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    // PROPERTIES
    private Card cards[];
    private int cardsPerSuit;
    private boolean AceValueHigh;
    private char suitarr[];
    private String coorColor[];
    private char ranks[];

    // CONSTRUCTORS
    public Deck() {
        this.cards = new Card[52];
    }

    public Deck(char suitarr[], String coorColor[], int cardsPerSuit, boolean AceValueHigh, char ranks[]) {
        this.suitarr = suitarr;
        this.coorColor = coorColor;
        this.cardsPerSuit = cardsPerSuit;
        this.AceValueHigh = true;
        this.ranks = ranks;
    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }
    public int RetCardAmm() {
        return this.cards.length;
    }
    public Card getCardAt(int i){
        return cards[i];
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        List<Card> l = Arrays.asList(cards);
        Collections.shuffle(l);
        for (int i = 0; i < cards.length; i++) {
            cards[i] = l.get(i);
        }
    }
    public void CreateDeck(){
        int indexTest = 0;
        cards = new Card[this.suitarr.length * this.cardsPerSuit];
        for (int i = 0; i < this.suitarr.length; i++) {
            for (int j = 0; j < this.cardsPerSuit; j++) {
                this.cards[indexTest] = new Card(this.coorColor[i], this.suitarr[i] , (this.AceValueHigh && this.ranks[j] == 'A')? this.cardsPerSuit + 2 : j+1, true, this.ranks[j]);
                System.out.println(indexTest);
                indexTest++;
            }
        }
    }
    public String toString() {
        // TODO Auto-generated method stub
        String cString = "";
        for (Card card : cards) {
            cString = cString + card.getColor() + " " + card.getSuit() + " " + card.getValue() + " " + card.getPlayable() + " " + card.getRank() + " " + '\n';
        }
        return cString;
    }
    public int getCardAmmount() {
        return this.cards.length;
    }
}
