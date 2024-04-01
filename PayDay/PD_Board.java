import java.util.ArrayList;

public class PD_Board
{
    private ArrayList<PD_Mails> mailDeck;
    private PD_Space[] spaces;
    public PD_Board()
    {
       spaces = new PD_Space[32];
       initializeBoard();
       initializeMailDeck();
    }
    private void initializeBoard()
    {
        spaces[0] = new PD_Space("Start", PD_Space.SpaceType.START);
        spaces[1] = new PD_Space("Mail1", PD_Space.SpaceType.MAIL);
        spaces[2] = new PD_Space("Sweepstakes", PD_Space.SpaceType.SWEEPSTAKES );
        spaces[3] = new PD_Space("Mail2", PD_Space.SpaceType.MAIL);
        spaces[4] = new PD_Space("Deal", PD_Space.SpaceType.DEAL);
        spaces[5] = new PD_Space("Mail2", PD_Space.SpaceType.MAIL);
        spaces[6] = new PD_Space("Lottery", PD_Space.SpaceType.LOTTERY);
        spaces[7] = new PD_Space("Sweet Sunday", PD_Space.SpaceType.RESTDAY);
        spaces[8] = new PD_Space("Radio Contest", PD_Space.SpaceType.RADIOCONTEST);
        spaces[9] = new PD_Space("Buyer", PD_Space.SpaceType.BUYER);
        spaces[10] = new PD_Space("Happy Birthday", PD_Space.SpaceType.HAPPYBIRTHDAY);
        spaces[11] = new PD_Space("Mail1", PD_Space.SpaceType.MAIL);
        spaces[12] = new PD_Space("Deal", PD_Space.SpaceType.DEAL);
        spaces[13] = new PD_Space("Buyer",PD_Space.SpaceType.BUYER);
        spaces[14] = new PD_Space("Fun Day", PD_Space.SpaceType.FUNDAY);
        spaces[15] = new PD_Space("Deal", PD_Space.SpaceType.DEAL);
        spaces[16] = new PD_Space("Mail3", PD_Space.SpaceType.MAIL);
        spaces[17] = new PD_Space("Buyer", PD_Space.SpaceType.BUYER);
        spaces[18] = new PD_Space("Buy Groceries", PD_Space.SpaceType.GROCERIES);
        spaces[19] = new PD_Space("Mail1", PD_Space.SpaceType.MAIL);
        spaces[20] = new PD_Space("Lottery", PD_Space.SpaceType.LOTTERY);
        spaces[21] = new PD_Space("Yard Sale", PD_Space.SpaceType.YARDSALE);
        spaces[22] = new PD_Space("Mail1", PD_Space.SpaceType.MAIL);
        spaces[23] = new PD_Space("Buyer", PD_Space.SpaceType.BUYER);
        spaces[24] = new PD_Space("Mail2", PD_Space.SpaceType.MAIL);
        spaces[25] = new PD_Space("Deal", PD_Space.SpaceType.DEAL);
        spaces[26] = new PD_Space("Family Casino Night", PD_Space.SpaceType.FAMILYCASINONIGHT);
        spaces[27] = new PD_Space("Buyer", PD_Space.SpaceType.BUYER);
        spaces[28] = new PD_Space("Charity Walk", PD_Space.SpaceType.CHARITYWALK );
        spaces[29] = new PD_Space("Buyer", PD_Space.SpaceType.BUYER);
        spaces[30] = new PD_Space("Buyer", PD_Space.SpaceType.BUYER);
        spaces[31] = new PD_Space("Pay Day", PD_Space.SpaceType.PAYDAY);
    }
    private void initializeMailDeck()
    {
        mailDeck = new ArrayList<>();
        mailDeck.add(new PD_Mails(PD_Mails.MailType.ADVERTISEMENT));
        mailDeck.add(new PD_Mails(PD_Mails.MailType.ADVERTISEMENT));
        mailDeck.add(new PD_Mails(PD_Mails.MailType.POSTCARD));
        mailDeck.add(new PD_Mails(PD_Mails.MailType.POSTCARD));
        mailDeck.add(new PD_Mails(PD_Mails.MailType.BILL));
        mailDeck.add(new PD_Mails(PD_Mails.MailType.BILL));
        mailDeck.add(new PD_Mails(PD_Mails.MailType.MONEYGRAM));
    }
    public PD_Mails drawMailCard()
    {
        if (!mailDeck.isEmpty()) 
        {
            return mailDeck.remove(0);
        } 
        else 
        {
            return null;
        }
    }
    public void printBoard()
    {
        for(PD_Space space : spaces)
        {
            if(space != null)
            {
                System.out.println(space.getTitle());
            }
        }
    }
    public PD_Space getSpace(int position)
    {
        if (position >= 0 && position < spaces.length)
        {
            return spaces[position];
        }
        else
        {
            return null;
        }
    }
}
