
/**
 * Write a description of class MoneygramCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoneygramCard
{
    private String message;
    private int amount;

    public MoneygramCard(String message, int amount) {
        this.message = message;
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public int getAmount() {
        return amount;
    }
}
