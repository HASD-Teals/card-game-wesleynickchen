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
        Deck deck1 = new Deck(suits, cols, 13, true, ranked);
        deck1.CreateDeck();
        deck1.shuffleCards();

        Scanner input = new Scanner(System.in);
        /*System.out.println("pick a card, any card (limit 1-52)");
        int p1 = input.nextInt();
        System.out.println("value is: " + deck.getCardAt(p1).getValue());*/
        boolean p = false;
        while(!p){
            int p1 = pickCard(input,deck);
            int p2 = pickCard(input,deck1);
            if (p1 > p2) {
                System.out.println("player 1 wins!");
            } else if(p2 > p1) {
                System.out.println("player 2 wins!");
            }else{
                System.out.println("its a tie!!");
            }
            System.out.println("play agian?");
            String s = input.next();
            if(!s.equals("yes")){
                p = true;
            }
        }
        input.close();
    }
    public static int pickCard(Scanner in, Deck deck){
        boolean playInCoor = false;
        int retin = 0;
        while(!playInCoor){
            System.out.println("pick a card, any playable card (limit 0-51)");
            int tempv = in.nextInt();
            if((tempv >= 0 && tempv <= 51) && deck.getCardAt(tempv).getPlayable()){
                System.out.println("its a(n): " + deck.getCardAt(tempv).getRank());
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
    