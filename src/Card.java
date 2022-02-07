public class Card {
    // PROPERTIES
    private String color;
    private char suit;
    private int value;
    private boolean playable;
    private char rank;

    // CONSTRUCTORS
    public Card() {
        this.color = "red";
        this.suit = 'H';
        this.value =  1;
        this.playable = false;
        this.rank = 'A';
    }
    public Card(String color, char suit, int value, boolean playable, char rank) {
        this.color = color;
        this.suit = suit;
        this.value =  value;
        this.playable = playable;
        this.rank = rank;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    public char getSuit() {
        return this.suit;
    }
    public int getValue() {
        return this.value;
    }
    public boolean getPlayable() {
        return this.playable;
    }
    public char getRank() {
        return this.rank;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    public void setSuit(char suit) {
        this.suit = suit;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void isPlayable(boolean playable) {
        this.playable = playable;
    }
    public void setRank(char rank) {
        this.rank = rank;
    }

    // METHODS
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.color + '\n' + this.suit + '\n' + this.value + '\n' + this.playable + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.equals(obj);
    }
}
