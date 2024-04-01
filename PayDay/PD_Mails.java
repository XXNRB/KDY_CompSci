
/**
 * Write a description of class PD_Mails here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PD_Mails
{
    public enum MailType
    {
        ADVERTISEMENT,
        POSTCARD,
        BILL,
        MONEYGRAM,
    }
    private MailType type;
    public PD_Mails(MailType type)
    {
        this.type = type;
    }
    public MailType getType()
    {
        return type;
    }
    
}
