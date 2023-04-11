public enum CardValue {
    JOKER(0), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), KNIGHT(11), QUEEN(12), KING(13), ACE(14);

    public final int value;

    CardValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name() + " - " + value;
    }
}
