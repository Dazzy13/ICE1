package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Dazzling Verdi Feb 2 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random() * 14));
             
            card.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            hand[i] = card;
        }
        
        System.out.println("Enter a number from 1 - 10: ");
        int cardNumber_val = scan.nextInt();
        
        System.out.println("Enter a suit: ");
        String cardSuit_val = scan.next();

        Card userCard = new Card();
        userCard.setValue(cardNumber_val);
        userCard.setSuit(cardSuit_val);
        
        for(int j = 0; j < hand.length; j++){
            
            if(hand[j].getSuit().equals(userCard.getSuit())){
                printInfo();
            }
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Dazzling Verdi February 02 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Dazzling, but you can call me Dazz");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Going to concerts");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing the panflute");

        System.out.println();
        
    
    }

}
