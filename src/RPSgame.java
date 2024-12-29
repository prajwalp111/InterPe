import java.util.Scanner;
import java.util.Random;

public class RPSgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int play;
        System.out.println("Welcome to Rock-Paper-Scissors!");
        do{
            System.out.println("Enter your choice: Rock, Paper, or Scissors");
            System.out.print("Your choice: ");
            String userChoice = scanner.nextLine().toLowerCase();
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input! Please choose Rock, Paper, or Scissors.");
            }
            else {
                String[] choices = {"rock", "paper", "scissors"};
                String computerChoice = choices[random.nextInt(3)];
                System.out.println("Computer chose: " + computerChoice.substring(0, 1).toUpperCase() + computerChoice.substring(1));

                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You lose!");
                }
            }
            System.out.println("enter 1 if you want to continue or anything to quit");
            play = scanner.nextInt();
            scanner.nextLine();
        }while (play==1);
        scanner.close();
    }
}
