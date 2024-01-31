import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class SD_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess, attempts = 0;
        boolean win = false;

        JOptionPane.showMessageDialog(null, "I'm thinking of a number between 1 and 100. Can you guess it?");

        while (!win) {
            String guessString = JOptionPane.showInputDialog(null, "Enter your guess: ");
            guess = Integer.parseInt(guessString);
            attempts++;

            if (guess == number) {
                win = true;
            } else if (guess < number) {
                JOptionPane.showMessageDialog(null, "Too low! Try again.");
            } else if (guess > number) {
                JOptionPane.showMessageDialog(null, "Too high! Try again.");
            }
        }

        JOptionPane.showMessageDialog(null, String.format("Congratulations! You guessed the number in %d attempts.", attempts));
        sc.close();
    }

}
