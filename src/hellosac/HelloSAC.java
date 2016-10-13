import java.util.Scanner; 
import java.util.Random;

public class CS112Midterm 
{
    // Main method begins execution of Java application
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userGuess; // user guess low or high
        int i=0; // count to stop loop.
        int userWin=0;//Number of times user win;
        int totalPlay=1;//Number of times user have played.
        float percentageWin; // winning percentage
        int totalDices=0; // the total number of dice1 and dice2
       
        // play until decide to quit
        do
        {   
           
            int dice1 = 1 + (int)(Math.random()*6); // random number dice1
            int dice2 = 1 + (int)(Math.random()*6); // random number dice2
            totalDices=dice1 + dice2;
            System.out.println("Dice 1 is:" + dice1);
	    System.out.println("Dice 2 is:" + dice2);
            System.out.println("Total Dices 2 is:" + totalDices);
            System.out.println("Enter a guess number with 1 for Low, 2 for High:");
            userGuess = input.nextInt();
            
            // conditional statement
            if(userGuess==1 && totalDices>=2 && totalDices <=6)
            {
                System.out.println("You win!");
                userWin++;
            }
  
            else if (userGuess==2 && totalDices>=7 && totalDices<=12)
            {
                System.out.println("You win!");
                userWin++;
            }
	    else if (userGuess==1 && totalDices>=7 && totalDices <=12)
                System.out.println("You guess low, but the total number of 2 dices is high!");
            else
                System.out.println("You guess high, but the total number of 2 dices is low!");
             
            // Ask if play again?         
            System.out.println("Would you like to play again? Y/N");
            String answer = input.next(); 
            String upperCaseAnswer = answer.toUpperCase(); 
            if(upperCaseAnswer.equals("Y"))
            {
                i++;
                totalPlay ++;
            }
            else
            
                i=0;
        }while(i!=0 && i<100);
        
        // Print out History game and Winning Percentage
        percentageWin = (float)((userWin*100)/totalPlay);
        System.out.printf("%nYou've won %d times.",userWin);
        System.out.printf("%nYou've played %d times.%n",totalPlay);
        System.out.printf("Your winning percentage is %s.%n",percentageWin+"%");
        System.out.println("Goodbye!");
   
    } // End main
 } // End class CS112Midterm
