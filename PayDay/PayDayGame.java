
/**
 * Write a description of class PayDayGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PayDayGame
{
    public static void main(String[] args)
    {
        PayDay game = new PayDay();
        while( game.isGameFinished() == false)
        {
            game.playRound();
            game.printBoard();
        }
        System.out.println("Game is Finished");
    }
    
}
