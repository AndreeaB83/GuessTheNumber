import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        /*
        cere de la user sa ghiceasca un nr de la 1 la 100,
        daca un nr introdus de user este mai mic sa se afiseze - more
        daca un nr introdus de user este mai mare sa se afiseze - less
        daca un nr introdus de user este egal sa se afiseze - you won/guessed
         */
        Random randMeu = new Random();
        Scanner scMeu = new Scanner(System.in);
        int hiddenNumber = randMeu.nextInt(101);
        int attemps = 0;

        while (true) {

            System.out.println("Guess a number from 1 to 100");
            int guessNumber = scMeu.nextInt();
            attemps++;

            if (guessNumber < hiddenNumber) {
                System.out.println("more");
            } else if (guessNumber > hiddenNumber) {
                System.out.println("less");
            } else {
                System.out.println("You guessed the number!");
                System.out.println("You used " + attemps + " attemps");
                break;
            }
        }
    }
}
// Todo: Implemnteaza un sistem de vieti (8 attempts, la a 9 a dupa care Game Over)