public class Card {
    public enum Suit { HEARTS, SPADES, CLUBS, DIAMONDS }

    private Suit suit;
    private CardValue value;

    public Card(Suit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.name() + " of " + suit;
    }
}
