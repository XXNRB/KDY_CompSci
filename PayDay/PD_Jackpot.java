
/**
 * Write a description of class PD_Jackpot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PD_Jackpot
{
    private int money;

    public PD_Jackpot()
    {
      money = 0;  
    }
    public void addMoney(int amount)
    {
        money += amount;
    }
    public int retrieveMoney()
    {
        int amount = money;
        money = 0;
        return amount;
    }
}
