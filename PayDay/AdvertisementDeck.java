import java.util.Random;


public class AdvertisementDeck
{
    private AdvertisementCard[] cards;
    private Random random;

    public AdvertisementDeck() 
    {
        cards = new AdvertisementCard[4];
        cards[0] = new MusicForPlants();
        cards[1] = new ChanceOfALifetime();
        cards[2] = new GoodNightSheep();
        cards[3] = new CatsMeow();
        random = new Random();
    }

    public AdvertisementCard drawCard() 
    {
        int index = random.nextInt(cards.length);
        return cards[index];
    }
}
