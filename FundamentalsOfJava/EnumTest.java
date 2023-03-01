package FundamentalsOfJava;

public class EnumTest {
    public enum CardSuit {HEARTS,SPADES,DIAMOND,CLUBS}
    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("THe suit is : "+suit);
    }
}
