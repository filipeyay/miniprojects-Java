import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose one - rock/paper/scissors");
        String playerChoice = scanner.nextLine();

        // Get random input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerChoice = "";
        if(randomNumber == 0) {
            computerChoice = "rock";
        } else if (randomNumber == 1) {
            computerChoice = "scissors";
        }
        System.out.println("Computer chose " + computerChoice);

        // Result
        if(playerChoice.equals(computerChoice)) {
            System.out.println("Draw");
        } else if(playerWins(playerChoice, computerChoice)) {
            System.out.println("Player wins");
        } else {
            System.out.println("Computer wins");
        }
    }

    static boolean playerWins(String playerChoice, String computerChoice) {
        if(playerChoice.equals("rock")) {
            return computerChoice.equals("scissors");
        } else if (playerChoice.equals("paper")) {
            return computerChoice.equals("rock");
        } else {
            return computerChoice.equals("paper");
        }
    }
}
