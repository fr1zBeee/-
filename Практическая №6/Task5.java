
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter 1 for ascending order or 2 for descending order:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Arrays.sort(array);
            System.out.println("Array sorted in ascending order:");
        } else if (choice == 2) {
            Arrays.sort(array);
            for (int i = 0; i < size / 2; i++) {
                int temp = array[i];
                array[i] = array[size - 1 - i];
                array[size - 1 - i] = temp;
            }
            System.out.println("Array sorted in descending order:");
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
