import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       guessingGame();
    }

    public static void guessingGame()
    {
        int min = 1;
        int max = 100;

        Scanner sc = new Scanner(System.in);

        // Generate random int value from min to max
        int numberToGuess = (int) (Math.random()* (max - min + 1) + min);
        int numberGuessed;
        // System.out.println("you guessed :" + numberGuessed + " but the correct answer is : " + numberToGuess);

        int i, attempts = 10;

        System.out.println("\u001B[32mThe system will choose a number between 1 and 100\nYour job is to guess that number! You have 10 tries, Good luck!");

        for (i = 0; i < attempts; i++)
        {
            System.out.println("\u001B[37mGuess the number : ");

            // Number guessed by user
            numberGuessed = sc.nextInt();

            // Number guessed
            if (numberGuessed == numberToGuess){
                System.out.println("\u001B[33mCongratulations! You guessed the number!!\nIt took : " + attempts + "tries");
                break;
            }
            // Guess is higher than answer
            else if (numberGuessed > numberToGuess && i != attempts - 1){
                System.out.println(numberGuessed + " \u001B[31mis higher than the answer.");
            }
            // Guess is lower than the answer
            else if (numberGuessed < numberToGuess && i != attempts - 1){
                System.out.println(numberGuessed + " \u001B[31mis lower than the answer.");
            }
        }

        // Number of attempts exceeded
        if  (i == attempts){
        System.out.println("\u001B[31mI'm sorry you have exceeded the attempt limit.. The answer was : " + numberToGuess);
        }
    }
}