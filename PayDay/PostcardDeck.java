import java.util.Random;


public class PostcardDeck
{
    private Postcard[] cards;
    private Random random;

    public PostcardDeck() {
        cards = new Postcard[7];
        cards[0] = new Postcard(" Dear Mrs. McGregor, We regret to Inform you that Mr. MeGregor has not been seen since he went fishing in the Lowh. \n Sincerely, \n A. McTavish \"Keeper of the Monster\"");
        cards[1] = new Postcard(" Dear Mom, I've had the blues sinee I've been here. Please write. Love, Len");
        cards[2] = new Postcard("DEar Mommy Camp Snake BIT IS GrAVE Love JohN");
        cards[3] = new Postcard(" Dear Ray, Your sunny letters warm my heart. Keep writing so I can keep the home fires burning: Love, Lottie Snow");
        cards[4] = new Postcard(" Hi Everyone! We ONY! хохо, Michelle & Barry");
        cards[5] = new Postcard(" Dear Mom, This is the year. Go Cubs Love, Theo");
        cards[6] = new Postcard("Dear Mom, What happens here should stay here! Love, The \"New\" Mrs. Smith");
        random = new Random();
    }

    public Postcard drawCard() {
        int index = random.nextInt(cards.length);
        return cards[index];
    }
}
