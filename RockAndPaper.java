import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class RockAndPaper {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
while(true)
        {
            String[] rps = { "r","p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];


            String playerMove;
            while(true)
            {
                System.out.println("Please enter your move (r,p, or s) ");
                playerMove = scanner.nextLine();
                if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }

            System.out.println("Computer played: " + computerMove);
            if(playerMove.equals(computerMove)){
                System.out.println("The game tied!");
            }

            // if player moves is rockr
            else if(playerMove.equals("r"))
            {
                if(computerMove.equals("p"))
                {
                    System.out.println("lost !");
                }else if(computerMove.equals("s"))
                {
                    System.out.println("Won !");
                }

            }
        // if player moves is paper
            else if(playerMove.equals("p"))
            {
                if(computerMove.equals("r"))
                {
                    System.out.println("Won !");
                }else if(computerMove.equals("s"))
                {
                    System.out.println("lost !");
                }
            }
        // if player moves is scissors
            else if(playerMove.equals("s"))
            {
                if(computerMove.equals("p"))
                {
                    System.out.println("won !");
                }else if(computerMove.equals("r"))
                {
                    System.out.println("lost!");
                }
            }
            System.out.println("playAgain? (y/n)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("y")){
                break;
            }
        }

    }
}