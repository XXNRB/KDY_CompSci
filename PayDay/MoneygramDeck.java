import java.util.Random;


public class MoneygramDeck
{
    private MoneygramCard[] cards;
    private Random random;

    public MoneygramDeck() 
    {
        cards = new MoneygramCard[3];
        cards[0] = new MoneygramCard("Send $300 to Aunt Cindy for cat food.", 300);
        cards[1] = new MoneygramCard("Junior needs spending money for college - $200.", 200);
        cards[2] = new MoneygramCard("Grammy's coming for a visit. Send $400 for tickets.", 400);
        random = new Random();
    }

    public MoneygramCard drawCard() 
    {
        int index = random.nextInt(cards.length);
        return cards[index];
    }
}
