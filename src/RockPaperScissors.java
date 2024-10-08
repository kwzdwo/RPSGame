import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerA;
        String playerB;
        String playAgain;

        do {

            playerA = getPlayerMove(scanner, "A");


            playerB = getPlayerMove(scanner, "B");


            if (playerA.equals(playerB)) {
                System.out.println("It's a Tie!");
            } else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("P") && playerB.equals("R")) ||
                    (playerA.equals("S") && playerB.equals("P"))) {
                System.out.println("Player A wins!");
            } else {
                System.out.println("Player B wins!");
            }


            System.out.print("Play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

        } while (playAgain.equals("Y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }


    public static String getPlayerMove(Scanner scanner, String playerName) {
        String move;
        System.out.print("Player " + playerName + ", enter your move (R, P, S): ");
        move = scanner.nextLine().toUpperCase();

        while (!move.equals("R") && !move.equals("P") && !move.equals("S")) {
            System.out.print("Invalid move! Player " + playerName + ", enter your move (R, P, S): ");
            move = scanner.nextLine().toUpperCase();
        }
        return move;
    }
}
