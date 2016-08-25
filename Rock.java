
/**
 * 
 */
import java.util.Scanner;
import java.util.Random;

/**
 * Rock Paper Scissor game.
 * @author ËÎÓëçñ
 * @version 1.0
 */
public class Rock {
    /**
     * Drive my program
     * @param args args command line arguments.
     */
public static void main(String[] args)
{
       String personPlay; //User's play -- "R", "P", or "S"
       String computerPlay = null; //Computer's play -- "R", "P", or "S"
       int computerInt; //Randomly generated number used to determine
//computer's play
       Scanner scan = new Scanner(System.in);
       Random generator = new Random();
       
//Get player's play -- note that this is stored as a string
       System.out.println("Enter your play: R, P, or S: ");
       personPlay = scan.nextLine();
//Make player's play uppercase for ease of comparison
       personPlay = personPlay.toUpperCase();
//Generate computer's play (0,1,2)
       computerInt = generator.nextInt(3);
//Translate computer's randomly generated play to string
       switch (computerInt)
{   case 0:
        computerPlay = "R";
    break;
    case 1:
        computerPlay = "P";
        break;
    case 2:
        computerPlay = "S";
        break;
}
//Print computer's play
       System.out.println("Computer play is: " + computerPlay);
//See who won. Use nested ifs instead of &&.
       if (personPlay.equals(computerPlay))
           System.out.println("It's a tie!");
       
       else if (personPlay.equals("R"))
           if (computerPlay.equals("S"))
               System.out.println("Rock crushes scissors. You win!!");
           
           else
               System.out.println("Paper crushes rock. Sorry,computer win.");
           
       else if (personPlay.equals("S"))
           if (computerPlay.equals("P"))
               System.out.println("scissors crushes paper. You win!!");
          
           else
               System.out.println("Rock crushes scissors. Sorry,computer win."); 
          
       else if (personPlay.equals("P"))
           if (computerPlay.equals("R"))
               System.out.println("Paper crushes rock. You win!!");
           
           else
               System.out.println("Scissors crushes paper. Sorry,computer win.");
           
       
//... Fill in rest of code
}
}