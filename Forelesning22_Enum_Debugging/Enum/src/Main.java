import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffleDeck();
        deck.printAllCards();

        List<Card> yourHand = deck.drawCards(5);

        System.out.println("\nYour hand: \n" + yourHand);

        Card aceOfSpades = new Card(Card.Suit.SPADES, CardValue.ACE);
        int numberOfCards = deck.drawCardUntilFound(aceOfSpades);
        System.out.printf("\nIt took %d draws to find %s\n", numberOfCards, aceOfSpades);

        Card drawnCard = deck.drawCard();
        System.out.println("\nCard drawn: " + drawnCard);

        Card.Suit suit = drawnCard.getSuit();

        switch (suit) {
            case SPADES -> System.out.println("Spades is the best " + drawnCard.getValue());
            case HEARTS -> System.out.println("Hearts means true love " + drawnCard.getValue());
            case CLUBS -> System.out.println("Lucky, it was clubs " + drawnCard.getValue());
            case DIAMONDS -> System.out.println("A girls best friend " + drawnCard.getValue());
            // "null"-check her fungerer bare i preview-versjon av Java 19/20 som har pattern-matching
            case null, default -> System.out.println("It must be a Joker!");
        }
    }
}