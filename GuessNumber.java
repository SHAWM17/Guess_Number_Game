import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String again;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking the number between 1 and 100");

        do {
            System.out.println("Please select the difficulty level: \n 1. Easy (10 Chances) \n 2. Medium (5 Chances) \n 3. Hard (3 Chances)");
            System.out.print("Enter your choice: ");
            int level = sc.nextInt();
            int loopChance;
            if (level == 1){
                loopChance = 10;
            } else if (level == 2){
                loopChance = 5;
            } else {
                loopChance = 3;
            }
    
            // Random Pick by Program
            System.out.println("Loop chance = " + loopChance);
            int[] array = new int[100];
            for (int i = 0; i <= 99; i++){
                array[i] = i + 1;
            }
            int randomIndex = rand.nextInt(array.length);
    
    
            // Guess Number
            for (int i = 1; i <= loopChance; i++){
                System.out.print("Enter your Guess: ");
                int guess = sc.nextInt();
                if (randomIndex == guess){
                    System.out.println("Congatulation! You guessed the correct number at " + i + " attempts.");
                    break;
                } else if (randomIndex < guess){
                    System.out.println("Incorrect. The number is less than " + guess);
                } else if (randomIndex > guess){
                    System.out.println("Incorrect. The number is greater than " + guess);
                }
            }
            sc.nextLine();
            System.out.print("Are you want to play again? (Y/N): ");
            again = sc.nextLine();
        }while("y".equalsIgnoreCase(again));
        sc.close();
    }
}
