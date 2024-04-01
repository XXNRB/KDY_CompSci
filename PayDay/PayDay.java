
/**
 * 10 points each
Keeps track of player information correctly
Displays player information neatly each turn
Properly deals with loans
Rolling 6 give jackpot
Keeps track of players Mail and Deal cards
Each space does the proper action
PayDay works as intended
Game ends and proper winner declared
Uses an array/arraylist of objects for the board
Comments and Neatness

 * The object is to be the player who has the most cash and savings at the end of the game. 
 * Players decide in advance how many in-game months will be played.
 * one die, four playing pieces, play money, 16 "Deal" cards, 72 "Mail" cards. 
 * Each player starts with $325 or 3500
 * 
 * Game board
 * Calendar
 * 4 tokens (representing players)
 * 64 deal cards
 * 36 mail cards
 * 24 event cards
 * Pay Day money
 * Loans
 * Savings and loan record pad
 * 
 * Special Cards:
 * Deal spaces: Players can buy deal cards when landing on these spaces.
 * Mail spaces: Draw a mail card when landing here.
 *Event spaces: Draw an event card when landing here.
 *Lottery spaces: Players can buy a lottery ticket and have a chance to win the jackpot.
 *
 *
 * Players take turns clockwise, starting with the player to the left of the banker.
 * Roll the die and move your token forward the number of spaces indicated.
 * Follow the instructions on the space where you land.
 * Perform actions such as buying deal cards, taking out loans, or encountering events.
 * Pay bills when landing on a "Bill" space, and receive income on "Pay Day" spaces.
 * Players can buy deal cards during their turn, investing in opportunities that may yield returns.
 * Handle unexpected events through event cards.
 * Manage finances, including loans and savings.
 * The game is played over a series of months (rounds), and players mark off days on the calendar as they progress.
 * The game ends after a set number of months, and the player with the most money wins.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PayDay
{
    private ArrayList<PD_Player> players;
    PD_Die P = new PD_Die();
    int numMonths; 
    int numMonthsAroundBoard;
    private PD_Board board;
    
    public PayDay()
     {
        players= new ArrayList<PD_Player>();
        this.board = new PD_Board();
        while(players.size()<4)
        {
            System.out.println("Enter Player name:");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            addPlayer(new PD_Player(name));
            
        }
        System.out.println("Maximum number of players has been reached(4 Players)");
        System.out.println("Enter Amount of Months You Want To Play For(How manny Rounds?):");
        Scanner scan = new Scanner(System.in);
        this.numMonths = scan.nextInt();
     }
    public void addPlayer(PD_Player player)
    {
        players.add(player);
        System.out.println("Player added.");
    }
    public ArrayList<PD_Player> getPlayers()
    {
        return players;
    }
    public void playRound()
    {
        movePlayers();
    }
    public boolean isGameFinished()
    {
        if(numMonths == numMonthsAroundBoard)
        {
            return true;
        }
        else
        {
           return false; 
        }
    }

    public void printBoard()
    {
        for(PD_Player player : players)
        {
            System.out.println(player.getName() + " is at position " + player.getPosition());
        }
        System.out.println();
    }
    private void handleSpaceAction(PD_Player player, PD_Space space)
    {
        switch (space.getType())
        {
            case START:
            
            break;
            case MAIL:
            
                PD_Mails mailCard = board.drawMailCard();
                if (mailCard != null) 
                {
                    handleMailCard(player, mailCard);
                }
                else
                {
                    System.out.println("No more mail cards available.");
                }
            break;
            case DEAL:
            
            break;
            case LOTTERY:
            
            break;
            case RESTDAY:
            
            break;
            case RADIOCONTEST:
                
            break;
            case HAPPYBIRTHDAY:
                
            break;
            case FUNDAY:
                
            break;
            case GROCERIES:
                
            break;
            case YARDSALE:
                
            break;
            case  PAYDAY:
                
            break;
            case FAMILYCASINONIGHT:
                
            break;
            case CHARITYWALK:
                
            break;
        }
    }
    private void handleMailCard(PD_Player player, PD_Mails mailCard) 
    {
        switch (mailCard.getType()) 
        {
            case ADVERTISEMENT:
                
                break;
            case POSTCARD:
                
                break;
            case BILL:
                
                player.addBill();
                break;
            case MONEYGRAM:
                
                
                break;
        }
    }
    public void movePlayers()
    {
        for(PD_Player player : players)
        {
            if(player.getPosition() != 31)
            {
                int roll = P.roll();
                player.movePlayer(roll);
                PD_Space currentSpace = board.getSpace(player.getPosition());
                handleSpaceAction(player, currentSpace);
                System.out.println("Player " + player.getName() + " rolled a " + roll);
            }
            else
            {
                boolean isRoundFinished = true;
                for(PD_Player person : players)
                {
                    if(person.getPosition() != 31)
                    {
                        isRoundFinished = false;
                    }
                }
                if(isRoundFinished == true)
                {
                    if(numMonths == numMonthsAroundBoard)
                    {
                         System.out.println("Game is Finished");  
                    }
                    else
                    {
                       for(PD_Player person : players)
                       {
                           person.setPosition(0);
                       }
                       numMonthsAroundBoard++;
                    }
                }
                else
                {
                    //leave them where they are.
                }
            }
        }
        System.out.println();
    }
    
}

