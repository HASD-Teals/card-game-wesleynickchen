public class Card {
    // PROPERTIES
    private String color;
    private char suit;
    private int value;
    private boolean playable;

    // CONSTRUCTORS
    public Card() {
        this.color = "red";
        this.suit = 'A';
        this.value =  1;
        this.playable = false;
    }
    public Card(String color, char suit, int value, boolean playable) {
        this.color = color;
        this.suit = suit;
        this.value =  value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    public char getRank() {
        return this.suit;
    }
    public int getValue() {
        return this.value;
    }
    public boolean getPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }
    public void setRank(char suit) {
        this.suit = suit;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void isPlayable(boolean playable) {
        this.playable = playable;
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
