public class CardGameClient {
    public static void main(String[] args) throws Exception {
        char[] suits = {'D', 'H', 'C', 'S'};
        String[] cols = {"red", "red", "black", "black"};
        Deck deck = new Deck(suits, cols, 13, true);
        deck.CreateDeck();
        deck.toString2();
    }
}
