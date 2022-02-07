import java.util.Scanner;

public class CardGameClient {
    public static void main(String[] args) throws Exception {
        char[] suits = {'D', 'H', 'C', 'S'};
        String[] cols = {"red", "red", "black", "black"};
        char[] ranked = {'A','2','3','4','5','6','7','8','9','0','J','Q','K'};
        Deck deck = new Deck(suits, cols, 13, true, ranked);
        deck.CreateDeck();
        //System.out.println( deck.toString());
        deck.shuffleCards();
        //System.out.println( deck.toString());

        Scanner input = new Scanner(System.in);
        /*System.out.println("pick a card, any card (limit 1-52)");
        int p1 = input.nextInt();
        System.out.println("value is: " + deck.getCardAt(p1).getValue());*/
        pickCard(input,deck);
        pickCard(input,deck);

        input.close();
    }
    public static int pickCard(Scanner in, Deck deck){
        boolean playInCoor = false;
        int retin = 0;
        while(!playInCoor){
            System.out.println("pick a card, any playable card (limit 0-51)");
            int tempv = in.nextInt();
            if((tempv >= 0 && tempv <= 51) && deck.getCardAt(tempv).getPlayable()){
                System.out.println("value is: " + deck.getCardAt(tempv).getValue());
                playInCoor= true;
                deck.getCardAt(tempv).isPlayable(false);
                retin = deck.getCardAt(tempv).getValue();
                
            }else{
                System.out.println("error, value not in range, or card is already played");

            }
        }
        return retin;

    }

}
    