
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of angles in the polygon:");
        int n = scanner.nextInt();
        int[] angles = new int[n];
        int sum = 0;

        System.out.println("Enter the angles of the polygon:");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        if (sum == 180 * (n - 2)) {
            System.out.println("The angles can form a valid polygon.");
        } else {
            System.out.println("The angles cannot form a valid polygon.");
        }

        scanner.close();
    }
}
