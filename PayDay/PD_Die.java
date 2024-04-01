import java.util.Random;


public class PD_Die
{
    private int sides;
    
    public PD_Die()
    {
        this.sides = 6;
    }
    public int roll()
    {
        Random random = new Random();
        int result = random.nextInt(sides = 6)+1;
        return result;
    }

}
