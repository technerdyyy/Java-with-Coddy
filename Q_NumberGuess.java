/*
 You are given a number - randNum (assume it's a random number :)), your tasks is:

1. Get input number from the user (the guess)

2. If the guess is bigger than the given number output Too high

3. If the guess is smaller than the given number output Too low

4. If it's the exact number output You are right!
 */

import java.util.Scanner;

public class Q_NumberGuess {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int randNum = scanner.nextInt();
            
            // Write code here
            int guess = scanner.nextInt();
            if(guess>randNum){
                System.out.println("Too high");
            }else if(guess<randNum){
                System.out.println("Too low");
            } else {
                System.out.println("You are right!");
            }
        }
    }
    
}
