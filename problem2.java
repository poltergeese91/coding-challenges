import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for the first line
        System.out.println("Enter the number of players (N) and number of matches (M):");
        int N = sc.nextInt();
        long M = sc.nextLong();

        // Prompt user for the second line
        System.out.println("Enter the points for each of the " + N + " players:");
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += sc.nextLong();
        }

        // Calculate number of ties
        long ties = (42L * M - sum) / 22;

        // Output result
        System.out.println("Number of ties: " + ties);
    }
}

