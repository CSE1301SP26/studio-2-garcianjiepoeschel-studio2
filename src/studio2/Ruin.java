import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Ruin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Starting Amount: ");
        double startAmount = in.nextDouble();
        System.out.print("Winning Probability: ");
        double winChance = in.nextDouble();
        System.out.print("Win Limit:  ");
        double winLimit = in.nextDouble();

        double currentAmount = startAmount;

        // for (double i = startAmount; i < winLimit; i++) {
        // System.out.print(i + " ");

        while (0 < currentAmount && currentAmount <= winLimit) {
            double RandomNumber = Math.random();
            System.out.print("Hand: " + RandomNumber);

            if (RandomNumber > winChance) {
                boolean WinOrLoss = true;
                ;
            }

        }
    }
}

// boolean WinOrLoss;
