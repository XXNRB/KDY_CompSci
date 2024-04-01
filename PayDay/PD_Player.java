
/**
 * Write a description of class PD_Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PD_Player
{
    //keep track of money and position(day of the year)
    private int position;
    private int money;
    private String name;
    private int bills;
    public PD_Player(String name)
    {
        position = 0;
        money = 3500;
        this.name = name;
        bills = 0;
    }
    
    public void movePlayer(int amountMove)
    {
        position = position + amountMove;
        if( position> 31)
        {
            position = 31;
        }
    }
    
    public void setPosition(int position)
    {
        this.position = position;
    }
    
    public int getPosition()
    {
        return position;
    }
    
    public void updateMoney(int gainMoney)
    {
        money = money + gainMoney;
    }
    
    public int getMoney()
    {
        return money;
    }
    
    public String getName()
    {
        return name;
    }
    public void addBill()
    {
        bills++;
    }
    public int payMoneyGram()
    {
        int amountToSend = 50;
        money -= amountToSend;
        return amountToSend;
    }
}

