
/**
 * Write a description of class PD_Space here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PD_Space
{
    private String title;
    private SpaceType type; 
    public PD_Space(String title, SpaceType type)
    {
        this.title = title;
        this.type = type;
    }
    public String getTitle()
    {
        return title;
    }
    public SpaceType getType()
    {
        return type;
    }
    public enum SpaceType
    {
        START,
        MAIL,
        DEAL,
        LOTTERY,
        RESTDAY,
        SWEEPSTAKES,
        BUYER,
        RADIOCONTEST,
        HAPPYBIRTHDAY,
        FUNDAY,
        GROCERIES,
        YARDSALE,
        PAYDAY,
        FAMILYCASINONIGHT,
        CHARITYWALK,
    }
}
