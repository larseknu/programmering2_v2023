import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Deck {
    private Stack<Card> currentDeck;

    public Deck() {
        createDeck();
    }

    private void createDeck() {
        currentDeck = new Stack<>();

        for (Card.Suit cardSuit : Card.Suit.values()) {
            for (CardValue value : CardValue.values()) {
                currentDeck.add(new Card(cardSuit, value));
            }
        }
    }

    public Stack<Card> getCurrentDeck() {
        return currentDeck;
    }

    public void shuffleDeck() {
        Collections.shuffle(currentDeck);
    }

    public void shuffleAllCards() {
        createDeck();
        shuffleDeck();
    }

    public Card drawCard() {
        if (currentDeck.isEmpty())
                return new Card(null, CardValue.JOKER);

        return currentDeck.pop();
    }

    /**
     * Returns the number of cards drawn until a certain card is found.
     * Returns -1 if the card is not found.
     *
     * @param card The card that should be found
     * @return The number of cards picked until the card was found
     */
    public int drawCardUntilFound(Card card) {
        int count = 0;
        Card pickedCard;

        while (!currentDeck.isEmpty()) {
            pickedCard = drawCard();
            count++;

            if (pickedCard.getSuit() == card.getSuit() && pickedCard.getValue() == card.getValue()) {
                return count;
            }
        }

        return -1;
    }


    public List<Card> drawCards(int number) {
        ArrayList<Card> drawnCards = new ArrayList<>();

        for (int i = 0; i < number && !currentDeck.isEmpty(); i++) {
            drawnCards.add(drawCard());
        }

        return drawnCards;
    }

    public void printAllCards() {
        for (Card aCard : currentDeck) {
            System.out.println(aCard);
        }
    }

}
