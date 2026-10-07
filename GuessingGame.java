import java.util.Random;
import java.util.Scanner;


public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(1,101);
        Boolean numberTrueFalse = true;
        int guess;
        System.out.println("Guess my number 1-100");
        while(numberTrueFalse){

            guess = input.nextInt();
            if(guess == number){
                System.out.println("Correct");
                numberTrueFalse = false;
            }
            else if(guess > number){
                System.out.println("Lower");
            }
            else{
                System.out.println("Higher");
            }
        }
    }
}
