
/**
 * Write a description of class MailDeck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MailDeck
{

    private AdvertisementDeck advertisement;
    private PostcardDeck postcard;
    private BillDeck bill;
    private MoneygramDeck moneygram;

    public MailDeck() 
    {
        advertisement = new AdvertisementDeck();
        postcard = new PostcardDeck();
        bill = new BillDeck();
        moneygram = new MoneygramDeck();
    }
}
